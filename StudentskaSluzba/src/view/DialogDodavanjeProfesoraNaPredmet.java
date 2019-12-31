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
/**
 * @author Luka ra25-2017
 */
public class DialogDodavanjeProfesoraNaPredmet extends JDialog{
	
	private static final long serialVersionUID = 4428728189585177896L;
	
	private JLabel brlickarteprof;
	private JTextField poljebrlickarteprof;
	private JButton potvrdi;
	private JButton odustani;
	
	public DialogDodavanjeProfesoraNaPredmet(JFrame parent, boolean modal)
	{

		super(parent, "Predmet - dodavanje profesora", modal);
	
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.add(panel, BorderLayout.CENTER);
		
		Dimension dimenzije1 = new Dimension(160, 25);
		Dimension dimenzije2 = new Dimension(250, 25);
		
		panel.add(Box.createVerticalStrut(20));
		
		JPanel BrLicneProf = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		brlickarteprof = new JLabel();
		brlickarteprof.setText("Broj licne karte profesora*");
		brlickarteprof.setPreferredSize(dimenzije1);
		
		poljebrlickarteprof = new JTextField();
		poljebrlickarteprof.setPreferredSize(dimenzije2);
		
		BrLicneProf.add(Box.createHorizontalStrut(15));
		BrLicneProf.add(brlickarteprof);
		BrLicneProf.add(Box.createHorizontalStrut(20));
		BrLicneProf.add(poljebrlickarteprof);
		BrLicneProf.add(Box.createHorizontalStrut(5));
		panel.add(BrLicneProf);
				
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
