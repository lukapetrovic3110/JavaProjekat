package view;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

import model.BazaStudenata;
import model.Student;



public class StudentTableModel extends AbstractTableModel{
	private static final long serialVersionUID = 3591599721222020284L;
	private final String[] kolone= {"Ime","Prezime","Datum rodjenja","Adresa stanovanja","Telefon","E-mail","Broj indeksa","Datum upisa","Godina studija","Prosek","Status","Spisak predmeta"};
	
	@Override
	public int getColumnCount() {
		
		return BazaStudenata.getInstance().getColumnCount();
	}
	@Override
	public int getRowCount() {
		return BazaStudenata.getInstance().getRowCount();
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
	public Class<?> getColumnClass(int column) {
		switch (column) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			return Integer.class;
		case 9:
			return Long.class;
		case 10:
			return char.class;
		case 11:
			return JButton.class;
		default:
			return null;
		}
		//return getValueAt(0,c).getClass();
	}
	
	

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		/*Student student=MainController.getInstance().getStudentController().getStudent(rowIndex);*/
		Student s=BazaStudenata.getInstance().getRow(rowIndex);
		switch(columnIndex) {
		
		case 0:
			return s.getIme();
		case 1:
			return s.getPrezime();
		case 2:
			return s.getDatumr();
			
		case 3:
			return s.getAdresa();
			
		case 4:
			return s.getTel();
		
		case 5:
			return s.getEmail();
			
		case 6:
			return s.getBrindeksa(); //getDatumr().toString();
		case 7:
			return s.getDatumu();
			
		case 8:
			return s.getGodinastud();
		case 9:
			return s.getProsek();
		case 10:
			return s.getS();
		case 11:
			JButton btnPrikaziSpisakPredmeta = new JButton("" + rowIndex);
			return btnPrikaziSpisakPredmeta;
		default:
			return "";
		}
		
	} 
	
	
	
	
}
