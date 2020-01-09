package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.StudentController;
import model.BazaStudenata;
import model.Student;
import model.Student.status;

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
	private JLabel email;
	private JLabel datumupisa;
	private JLabel prosekocena;
	private JComboBox<String> god2;
	private JRadioButton samo;
	private JRadioButton budzet;

	private JTextField im, prz, datr, adr, t, bri,datu,em,p;
	
	private String imes;
	private String prezimes;
	private String datumrs;
	private String adresas;
	private String tels;
	private String emails;
	private String brindeksas;
	private String datumus;
	private double prosek;
    private String godina;
    private status st;
	
	private int rowSelectedIndex;
	private Student s;
	
	public DodavanjeStudenta(JFrame parentFrame, boolean modal, boolean daLiJeIzmena) {

		super(parentFrame, "Dodavanje studenta", modal);

		JPanel panCenter = new JPanel();
		BoxLayout boxCenter = new BoxLayout(panCenter, BoxLayout.Y_AXIS);
		panCenter.setLayout(boxCenter);
		
		this.add(panCenter, BorderLayout.CENTER);

		Dimension dim = new Dimension(160, 25);
		
		
		
		JPanel Ime = new JPanel(new FlowLayout(FlowLayout.LEFT));
		ime = new JLabel();
		ime.setText("Ime*");
		ime.setPreferredSize(dim);
		im = new JTextField();
		im.setPreferredSize(dim);
		Ime.add(ime);
		Ime.add(im);
		
		panCenter.add(Ime);
	
		
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
		
		JPanel Email = new JPanel(new FlowLayout(FlowLayout.LEFT));
		email = new JLabel();
		email.setText("Email*");
		email.setPreferredSize(dim);
		em = new JTextField();
		em.setPreferredSize(dim);
		Email.add(email);
		Email.add(em);

		panCenter.add(Email);
		
		JPanel Prosek = new JPanel(new FlowLayout(FlowLayout.LEFT));
		prosekocena = new JLabel();
		prosekocena.setText("Prosek*");
		prosekocena.setPreferredSize(dim);
		p = new JTextField();
		p.setPreferredSize(dim);
		Prosek.add(prosekocena);
		Prosek.add(p);

		panCenter.add(Prosek);
		
		JPanel Datumu = new JPanel(new FlowLayout(FlowLayout.LEFT));
		datumupisa = new JLabel();
		datumupisa.setText("Datum upisa*");
		datumupisa.setPreferredSize(dim);
		datu = new JTextField();
		datu.setPreferredSize(dim);
		Datumu.add(datumupisa);
		Datumu.add(datu);

		panCenter.add(Datumu);	
		
		JPanel God = new JPanel(new FlowLayout(FlowLayout.LEFT));
		godinastud = new JLabel();
		godinastud.setText("Trenutna godina studija*");
		godinastud.setPreferredSize(dim);
	
		god2=new JComboBox<String>();
		god2.setModel(new DefaultComboBoxModel<String>(new String[] {"I (PRVA)",
				"II (DRUGA)", "III (TRECA)", "IV (CETVRTA)" }));
		
		God.add(godinastud);
		God.add(god2);
		

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

		if (daLiJeIzmena) 
		{
			
			rowSelectedIndex = PanelStudenti.tableStudenti.getSelectedRow();
			
			if (rowSelectedIndex >= 0)
			{
				rowSelectedIndex = PanelStudenti.tableStudenti.convertRowIndexToModel(rowSelectedIndex);
				
				s = BazaStudenata.getInstance().getRow(rowSelectedIndex);
				
				imes=s.getIme();
				prezimes=s.getPrezime();
				datumrs=s.getDatumr();
				adresas=s.getAdresa();
				emails=s.getEmail();
				tels=s.getTel();
				prosek=s.getProsek();
				datumus=s.getDatumu();
				brindeksas=s.getBrindeksa();
				godina = s.getGodinastud();
				st = s.getS();
				
				
				bri.setText(brindeksas);
				bri.setEditable(false);
				im.setText(imes);
				prz.setText(prezimes);
			    datr.setText(datumrs);
				adr.setText(adresas);
				em.setText(emails);
				t.setText(tels);
				p.setText(""+prosek);
				datu.setText(datumus);
				god2.setSelectedItem(godina);
				
				if(st == status.B) {
					samo.setSelected(false);
					budzet.setSelected(true);
				}else
				{
					samo.setSelected(true);
					budzet.setSelected(false);
				}
			
			}
		}
		
		
		
		JButton btn1 = new JButton("Potvrdi");
		btn1.setPreferredSize(new Dimension(100, 35));
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!daLiJeIzmena) 
				{
					if((!im.getText().equals("")) && (!prz.getText().equals("")) && (!datr.getText().equals("")) && (!adr.getText().equals("")) && (!t.getText().equals("")) && (!bri.getText().equals("")) && (!datu.getText().equals("")) && (!em.getText().equals("")) && (!p.getText().equals("")))
					{
						imes = im.getText();
						prezimes = prz.getText();
						datumrs = datr.getText();
						adresas = adr.getText();
						emails = em.getText();
						tels = t.getText();
						prosek = Double.parseDouble(p.getText());
						datumus = datu.getText();
						brindeksas = bri.getText();
						godina = god2.getSelectedItem().toString();
						
						if(samo.isSelected()) 
						{
							st = status.S;
						}else
						{
							st = status.B;
						}
						
					    StudentController.getInstance().dodajStudenta(imes, prezimes, datumrs, adresas, tels, emails, brindeksas, datumus, godina, prosek, st);
							
						setVisible(false);
					}
				}
				else 
				{
					imes = im.getText();
					prezimes = prz.getText();
					datumrs = datr.getText();
					adresas = adr.getText();
					emails = em.getText();
					tels = t.getText();
					prosek = Double.parseDouble(p.getText());
					datumus = datu.getText();
					brindeksas = bri.getText();
					godina = god2.getSelectedItem().toString();
					if(samo.isSelected()) 
					{
						st = status.S;
					}else
					{
						st = status.B;
					}
					
				    StudentController.getInstance().izmeniStudenta(imes, prezimes, datumrs, adresas, tels, emails, brindeksas, datumus, godina, prosek, st);
					
					setVisible(false);
				}
			}
		});
		
		

		JButton btn2 = new JButton("Odustani");
		btn2.setPreferredSize(new Dimension(100, 35));
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
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
