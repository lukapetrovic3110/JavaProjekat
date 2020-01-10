package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class AboutDialog extends JOptionPane{
	private static final long serialVersionUID = 3591599721565020284L;
	

	public AboutDialog(JFrame parentFrame) {
		
		//JOptionPane.showMessageDialog(null, "tekst", "About", JOptionPane.PLAIN_MESSAGE);
		String longMessage=" ** Ovo je Java GUI aplikacija sa koristenjem Swing biblioteke, pod nazivom 'Studentska sluzba'.\nAplikacija predstavlja rad sa podacima o studentima,"
				+ "profesorima i predmetima u nekoj studentskoj sluzbi.\nNjen izgled sastoji se iz glavnog prozora sa trakom sa menijima,\ntrakom sa alatkama,trakom sa izbranim entitetima i statusnom linijom.\n"
				+ "Pomocu aplikacije je moguce vrsiti dodavanje,izmenu,pretragu i sortiranje datih podatdaka.\n"
				+ " \n** Autori ove aplikacije su Luka Petrovic i Jelena Budisa.Luka je rodjen 31.10.1998.godine\n u Novom Sadu,Backi Jarak,Republika Srbija."
				+ "\nZavrsio je Elektrotehnicku skolu 'Mihajlo Pupin' u Novom Sadu.\nSada je student 3.godine Fakulteta tehnickih nauka u Novom Sadu,"
				+ "\nusmerenje Racunarstvo i automatika."
				+ "\nJelena je rodjena 12.6.1998.godine u Banjoj Luci,BiH.\nPohadjala je Katolicku gimnaziju u Banjoj Luci \na trenutno je student"
				+ " 3.godine Fakulteta tehnickih nauka u Novom Sadu,\nusmerenje Racunarstvo i automatika.";
	    JTextArea textArea = new JTextArea(7, 30);
	    textArea.setText(longMessage);
	    textArea.setEditable(false);
	    JScrollPane scrollPane = new JScrollPane(textArea);
	    JOptionPane.showMessageDialog(parentFrame, scrollPane, "About", JOptionPane.PLAIN_MESSAGE);
	}

};	
