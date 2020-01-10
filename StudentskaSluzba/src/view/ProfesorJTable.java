package view;

import java.awt.Color;
import java.awt.Component;
import java.util.Comparator;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

public class ProfesorJTable extends JTable {

	private static final long serialVersionUID = -400597157617490769L;
	private TableRowSorter<ProfesorTableModel> sorter;

	public ProfesorJTable() {

		ProfesorTableModel model = new ProfesorTableModel();
		this.setModel(model);
		sorter = new TableRowSorter<ProfesorTableModel>(model);
		sorter.setSortable(3, false);
		sorter.setSortable(4, false);
		sorter.setSortable(5, false);
		sorter.setSortable(6, false);
		sorter.setSortable(7, false);
		sorter.setSortable(8, false);
		sorter.setSortable(9, false);
		sorter.setSortable(10, false);
		this.setRowSorter(sorter);
		this.setRowSelectionAllowed(true);
		this.setColumnSelectionAllowed(true);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		new  PrikaziButtonColumn(this, 10);

		sorter.setComparator(2, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[] god1 = o1.split("\\.");
				String[] god2 = o2.split("\\.");

				if (god1[2].equals(god2[2])) {
					// String mes1 = god1[1];
					// String mes2 = god2[1];
					if (god1[1].equals(god2[1])) {
						if (god1[0].equals(god2[0])) {
							return 0;
						} else if (Integer.parseInt(god1[0]) < (Integer.parseInt(god2[0]))) {
							return -1;
						} else {
							return 1;
						}
					} else if (Integer.parseInt(god1[1]) < (Integer.parseInt(god2[1]))) {
						return -1;
					} else {
						return 1;
					}
				} else if (Integer.parseInt(god1[2]) < (Integer.parseInt(god2[2]))) {
					return -1;
				} else {
					return 1;
				}
			}

		});
	}

	@Override
	public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		Component c = super.prepareRenderer(renderer, row, column);
		// selektovani red ce imati drugaciju boju od ostalih
		if (isRowSelected(row)) {
			c.setBackground(Color.LIGHT_GRAY);
		} else {
			c.setBackground(Color.WHITE);
		}
		return c;
	}
}
