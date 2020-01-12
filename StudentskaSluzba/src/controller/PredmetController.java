package controller;

import model.BazaPredmeta;
import model.Predmet;
import model.PredmetMethods;
import view.PanelPredmeti;
import view.PanelProfesori;

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
	
	public void dodajPredmet(String sifraPredmeta, String nazivPredmeta, int semestar, int godinaStudija, String profesor)
	{
		PredmetMethods.dodajPredmet(sifraPredmeta, nazivPredmeta, semestar, godinaStudija, profesor);
		PanelPredmeti.azurirajPrikaz();
	}
	
	public void izmeniPredmet(String sifraPredmeta, String nazivPredmeta, int semestar, int godinaStudija)
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

	public String[] izlistajStudenteZaPredmet(int rowSelectedIndex)
	{
		rowSelectedIndex = PanelPredmeti.tablePredmeti.convertRowIndexToModel(rowSelectedIndex);
		Predmet predmet = BazaPredmeta.getInstance().getRow(rowSelectedIndex);
		String[] podaci = PredmetMethods.izlistajStudenteZaPredmet(predmet.getSifrapredmeta());
		PanelPredmeti.azurirajPrikaz();
		return podaci;
	}

	public void dodajProfesoraNaPredmet(String sifraPredmeta, String brojLicneKarteProfesora) {
		
		PredmetMethods.dodajProfesoraNaPredmet(sifraPredmeta, brojLicneKarteProfesora);
		PanelPredmeti.azurirajPrikaz();
		
	}
	
	public void obrisiProfesoraSaPredmeta(int rowSlectedIndex)
	{
		Predmet predmet = BazaPredmeta.getInstance().getRow(rowSlectedIndex);
		PredmetMethods.obrisiProfesoraSaPredmeta(predmet.getSifrapredmeta());
		PanelPredmeti.azurirajPrikaz();
	}

}
