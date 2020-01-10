package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.BazaStudenata;
import model.Student;



public class PanelStudenti extends JPanel{
	
	private static final long serialVersionUID = 2883721902577408910L;
	private static PanelStudenti instance = null;
	public static PanelStudenti getInstance() {
		if (instance == null) {
			instance = new PanelStudenti();
		}
		return instance;
	}
	public static StudentiJTable tableStudenti;
	private JPanel leftPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	private JPanel topPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JScrollPane scrollPane;
	
	public PanelStudenti() {
		setLayout(new BorderLayout());
		add(leftPanel, BorderLayout.WEST);
		leftPanel.setBackground(Color.LIGHT_GRAY);
		add(rightPanel, BorderLayout.EAST);
		rightPanel.setBackground(Color.LIGHT_GRAY);
	}

	public PanelStudenti(Component c, int i, int j) {
		this();
		leftPanel.setPreferredSize(new Dimension(i, j));
		rightPanel.setPreferredSize(new Dimension(i, j));
		add(c, BorderLayout.CENTER);
	}
	
	public PanelStudenti(int sirina, int visina) {
		
		setLayout(new BorderLayout());
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
		
		azurirajPrikaz();
	}
	 public static void azurirajPrikaz() {
			
	    	StudentTableModel model = (StudentTableModel) tableStudenti.getModel();
			model.fireTableDataChanged();
		}
	 @Override
		public void setBackground(Color bg) {
			// TODO Auto-generated method stub
			super.setBackground(bg);
			if (leftPanel == null || rightPanel == null)
				return;
			leftPanel.setBackground(bg);
			rightPanel.setBackground(bg);
		}

	public static StudentiJTable getTableStudenti() {
		return tableStudenti;
	}

	public static void setTableStudenti(StudentiJTable tableStudenti) {
		PanelStudenti.tableStudenti = tableStudenti;
	}
	 
}
