package model;

import java.util.ArrayList;

import model.Profesor.titule;
import model.Profesor.zvanja;

public class BazaProfesora {
	
	private static BazaProfesora instance = null;
	public static BazaProfesora getInstance()
	{
		if(instance == null)
		{
			instance = new BazaProfesora();
		}
		return instance;
	}
	
	private ArrayList<Profesor> profesori;
	private ArrayList<String> kolone;
	
	private BazaProfesora() {
		
		initProf();
		this.kolone = new ArrayList<String>();
		this.kolone.add("Ime");
		this.kolone.add("Prezime");
		this.kolone.add("Datum rodjenja");
		this.kolone.add("Adresa stanovanja");
		this.kolone.add("Telefon");
		this.kolone.add("E-mail");
		this.kolone.add("Adresa kancelarije");
		this.kolone.add("Broj licne karte");
		this.kolone.add("Titula");
		this.kolone.add("Zvanje");
		//this.kolone.add("Spisak predmeta");

	}

	private void initProf() {
		this.profesori = new ArrayList<Profesor>();
		profesori.add(new Profesor("Nikol", "Despotovic", "21.10.1968.", "Bulevar oslobodjenja 38", "064/2053-991", "nikola.peric@uns.ac.rs", "Bulevar Oslobdjenja 133", 8780888, titule.DOKTORNAUKA, zvanja.REDOVNIPROFESOR));
		profesori.add(new Profesor("Milos", "Biklic", "20.1.1978.", "Bulevar oslobodjenja 108", "061/2153-991", "milos.biklic@uns.ac.rs", "Bulevar Oslobdjenja 133", 3280189, titule.DIPLOMIRANIINZENJER, zvanja.ASISTENT));
		profesori.add(new Profesor("Ana", "Veselinovic", "3.3.1991.", "Ulica Nikole Tesle 7", "063/2010-800", "ana.veselinovic@uns.ac.rs", "Bulevar Oslobdjenja 133", 5780448, titule.MAGISTAR, zvanja.DOCENT));
		profesori.add(new Profesor("Bojana", "Bozovic", "7.7.1995.", "Ulica Narodnih heroja 10", "061/2210-800", "bojana95@uns.ac.rs", "Bulevar Oslobdjenja 133", 3331088, titule.DIPLOMIRANIINZENJER, zvanja.ASISTENT));
		profesori.add(new Profesor("Imenko", "Prezimenic", "1.1.1986.", "Ulica Narodnih heroja 1", "062/2010-800", "imenko@uns.ac.rs", "Bulevar Oslobdjenja 133", 2227010, titule.DIPLOMIRANIINZENJER, zvanja.ASISTENT));
	}
	
	public ArrayList<Profesor> getProfesori() {
		return profesori;
	}	
	
	public void setProfesori(ArrayList<Profesor> profesori) {
		this.profesori = profesori;
	}
	
	public int getColumnCount()
	{
		return this.kolone.size();
	}
	
	public int getRowCount() {
		return this.profesori.size();
	}
	
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Profesor getRow(int rowIndex) {
		return this.profesori.get(rowIndex);
	}
	
	public String getValueAt(int row, int column) {
		Profesor profesor = this.profesori.get(row);
		switch (column) {
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
			return Long.toString(profesor.getBrlicne());
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
		default:
			return null;
		}
	}
}
