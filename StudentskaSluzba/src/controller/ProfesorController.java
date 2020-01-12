package controller;

import java.util.ArrayList;

import model.BazaProfesora;
import model.Predmet;
import model.Profesor;
import model.ProfesorMethods;
import view.PanelProfesori;

public class ProfesorController {

	private static ProfesorController instance = null;
	
	public static ProfesorController getInstance()
	{
		if(instance == null)
		{
			instance = new ProfesorController();
		}
		
		return instance;
	}
	
	private ProfesorController() {}
	
	public void dodajProfesora(String imeProfesora, String prezimeProfesora, String datumRodjenjaProfesora, String adresaStanovanjaProfesora, 
			String telefonProfesora, String emailProfesora, String adresaKancelarijeProfesora, String brojLicneKarteProfesora, Profesor.titule titulaProfesora, Profesor.zvanja zvanjeProfesora, ArrayList<Predmet> predmeti)
	{
		ProfesorMethods.dodajProfesora(imeProfesora, prezimeProfesora, datumRodjenjaProfesora, adresaStanovanjaProfesora, telefonProfesora, emailProfesora, adresaKancelarijeProfesora, brojLicneKarteProfesora, titulaProfesora, zvanjeProfesora, predmeti);
		PanelProfesori.azurirajPrikaz();
	}
	
	public void izmeniProfesora(String brojLicneKarteProfesora, String imeProfesora, String prezimeProfesora, String datumRodjenjaProfesora, String adresaStanovanjaProfesora, 
			String telefonProfesora, String emailProfesora, String adresaKancelarijeProfesora, Profesor.titule titulaProfesora, Profesor.zvanja zvanjeProfesora)
	{
		ProfesorMethods.izmeniProfesora(brojLicneKarteProfesora, imeProfesora, prezimeProfesora, datumRodjenjaProfesora, adresaStanovanjaProfesora, telefonProfesora, emailProfesora, adresaKancelarijeProfesora, titulaProfesora, zvanjeProfesora);
		PanelProfesori.azurirajPrikaz();
	}
	
	public void izbrisiProfesora(int rowSelectedIndex)
	{
		Profesor profesor = BazaProfesora.getInstance().getRow(rowSelectedIndex);
		ProfesorMethods.izbrisiProfesora(profesor.getBrlicne());
		PanelProfesori.azurirajPrikaz();
	}
	
	public String[] izlistajPredmeteZaProfesore(int rowSelectedIndex)
	{
		rowSelectedIndex = PanelProfesori.tableProfesori.convertRowIndexToModel(rowSelectedIndex);
		Profesor profesor = BazaProfesora.getInstance().getRow(rowSelectedIndex);
		String[] podaci = ProfesorMethods.izlistajPredmeteZaProfesore(profesor.getBrlicne());
		PanelProfesori.azurirajPrikaz();
		return podaci;
	}
}
