package view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

public class PredmetJTable extends JTable{

	
	private static final long serialVersionUID = -636753750955096487L;
	private TableRowSorter<PredmetTableModel> sorter;
	
	public PredmetJTable()
	{
		PredmetTableModel model = new PredmetTableModel();
		this.setModel(model);
		sorter = new TableRowSorter<PredmetTableModel>(model);
		sorter.setSortable(4, false);
		sorter.setSortable(5, false);
		this.setRowSorter(sorter);
		this.setRowSelectionAllowed(true);
		this.setColumnSelectionAllowed(true);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		new PrikaziButtonColumn(this, 4);
		new PrikaziButtonColumn(this, 5);
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
