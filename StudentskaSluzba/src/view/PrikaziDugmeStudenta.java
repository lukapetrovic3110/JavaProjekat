package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controller.StudentController;

public class PrikaziDugmeStudenta extends JDialog {

	JList<String> lista;
	JButton btn1=new JButton("Odustanak");
	JButton btn2=new JButton("Potvrda");
	
	public PrikaziDugmeStudenta(JFrame parentFrame, boolean modal, boolean daLiJeIzmena) {
		super(parentFrame, "Dodavanje studenta", modal);
		
		JPanel panCenter = new JPanel();
		BoxLayout boxCenter = new BoxLayout(panCenter, BoxLayout.Y_AXIS);
		panCenter.setLayout(boxCenter);
		
		this.add(panCenter, BorderLayout.CENTER);

		int rowSelected = PanelStudenti.tableStudenti.getSelectedRow();
		String podaci[] = StudentController.getInstance().izlistajPredmeteZaStudente(rowSelected);
		
		Dimension dim = new Dimension(160, 25);
		JScrollPane pan = new JScrollPane();
		lista = new JList<String>(podaci);
		pan.setViewportView(lista);
		panCenter.add(pan);
		/*JPanel dugmad = new JPanel(new FlowLayout());
		btn1.setSize(dim);
		btn2.setSize(dim);
		dugmad.add(btn1);
		dugmad.add(btn2);
		panCenter.add(dugmad);*/
		setSize(200, 200);
		setLocationRelativeTo(parentFrame);
	}
}
