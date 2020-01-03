package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Profesor.titule;
import model.Profesor.zvanja;
/**
 *  @author ra25-2017
 */
public class DialogDodavanjeProfesora extends JDialog{
	
	private static final long serialVersionUID = 5272581017507998104L;
	
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
	//private JComboBox<titule> combotitula;
	//private JComboBox<zvanja> combozvanje;
	private JComboBox combotitula;
	private JComboBox combozvanja;
	
	private JButton potvrdi;
	private JButton odustani;
	
	private String imeProfesora;
	private String prezimeProfesora;
	private String datumrodjenjaProfesora;
	private String adresastanovanjaProfesora;
	private String telefonProfesora;
	private String emailProfesora;
	private String adresakancelarijeProfesora;
	private int brojlicnekarteProfesora;
	private titule titulaProfesora;
	private zvanja zvanjeProfesora;

	public DialogDodavanjeProfesora(JFrame parent, boolean modal) {

		super(parent, "Dodavanje profesora", modal);
	
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.add(panel, BorderLayout.CENTER);
		
		Dimension dimenzije = new Dimension(160, 25);
		
		JPanel Ime = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		ime = new JLabel();
		ime.setText("Ime*");
		ime.setPreferredSize(dimenzije);
		
		poljeime = new JTextField();
		poljeime.setPreferredSize(dimenzije);
		
		Ime.add(ime);
		Ime.add(poljeime);
		
		panel.add(Ime);
		
		JPanel Prezime = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		prezime = new JLabel();
		prezime.setText("Prezime*");
		prezime.setPreferredSize(dimenzije);
		
		poljeprz = new JTextField();
		poljeprz.setPreferredSize(dimenzije);
		
		Prezime.add(prezime);
		Prezime.add(poljeprz);
		
		panel.add(Prezime);	
		
		JPanel Datumrodjenja = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		datumrodjenja = new JLabel();
		datumrodjenja.setText("Datum rodjenja*");
		datumrodjenja.setPreferredSize(dimenzije);
		
		poljedatrodj = new JTextField();
		poljedatrodj.setPreferredSize(dimenzije);
		
		Datumrodjenja.add(datumrodjenja);
		Datumrodjenja.add(poljedatrodj);
		
		panel.add(Datumrodjenja);
		
		JPanel Adresa = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		adresastanovanja = new JLabel();
		adresastanovanja.setText("Adresa stanovanja*");
		adresastanovanja.setPreferredSize(dimenzije);
		
		poljeadrstan = new JTextField();
		poljeadrstan.setPreferredSize(dimenzije);
		
		Adresa.add(adresastanovanja);
		Adresa.add(poljeadrstan);
		
		panel.add(Adresa);
		
		JPanel Telefon = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		telefon = new JLabel();
		telefon.setText("Kontakt telefon*");
		telefon.setPreferredSize(dimenzije);
		
		poljetel = new JTextField();
		poljetel.setPreferredSize(dimenzije);
		
		Telefon.add(telefon);
		Telefon.add(poljetel);
		
		panel.add(Telefon);
		
		JPanel Email = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		email = new JLabel();
		email.setText("E-mail*");
		email.setPreferredSize(dimenzije);
		
		poljeemail = new JTextField();
		poljeemail.setPreferredSize(dimenzije);
		
		Email.add(email);
		Email.add(poljeemail);
		
		panel.add(Email);
		
		JPanel AdresaKancelarije = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		adresakancelarije = new JLabel();
		adresakancelarije.setText("Adresa kancelarije*");
		adresakancelarije.setPreferredSize(dimenzije);
		
		poljeadrkan = new JTextField();
		poljeadrkan.setPreferredSize(dimenzije);
		
		AdresaKancelarije.add(adresakancelarije);
		AdresaKancelarije.add(poljeadrkan);
		
		panel.add(AdresaKancelarije);
		
		JPanel BrojLicneKarte = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		brojlicnekarte = new JLabel();
		brojlicnekarte.setText("Broj licne karte*");
		brojlicnekarte.setPreferredSize(dimenzije);
		
		poljebrlickarte = new JTextField();
		poljebrlickarte.setPreferredSize(dimenzije);
		
		BrojLicneKarte.add(brojlicnekarte);
		BrojLicneKarte.add(poljebrlickarte);
		
		panel.add(BrojLicneKarte);
		
		JPanel Titula = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		titula = new JLabel();
		titula.setText("Titula*");
		titula.setPreferredSize(dimenzije);
		
		combotitula = new JComboBox<titule>();
		combotitula.setModel(new DefaultComboBoxModel(new String[] {"DIPLOMIRANI INZENJER", "MAGISTAR", "DOKTORNAUKA"}));
		//combotitula.setModel(new DefaultComboBoxModel<titule>(new titule[] {titule.DIPLOMIRANIINZENJER, titule.MAGISTAR, titule.DOKTORNAUKA}));
		
		Titula.add(titula);
		Titula.add(combotitula);
		
		panel.add(Titula);
		
		JPanel Zvanje = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		zvanje = new JLabel();
		zvanje.setText("Zvanje*");
		zvanje.setPreferredSize(dimenzije);
		
		combozvanja = new JComboBox<zvanja>();
		combozvanja.setModel(new DefaultComboBoxModel(new String[] {"ASISTENT", "VANREDNI PROFESOR", "DOCENT", "REDOVNI PROFESOR", "DEKAN"}));
		
		Zvanje.add(zvanje);
		Zvanje.add(combozvanja);
		panel.add(Zvanje);
		
		panel.add(Box.createVerticalStrut(20));
		
		JPanel panelDugmici = new JPanel();
		panelDugmici.setLayout(new BoxLayout(panelDugmici, BoxLayout.X_AXIS));
		
		Dimension dimenzijadugmica = new Dimension(100,35);
		
		potvrdi = new JButton("Potvrdi");
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