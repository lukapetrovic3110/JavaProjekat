package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import javafx.scene.control.ComboBox;

public class DodavanjeStudenta extends JDialog {
	private static final long serialVersionUID = 3591599721565020284L;

	private JLabel ime;
	private JLabel prezime;
	private JLabel datumr;
	private JLabel adresa;
	private JLabel tel;
	private JLabel brindeksa;
	private JLabel godinastud;
	private JLabel samo1;
	private JLabel budzet1;
	private JComboBox god2;
	private JRadioButton samo;
	private JRadioButton budzet;

	private JTextField im, prz, datr, adr, t, bri;
	

	public DodavanjeStudenta(JFrame parentFrame, boolean modal) {

		super(parentFrame, "Dodavanje studenta", modal);

		JPanel panCenter = new JPanel();
		BoxLayout boxCenter = new BoxLayout(panCenter, BoxLayout.Y_AXIS);
		panCenter.setLayout(boxCenter);
		
		this.add(panCenter, BorderLayout.CENTER);

		Dimension dim = new Dimension(160, 25);
		
		MyFocusListener focusListener = new MyFocusListener();
		
		JPanel Ime = new JPanel(new FlowLayout(FlowLayout.LEFT));
		ime = new JLabel();
		ime.setText("Ime*");
		ime.setPreferredSize(dim);
		im = new JTextField();
		im.setPreferredSize(dim);
		Ime.add(ime);
		Ime.add(im);
		
		panCenter.add(Ime);
		im.setBackground(Color.GRAY);
		im.setName("txtIme");
		im.addFocusListener(focusListener);
		//JPanel panFocusListener = new FocusListenerPanel();
		//panCenter.add(panFocusListener);
		
		JPanel Prezime = new JPanel(new FlowLayout(FlowLayout.LEFT));
		prezime = new JLabel();
		prezime.setText("prezime*");
		prezime.setPreferredSize(dim);
		prz = new JTextField();
		prz.setPreferredSize(dim);
		Prezime.add(prezime);
		Prezime.add(prz);

		panCenter.add(Prezime);
		
		
		
		JPanel Datum = new JPanel(new FlowLayout(FlowLayout.LEFT));
		datumr = new JLabel();
		datumr.setText("Datum rodjenja*");
		datumr.setPreferredSize(dim);
		datr = new JTextField();
		datr.setPreferredSize(dim);
		Datum.add(datumr);
		Datum.add(datr);

		panCenter.add(Datum);
		
		JPanel Adresa = new JPanel(new FlowLayout(FlowLayout.LEFT));
		adresa = new JLabel();
		adresa.setText("Adresa stanovanja*");
		adresa.setPreferredSize(dim);
		adr = new JTextField();
		adr.setPreferredSize(dim);
		Adresa.add(adresa);
		Adresa.add(adr);

		panCenter.add(Adresa);
		
		JPanel Tel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		tel = new JLabel();
		tel.setText("Broj telefona*");
		tel.setPreferredSize(dim);
		t = new JTextField();
		t.setPreferredSize(dim);
		Tel.add(tel);
		Tel.add(t);

		panCenter.add(Tel);
		
		JPanel Br = new JPanel(new FlowLayout(FlowLayout.LEFT));
		brindeksa = new JLabel();
		brindeksa.setText("Broj indeksa*");
		brindeksa.setPreferredSize(dim);
		bri = new JTextField();
		bri.setPreferredSize(dim);
		Br.add(brindeksa);
		Br.add(bri);

		panCenter.add(Br);
		
		
		
		JPanel God = new JPanel(new FlowLayout(FlowLayout.LEFT));
		godinastud = new JLabel();
		godinastud.setText("Trenutna godina studija*");
		godinastud.setPreferredSize(dim);
		     
		
		ComboBoxModel god1=new DefaultComboBoxModel(new String[] {"I (PRVA)",
				"II (DRUGA)", "III (TRECA)", "IV (CETVRTA)" });

		god2=new JComboBox();
		God.add(godinastud);
		God.add(god2);
		god2.setModel(god1);
		

		panCenter.add(God);
		
		Dimension dim2 = new Dimension(120, 25);
		JPanel Novo = new JPanel(new FlowLayout(FlowLayout.LEFT));
		samo1 = new JLabel();
		samo1.setText("Samofinansiranje");
		samo1.setPreferredSize(dim2);
		Novo.add(samo1);
		
		samo = new JRadioButton();
	    samo.setMnemonic(KeyEvent.VK_B);
	    Novo.add(samo);
	    samo.setSelected(true);
	    panCenter.add(Novo);
		
	    JPanel Novo2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		budzet1 = new JLabel();
		budzet1.setText("Budzet");
		budzet1.setPreferredSize(dim2);
		Novo2.add(budzet1);
		
		budzet = new JRadioButton();
		budzet.setMnemonic(KeyEvent.VK_B);
	    Novo2.add(budzet);
	    panCenter.add(Novo2);
	    
	    ButtonGroup btnGroup1 = new ButtonGroup();
		btnGroup1.add(samo);
		btnGroup1.add(budzet);
		
		panCenter.add(Box.createVerticalStrut(25));
		add(panCenter, BorderLayout.CENTER);
		
		JPanel panBottom = new JPanel();
		BoxLayout box = new BoxLayout(panBottom, BoxLayout.X_AXIS);
		panBottom.setLayout(box);

		JButton btn1 = new JButton("Potvrdi");
		btn1.setPreferredSize(new Dimension(100, 35));

		JButton btn2 = new JButton("Odustani");
		btn2.setPreferredSize(new Dimension(100, 35));
		panBottom.add(Box.createGlue());
		panBottom.add(btn1);
		panBottom.add(Box.createHorizontalStrut(20));
		panBottom.add(btn2);
		panBottom.add(Box.createHorizontalStrut(10));
		
		add(panBottom, BorderLayout.SOUTH);
		pack();

		setSize(500, 500);
		setLocationRelativeTo(parentFrame);

	}


	/*
	 * Dimension dim = new Dimension(150, 20);
	 * 
	 * JPanel panPrezime = new JPanel(new FlowLayout(FlowLayout.LEFT)); JLabel
	 * lblPrezime = new JLabel("Prezime:"); lblPrezime.setPreferredSize(dim);
	 * 
	 * JTextField txtPrezime = new JTextField(); txtPrezime.setPreferredSize(dim);
	 * 
	 * panPrezime.add(lblPrezime); panPrezime.add(txtPrezime);
	 * 
	 * JPanel panIme = new JPanel(new FlowLayout(FlowLayout.LEFT)); JLabel lblIme =
	 * new JLabel("Ime:"); lblIme.setPreferredSize(dim); JTextField txtIme = new
	 * JTextField(); txtIme.setPreferredSize(dim); panIme.add(lblIme);
	 * panIme.add(txtIme);
	 */

	// myFocusListener za obavezna polja
	
/*	@Override
	public void focusGained(FocusEvent arg0) {

		JTextField txt = (JTextField) arg0.getComponent();
		txt.setBackground(Color.RED);

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		JTextField txt = (JTextField) arg0.getComponent();
		txt.setBackground(Color.WHITE);

		// polje prezime je obavezno za unos:
		if (txt.getName().equals("txtPrezime")) {

			if (txt.getText().trim().equals("") || txt.getText().trim().equals("Unesite prezime...")) {
				txt.setText("Unesite prezime...");
				txt.requestFocus();
				txt.setForeground(Color.RED);
			} else {
				txt.setForeground(Color.BLACK);
			}
		}

	}
	JPanel panFocusListener = new FocusListenerPanel();
	panCentar.add(panFocusListener); */
}
