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
import view.PanelPredmeti;

public class BazaPredmeta {

	private static BazaPredmeta instance = null;

	public static BazaPredmeta getInstance() {
		if (instance == null) {
			instance = new BazaPredmeta();
		}

		return instance;
	}

	private ArrayList<Predmet> predmeti;
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
		
		predmeti.add(new Predmet("OP301", "Osnove programiranja", 1, 1, p1.toString()));
		predmeti.add(new Predmet("DM881", "Diskretna matematika", 3, 2, p2.toString()));
		predmeti.add(new Predmet("PP007", "Paralelno programiranje", 5, 3, p3.toString()));
		predmeti.add(new Predmet("RVP33", "Racunarstvo visokih performanasi", 7, 4, p4.toString()));
		predmeti.add(new Predmet("JSD91", "Jezici specificni za domen", 8, 4));
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
