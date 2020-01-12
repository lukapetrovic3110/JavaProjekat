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
		this.kolone.add("Spisak predmeta");

	}

	private void initProf() {
		this.profesori = new ArrayList<Profesor>();
		
		ArrayList<Predmet> predmeti1 = new ArrayList<Predmet>();
		predmeti1.add(new Predmet("OP301", "Osnove programiranja", 1, 1));
		
		ArrayList<Predmet> predmeti2 = new ArrayList<Predmet>();
		predmeti2.add(new Predmet("DM881", "Diskretna matematika", 3, 2));
		
		ArrayList<Predmet> predmeti3 = new ArrayList<Predmet>();
		predmeti3.add(new Predmet("RVP33", "Racunarstvo visokih performanski", 7, 4));
		
		ArrayList<Predmet> predmeti4 = new ArrayList<Predmet>();
		predmeti4.add(new Predmet("JSD91", "Jezici specificni za domen", 8, 4));
		
		profesori.add(new Profesor("Aleksa", "Petkovic", "15.01.1965.", "Temerinska 15, Novi Sad", "021/334-990", "aleksa.petkovic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, MI 105", "007198721", titule.DOKTORNAUKA, zvanja.REDOVNIPROFESOR, predmeti1));
		profesori.add(new Profesor("Jana", "Lazarevic", "25.02.1963.", "Jovana Cvijica 26, Novi Sad", "021/435-891", "jana.lazarevic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, Nastavni Blok 206", "008431903", titule.DOKTORNAUKA, zvanja.REDOVNIPROFESOR, predmeti2));
		profesori.add(new Profesor("Nadja", "Aleksic", "23.03.1973.", "Gunduliceva 75, Novi Sad", "021/730-172", "nadja.aleksic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, NTP 307", "005671007", titule.MAGISTAR, zvanja.VANREDNIPROFESOR, predmeti3));
		profesori.add(new Profesor("Djordje", "Spasojevic", "24.08.1978.", "Sekspirova 44, Novi Sad", "021/514-893", "djordje.spasojevic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, MI 118", "009999331", titule.MAGISTAR, zvanja.VANREDNIPROFESOR, predmeti4));
		profesori.add(new Profesor("Elena", "Milenkovic", "08.11.1985.", "Tolstojeva 52, Novi Sad", "021/834-901", "elena.milenkovic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, Nastavni blok 217", "003330976", titule.MAGISTAR, zvanja.DOCENT));
		profesori.add(new Profesor("Teodor", "Mladenovic", "14.12.1983.", "Jovana Subotica 33, Novi Sad", "021/441-007", "teodor.mladenovic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, NTP M35", "007441998", titule.DOKTORNAUKA, zvanja.DOCENT));
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
		default:
			return null;
		}
	}
}
