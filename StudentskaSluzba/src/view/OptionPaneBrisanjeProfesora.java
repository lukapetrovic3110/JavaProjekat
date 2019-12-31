package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OptionPaneBrisanjeProfesora extends JOptionPane{
	
	private static final long serialVersionUID = -894509145520418143L;

	public OptionPaneBrisanjeProfesora() 
	{
		Object[] options = { "Potvrdi", "Odustani" };
		
		JOptionPane.showOptionDialog(null, "Da li ste sigurni da zelite da obrisete profesora?", "Brisanje profesora",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/icons/icon_delete.png"), options, options[1]);
	}
}
