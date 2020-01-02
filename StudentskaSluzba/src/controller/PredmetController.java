package controller;

import model.PredmetMethods;
import view.PanelPredmeti;

public class PredmetController {
	
	private static PredmetController instance = null;
	
	public static PredmetController getInstance()
	{
		if(instance == null)
		{
			instance = new PredmetController();
		}
		
		return instance;
	}
	
	private PredmetController() {}
	
	public void dodajPredmet(String sifraPredmeta, String nazivPredmeta, String semestar, String godinaStudija)
	{
		PredmetMethods.dodajPredmet(sifraPredmeta, nazivPredmeta, semestar, godinaStudija);
		PanelPredmeti.azurirajPrikaz();
	}
	
	public void izmeniPredmet()
	{
		// TO::DO
	}
	
	public void izbrisiPredmet()
	{
		// TO::DO
	}
}
