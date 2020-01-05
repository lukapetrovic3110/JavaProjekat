package view;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

import model.BazaProfesora;
import model.Profesor;
import model.Profesor.titule;
import model.Profesor.zvanja;

public class ProfesorTableModel extends AbstractTableModel{
	
	private static final long serialVersionUID = 6127102205843865783L;
	private final String[] kolone= {"Ime", "Prezime", "Datum rodjenja", "Adresa stanovanja", "Telefon", "E-mail", "Adresa kancelarije", "Broj licne karte", "Titula", "Zvanje", "Spisak predmeta"};
	
	@Override
	public int getColumnCount() {
		return BazaProfesora.getInstance().getColumnCount();
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
		case 9:
			return String.class;
		case 10:
			return JButton.class;
		default:
			return null;
		}
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
			if(profesor.getTitula() == titule.DIPLOMIRANIINZENJER)
			{
				return "DIPLOMIRANI INZENJER";
			}
			else if(profesor.getTitula() == titule.DOKTORNAUKA)
			{
				return "DOKTOR NAUKA";
			}
			else
			{
				return  "MAGISTAR";
			}
		case 9:
			if(profesor.getZvanje() == zvanja.REDOVNIPROFESOR)
			{
				return "REDOVNI PROFESOR";
			}
			else if(profesor.getZvanje() == zvanja.VANREDNIPROFESOR)
			{
				return "VANREDNI PROFESOR";
			}
			else if(profesor.getZvanje() == zvanja.ASISTENT)
			{
				return "ASISTENT";
			}
			else if(profesor.getZvanje() == zvanja.DOCENT)
			{
				return "DOCENT";
			}
			else
			{
				return "DEKAN";
			}
		case 10:
			JButton btnPrikaziSpisakPredmeta = new JButton("" + rowIndex);
			return btnPrikaziSpisakPredmeta;
		default:
			return "";

		}
		
	} 

}
