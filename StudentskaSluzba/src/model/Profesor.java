package model;
import java.util.ArrayList;
/**
 * @author ra25-2017
 */
public class Profesor {
	
	public enum titule { DIPLOMIRANIINZENJER, MAGISTAR, DOKTORNAUKA; }
	
	public enum zvanja { ASISTENT, VANREDNIPROFESOR, DOCENT, REDOVNIPROFESOR, DEKAN;}
	
	private String ime;
	private String prezime;
	private String datum_rodjenja;
	private String adresa_stanovanja;
	private String kontakt_telefona;
	private String e_mail;
	private String adresa_kancelarije;
	private String br_licne;
	private titule titula;
	private zvanja zvanje;
	private ArrayList<Predmet> spisak_predmeta;
	
	public Profesor() {}
	
	public Profesor(String ime, String prezime, String datum_rodjenja,
		       String adresa_stanovanja, String kontakt_telefon, String e_mail,
		       String adresa_kancelarije, String br_licne, titule titula, zvanja zvanje 
		   	 ) 
	{
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datum_rodjenja = datum_rodjenja;
		this.adresa_stanovanja = adresa_stanovanja;
		this.kontakt_telefona = kontakt_telefon;
		this.e_mail = e_mail;
		this.adresa_kancelarije = adresa_kancelarije;
		this.br_licne = br_licne;
		this.titula = titula;
		this.zvanje = zvanje;
	}
	
	public Profesor(String ime, String prezime, String datum_rodjenja,
			       String adresa_stanovanja, String kontakt_telefon, String e_mail,
			       String adresa_kancelarije, String br_licne, titule titula, zvanja zvanje, 
			       ArrayList<Predmet> spisak_predmeta
			   	 ) 
	{
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datum_rodjenja = datum_rodjenja;
		this.adresa_stanovanja = adresa_stanovanja;
		this.kontakt_telefona = kontakt_telefon;
		this.e_mail = e_mail;
		this.adresa_kancelarije = adresa_kancelarije;
		this.br_licne = br_licne;
		this.titula = titula;
		this.zvanje = zvanje;
		this.spisak_predmeta = spisak_predmeta;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getDatumrodjenja() {
		return datum_rodjenja;
	}
	public void setDatumrodjenja(String datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}
	public String getAdresastanovanja() {
		return adresa_stanovanja;
	}
	public void setAdresastanovanja(String adresa_stanovanja) {
		this.adresa_stanovanja = adresa_stanovanja;
	}
	public String getKontakttelefona() {
		return kontakt_telefona;
	}
	public void setKontakttelefona(String kontakt_telefona) {
		this.kontakt_telefona = kontakt_telefona;
	}
	public String getEmail() {
		return e_mail;
	}
	public void setEmail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getAdresakancelarije() {
		return adresa_kancelarije;
	}
	public void setAdresakancelarije(String adresa_kancelarije) {
		this.adresa_kancelarije = adresa_kancelarije;
	}
	public String getBrlicne() {
		return br_licne;
	}
	public void setBrlicne(String br_licne) {
		this.br_licne = br_licne;
	}
	public titule getTitula() {
		return titula;
	}
	public void setTitula(titule titula) {
		this.titula = titula;
	}
	public zvanja getZvanje() {
	
		return zvanje;
	}
	public void setZvanje(zvanja zvanje) {
		this.zvanje = zvanje;
	}
	public ArrayList<Predmet> getSpisakpredmeta() {
		return spisak_predmeta;
	}
	
	public void setSpisakpredmeta(ArrayList<Predmet> spisak_predmeta) {
		this.spisak_predmeta = spisak_predmeta;
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
				+ titula + ", zvanje=" + zvanje + ", skisak_predmeta=" + spisak_predmeta + "]";
	}

	
}
