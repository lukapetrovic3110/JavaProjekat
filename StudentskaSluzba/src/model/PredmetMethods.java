package model;

import java.util.ArrayList;

public class PredmetMethods {
	
	private static ArrayList<Predmet> predmeti = BazaPredmeta.getInstance().getPredmeti();
	private static ArrayList<Profesor> profesori = BazaProfesora.getInstance().getProfesori();
	
	public static void dodajPredmet(String sifraPredmeta, String nazivPredmeta, int semestar, int godinaStudija, String initprofesor)
	{
	
		predmeti.add(new Predmet(sifraPredmeta, nazivPredmeta, semestar, godinaStudija, initprofesor));
	}
	
	public static void izbrisiPredmet(String sifraPredmeta)
	{
		for(Predmet p : predmeti)
		{
			if(p.getSifrapredmeta().equals(sifraPredmeta))
			{
				predmeti.remove(p);
				break;
			}
		}
	}
	
	public static void izmeniPredmet(String sifraPredmeta, String nazivPredmeta, int semestar, int godinaStudija)
	{
		for(Predmet p : predmeti)
		{
			if(p.getSifrapredmeta().equals(sifraPredmeta))
			{
				p.setNazivpredmeta(nazivPredmeta);
				p.setSemestar(semestar);
				p.setGodinastudija(godinaStudija);
			}
		}
	}

	
	public static void dodajProfesoraNaPredmet(String sifraPredmeta, String brojLicneKarte)
	{
		for(Predmet p : predmeti)
		{
			if(p.getSifrapredmeta().equals(sifraPredmeta)) {
				for (Profesor profa : profesori)
				{
					if(profa.getBrlicne().equals(brojLicneKarte))
					{
						p.setProfa(profa.toString());
						break;
					}
				}
				
				
			}
		}
		
	}
	
	public static String[] izlistajStudenteZaPredmet(String sifraPredmeta) {
		String[] podaci;
		ArrayList<Student> studenti = new ArrayList<Student>();
		for (Predmet p : predmeti) {
			if (p.getSifrapredmeta().equals(sifraPredmeta)) {
				studenti = p.getSlusajuStudenti();
				podaci = new String[studenti.size()];
				int i = 0;
				for(Student s : studenti) {
					podaci[i] = s.toString();
					i++;
				}
				return podaci;
			}
		}
		return null;
	}
	
	public static void obrisiProfesoraSaPredmeta(String sifraPredmeta)
	{
		for(Predmet p : predmeti)
		{
			if(p.getSifrapredmeta().equals(sifraPredmeta))
			{
				p.setProfa("");
				break;
			}
		}
		
		
	}
}
