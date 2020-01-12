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
		
		studenti.add(new Student("Luka","Jovanovic","01.01.2000.","Karadjordjeva 83, Novi Sad","021/333-555","luka.jovanovic@mailinator.com","RA 1/2019","01.07.2019.",1,8.0,status.B));
		studenti.add(new Student("Sofija","Petrovic","16.05.2000.","Milosa Pocerca 55, Sabac","015/343-356","sofija.petrovic@mailinator.com","RA 5/2019","11.07.2019.",1,9.0,status.B,predmeti));
		studenti.add(new Student("Stefan","Nikolic","18.03.2000.","Knez Mihajlova 16, Beograd","011/9234-857","stefan.nikolic@mailinator.com","RA 3/2019","03.07.2019.",1,6.9,status.B));
		studenti.add(new Student("Dunja","Ilic","11.11.2000.","Petefi Sandora 15, Novi Sad","021/433-958","dunja.ilic@mailinator.com","RA 2/2019","01.07.2019.",1,7.22,status.S));
		studenti.add(new Student("Lazar","Djordjevic","03.12.2000.","Josip Broz Tito 13, Subotica","024/333-559","lazar.djordjevic@mailinator.com","RA 4/2019","06.07.2019.",1,7.1,status.S));
		studenti.add(new Student("Sara","Pavlovic","03.12.1999.","Vojvode Misica 23, Sabac","015/313-061","sara.pavlovic@mailinator.com","RA 3/2018","01.07.2018.",2,8.342,status.B));
		studenti.add(new Student("Vuk","Markovic","03.12.1999.","Temerinska 133, Novi Sad","021/351-091","vuk.markovic@mailinator.com","RA 15/2018","11.07.2018.",2,8.111,status.B));
		studenti.add(new Student("Teodora","Popovic","03.12.1998.","Surepova 15, Sabac","015/324-500","teodora.popovic@mailinator.com","RA 133/2017","03.07.2017.",2,10.0,status.S));
		studenti.add(new Student("Filip","Stojanovic","03.12.1998.","Francuska 113, Beograd","011/2333-900","filip.stojanovic@mailinator.com","RA 122/2017","02.07.2017.",2,9.543,status.S));
		studenti.add(new Student("Ana","Zivkovic","03.12.1998.","Kralja Petra 20, Novi Sad","021/231-114","ana.zivkovic@mailinator.com","RA 201/2017","04.07.2017.",2,9.533,status.S));
		studenti.add(new Student("Viktor","Jankovic","03.12.1998.","Gogoljeva 3, Novi Sad","021/135-463","viktor.jankovic@mailinator.com","RA 1/2017","01.07.2017.",3,6.543,status.B));
		studenti.add(new Student("Petra","Todorovic","03.12.1998.","Njegoseva 2, Novi Sad","021/903-463","petra.todorovic@mailinator.com","RA 5/2017","12.07.2017.",3,9.5,status.B));
		studenti.add(new Student("Andrej","Stankovic","03.12.1998.","Radoja Domanovica 5, Novi Sad","021/731-067","andrej.stankovic@mailinator.com","RA 33/2017","19.07.2017.",3,8.7,status.B));
		studenti.add(new Student("Mila","Ristic","03.12.1997.","Vojvode Stepe 183, Beograd","011/4333-800","mila.ristic@mailinator.com","RA 152/2016","15.07.2016.",3,9.0,status.S));
		studenti.add(new Student("Pavle","Kostic","03.12.1997.","Crnotravska 13, Beograd","011/3130-007","pavle.kostic@mailinator.com","RA 104/2016","06.07.2016.",3,8.543,status.S));
		studenti.add(new Student("Lena","Kovacevic","03.12.1997.","Bulevar Oslobodjenja 143, Novi Sad","021/5333-801","lena.kovacevic@mailinator.com","RA 1/2016","01.07.2016.",4,8.0,status.B));
		studenti.add(new Student("Filip","Zivkovic","03.12.1997.","1300 Kaplara, Sabac","015/333-500","filip.zivkovic@mailinator.com","RA 5/2016","21.07.2016.",4,8.03,status.B));
		studenti.add(new Student("Tara","Dmiitrijevic","03.12.1996.","Milovana Glisica, Valjevo","014/303-007","tara.dimitrijevic@mailinator.com","RA 33/2015","23.07.2015.",4,7.0,status.S));
		studenti.add(new Student("Vasilije","Micic","03.12.1996.","Vuka Karadzica, Loznica","015/101-909","vasilije.micic@mailinator.com","RA 102/2015","04.07.2015.",4,8.9,status.S));
		studenti.add(new Student("Lenka","Jovic","03.12.1997.","Bulevar Mihajla Pupina, Novi Sad","021/431-500","lenka.jovic@mailinator.com","RA 244/2016","07.07.2016.",4,8.98,status.S));

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
