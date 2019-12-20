package model;
import java.util.ArrayList;

/**
 * @author ra25-2017
 */

public class Profesor {
	private String ime;
	private String prezime;
	private String datum_rodjenja;
	private String adresa_stanovanja;
	private String kontakt_telefona;
	private String e_mail;
	private String adresa_kancelarije;
	private int br_licne;
	private String titula;
	private String zvanje;
	private ArrayList<Predmet> skisak_predmeta;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getDatum_rodjenja() {
		return datum_rodjenja;
	}
	public void setDatum_rodjenja(String datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}
	public String getAdresa_stanovanja() {
		return adresa_stanovanja;
	}
	public void setAdresa_stanovanja(String adresa_stanovanja) {
		this.adresa_stanovanja = adresa_stanovanja;
	}
	public String getKontakt_telefona() {
		return kontakt_telefona;
	}
	public void setKontakt_telefona(String kontakt_telefona) {
		this.kontakt_telefona = kontakt_telefona;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getAdresa_kancelarije() {
		return adresa_kancelarije;
	}
	public void setAdresa_kancelarije(String adresa_kancelarije) {
		this.adresa_kancelarije = adresa_kancelarije;
	}
	public int getBr_licne() {
		return br_licne;
	}
	public void setBr_licne(int br_licne) {
		this.br_licne = br_licne;
	}
	public String getTitula() {
		return titula;
	}
	public void setTitula(String titula) {
		this.titula = titula;
	}
	public String getZvanje() {
		return zvanje;
	}
	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}
	public ArrayList<Predmet> getSkisak_predmeta() {
		return skisak_predmeta;
	}
	public void setSkisak_predmeta(ArrayList<Predmet> skisak_predmeta) {
		this.skisak_predmeta = skisak_predmeta;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	@Override
	public String toString() {
		return "Profesor [ime=" + ime + ", prezime=" + prezime + ", datum_rodjenja=" + datum_rodjenja
				+ ", adresa_stanovanja=" + adresa_stanovanja + ", kontakt_telefona=" + kontakt_telefona + ", e_mail="
				+ e_mail + ", adresa_kancelarije=" + adresa_kancelarije + ", br_licne=" + br_licne + ", titula="
				+ titula + ", zvanje=" + zvanje + ", skisak_predmeta=" + skisak_predmeta + "]";
	}
}
