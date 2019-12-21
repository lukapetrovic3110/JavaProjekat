package view;

import javax.swing.table.AbstractTableModel;

import controller.MainController;

public class StudentTableModel extends AbstractTableModel{
	private static final long serialVersionUID = 3591599721222020284L;
	private final String[] kolone= {"Ime","Prezime","Broj indeksa","Godina studija","Status","Prosek","Datum rodjenja","Adresa stanovanja","Broj telefona","E-mail adresa","Datum upisa","Predmeti"};
	
	@Override
	public int getColumnCount() {
		
		return this.kolone.length;
	}
	@Override
	public int getRowCount() {
		return 0;
		//return MainController.getInstance().getStudentController().getBrojStudenata();
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
		/*Student student=MainController.getInstance().getStudentController().getStudent(rowIndex);
		switch(columnIndex) {
		
		case 0:
			return student.getIme();
		case 1:
			return student.getPrezime();
		case 2:
			return student.getBrindeksa();
			
		case 3:
			return student.getGodinastud();
			
		case 4:
			return student.getS();
		
		case 5:
			return student.getProsek();
			
		case 6:
			return student.getDatumr().toString();
		case 7:
			return student.getAdresa();
			
		case 8:
			return student.getTel();
		case 9:
			return student.getEmail();
		case 10:
			return student.getDatumu().toString();
		case 11:
			return student.getLista();
		default:
			*/return "";
		//}
		
	} 
	
	
	
	
}
