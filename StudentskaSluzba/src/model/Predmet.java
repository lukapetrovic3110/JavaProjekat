package model;

import java.util.ArrayList;
/**
 * @author ra25-2017
 */
public class Predmet {
	private String sifra_predmeta;
	private String naziv_predmeta;
	private String semestar;
	private String godina_studija;
	private Profesor predmetniProfesor;
	private ArrayList<Student> slusajuStudenti;
	
	public Predmet() {}
	
	public Predmet(String sifra_predmeta, String naziv_predmeta, String semestar,
			   String godina_studija) {

		super();
		this.sifra_predmeta = sifra_predmeta;
		this.naziv_predmeta = naziv_predmeta;
		this.semestar = semestar;
		this.godina_studija = godina_studija;
	}
	
	public Predmet(String sifra_predmeta, String naziv_predmeta, String semestar,
				   String godina_studija, Profesor predmetniProfesor, ArrayList<Student> slusajuStudenti) {
	
		super();
		this.sifra_predmeta = sifra_predmeta;
		this.naziv_predmeta = naziv_predmeta;
		this.semestar = semestar;
		this.godina_studija = godina_studija;
		this.predmetniProfesor = predmetniProfesor;
		this.slusajuStudenti = slusajuStudenti;
	}
	
	public String getSifrapredmeta() {
		return sifra_predmeta;
	}
	public void setSifrapredmeta(String sifra_predmeta) {
		this.sifra_predmeta = sifra_predmeta;
	}
	public String getNazivpredmeta() {
		return naziv_predmeta;
	}
	public void setNazivpredmeta(String naziv_predmeta) {
		this.naziv_predmeta = naziv_predmeta;
	}
	public String getSemestar() {
		return semestar;
	}
	public void setSemestar(String semestar) {
		this.semestar = semestar;
	}
	public String getGodinastudija() {
		return godina_studija;
	}

	public void setGodinastudija(String godina_studija) {
		this.godina_studija = godina_studija;
	}

	public Profesor getPredmetniProfesor() {
		return predmetniProfesor;
	}
	public void setPredmetniProfesor(Profesor predmetniProfesor) {
		this.predmetniProfesor = predmetniProfesor;
	}
	
	public ArrayList<Student> getSlusajuStudenti() {
		return slusajuStudenti;
	}

	public void setSlusajuStudenti(ArrayList<Student> slusajuStudenti) {
		this.slusajuStudenti = slusajuStudenti;
	}

	@Override
	public String toString() {
		return "Predmet [sifra_predmeta=" + sifra_predmeta + ", naziv_predmeta=" + naziv_predmeta + ", semestar="
				+ semestar + ", godina_studija=" + godina_studija + ", predmetniProfesor=" + predmetniProfesor
				+ ", slusajuStudenti=" + slusajuStudenti + "]";
	}

}
