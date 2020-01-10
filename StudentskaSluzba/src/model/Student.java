package model;

import java.util.ArrayList;

public class Student {
	
	public enum status {B,S};
	
	private String ime;
	private String prezime;
	private String datumr;
	private String adresa;
	private String tel;
	private String email;
	private String brindeksa;
	private String datumu;
	private String godinastud;
	private double prosek;
	private status s;
	private ArrayList<Predmet> lista=new ArrayList<Predmet>();
	
	public Student() {}
	
	public Student(String ime, String prezime, String datumr, 
			String adresa, String tel, String email, String brindeksa,
			String datumu, String godinastud, double prosek,status s
			//,ArrayList <String> lista
			){
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumr=datumr;
		this.adresa=adresa;
		this.tel=tel;
		this.email=email;
		this.brindeksa=brindeksa;
		this.datumu=datumu;
		this.godinastud=godinastud;
		this.prosek=prosek;
		
		this.s=s;
	//	this.lista=lista;
	}
	public Student(String ime, String prezime, String datumr, 
			String adresa, String tel, String email, String brindeksa,
			String datumu, String godinastud, double prosek,status s
			,ArrayList <Predmet> lista
			){
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumr=datumr;
		this.adresa=adresa;
		this.tel=tel;
		this.email=email;
		this.brindeksa=brindeksa;
		this.datumu=datumu;
		this.godinastud=godinastud;
		this.prosek=prosek;
		
		this.s=s;
		this.lista=lista;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getDatumr() {
		return datumr;
	}

	public void setDatumr(String datumr) {
		this.datumr = datumr;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBrindeksa() {
		return brindeksa;
	}

	public void setBrindeksa(String brindeksa) {
		this.brindeksa = brindeksa;
	}

	public String getDatumu() {
		return datumu;
	}

	public void setDatumu(String datumu) {
		this.datumu = datumu;
	}

	public String getGodinastud() {
		return godinastud;
	}

	public void setGodinastud(String godinastud) {
		this.godinastud = godinastud;
	}

	public double getProsek() {
		return prosek;
	}

	public void setProsek(double prosek) {
		this.prosek = prosek;
	}

	public status getS() {
		return s;
	}

	public void setS(status s) {
		this.s = s;
	}

	public ArrayList<Predmet> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Predmet> lista) {
		this.lista = lista;
	}

	/*public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}*/
	
	

}
