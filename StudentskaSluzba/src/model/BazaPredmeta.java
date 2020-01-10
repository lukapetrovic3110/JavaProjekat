package model;

import java.util.ArrayList;

public class BazaPredmeta {
	
	private static BazaPredmeta instance = null;
	public static BazaPredmeta getInstance(){
		if (instance == null){
			instance = new BazaPredmeta();
		}
		
		return instance;
	}
	
	private ArrayList<Predmet> predmeti;
	private ArrayList<String> kolone;
	
	private BazaPredmeta(){
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
		predmeti.add(new Predmet("OP301", "Osnove programiranja", 1, 1));
		predmeti.add(new Predmet("DM881", "Diskretna matematika", 3, 2));
		predmeti.add(new Predmet("PP007", "Paralelno programiranje", 5, 3));
		predmeti.add(new Predmet("RVP33", "Racunarstvo visokih performanasi", 7, 4));
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
		default:
			return null;
		}
	}
}
