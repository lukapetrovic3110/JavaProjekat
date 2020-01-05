package view;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

import model.BazaPredmeta;
import model.Predmet;

public class PredmetTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 3062904794530832287L;
	private final String[] kolone = { "Sifra predmeta", "Naziv predmeta", "Semestar", "Godina studija",
			"Predmetni profesor", "Slusaju studenti" };

	@Override
	public int getColumnCount() {

		return BazaPredmeta.getInstance().getColumnCount();
	}

	@Override
	public int getRowCount() {
		return BazaPredmeta.getInstance().getRowCount();
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex >= 4)
			return true;
		else
			return false;
	}

	@Override
	public String getColumnName(int column) {

		return kolone[column];
	}

	@Override
	public Class<?> getColumnClass(int column) {

		switch (column) {
		case 0:
		case 1:
		case 2:
		case 3:
			return String.class;
		case 4:
			return JButton.class;
		case 5:
			return JButton.class; 
		default:
			return null;
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Predmet predmet = BazaPredmeta.getInstance().getRow(rowIndex);

		switch (columnIndex) {
		case 0:
			return predmet.getSifrapredmeta();
		case 1:
			return predmet.getNazivpredmeta();
		case 2:
			return predmet.getSemestar();
		case 3:
			return predmet.getGodinastudija();
		case 4:
			JButton btnPrikazi1 = new JButton("" + rowIndex);
			return btnPrikazi1;
		case 5:
			JButton btnPrikazi2 = new JButton("" + rowIndex);
			return btnPrikazi2;
		default:
			return "";
		}
	}
}
