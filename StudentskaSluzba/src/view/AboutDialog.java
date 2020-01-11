package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class AboutDialog extends JOptionPane{
	private static final long serialVersionUID = 3591599721565020284L;
	

	public AboutDialog(JFrame parentFrame) {
		
		//JOptionPane.showMessageDialog(null, "tekst", "About", JOptionPane.PLAIN_MESSAGE);
		String longMessage=" ** Ovo je Java GUI aplikacija sa koristenjem Swing biblioteke, pod nazivom 'Studentska sluzba'.\n Aplikacija predstavlja rad sa podacima o studentima,"
				+ "profesorima i predmetima u nekoj studentskoj sluzbi.\n Njen izgled sastoji se iz glavnog prozora sa trakom sa menijima,\n trakom sa alatkama,trakom sa izbranim entitetima i statusnom linijom.\n"
				+ " Pomocu aplikacije je moguce vrsiti dodavanje,izmenu,pretragu i sortiranje datih podatdaka.\n"
				+ " \n** Autori ove aplikacije su Luka Petrovic i Jelena Budisa.\n ~ Luka je rodjen 31.10.1998.godine\n u Novom Sadu,Backi Jarak,Republika Srbija."
				+ "\n Zavrsio je Elektrotehnicku skolu 'Mihajlo Pupin' u Novom Sadu.\n Sada je student 3.godine Fakulteta tehnickih nauka u Novom Sadu,"
				+ "\n usmerenje Racunarstvo i automatika."
				+ "\n ~ Jelena je rodjena 12.6.1998.godine u Banjoj Luci,BiH.\n Pohadjala je Katolicku gimnaziju u Banjoj Luci \n a trenutno je student"
				+ " 3.godine Fakulteta tehnickih nauka u Novom Sadu,\n usmerenje Racunarstvo i automatika.";
	    JTextArea textArea = new JTextArea(7, 30);
	    textArea.setText(longMessage);
	    textArea.setEditable(false);
	    JScrollPane scrollPane = new JScrollPane(textArea);
	    JOptionPane.showMessageDialog(parentFrame, scrollPane, "About", JOptionPane.PLAIN_MESSAGE);
	}

};	
