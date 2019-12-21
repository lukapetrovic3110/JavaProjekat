package model;

import java.util.ArrayList;

public class Predmet {
	private int sifra_predmeta;
	private String naziv_predmeta;
	private String semestar;
	private String godinastudija;
	private Profesor predmetniProfesor;
	private ArrayList<Student> slusajustudenti;
	public int getSifra_predmeta() {
		return sifra_predmeta;
	}
	public void setSifra_predmeta(int sifra_predmeta) {
		this.sifra_predmeta = sifra_predmeta;
	}
	public String getNaziv_predmeta() {
		return naziv_predmeta;
	}
	public void setNaziv_predmeta(String naziv_predmeta) {
		this.naziv_predmeta = naziv_predmeta;
	}
	public String getSemestar() {
		return semestar;
	}
	public void setSemestar(String semestar) {
		this.semestar = semestar;
	}
	public String getGodinastudija() {
		return godinastudija;
	}
	public void setGodinastudija(String godinastudija) {
		this.godinastudija = godinastudija;
	}
}
