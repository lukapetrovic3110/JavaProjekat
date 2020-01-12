package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.PredmetController;
import model.BazaPredmeta;
import model.Predmet;
import view.documentlisteners.PredmetDocumentListener;

/**
 * @author ra25-2017
 */
public class DialogDodavanjePredmeta extends JDialog implements KomponenteInterface {

	private static final long serialVersionUID = -2892079969591847274L;

	private ArrayList<JTextField> listaKomponenti;
	private ArrayList<Boolean> vrednostPopunjenostiKomponenti;

	private JLabel sifrapredmeta;
	private JLabel nazivpredmeta;
	private JLabel semsetar;
	private JLabel godinastudija;

	private JTextField poljesifpred;
	private JTextField poljenzvpred;
	private JTextField poljesemestar;
	private JTextField poljegodstud;

	public static JButton dugmePotvrdi;
	public static JButton dugmeOdustani;

	private String sifraPredmeta;
	private String nazivPredmeta;
	private int semestar;
	private int godinaStudija;
	
	private String regexSifra = "[A-Z]{2,20}[0-9]{1,5}";
	private String regexNaziv = "[A-Z][A-Za-z]{1,20}[a-zA-Z1-9 ]{1,}";
	private String regexSemestar = "[1-8]";
	private String regexGodina = "[1-5]";

	private int rowSelectedIndex;
	private Predmet p;

