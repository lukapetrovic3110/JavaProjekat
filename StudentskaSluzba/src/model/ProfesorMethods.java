package model;

import java.util.ArrayList;

public class ProfesorMethods {
	
	private static ArrayList<Profesor> profesori = BazaProfesora.getInstance().getProfesori();
	
	public static void dodajProfesora(String imeProfesora, String prezimeProfesora, String datumRodjenjaProfesora, String adresaStanovanjaProfesora, 
			String telefonProfesora, String emailProfesora, String adresaKancelarijeProfesora, long brojLicneKarteProfesora, Profesor.titule titulaProfesora, Profesor.zvanja zvanjeProfesora)	
	{
		
		profesori.add(new Profesor(imeProfesora, prezimeProfesora, datumRodjenjaProfesora, adresaStanovanjaProfesora, telefonProfesora, emailProfesora, adresaKancelarijeProfesora, brojLicneKarteProfesora, titulaProfesora, zvanjeProfesora));
	}
	
	public static void izbrisiProfesora(long brojLicneProfesora)
	{
		for(Profesor profesor : profesori)
		{
			if(profesor.getBrlicne() == brojLicneProfesora)
			{
				profesori.remove(profesor);
				break;
			}
		}
	}
	
	public static void izmeniProfesora(long brojLicneKarteProfesora, String imeProfesora, String prezimeProfesora, String datumRodjenjaProfesora, String adresaStanovanjaProfesora, 
			String telefonProfesora, String emailProfesora, String adresaKancelarijeProfesora, Profesor.titule titulaProfesora, Profesor.zvanja zvanjeProfesora)
	{
		for(Profesor profesor : profesori)
		{
			if(profesor.getBrlicne() == brojLicneKarteProfesora)
			{
				profesor.setIme(imeProfesora);
				profesor.setPrezime(prezimeProfesora);
				profesor.setDatumrodjenja(datumRodjenjaProfesora);
				profesor.setAdresastanovanja(adresaStanovanjaProfesora);
				profesor.setKontakttelefona(telefonProfesora);
				profesor.setEmail(emailProfesora);
				profesor.setAdresakancelarije(adresaKancelarijeProfesora);
				profesor.setBrlicne(brojLicneKarteProfesora);
				profesor.setTitula(titulaProfesora);
				profesor.setZvanje(zvanjeProfesora);
			}
		}
	}
}
