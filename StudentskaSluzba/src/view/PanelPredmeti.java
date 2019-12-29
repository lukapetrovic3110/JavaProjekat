package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import java.awt.ScrollPane;

public class PanelPredmeti extends JPanel{
	
	private static final long serialVersionUID = -7962103450323241058L;
	private JTable tablePredmeti;

	public PanelPredmeti()
	{
		
		TabbedPane.panelstdunt = false;
		TabbedPane.panelprofesor = false;
		TabbedPane.panelpredmet = true;
		
		setLayout(new BorderLayout(0, 0));
		
		ScrollPane scrollPane = new ScrollPane();
		this.add(scrollPane, BorderLayout.CENTER);
		
		tablePredmeti = new JTable();
		scrollPane.add(tablePredmeti);
		
	}
}