	public DialogDodavanjePredmeta(JFrame parent, boolean modal, boolean daLiJeIzmena) {

		super(parent, "Dodavanje predmeta", modal);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.add(panel, BorderLayout.CENTER);

		Dimension dimenzije = new Dimension(160, 25);

		listaKomponenti = new ArrayList<JTextField>();
		vrednostPopunjenostiKomponenti = new ArrayList<Boolean>();

		JPanel Sifra = new JPanel(new FlowLayout(FlowLayout.LEFT));

		sifrapredmeta = new JLabel();
		sifrapredmeta.setText("Sifra predmeta*");
		sifrapredmeta.setPreferredSize(dimenzije);

		poljesifpred = new JTextField();
		poljesifpred.setPreferredSize(dimenzije);
		listaKomponenti.add(poljesifpred);
		Sifra.add(sifrapredmeta);
		Sifra.add(poljesifpred);

		panel.add(Sifra);

		JPanel NazivPredmeta = new JPanel(new FlowLayout(FlowLayout.LEFT));

		nazivpredmeta = new JLabel();
		nazivpredmeta.setText("Naziv predmeta*");
		nazivpredmeta.setPreferredSize(dimenzije);

		poljenzvpred = new JTextField();
		poljenzvpred.setPreferredSize(dimenzije);
		listaKomponenti.add(poljenzvpred);
		NazivPredmeta.add(nazivpredmeta);
		NazivPredmeta.add(poljenzvpred);

		panel.add(NazivPredmeta);

		JPanel Semestar = new JPanel(new FlowLayout(FlowLayout.LEFT));

		semsetar = new JLabel();
		semsetar.setText("Semestar*");
		semsetar.setPreferredSize(dimenzije);

		poljesemestar = new JTextField();
		poljesemestar.setPreferredSize(dimenzije);
		listaKomponenti.add(poljesemestar);
		Semestar.add(semsetar);
		Semestar.add(poljesemestar);

		panel.add(Semestar);

		JPanel GodinaStudija = new JPanel(new FlowLayout(FlowLayout.LEFT));

		godinastudija = new JLabel();
		godinastudija.setText("Godina studija*");
		godinastudija.setPreferredSize(dimenzije);

		poljegodstud = new JTextField();
		poljegodstud.setPreferredSize(dimenzije);
		listaKomponenti.add(poljegodstud);
		GodinaStudija.add(godinastudija);
		GodinaStudija.add(poljegodstud);

		panel.add(GodinaStudija);

		panel.add(Box.createVerticalStrut(20));

		for (int i = 0; i <= listaKomponenti.size() - 1; i++) {
			vrednostPopunjenostiKomponenti.add(i, false);
		}
		
		poljesifpred.getDocument().addDocumentListener(new PredmetDocumentListener(this, poljesifpred, regexSifra));
		
		poljenzvpred.getDocument().addDocumentListener(new PredmetDocumentListener(this, poljenzvpred, regexNaziv));
		
		poljesemestar.getDocument().addDocumentListener(new PredmetDocumentListener(this, poljesemestar, regexSemestar));
		
		poljegodstud.getDocument().addDocumentListener(new PredmetDocumentListener(this, poljegodstud, regexGodina));
		
		dugmePotvrdi = new JButton("Potvrdi");
		
		dugmePotvrdi.setEnabled(checkifAllValid());
		
		dugmeOdustani = new JButton("Odustani");
		
		if (daLiJeIzmena) {

			rowSelectedIndex = PanelPredmeti.tablePredmeti.getSelectedRow();

			if (rowSelectedIndex >= 0) {
				rowSelectedIndex = PanelPredmeti.tablePredmeti.convertRowIndexToModel(rowSelectedIndex);

				p = BazaPredmeta.getInstance().getRow(rowSelectedIndex);

				sifraPredmeta = p.getSifrapredmeta();
				nazivPredmeta = p.getNazivpredmeta();
				semestar = p.getSemestar();
				godinaStudija = p.getGodinastudija();

				poljesifpred.setText(sifraPredmeta);
				poljesifpred.setEnabled(false);
				poljenzvpred.setText(nazivPredmeta);
				String txtSemestar = ""+semestar;
				poljesemestar.setText(txtSemestar);
				String txtGodinaStudija = ""+godinaStudija;
				poljegodstud.setText(txtGodinaStudija);
			}
		}

		JPanel panelDugmici = new JPanel();
		panelDugmici.setLayout(new BoxLayout(panelDugmici, BoxLayout.X_AXIS));

		Dimension dimenzijadugmica = new Dimension(100, 35);

		dugmePotvrdi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!daLiJeIzmena) {
					
					if(!(postojiSifra(poljesifpred.getText())))
					{
						if ((!poljesifpred.getText().equals("")) && (!poljenzvpred.getText().equals(""))
								&& (!poljesemestar.getText().equals("")) && (!poljegodstud.getText().equals(""))) {
							sifraPredmeta = poljesifpred.getText();
							nazivPredmeta = poljenzvpred.getText();
							semestar = Integer.parseInt(poljesemestar.getText());
							godinaStudija = Integer.parseInt(poljegodstud.getText());
	
							PredmetController.getInstance().dodajPredmet(sifraPredmeta, nazivPredmeta, semestar,
									godinaStudija, "");
	
							setVisible(false);
						}
						
					}
				} else {
					nazivPredmeta = poljenzvpred.getText();
					semestar = Integer.parseInt(poljesemestar.getText());
					godinaStudija = Integer.parseInt(poljegodstud.getText());

					PredmetController.getInstance().izmeniPredmet(sifraPredmeta, nazivPredmeta, semestar,
							godinaStudija);

					setVisible(false);
				}
			}
		});

		dugmePotvrdi.setPreferredSize(dimenzijadugmica);
		
		dugmeOdustani.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		dugmeOdustani.setPreferredSize(dimenzijadugmica);

		panelDugmici.add(Box.createGlue());

		panelDugmici.add(dugmeOdustani);
		panelDugmici.add(Box.createHorizontalStrut(20));

		panelDugmici.add(dugmePotvrdi);
		panelDugmici.add(Box.createHorizontalStrut(20));

		this.add(panelDugmici, BorderLayout.SOUTH);
		pack();

		setSize(500, 500);
		setLocationRelativeTo(parent);
	}

	@Override
	public void setValid(JTextField komponenta) {
		for (int i = 0; i <= listaKomponenti.size() - 1; i++) {
			if (listaKomponenti.get(i) == komponenta) {

				vrednostPopunjenostiKomponenti.set(i, true);
			}
		}
	}

	@Override
	public void setInvalid(JTextField komponenta) {
		for (int i = 0; i <= listaKomponenti.size() - 1; i++) {
			if (listaKomponenti.get(i) == komponenta) {

				vrednostPopunjenostiKomponenti.set(i, false);
			}
		}
	}

	@Override
	public boolean checkifAllValid() {

		for (int i = 0; i <= vrednostPopunjenostiKomponenti.size() - 1; i++) {
			if (vrednostPopunjenostiKomponenti.get(i) == false) {

				dugmePotvrdi.setEnabled(false);
				return false;
			}
		}

		dugmePotvrdi.setEnabled(true);
		return true;
	}
	
	public boolean postojiSifra(String sifraPredmeta)
	{
		for(Predmet predmet : BazaPredmeta.getInstance().getPredmeti())
		{
			if(predmet.getSifrapredmeta().equals(sifraPredmeta))
			{
				JOptionPane.showMessageDialog(this, "Uneli ste sifru predmeta koja vec postoji u bazi predmeta!", "Greska prilikom unosa sifre predmeta", JOptionPane.ERROR_MESSAGE);
				poljesifpred.setText("");
				return true;
			}
		}
		
		return false;
	}

}
