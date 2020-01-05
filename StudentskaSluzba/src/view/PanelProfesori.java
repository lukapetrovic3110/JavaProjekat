package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PanelProfesori extends JPanel {

	private static final long serialVersionUID = -8834895513188479593L;
	public static ProfesorJTable tableProfesori;
	private JPanel leftPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	private JPanel topPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JScrollPane scrollPane;

	public PanelProfesori() {
		setLayout(new BorderLayout());
		add(leftPanel, BorderLayout.WEST);
		leftPanel.setBackground(Color.LIGHT_GRAY);
		add(rightPanel, BorderLayout.EAST);
		rightPanel.setBackground(Color.LIGHT_GRAY);
	}

	public PanelProfesori(Component c, int i, int j) {
		this();
		leftPanel.setPreferredSize(new Dimension(i, j));
		rightPanel.setPreferredSize(new Dimension(i, j));
		add(c, BorderLayout.CENTER);
	}

	public PanelProfesori(int sirina, int visina) {

		setLayout(new BorderLayout());
		tableProfesori = new ProfesorJTable();

		leftPanel.setPreferredSize(new Dimension(35, 20));
		this.add(leftPanel, BorderLayout.WEST);
		leftPanel.setBackground(Color.WHITE);

		rightPanel.setPreferredSize(new Dimension(35, 20));
		this.add(rightPanel, BorderLayout.EAST);
		rightPanel.setBackground(Color.WHITE);

		topPanel.setPreferredSize(new Dimension(20, 35));
		this.add(topPanel, BorderLayout.NORTH);
		topPanel.setBackground(Color.WHITE);

		bottomPanel.setPreferredSize(new Dimension(20, 100));
		this.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setBackground(Color.WHITE);

		tableProfesori.setPreferredSize(new Dimension(sirina - 75, visina));

		scrollPane = new JScrollPane(tableProfesori, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.add(scrollPane, BorderLayout.CENTER);

		azurirajPrikaz();
	}

	public static void azurirajPrikaz() {

		ProfesorTableModel model = (ProfesorTableModel) tableProfesori.getModel();
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
}
