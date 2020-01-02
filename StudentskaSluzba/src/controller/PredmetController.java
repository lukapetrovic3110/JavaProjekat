package controller;

import javax.swing.JOptionPane;

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
	
	public void izmeniPredmet()
	{
		// TO::DO
	}
	
	public void izbrisiPredmet(int rowSelectedIndex)
	{
		if (rowSelectedIndex < 0)
		{
			JOptionPane.showMessageDialog(null, "Nije selektovan predmet u tabeli!\nNije moguce izvrsiti brisanje!");
			return ;
		}
		
		Predmet predmet = BazaPredmeta.getInstance().getRow(rowSelectedIndex);
		PredmetMethods.izbrisiPredmet(predmet.getSifrapredmeta());
		PanelPredmeti.azurirajPrikaz();
	}
}
