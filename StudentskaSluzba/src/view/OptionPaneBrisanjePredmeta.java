package view;

import javax.swing.JOptionPane;

public class OptionPaneBrisanjePredmeta extends JOptionPane{
	
	private static final long serialVersionUID = 3497501625586315362L;
	
	public OptionPaneBrisanjePredmeta() 
	{
		Object[] options = { "Potvrdi", "Odustani" };	
		
		JOptionPane.showOptionDialog(null, "Da li ste sigurni da zelite da obrisete predmet?", "Brisanje predmeta",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		
		
		this.setLocation(null);
	}
}
