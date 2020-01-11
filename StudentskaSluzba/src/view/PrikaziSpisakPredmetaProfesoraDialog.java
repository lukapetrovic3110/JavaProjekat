package view;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.ProfesorController;

public class PrikaziSpisakPredmetaProfesoraDialog extends JDialog {

	private static final long serialVersionUID = 5001638337905015201L;
	private JList<String> lista;
	
	public PrikaziSpisakPredmetaProfesoraDialog(JFrame parentFrame, boolean modal) {
		super(parentFrame, "Spisak predmeta", modal);
		
		JPanel panCenter = new JPanel();
		BoxLayout boxCenter = new BoxLayout(panCenter, BoxLayout.Y_AXIS);
		panCenter.setLayout(boxCenter);
		
		this.add(panCenter, BorderLayout.CENTER);

		int rowSelected = PanelProfesori.tableProfesori.getSelectedRow();
		String podaci[] = ProfesorController.getInstance().izlistajPredmeteZaProfesore(rowSelected);
		
		JScrollPane pan = new JScrollPane();
		lista = new JList<String>(podaci);
		pan.setViewportView(lista);
		panCenter.add(pan);
		
		setSize(400, 200);
		setLocationRelativeTo(parentFrame);
	}
}
