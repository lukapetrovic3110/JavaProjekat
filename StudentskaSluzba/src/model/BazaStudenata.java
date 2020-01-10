package model;

import java.util.ArrayList;

import model.Student.status;

public class BazaStudenata {

	private static BazaStudenata instance = null;
	public static BazaStudenata getInstance() {
		if (instance == null) {
			instance = new BazaStudenata();
		}
		return instance;
	}
	
	public ArrayList<Student> studenti;
	private ArrayList<String> kolone;
	
	private BazaStudenata() {
	
		initStud();
		this.kolone = new ArrayList<String>();
		this.kolone.add("Ime");
		this.kolone.add("Prezime");
		this.kolone.add("Datum rodjenja");
		this.kolone.add("Adresa stanovanja");
		this.kolone.add("Telefon");
		this.kolone.add("E-mail");
		this.kolone.add("Broj indeksa");
		this.kolone.add("Datum upisa");
		this.kolone.add("Godina studija");
		this.kolone.add("Prosek");
		this.kolone.add("Status");
		this.kolone.add("Spisak predmeta");
	}
	
	private void initStud() {
		this.studenti = new ArrayList<Student>();
		ArrayList<Predmet> predmeti = new ArrayList<Predmet>();
		predmeti.add(new Predmet("MO-RA", "Metode optimizacije", 5, 3));
		predmeti.add(new Predmet("DM881", "Diskretna matematika", 3, 2));
		studenti.add(new Student("Luka","Petrovic","31.10.1998.","Branislava Nusica 33,Novi Sad","063/444-8837","luka.petrovic@gmail.com","RA 21/2017","06.07.2017.",3,8.0,status.B));
		studenti.add(new Student("Jelena","Budisa","12.06.1998.","Branislava Nusica 25,Novi Sad","067/653-883","jelena.budisa@gmail.com","RA 33/2017","12.06.2017.",3,9.0,status.B,predmeti));
		studenti.add(new Student("Marko","Petrovic","30.10.1998.","Branislava Nusica 22,Novi Sad","064/333-7788","luka.petrovic@gmail.com","SW 22/2017","06.07.2017.",4,6.9,status.S));
		studenti.add(new Student("Jovan","Jovanovic","31.10.1933.","Branislava Nusica 2,Novi Sad","065/545-222","luka.petrovic@gmail.com","RA 233/2016","06.08.2017.",1,7.22,status.S));
		studenti.add(new Student("Sanja","Jungic","31.01.1999.","Branislava Nusica 6,Beograd","062/221-1111","luka.petrovic@gmail.com","RA 29/2015","31.10.2018.",2,7.1,status.S));
		studenti.add(new Student("Maja","Jovic","01.08.1998.","Branislava Nusica 78,Beograd","064/325-234","luka.petrovic@gmail.com","SW 123/2015","06.03.2019.",4,8.342,status.B));
		studenti.add(new Student("Ana","Lalic","14.08.1997.","Branislava Nusica 23,Beograd","063/443-234","luka.petrovic@gmail.com","RA 88/2016","06.12.2018.",1,8.111,status.S));
		studenti.add(new Student("Nikola","Savic","28.05.1923.","Branislava Nusica 1,Beograd","061/239-9899","luka.petrovic@gmail.com","PR 90/2017","10.10.2010.",2,10.0,status.B));
		studenti.add(new Student("Marija","Nikolic","11.11.1991.","Bulevar Vojvode Stepe Stepanovica 16,Beograd","064/350-000","luka.petrovic@gmail.com","RA 44/2018","03.03.2003.",4,9.543,status.B));

	}

	public ArrayList<Student> getStudenti() {
		return studenti;
	}

	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}

	public int getColumnCount() {
		return this.kolone.size();
	}
	public int getRowCount() {
		return this.studenti.size();
	}
	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Student getRow(int rowIndex) {
		return this.studenti.get(rowIndex);
	}
	
	public String getValueAt(int row, int column) {
		Student s = this.studenti.get(row);
		switch (column) {
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
			return s.getBrindeksa();
		case 7:
			return s.getDatumu();
		case 8:
			return  ""+s.getGodinastud();
		case 9:
			return Double.toString(s.getProsek());
		case 10:
			return ""+s.getS();
		default:
			return null;
		}
	}
	
	
	
}
