package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ProfesorController;
import model.BazaProfesora;
import model.Predmet;
import model.Profesor;
import model.Profesor.titule;
import model.Profesor.zvanja;
import view.documentlisteners.ProfesorDocumentListener;

/**
 * @author ra25-2017
 */
public class DialogDodavanjeProfesora extends JDialog implements KomponenteInterface {

	private static final long serialVersionUID = 5272581017507998104L;

	private ArrayList<JTextField> listaKomponenti;
	public ArrayList<Boolean> vrednostPopunjenostiKomponenti;
	private ArrayList<Predmet> predmeti;
	
	private JLabel ime;
	private JLabel prezime;
	private JLabel datumrodjenja;
	private JLabel adresastanovanja;
	private JLabel telefon;
	private JLabel email;
	private JLabel adresakancelarije;
	private JLabel brojlicnekarte;
	private JLabel titula;
	private JLabel zvanje;

	private JTextField poljeime;
	private JTextField poljeprz;
	private JTextField poljedatrodj;
	private JTextField poljeadrstan;
	private JTextField poljetel;
	private JTextField poljeemail;
	private JTextField poljeadrkan;
	private JTextField poljebrlickarte;
	private JComboBox<String> combotitula;
	private JComboBox<String> combozvanja;

	public static JButton potvrdi;
	public static JButton odustani;

	private String imeProfesora;
	private String prezimeProfesora;
	private String datumRodjenjaProfesora;
	private String adresaStanovanjaProfesora;
	private String telefonProfesora;
	private String emailProfesora;
	private String adresaKancelarijeProfesora;
	private String brojLicneKarteProfesora;
	private titule titulaProfesora;
	private zvanja zvanjeProfesora;

	private String stringTitula;;
	private String stringZvanje;

	private String regexIme = "[A-Z][a-z]{2,15}";
	private String regexPrzime = "[A-Z][a-z]{2,19}";
	private String regexDatumRodjenja = "([0-9]{2}).([0-9]{2}).([0-9]{4}).";
	private String regexAdresaStanovanja = "[A-Z][A-Z a-z]{2,35}[0-9]{1,4},[A-Z a-z]{1,30}";
	private String regexTelefon = "[0-9]{3,4}/[0-9]{3,4}-[0-9]{3,4}";
	private String regexEmail = "[a-z]{1,20}.?([a-z]{1,20})?@[a-z]{1,15}.com";
	private String regexAdresaKancelarije = "[A-Z a-z]{3,50}[0-9]{1,2},[A-Z a-z]{1,30},[A-Z a-z]{1,30}[0-9A-Z]{1,3}";
	private String regexBrLicneKarte = "[0-9]{9}";
	
	int rowSelectedIndex;
	Profesor profesor;

