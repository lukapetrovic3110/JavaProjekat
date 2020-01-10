package model;

import java.util.ArrayList;

import model.Student.status;

public class StudentMethods {
	
	private static ArrayList<Student> studenti=BazaStudenata.getInstance().getStudenti();
	
	public static void dodajStudenta(String ime,String prezime,String datumr,String adresa,String tel,String 
			email,String brindeksa,String datumu,int godinastud,double prosek,status st) {
		
		studenti.add(new Student(ime,prezime,datumr,adresa,tel,email,brindeksa,datumu,godinastud,prosek,st));
	}

	public static void izbrisiStudenta(String indeks) {
		
		for (Student s : studenti) {
			if (s.getBrindeksa().equals(indeks)) {
				studenti.remove(s);
				break;
			}
		}
		
	}

	public static void izmeniStudenta(String ime,String prezime,String datumr,String adresa,String tel,String 
			email,String brindeksa,String datumu,int godinastud,double prosek,status st) {
		for (Student s : studenti) {
			if (s.getBrindeksa().equals( brindeksa)) {
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
	
	public static String[] izlistajPredmeteZaStudente(String indeks) {
		String[] podaci;
		ArrayList<Predmet> predmeti = new ArrayList<Predmet>();
		for (Student s : studenti) {
			if (s.getBrindeksa().equals(indeks)) {
				predmeti = s.getLista();
				podaci = new String[predmeti.size()];
				int i = 0;
				for(Predmet predmet : predmeti) {
					podaci[i] = predmet.getSifrapredmeta();
					i++;
				}
				return podaci;
			}
		}
		return null;
	}

}
