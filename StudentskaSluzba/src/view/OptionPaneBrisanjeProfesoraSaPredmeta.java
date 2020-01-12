package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import controller.PredmetController;

public class OptionPaneBrisanjeProfesoraSaPredmeta extends JOptionPane{
	
	private static final long serialVersionUID = 3497501625586315362L;
	
	public OptionPaneBrisanjeProfesoraSaPredmeta() 
	{
		Object[] options = { "Potvrdi", "Odustani" };	

		int n = JOptionPane.showOptionDialog(null, "Da li ste sigurni da zelite da obrisete profesora sa predmeta?", "Brisanje profesora sa predmeta",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/icons/icon_delete.png"), options, options[1]);

	
		if (n == 0)
		{
			int rowSelected = PanelPredmeti.tablePredmeti.getSelectedRow();
			rowSelected = PanelPredmeti.tablePredmeti.convertRowIndexToModel(rowSelected);
			PredmetController.getInstance().obrisiProfesoraSaPredmeta(rowSelected);
		}	
	}
}
