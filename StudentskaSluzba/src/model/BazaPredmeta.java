package model;

import java.util.ArrayList;

public class BazaPredmeta {
	
	private static BazaPredmeta instance = null;
	public static BazaPredmeta getInstanece(){
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
		//this.kolone.add("Predmetni profesor");
		//this.kolone.add("Slusaju studenti");
	}

	private void initPred() {
		this.predmeti = new ArrayList<Predmet>();
		predmeti.add(new Predmet("PJISP-RA", "Programski jezici i strukture podataka", "prvi", "I (PRAVA)"));
		predmeti.add(new Predmet("MIS-RA", "Modeliranje i simulacija sistema", "treci", "II (DRUGA)"));
		predmeti.add(new Predmet("MO-RA", "Metode optimizacije", "peti", "III (TRECA)"));
		
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
			return predmet.getSemestar();
		case 3:
			return predmet.getGodinastudija();
		default:
			return null;
		}
	}
}