	public DialogDodavanjeProfesora(JFrame parent, boolean modal, boolean daLiJeIzmena) {
		super(parent, "Dodavanje profesora", modal);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.add(panel, BorderLayout.CENTER);

		Dimension dimenzije = new Dimension(160, 25);

		listaKomponenti = new ArrayList<JTextField>();
		vrednostPopunjenostiKomponenti = new ArrayList<Boolean>();

		JPanel Ime = new JPanel(new FlowLayout(FlowLayout.LEFT));

		ime = new JLabel();
		ime.setText("Ime*");
		ime.setPreferredSize(dimenzije);

		poljeime = new JTextField();
		poljeime.setPreferredSize(dimenzije);
		listaKomponenti.add(poljeime);

		Ime.add(ime);
		Ime.add(poljeime);

		panel.add(Ime);

		JPanel Prezime = new JPanel(new FlowLayout(FlowLayout.LEFT));

		prezime = new JLabel();
		prezime.setText("Prezime*");
		prezime.setPreferredSize(dimenzije);

		poljeprz = new JTextField();
		poljeprz.setPreferredSize(dimenzije);
		listaKomponenti.add(poljeprz);

		Prezime.add(prezime);
		Prezime.add(poljeprz);

		panel.add(Prezime);

		JPanel Datumrodjenja = new JPanel(new FlowLayout(FlowLayout.LEFT));

		datumrodjenja = new JLabel();
		datumrodjenja.setText("Datum rodjenja*");
		datumrodjenja.setPreferredSize(dimenzije);

		poljedatrodj = new JTextField();
		poljedatrodj.setPreferredSize(dimenzije);
		listaKomponenti.add(poljedatrodj);
		Datumrodjenja.add(datumrodjenja);
		Datumrodjenja.add(poljedatrodj);

		panel.add(Datumrodjenja);

		JPanel Adresa = new JPanel(new FlowLayout(FlowLayout.LEFT));

		adresastanovanja = new JLabel();
		adresastanovanja.setText("Adresa stanovanja*");
		adresastanovanja.setPreferredSize(dimenzije);

		poljeadrstan = new JTextField();
		poljeadrstan.setPreferredSize(dimenzije);
		listaKomponenti.add(poljeadrstan);
		Adresa.add(adresastanovanja);
		Adresa.add(poljeadrstan);

		panel.add(Adresa);

		JPanel Telefon = new JPanel(new FlowLayout(FlowLayout.LEFT));

		telefon = new JLabel();
		telefon.setText("Kontakt telefon*");
		telefon.setPreferredSize(dimenzije);

		poljetel = new JTextField();
		poljetel.setPreferredSize(dimenzije);
		listaKomponenti.add(poljetel);
		Telefon.add(telefon);
		Telefon.add(poljetel);

		panel.add(Telefon);

		JPanel Email = new JPanel(new FlowLayout(FlowLayout.LEFT));

		email = new JLabel();
		email.setText("E-mail*");
		email.setPreferredSize(dimenzije);

		poljeemail = new JTextField();
		poljeemail.setPreferredSize(dimenzije);
		listaKomponenti.add(poljeemail);
		Email.add(email);
		Email.add(poljeemail);

		panel.add(Email);

		JPanel AdresaKancelarije = new JPanel(new FlowLayout(FlowLayout.LEFT));

		adresakancelarije = new JLabel();
		adresakancelarije.setText("Adresa kancelarije*");
		adresakancelarije.setPreferredSize(dimenzije);

		poljeadrkan = new JTextField();
		poljeadrkan.setPreferredSize(dimenzije);
		listaKomponenti.add(poljeadrkan);
		AdresaKancelarije.add(adresakancelarije);
		AdresaKancelarije.add(poljeadrkan);

		panel.add(AdresaKancelarije);

		JPanel BrojLicneKarte = new JPanel(new FlowLayout(FlowLayout.LEFT));

		brojlicnekarte = new JLabel();
		brojlicnekarte.setText("Broj licne karte*");
		brojlicnekarte.setPreferredSize(dimenzije);

		poljebrlickarte = new JTextField();
		poljebrlickarte.setPreferredSize(dimenzije);
		listaKomponenti.add(poljebrlickarte);
		BrojLicneKarte.add(brojlicnekarte);
		BrojLicneKarte.add(poljebrlickarte);

		panel.add(BrojLicneKarte);

		for (int i = 0; i <= listaKomponenti.size() - 1; i++) {
			vrednostPopunjenostiKomponenti.add(i, false);
		}

		JPanel Titula = new JPanel(new FlowLayout(FlowLayout.LEFT));

		titula = new JLabel();
		titula.setText("Titula*");
		titula.setPreferredSize(dimenzije);

		combotitula = new JComboBox<String>();
		combotitula.setModel(
				new DefaultComboBoxModel<String>(new String[] { "DIPLOMIRANI INZENJER", "MAGISTAR", "DOKTOR NAUKA" }));

		Titula.add(titula);
		Titula.add(combotitula);

		panel.add(Titula);

		JPanel Zvanje = new JPanel(new FlowLayout(FlowLayout.LEFT));

		zvanje = new JLabel();
		zvanje.setText("Zvanje*");
		zvanje.setPreferredSize(dimenzije);

		combozvanja = new JComboBox<String>();
		combozvanja.setModel(new DefaultComboBoxModel<String>(new String[] { "ASISTENT", "VANREDNI PROFESOR", "DOCENT", "REDOVNI PROFESOR", "DEKAN" }));

		Zvanje.add(zvanje);
		Zvanje.add(combozvanja);
		panel.add(Zvanje);

		panel.add(Box.createVerticalStrut(20));

		poljeime.getDocument().addDocumentListener(new ProfesorDocumentListener(this, poljeime, regexIme));

		poljeprz.getDocument().addDocumentListener(new ProfesorDocumentListener(this, poljeprz, regexPrzime));

		poljedatrodj.getDocument().addDocumentListener(new ProfesorDocumentListener(this, poljedatrodj, regexDatumRodjenja));

		poljeadrstan.getDocument().addDocumentListener(new ProfesorDocumentListener(this, poljeadrstan, regexAdresaStanovanja));

		poljetel.getDocument().addDocumentListener(new ProfesorDocumentListener(this, poljetel, regexTelefon));

		poljeemail.getDocument().addDocumentListener(new ProfesorDocumentListener(this, poljeemail, regexEmail));

		poljeadrkan.getDocument().addDocumentListener(new ProfesorDocumentListener(this, poljeadrkan, regexAdresaKancelarije));

		poljebrlickarte.getDocument().addDocumentListener(new ProfesorDocumentListener(this, poljebrlickarte, regexBrLicneKarte));

		potvrdi = new JButton("Potvrdi");
		
		potvrdi.setEnabled(checkifAllValid());
		
		odustani = new JButton("Odustani");

		if (daLiJeIzmena) {

			rowSelectedIndex = PanelProfesori.tableProfesori.getSelectedRow();

			if (rowSelectedIndex >= 0) {
				rowSelectedIndex = PanelProfesori.tableProfesori.convertRowIndexToModel(rowSelectedIndex);

				profesor = BazaProfesora.getInstance().getRow(rowSelectedIndex);

				imeProfesora = profesor.getIme();
				prezimeProfesora = profesor.getPrezime();
				datumRodjenjaProfesora = profesor.getDatumrodjenja();
				adresaStanovanjaProfesora = profesor.getAdresastanovanja();
				telefonProfesora = profesor.getKontakttelefona();
				emailProfesora = profesor.getEmail();
				adresaKancelarijeProfesora = profesor.getAdresakancelarije();
				brojLicneKarteProfesora = profesor.getBrlicne();
				titulaProfesora = profesor.getTitula();
				zvanjeProfesora = profesor.getZvanje();

				poljeime.setText(imeProfesora);
				poljeprz.setText(prezimeProfesora);
				poljedatrodj.setText(datumRodjenjaProfesora);
				poljeadrstan.setText(adresaStanovanjaProfesora);
				poljetel.setText(telefonProfesora);
				poljeemail.setText(emailProfesora);
				poljeadrkan.setText(adresaKancelarijeProfesora);
				poljebrlickarte.setText(brojLicneKarteProfesora);
				poljebrlickarte.setEnabled(false);

				if (profesor.getTitula() == titule.DIPLOMIRANIINZENJER) {
					stringTitula = "DIPLOMIRANI INZENJER";
				} else if (profesor.getTitula() == titule.DOKTORNAUKA) {
					stringTitula = "DOKTOR NAUKA";
				} else {
					stringTitula = "MAGISTAR";
				}

				if (profesor.getZvanje() == zvanja.REDOVNIPROFESOR) {
					stringZvanje = "REDOVNI PROFESOR";
				} else if (profesor.getZvanje() == zvanja.VANREDNIPROFESOR) {
					stringZvanje = "VANREDNI PROFESOR";
				} else if (profesor.getZvanje() == zvanja.ASISTENT) {
					stringZvanje = "ASISTENT";
				} else if (profesor.getZvanje() == zvanja.DOCENT) {
					stringZvanje = "DOCENT";
				} else {
					stringZvanje = "DEKAN";
				}

				combotitula.setSelectedItem(stringTitula);
				combozvanja.setSelectedItem(stringZvanje);
			}
		}

		JPanel panelDugmici = new JPanel();
		panelDugmici.setLayout(new BoxLayout(panelDugmici, BoxLayout.X_AXIS));

		Dimension dimenzijadugmica = new Dimension(100, 35);
		
		potvrdi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (!daLiJeIzmena) {
					
					if(!postoji(poljebrlickarte.getText()))
					{
						if ((!poljeime.getText().equals("")) && (!poljeprz.getText().equals(""))
								&& (!poljedatrodj.getText().equals("")) && (!poljeadrstan.getText().equals(""))
								&& (!poljetel.getText().equals("")) && (!poljeemail.getText().equals(""))
								&& (!poljeadrkan.getText().equals("")) && (!poljebrlickarte.getText().equals(""))) {
							imeProfesora = poljeime.getText();
							prezimeProfesora = poljeprz.getText();
							datumRodjenjaProfesora = poljedatrodj.getText();
							adresaStanovanjaProfesora = poljeadrstan.getText();
							telefonProfesora = poljetel.getText();
							emailProfesora = poljeemail.getText();
							adresaKancelarijeProfesora = poljeadrkan.getText();
							brojLicneKarteProfesora = poljebrlickarte.getText();
	
							if (combotitula.getSelectedItem().toString().equals("DIPLOMIRANI INZENJER")) {
								titulaProfesora = titule.DIPLOMIRANIINZENJER;
							} else if (combotitula.getSelectedItem().toString().equals("DOKTOR NAUKA")) {
								titulaProfesora = titule.DOKTORNAUKA;
							} else {
								titulaProfesora = titule.MAGISTAR;
							}
	
							if (combozvanja.getSelectedItem().toString().equals("REDOVNI PROFESOR")) {
								zvanjeProfesora = zvanja.REDOVNIPROFESOR;
							} else if (combozvanja.getSelectedItem().toString().equals("VANREDNI PROFESOR")) {
								zvanjeProfesora = zvanja.VANREDNIPROFESOR;
							} else if (combozvanja.getSelectedItem().toString().equals("ASISTENT")) {
								zvanjeProfesora = zvanja.ASISTENT;
							} else if (combozvanja.getSelectedItem().toString().equals("DOCENT")) {
								zvanjeProfesora = zvanja.DOCENT;
							} else {
								zvanjeProfesora = zvanja.DEKAN;
							}
							
							predmeti = new ArrayList<Predmet>();
							
							ProfesorController.getInstance().dodajProfesora(imeProfesora, prezimeProfesora,
									datumRodjenjaProfesora, adresaStanovanjaProfesora, telefonProfesora, emailProfesora,
									adresaKancelarijeProfesora, brojLicneKarteProfesora, titulaProfesora, zvanjeProfesora, predmeti);
	
							setVisible(false);
						}
						
					}
				} else {
					imeProfesora = poljeime.getText();
					prezimeProfesora = poljeprz.getText();
					datumRodjenjaProfesora = poljedatrodj.getText();
					adresaStanovanjaProfesora = poljeadrstan.getText();
					telefonProfesora = poljetel.getText();
					emailProfesora = poljeemail.getText();
					adresaKancelarijeProfesora = poljeadrkan.getText();

					if (combotitula.getSelectedItem().toString().equals("DIPLOMIRANI INZENJER")) {
						titulaProfesora = titule.DIPLOMIRANIINZENJER;
					} else if (combotitula.getSelectedItem().toString().equals("DOKTOR NAUKA")) {
						titulaProfesora = titule.DOKTORNAUKA;
					} else {
						titulaProfesora = titule.MAGISTAR;
					}

					if (combozvanja.getSelectedItem().toString().equals("REDOVNI PROFESOR")) {
						zvanjeProfesora = zvanja.REDOVNIPROFESOR;
					} else if (combozvanja.getSelectedItem().toString().equals("VANREDNI PROFESOR")) {
						zvanjeProfesora = zvanja.VANREDNIPROFESOR;
					} else if (combozvanja.getSelectedItem().toString().equals("ASISTENT")) {
						zvanjeProfesora = zvanja.ASISTENT;
					} else if (combozvanja.getSelectedItem().toString().equals("DOCENT")) {
						zvanjeProfesora = zvanja.DOCENT;
					} else {
						zvanjeProfesora = zvanja.DEKAN;
					}

					ProfesorController.getInstance().izmeniProfesora(brojLicneKarteProfesora, imeProfesora,
							prezimeProfesora, datumRodjenjaProfesora, adresaStanovanjaProfesora, telefonProfesora,
							emailProfesora, adresaKancelarijeProfesora, titulaProfesora, zvanjeProfesora);

					setVisible(false);
				}

			}
		});
		potvrdi.setPreferredSize(dimenzijadugmica);

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

		setSize(500, 500);
		setLocationRelativeTo(parent);
	}

	@Override
	public void setValid(JTextField komponenta) {
		for (int i = 0; i <= listaKomponenti.size() - 1; i++) {
			if (listaKomponenti.get(i) == komponenta) {

				vrednostPopunjenostiKomponenti.set(i, true); // System.out.println("TO TRUE");
			}
		}
	}

	@Override
	public void setInvalid(JTextField komponenta) {
		for (int i = 0; i <= listaKomponenti.size() - 1; i++) {
			if (listaKomponenti.get(i) == komponenta) {

				vrednostPopunjenostiKomponenti.set(i, false); // System.out.println("TO FALSE");
			}
		}
	}

	@Override
	public boolean checkifAllValid() {

		for (int i = 0; i <= vrednostPopunjenostiKomponenti.size() - 1; i++) {
			if (vrednostPopunjenostiKomponenti.get(i) == false) {

				potvrdi.setEnabled(false); // System.out.println("Check");
				return false;
			}
		}

		potvrdi.setEnabled(true);
		return true;
	}
	
	public boolean postoji(String brLiceneProfesora)
	{
		for(Profesor p : BazaProfesora.getInstance().getProfesori())
		{
			if(p.getBrlicne().equals(brLiceneProfesora))
			{
				JOptionPane.showMessageDialog(null, "Uneli ste br. licen karte profesora koji vec postoji u bazi podataka!", "Greska", JOptionPane.ERROR_MESSAGE);
				poljebrlickarte.setText("");
				return true;
			}
		}
		
		return false;
	}
}