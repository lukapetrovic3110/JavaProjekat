package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
	
	public DialogDodavanjePredmeta(JFrame parent, boolean modal){
		
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
		
		JPanel panelDugmici = new JPanel();
		panelDugmici.setLayout(new BoxLayout(panelDugmici, BoxLayout.X_AXIS));
		
		Dimension dimenzijadugmica = new Dimension(100,35);
		
		potvrdi = new JButton("Potvrdi");
		potvrdi.setPreferredSize(dimenzijadugmica);
		
		odustani = new JButton("Odustani");
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
