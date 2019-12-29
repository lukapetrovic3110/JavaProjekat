package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import sun.swing.SwingAccessor.JLightweightFrameAccessor;
import javax.swing.ScrollPaneConstants;


public class PanelStudenti extends JPanel{
	
	private static final long serialVersionUID = 2883721902577408910L;
	private StudentiJTable tableStudenti;
	
	public PanelStudenti() {
		
		setBackground(Color.WHITE);
		TabbedPane.panelstdunt = true;
		TabbedPane.panelprofesor = false;
		TabbedPane.panelpredmet = false;
		
		setLayout(new BorderLayout(0, 0));
		tableStudenti = new StudentiJTable();
		

		JScrollPane scrollPane = new JScrollPane(tableStudenti);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(this.getWidth()/3,this.getHeight()/3));
		
		
		/*tableStudenti.getColumnModel().getColumn(0).setPreferredWidth(110);
		tableStudenti.getColumnModel().getColumn(1).setPreferredWidth(144);
		tableStudenti.getColumnModel().getColumn(2).setPreferredWidth(138);
		tableStudenti.getColumnModel().getColumn(3).setPreferredWidth(150);
		tableStudenti.getColumnModel().getColumn(4).setPreferredWidth(159);
		*/
		
		this.add(scrollPane, BorderLayout.CENTER);
	}
}
