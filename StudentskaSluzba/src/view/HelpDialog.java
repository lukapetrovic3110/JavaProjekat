package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class HelpDialog extends JOptionPane{
	private static final long serialVersionUID = 359599721565020284L;
	
	public HelpDialog(JFrame parentFrame)
	{
		
		//JOptionPane.showMessageDialog(null, "tekst", "Help", JOptionPane.PLAIN_MESSAGE);
		String longMessage=" ** NACIN KORISTENJA APLIKACIJE **\n\n ~Dodavanje studenta/profesora/predmeta\n"
				+ " Za dodavanje novog studenta,profesora ili predmeta kliknuti na ikonu 'Dodaj' \n u traci sa alatkama ili"
				+ " koristiti File-New.Moguce je takodje koristiti akcelerator Ctrl+N.\n Ako ne popunite sve obavezna polja oznacenja sa '*'"
				+ " ili ako ih ne unesete u ispravno obliku,\n nece biti moguce dodati zeljeni objekat.\n "
				+ "\n ~Brisanje studenta/profesora/predmeta\n"
				+ " Za brisanje studenta,profesora ili predmeta potrebno je prvo selektovati studenta,profesora ili predmet\n"
				+ " koji zelite obrisati a potom kliknuti na ikonu 'Obrisi'\n u traci sa alatkama ili "
				+ " koristiti Edit-Delete.Moguce je takodje koristiti akcelerator Ctrl+D.\n\n ~Izmena studenta/profesora/predmeta\n"
				+ " Za menjanje nekog studenta,profesora ili predmeta potrebno je prvo selektovati studenta,profesora ili predmet"
				+ "\n koji zelite izmeniti a potom kliknuti na ikonu 'Izmeni' \n u traci sa alatkama ili"
				+ " koristiti Edit-Edit.Moguce je takodje koristiti akcelerator Ctrl+E.\n Ako ne popunite sve obavezna polja oznacenja sa '*'"
				+ " ili ako ih ne unesete u ispravno obliku,\n nece biti moguce izmeniti zeljeni objekat.\n\n ~Sortiranje studenta/profesora/predmeta\n"
				+ " Klikom na naziv kolone u tabeli moguce je sortirati podatke iz odredjene kolone u rastucem \n ili opadajucem redosledu.\n\n"
				+ " ~Zatvaranje aplikacije\n Za zatvaranje aplikacije moguce je kliknuti na dugme 'Close' u gornjem desnom uglu glavnog prozora\n"
				+ " ili koristiti File-Close.Takodje, moguce je koristiti akcelerator Ctrl+C.\n\n ~Informacije o aplikaciji\n"
				+ " Da dobijete informacije o radu oke aplikacije mozete koristiti Help-Help, Help-About ili akceleratore Ctrl+H, Ctrl+A.\n\n"
				+ " ~Pretraga studenta/profesora/predmeta\n U polje za pretragu uneti tekst za pretragu u obliku na primer: 'ime:Ana;', a moguce je vrsiti i "
				+ " \n kombinovanu pretragu po vise podataka na primer: 'ime:Ana;prezime:Markovic;'\n Za pokretanje pretrage pritisnuti"
				+ " dugme 'Pretraga' u traci sa alatkama.\n\n"
				+ " ~Dodavanje studenta/profesora na predmet\n Za dodavanje studenta na predmet koristiti dugme 'Dodaj studenta na predmet' iz "
				+ " trake sa alatkama.\n Dodati samo indeks studenta koji vec postoji u bazi studenata i to samo studenta koji je ista godina studija\n kao i predmet "
				+ " na koji se dodaje student.Za dodavanje profesora na predmet koristiti dugme\n 'Dodaj profesora na predmet' iz"
				+ " trake sa alatkama.Dodati samo broj licne karte profesora\n koji vec postoji u bazi profesora.Na jedan predmet je moguce dodati samo jednog profesora\n dok"
				+ " jedan profesor moze da se doda na vise predmeta.\n\n"
				+ " ~Uklanjanje studenta/profesora sa predmeta\n U panelu 'Predmeti' nalaze se dugmad 'Prikazi' za predmetnog profesora i za studente koji slusaju"
				+ " taj predmet.\n Izborom 'Obrisi' vrsi se uklanjanje.\n";

	    JTextArea textArea = new JTextArea(7, 30);
	    textArea.setText(longMessage);
	    textArea.setEditable(false);
	    JScrollPane scrollPane = new JScrollPane(textArea);
	    JOptionPane.showMessageDialog(parentFrame, scrollPane, "Help", JOptionPane.PLAIN_MESSAGE);
	    
	}
	
}
