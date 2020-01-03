package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
/**
 *  @author ra25-2017
 */
public class DialogDodavanjePredmeta extends JDialog{

	private static final long serialVersionUID = -2892079969591847274L;
	
	private JLabel sifrapredmeta;
	private JLabel nazivpredmeta;
	private JLabel semsetar;
	private JLabel godinastudija;
	
	private JTextField poljesifpred;
	private JTextField poljenzvpred;
	private JTextField poljesemestar;
	private JTextField poljegodstud;
	
	private JButton potvrdi;
	private JButton odustani;
	
	private String sifraPredmeta;
	private String nazivPredmeta;
	private String semestar;
	private String godinaStudija;
	
	private int rowSelectedIndex;
	private Predmet p;
	
	public DialogDodavanjePredmeta(JFrame parent, boolean modal, boolean daLiJeIzmena){
		
		super(parent, "Dodavanje predmeta", modal);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.add(panel, BorderLayout.CENTER);
		
		Dimension dimenzije = new Dimension(160, 25);
		
		JPanel Sifra = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		sifrapredmeta = new JLabel();
		sifrapredmeta.setText("Sifra predmeta*");
		sifrapredmeta.setPreferredSize(dimenzije);
		
		poljesifpred = new JTextField();
		poljesifpred.setPreferredSize(dimenzije);
		
		Sifra.add(sifrapredmeta);
		Sifra.add(poljesifpred);
		
		panel.add(Sifra);
		
		JPanel NazivPredmeta = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		nazivpredmeta = new JLabel();
		nazivpredmeta.setText("Naziv predmeta*");
		nazivpredmeta.setPreferredSize(dimenzije);
		
		poljenzvpred = new JTextField();
		poljenzvpred.setPreferredSize(dimenzije);
		
		NazivPredmeta.add(nazivpredmeta);
		NazivPredmeta.add(poljenzvpred);
		
		panel.add(NazivPredmeta);
		
		JPanel Semestar = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		semsetar = new JLabel();
		semsetar.setText("Semestar*");
		semsetar.setPreferredSize(dimenzije);
		
		poljesemestar = new JTextField();
		poljesemestar.setPreferredSize(dimenzije);
		
		Semestar.add(semsetar);
		Semestar.add(poljesemestar);
		
		panel.add(Semestar);
	
		JPanel GodinaStudija = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		godinastudija = new JLabel();
		godinastudija.setText("Godina studija*");
		godinastudija.setPreferredSize(dimenzije);
		
		poljegodstud = new JTextField();
		poljegodstud.setPreferredSize(dimenzije);
		
		GodinaStudija.add(godinastudija);
		GodinaStudija.add(poljegodstud);
		
		panel.add(GodinaStudija);
		
		panel.add(Box.createVerticalStrut(20));
		
		if (daLiJeIzmena) 
		{
			
			rowSelectedIndex = PanelPredmeti.tablePredmeti.getSelectedRow();
			
			if (rowSelectedIndex >= 0)
			{
				p = BazaPredmeta.getInstance().getRow(rowSelectedIndex);
				sifraPredmeta = p.getSifrapredmeta();
				nazivPredmeta = p.getNazivpredmeta();
				semestar = p.getSemestar();
				godinaStudija = p.getGodinastudija();
				
				poljesifpred.setText(sifraPredmeta);
				poljesifpred.setEditable(false);
				poljenzvpred.setText(nazivPredmeta);
				poljesemestar.setText(semestar);
				poljegodstud.setText(godinaStudija);
			}
		}
		
		JPanel panelDugmici = new JPanel();
		panelDugmici.setLayout(new BoxLayout(panelDugmici, BoxLayout.X_AXIS));
		
		Dimension dimenzijadugmica = new Dimension(100,35);
		
		potvrdi = new JButton("Potvrdi");
	
		potvrdi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!daLiJeIzmena) 
				{
					if((!poljesifpred.getText().equals("")) && (!poljenzvpred.getText().equals("")) && (!poljesemestar.getText().equals("")) && (!poljegodstud.getText().equals("")))
					{
						sifraPredmeta = poljesifpred.getText();
						nazivPredmeta = poljenzvpred.getText();
						semestar = poljesemestar.getText();
						godinaStudija = poljegodstud.getText();
		
						PredmetController.getInstance().dodajPredmet(sifraPredmeta, nazivPredmeta, semestar, godinaStudija);
							
						setVisible(false);
					}
				}
				else 
				{
					nazivPredmeta = poljenzvpred.getText();
					semestar = poljesemestar.getText();
					godinaStudija = poljegodstud.getText();
					
					PredmetController.getInstance().izmeniPredmet(sifraPredmeta, nazivPredmeta, semestar, godinaStudija);
					
					setVisible(false);
				}
			}
		});
		
		potvrdi.setPreferredSize(dimenzijadugmica);
		
		odustani = new JButton("Odustani");
		odustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		odustani.setPreferredSize(dimenzijadugmica);
		
		panelDugmici.add(Box.createGlue());
		
		panelDugmici.add(odustani);
		panelDugmici.add(Box.createHorizontalStrut(20));
		
		panelDugmici.add(potvrdi);
		panelDugmici.add(Box.createHorizontalStrut(20));
	
		this.add(panelDugmici, BorderLayout.SOUTH);
		pack();
		
		setSize(500,500);
		setLocationRelativeTo(parent);
	}
	
}
