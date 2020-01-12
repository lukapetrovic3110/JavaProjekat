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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DialogDodavanjeStudentaNaPredmet extends JDialog{
	
	private static final long serialVersionUID = 4428728189585177896L;
	
	private JLabel indeksstudenta;
	private JTextField poljeindeksstudenta;
	private JButton potvrdi;
	private JButton odustani;
	int rowSelectedIndex;
	public DialogDodavanjeStudentaNaPredmet(JFrame parent, boolean modal)
	{

		super(parent, "Predmet - dodavanje studenta", modal);
	
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.add(panel, BorderLayout.CENTER);
		
		Dimension dimenzije1 = new Dimension(160, 25);
		Dimension dimenzije2 = new Dimension(250, 25);
		
		panel.add(Box.createVerticalStrut(20));
		
		JPanel IndeksStudenta = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		indeksstudenta = new JLabel();
		indeksstudenta.setText("Indeks studenta*");
		indeksstudenta.setPreferredSize(dimenzije1);
		
		poljeindeksstudenta = new JTextField();
		poljeindeksstudenta.setPreferredSize(dimenzije2);
		
		IndeksStudenta.add(Box.createHorizontalStrut(15));
		IndeksStudenta.add(indeksstudenta);
		IndeksStudenta.add(Box.createHorizontalStrut(20));
		IndeksStudenta.add(poljeindeksstudenta);
		IndeksStudenta.add(Box.createHorizontalStrut(5));
		panel.add(IndeksStudenta);
				
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
		
		this.setSize(500, 200);
		this.setLocationRelativeTo(parent);
	}
}
