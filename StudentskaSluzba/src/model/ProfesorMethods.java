package model;

import java.util.ArrayList;

public class ProfesorMethods {
	
	private static ArrayList<Profesor> profesori = BazaProfesora.getInstance().getProfesori();
	
	public static void dodajProfesora(String imeProfesora, String prezimeProfesora, String datumRodjenjaProfesora, String adresaStanovanjaProfesora, 
			String telefonProfesora, String emailProfesora, String adresaKancelarijeProfesora, String brojLicneKarteProfesora, Profesor.titule titulaProfesora, Profesor.zvanja zvanjeProfesora)	
	{
		
		profesori.add(new Profesor(imeProfesora, prezimeProfesora, datumRodjenjaProfesora, adresaStanovanjaProfesora, telefonProfesora, emailProfesora, adresaKancelarijeProfesora, brojLicneKarteProfesora, titulaProfesora, zvanjeProfesora));
	}
	
	public static void izbrisiProfesora(String brojLicneProfesora)
	{
		for(Profesor profesor : profesori)
		{
			if(profesor.getBrlicne().equals(brojLicneProfesora))
			{
				profesori.remove(profesor);
				break;
			}
		}
	}
	
	public static void izmeniProfesora(String brojLicneKarteProfesora, String imeProfesora, String prezimeProfesora, String datumRodjenjaProfesora, String adresaStanovanjaProfesora, 
			String telefonProfesora, String emailProfesora, String adresaKancelarijeProfesora, Profesor.titule titulaProfesora, Profesor.zvanja zvanjeProfesora)
	{
		for(Profesor profesor : profesori)
		{
			if(profesor.getBrlicne().equals(brojLicneKarteProfesora))
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
	
	public static String[] izlistajPredmeteZaProfesore(String brojLicneKarteProfesora)
	{
		String[] podaci;
		ArrayList<Predmet> njegoviPredmeti = new ArrayList<Predmet>();
		for(Profesor profesor : profesori)
		{
			if(profesor.getBrlicne().equals(brojLicneKarteProfesora)) {
				njegoviPredmeti = profesor.getSpisakpredmeta();
				podaci = new String[njegoviPredmeti.size()];
				int i = 0;
				
				for(Predmet predmet : njegoviPredmeti) {
					podaci[i] = predmet.toString();
					i++;
				}
				
				return podaci;
			}
		}
		
		return null;
	}
}
