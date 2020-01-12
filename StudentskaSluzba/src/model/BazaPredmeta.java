package model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.Profesor.titule;
import model.Profesor.zvanja;
import model.Student.status;
import view.PanelPredmeti;

public class BazaPredmeta {

	private static BazaPredmeta instance = null;

	public static BazaPredmeta getInstance() {
		if (instance == null) {
			instance = new BazaPredmeta();
		}

		return instance;
	}

	public ArrayList<Predmet> predmeti;
	private ArrayList<String> kolone;

	private BazaPredmeta() {
		initPred();
		this.kolone = new ArrayList<String>();
		this.kolone.add("Sifra predmeta");
		this.kolone.add("Naziv predmeta");
		this.kolone.add("Semestar");
		this.kolone.add("Godina studija");
		this.kolone.add("Predmetni profesor");
		this.kolone.add("Slusaju studenti");
	}

	private void initPred() {
		this.predmeti = new ArrayList<Predmet>();
		Profesor p1 = new Profesor("Aleksa", "Petkovic", "15.01.1965.", "Temerinska 15, Novi Sad", "021/334-990", "aleksa.petkovic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, MI 105", "007198721", titule.DOKTORNAUKA, zvanja.REDOVNIPROFESOR, predmeti);
		Profesor p2 = new Profesor("Jana", "Lazarevic", "25.02.1963.", "Jovana Cvijica 26, Novi Sad", "021/435-891", "jana.lazarevic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, Nastavni Blok 206", "008431903", titule.DOKTORNAUKA, zvanja.REDOVNIPROFESOR);
		Profesor p3 = new Profesor("Nadja", "Aleksic", "23.03.1973.", "Gunduliceva 75, Novi Sad", "021/730-172", "nadja.aleksic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, NTP 307", "005671007", titule.MAGISTAR, zvanja.VANREDNIPROFESOR);
		Profesor p4 = new Profesor("Djordje", "Spasojevic", "24.08.1978.", "Sekspirova 44, Novi Sad", "021/514-893", "djordje.spasojevic@mailinator.com", "Dositeja Obradovica 6, Novi Sad, MI 118", "009999331", titule.MAGISTAR, zvanja.VANREDNIPROFESOR);
		
		ArrayList<Student> studenti1 = new ArrayList<Student>();
		studenti1.add(new Student("Luka","Jovanovic","01.01.2000.","Karadjordjeva 83, Novi Sad","021/333-555","luka.jovanovic@mailinator.com","RA 1/2019","01.07.2019.",1,8.0,status.B));
		studenti1.add(new Student("Sofija","Petrovic","16.05.2000.","Milosa Pocerca 55, Sabac","015/343-356","sofija.petrovic@mailinator.com","RA 5/2019","11.07.2019.",1,9.0,status.B,predmeti));
		studenti1.add(new Student("Stefan","Nikolic","18.03.2000.","Knez Mihajlova 16, Beograd","011/9234-857","stefan.nikolic@mailinator.com","RA 3/2019","03.07.2019.",1,6.9,status.B));
		studenti1.add(new Student("Dunja","Ilic","11.11.2000.","Petefi Sandora 15, Novi Sad","021/433-958","dunja.ilic@mailinator.com","RA 2/2019","01.07.2019.",1,7.22,status.S));
		
		ArrayList<Student> studenti2 = new ArrayList<Student>();
		studenti2.add(new Student("Sara","Pavlovic","03.12.1999.","Vojvode Misica 23, Sabac","015/313-061","sara.pavlovic@mailinator.com","RA 3/2018","01.07.2018.",2,8.342,status.B));
		studenti2.add(new Student("Vuk","Markovic","03.12.1999.","Temerinska 133, Novi Sad","021/351-091","vuk.markovic@mailinator.com","RA 15/2018","11.07.2018.",2,8.111,status.B));
		studenti2.add(new Student("Teodora","Popovic","03.12.1998.","Surepova 15, Sabac","015/324-500","teodora.popovic@mailinator.com","RA 133/2017","03.07.2017.",2,10.0,status.S));
		studenti2.add(new Student("Filip","Stojanovic","03.12.1998.","Francuska 113, Beograd","011/2333-900","filip.stojanovic@mailinator.com","RA 122/2017","02.07.2017.",2,9.543,status.S));

		ArrayList<Student> studenti3 = new ArrayList<Student>();
		studenti3.add(new Student("Viktor","Jankovic","03.12.1998.","Gogoljeva 3, Novi Sad","021/135-463","viktor.jankovic@mailinator.com","RA 1/2017","01.07.2017.",3,6.543,status.B));
		studenti3.add(new Student("Petra","Todorovic","03.12.1998.","Njegoseva 2, Novi Sad","021/903-463","petra.todorovic@mailinator.com","RA 5/2017","12.07.2017.",3,9.5,status.B));
		studenti3.add(new Student("Andrej","Stankovic","03.12.1998.","Radoja Domanovica 5, Novi Sad","021/731-067","andrej.stankovic@mailinator.com","RA 33/2017","19.07.2017.",3,8.7,status.B));
		studenti3.add(new Student("Mila","Ristic","03.12.1997.","Vojvode Stepe 183, Beograd","011/4333-800","mila.ristic@mailinator.com","RA 152/2016","15.07.2016.",3,9.0,status.S));

		ArrayList<Student> studenti4 = new ArrayList<Student>();
		studenti4.add(new Student("Lena","Kovacevic","03.12.1997.","Bulevar Oslobodjenja 143, Novi Sad","021/5333-801","lena.kovacevic@mailinator.com","RA 1/2016","01.07.2016.",4,8.0,status.B));
		studenti4.add(new Student("Filip","Zivkovic","03.12.1997.","1300 Kaplara, Sabac","015/333-500","filip.zivkovic@mailinator.com","RA 5/2016","21.07.2016.",4,8.03,status.B));
		studenti4.add(new Student("Tara","Dmiitrijevic","03.12.1996.","Milovana Glisica, Valjevo","014/303-007","tara.dimitrijevic@mailinator.com","RA 33/2015","23.07.2015.",4,7.0,status.S));
		studenti4.add(new Student("Vasilije","Micic","03.12.1996.","Vuka Karadzica, Loznica","015/101-909","vasilije.micic@mailinator.com","RA 102/2015","04.07.2015.",4,8.9,status.S));
		
		
		predmeti.add(new Predmet("OP301", "Osnove programiranja", 1, 1, p1.toString(),studenti1));
		predmeti.add(new Predmet("DM881", "Diskretna matematika", 3, 2, p2.toString(),studenti2));
		predmeti.add(new Predmet("PP007", "Paralelno programiranje", 5, 3, p3.toString(),studenti3));
		predmeti.add(new Predmet("RVP33", "Racunarstvo visokih performanasi", 7, 4, p4.toString(),studenti4));
		predmeti.add(new Predmet("JSD91", "Jezici specificni za domen", 8, 4, ""));
	}

