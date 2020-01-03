package controller;

import model.BazaPredmeta;
import model.Predmet;
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
	
	public void izmeniPredmet(String sifraPredmeta, String nazivPredmeta, String semestar, String godinaStudija)
	{
		PredmetMethods.izmeniPredmet(sifraPredmeta, nazivPredmeta, semestar, godinaStudija);
		PanelPredmeti.azurirajPrikaz();
	}
	
	public void izbrisiPredmet(int rowSelectedIndex)
	{
		Predmet predmet = BazaPredmeta.getInstance().getRow(rowSelectedIndex);
		PredmetMethods.izbrisiPredmet(predmet.getSifrapredmeta());
		PanelPredmeti.azurirajPrikaz();
	}
}
