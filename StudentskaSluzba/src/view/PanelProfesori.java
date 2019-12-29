package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelProfesori extends JPanel{
	
	private static final long serialVersionUID = -8834895513188479593L;
	private JTable tableProfesori;

	public PanelProfesori()
	{
		setLayout(new BorderLayout(0, 0));
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setPreferredSize(new Dimension(this.getWidth()/3,this.getHeight()/3));
		this.add(scrollPane, BorderLayout.CENTER);
		
		tableProfesori = new JTable();
		tableProfesori.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ime", "Prezime", "Datum rodjenja", "Adresa stanovanja", "Kontakt telefon", "E-mail", "Adresa kancelarije", "Broj licne", "Titula", "Spisak predmeta", "Zvanje"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Object.class, String.class, String.class, String.class, String.class, Integer.class, String.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableProfesori.getColumnModel().getColumn(0).setPreferredWidth(110);
		tableProfesori.getColumnModel().getColumn(1).setPreferredWidth(144);
		tableProfesori.getColumnModel().getColumn(2).setPreferredWidth(138);
		tableProfesori.getColumnModel().getColumn(3).setPreferredWidth(150);
		tableProfesori.getColumnModel().getColumn(4).setPreferredWidth(159);
		scrollPane.add(tableProfesori);
		
		TabbedPane.panelstdunt = false;
		TabbedPane.panelprofesor = true;
		TabbedPane.panelpredmet = false;
	}
}