	public ArrayList<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(ArrayList<Predmet> predmeti) {
		this.predmeti = predmeti;
	}

	public int getColumnCount() {
		return this.kolone.size();
	}

	public int getRowCount() {
		return this.predmeti.size();
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Predmet getRow(int rowIndex) {
		return this.predmeti.get(rowIndex);
	}

	public String getValueAt(int row, int column) {
		Predmet predmet = this.predmeti.get(row);
		switch (column) {
		case 0:
			return predmet.getSifrapredmeta();
		case 1:
			return predmet.getNazivpredmeta();
		case 2:
			return "" + predmet.getSemestar();
		case 3:
			return "" + predmet.getGodinastudija();
		case 4:
			return predmet.getProfa();
		default:
			return null;
		}
	}

	// serijalizacija
  /*
	public void serijalizacijaPisanje() throws FileNotFoundException, IOException {
		File txtPredmet = new File("bazapredmeta.txt");

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(txtPredmet)));

		try {
			objectOutputStream.writeObject(predmeti);
		} finally {
			objectOutputStream.close();
		}

	}

	@SuppressWarnings("unchecked")
	public void serijalizacijaCitanje() throws IOException, ClassNotFoundException, FileNotFoundException {
		File txtPredmet = new File("bazapredmeta.txt");

		ObjectInputStream objectInputStream = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(txtPredmet)));

		try {
			predmeti = (ArrayList<Predmet>) objectInputStream.readObject();
		} finally {
			objectInputStream.close();
		}

		PanelPredmeti.azurirajPrikaz();
	}
	*/
}
