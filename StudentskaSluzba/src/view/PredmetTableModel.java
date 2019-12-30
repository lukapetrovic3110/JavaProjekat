package view;

import javax.swing.table.AbstractTableModel;

import model.BazaPredmeta;
import model.Predmet;

public class PredmetTableModel extends AbstractTableModel{
	
	private static final long serialVersionUID = 3062904794530832287L;
	//private final String[] kolone = {"Sifra predmeta", "Naziv predmeta", "Semestar", "Godina studija", "Predmetni profesor", "Slusaju studenti"};
	private final String[] kolone = {"Sifra predmeta", "Naziv predmeta", "Semestar", "Godina studija"};
	
	@Override
	public int getColumnCount() {
	
		return this.kolone.length;
	}

	@Override
	public int getRowCount() {
		return BazaPredmeta.getInstance().getRowCount();
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if(columnIndex==kolone.length-1)
			return true;
		else
			return false;
	}
	
	@Override
	public String getColumnName(int column) {
		
		return kolone[column];
	}
	
	@Override
	public Class<?> getColumnClass(int c) {
		
		return getValueAt(0,c).getClass();
	}
	

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Predmet predmet = BazaPredmeta.getInstance().getRow(rowIndex);
		
		switch(columnIndex) {
		case 0:
			return predmet.getSifrapredmeta();
		case 1:
			return predmet.getNazivpredmeta();
		case 2:
			return predmet.getSemestar();
		case 3:
			return predmet.getGodinastudija();
		default:
			return "";
		}
	}
}
