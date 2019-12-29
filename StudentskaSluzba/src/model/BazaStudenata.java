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
	
	private ArrayList<Student> studenti;
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

	}
	
	private void initStud() {
		this.studenti = new ArrayList<Student>();
		studenti.add(new Student("Luka","Petrovic","31.10.1998.","Branislava Nusica 33","063","luka.petrovic@gmail.com","RA-21-2017","6.7.2017.","treca",8.0,status.B));
		studenti.add(new Student("Jelena","Budisa","12.6.1998.","Branislava Nusica 25","06765","jelena.budisa@gmail.com","RA-33-2017","12.6.2017.","treca",9.0,status.B));
		studenti.add(new Student("Marko","Petrovic","31.10.1998.","Branislava Nusica 22","064","luka.petrovic@gmail.com","RA-22-2017","6.7.2017.","cetvrta",6.9,status.S));
		studenti.add(new Student("Jovan","Jovanovic","31.10.1998.","Branislava Nusica 2","0655","luka.petrovic@gmail.com","RA-233-2016","6.7.2017.","treca",7.22,status.S));
		studenti.add(new Student("Sanja","Jungic","31.10.1998.","Branislava Nusica 6","06222","luka.petrovic@gmail.com","RA-29-2015","6.7.2017.","prva",7.1,status.S));
		studenti.add(new Student("Maja","Jovic","31.10.1998.","Branislava Nusica 78","064325","luka.petrovic@gmail.com","RA-123-2015","6.7.2017.","treca",8.342,status.B));
		studenti.add(new Student("Ana","Lalic","31.10.1998.","Branislava Nusica 23","06344","luka.petrovic@gmail.com","RA-88-2016","6.7.2017.","druga",8.111,status.S));
		studenti.add(new Student("Nikola","Savic","31.10.1998.","Branislava Nusica 1","06123","luka.petrovic@gmail.com","RA-90-2017","6.7.2017.","treca",10.0,status.B));
		studenti.add(new Student("Marija","Nikolic","31.10.1998.","Branislava Nusica 16","06435","luka.petrovic@gmail.com","RA-44-2018","6.7.2017.","cetvrta",9.543,status.B));

	}

	public ArrayList<Student> getStudenti() {
		return studenti;
	}

	public void setStudenti(ArrayList<Student> studenti) {
		this.studenti = studenti;
	}

	public int getColumnCount() {
		return 10;
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
			return s.getGodinastud();
		case 9:
			return Double.toString(s.getProsek());
		case 10:
			return ""+s.getS();
		default:
			return null;
		}
	}
	
	
	
}