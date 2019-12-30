package view;

import javax.swing.table.AbstractTableModel;

import model.BazaProfesora;
import model.Profesor;

public class ProfesorTableModel extends AbstractTableModel{
	
	private static final long serialVersionUID = 6127102205843865783L;
	private final String[] kolone= {"Ime","Prezime","Datum rodjenja","Adresa stanovanja","Telefon","E-mail","Adresa kancelarije","Broj licne karte","Titula","Zvanje"};
	
	@Override
	public int getColumnCount() {
		return this.kolone.length;
	}

	@Override
	public int getRowCount() {
		return BazaProfesora.getInstance().getRowCount();
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if(columnIndex==kolone.length-1)
			return true;
		else
			return false;
	}
	
	@Override
	public Class<?> getColumnClass(int c) {
		
		return getValueAt(0,c).getClass();
	}
	
	@Override
	public String getColumnName(int column) {
		
		return kolone[column];
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Profesor profesor = BazaProfesora.getInstance().getRow(rowIndex);
		
		switch(columnIndex) {
		
		case 0:
			return profesor.getIme();
		case 1:
			return profesor.getPrezime();
		case 2:
			return profesor.getDatumrodjenja();
		case 3:
			return profesor.getAdresastanovanja();
		case 4:
			return profesor.getKontakttelefona();
		case 5:
			return profesor.getEmail();
		case 6:
			return profesor.getAdresakancelarije();
		case 7:
			return profesor.getBrlicne();
		case 8:
			return profesor.getTitula();
		case 9:
			return profesor.getZvanje();
		default:
			return "";
			
		}
		
	} 

}
