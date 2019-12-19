package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridBagLayout;

public class PanelPredmeti extends JPanel{
	
	private static final long serialVersionUID = -7962103450323241058L;

	public PanelPredmeti()
	{
		TabbedPane.panelstdunt = false;
		TabbedPane.panelprofesor = false;
		TabbedPane.panelpredmet = true;
		
	}
}
