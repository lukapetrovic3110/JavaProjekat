package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanelProfesori extends JPanel{
	
	private static final long serialVersionUID = -8834895513188479593L;
	private ProfesorJTable tableProfesori;
	private JPanel leftPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	private JPanel topPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JScrollPane scrollPane;
	
	public PanelProfesori(int sirina, int visina){
		TabbedPane.panelstdunt = false;
		TabbedPane.panelprofesor = true;
		TabbedPane.panelpredmet = false;
		
		setLayout(new BorderLayout(0, 0));
		tableProfesori = new ProfesorJTable();
		
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
		
		tableProfesori.setPreferredSize(new Dimension(sirina-75, visina));
		
		scrollPane = new JScrollPane(tableProfesori, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
		this.add(scrollPane, BorderLayout.CENTER);	
	}
}
