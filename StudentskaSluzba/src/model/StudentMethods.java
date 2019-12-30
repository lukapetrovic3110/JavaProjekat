package model;

import java.util.ArrayList;

import model.Student.status;

public class StudentMethods {
	
	private ArrayList<Student> studenti;
	
	public void dodajStudenta(String ime,String prezime,String datumr,String adresa,String tel,String 
			email,String brindeksa,String datumu,String godinastud,double prosek,status st) {
		this.studenti.add(new Student(ime,prezime,datumr,adresa,tel,email,brindeksa,datumu,godinastud,prosek,st));
	}

	public void izbrisiStudenta(String indeks) {
		for (Student s : studenti) {
			if (s.getBrindeksa()==indeks) {
				studenti.remove(s);
				break;
			}
		}
	}

	public void izmeniStudenta(String ime,String prezime,String datumr,String adresa,String tel,String 
			email,String brindeksa,String datumu,String godinastud,double prosek,status st) {
		for (Student s : studenti) {
			if (s.getBrindeksa() == brindeksa) {
				s.setAdresa(adresa);
				s.setBrindeksa(brindeksa);
				s.setDatumr(datumr);
				s.setDatumu(datumu);
				s.setEmail(email);
				s.setGodinastud(godinastud);
				s.setIme(ime);
				s.setPrezime(prezime);
				s.setProsek(prosek);
				s.setS(st);
				s.setTel(tel);
			}
		}
		
		
		
		
	}


}
