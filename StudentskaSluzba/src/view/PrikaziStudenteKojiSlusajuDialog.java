package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import controller.PredmetController;
import model.Student;

public class PrikaziStudenteKojiSlusajuDialog extends JDialog {

	private static final long serialVersionUID = 5001638337905015201L;
	private JList<String> lista;
	private JButton btnObrisi = new JButton("Obrisi");
	private JButton btnNazad = new JButton("Nazad");
	
	public PrikaziStudenteKojiSlusajuDialog(JFrame parentFrame, boolean modal) {
		super(parentFrame, "Studenti koji slusaju predmet", modal);
		
		JPanel panCenter = new JPanel();
		BoxLayout boxCenter = new BoxLayout(panCenter, BoxLayout.Y_AXIS);
		panCenter.setLayout(boxCenter);
		
		this.add(panCenter, BorderLayout.CENTER);

		int rowSelected = PanelPredmeti.tablePredmeti.getSelectedRow();
		String podaci[] = PredmetController.getInstance().izlistajStudenteZaPredmet(rowSelected);
		
		Dimension dim = new Dimension(160, 25);
		JScrollPane pan = new JScrollPane();
		
		DefaultListModel<String> model = new DefaultListModel<>();
		JList<String> lista = new JList<>( model );
		for ( int i = 0; i < podaci.length; i++ ){
		  model.addElement( podaci[i]);
		}
		
		
		pan.setViewportView(lista);
		panCenter.add(pan);
		
		
		
		JPanel dugmad = new JPanel(new FlowLayout());
		btnObrisi.setSize(dim);
		btnObrisi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = lista.getSelectedIndex();
				if (selectedIndex != -1) 
				    model.remove(selectedIndex);
			}
		});
		
		
		btnNazad.setSize(dim);
		btnNazad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
		});
		dugmad.add(btnObrisi);
		dugmad.add(btnNazad);
		panCenter.add(dugmad);
		
		setSize(400, 200);
		setLocationRelativeTo(parentFrame);
	}
}
