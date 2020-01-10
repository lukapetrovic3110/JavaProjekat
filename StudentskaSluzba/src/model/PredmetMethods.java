package model;

import java.util.ArrayList;

public class PredmetMethods {
	
	private static ArrayList<Predmet> predmeti = BazaPredmeta.getInstance().getPredmeti();
	
	public static void dodajPredmet(String sifraPredmeta, String nazivPredmeta, int semestar, int godinaStudija)
	{
	
		predmeti.add(new Predmet(sifraPredmeta, nazivPredmeta, semestar, godinaStudija));
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
}
