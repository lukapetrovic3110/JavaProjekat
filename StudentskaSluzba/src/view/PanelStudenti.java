package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class PanelStudenti extends JPanel{
	
	private static final long serialVersionUID = 2883721902577408910L;
	private StudentiJTable tableStudenti;
	private JPanel leftPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	private JPanel topPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JScrollPane scrollPane;
	
	public PanelStudenti(int sirina, int visina) {
		TabbedPane.panelstdunt = true;
		TabbedPane.panelprofesor = false;
		TabbedPane.panelpredmet = false;
		
		setLayout(new BorderLayout(0, 0));
		tableStudenti = new StudentiJTable();
		
		leftPanel.setPreferredSize(new Dimension(35,20));
		this.add(leftPanel, BorderLayout.WEST);
		leftPanel.setBackground(Color.WHITE);
		
		rightPanel.setPreferredSize(new Dimension(35,20));
		this.add(rightPanel, BorderLayout.EAST);
		rightPanel.setBackground(Color.WHITE);
		
		topPanel.setPreferredSize(new Dimension(20,35));
		this.add(topPanel, BorderLayout.NORTH);
		topPanel.setBackground(Color.WHITE);
		
		bottomPanel.setPreferredSize(new Dimension(20,100));
		this.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setBackground(Color.WHITE);
			
		tableStudenti.setPreferredSize(new Dimension(sirina-75, visina));
	
		
		scrollPane = new JScrollPane(tableStudenti, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		
		this.add(scrollPane, BorderLayout.CENTER);
	}
}
