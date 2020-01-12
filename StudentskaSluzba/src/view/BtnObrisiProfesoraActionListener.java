package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BtnObrisiProfesoraActionListener implements ActionListener{
	
	private int rowSelectedIndex;
	@Override
	public void actionPerformed(ActionEvent e) {
		
		rowSelectedIndex = PanelPredmeti.tablePredmeti.getSelectedRow();
		
		if (rowSelectedIndex < 0)
		{
			JOptionPane.showMessageDialog(null, "Nije selektovan predmet u tabeli!\nNije moguce izvrsiti brisanje profesora sa predmeta!");
		}
		else
		{
			OptionPaneBrisanjeProfesoraSaPredmeta optionPaneBrisanjeProfesoraSaPredmeta = new OptionPaneBrisanjeProfesoraSaPredmeta();
			optionPaneBrisanjeProfesoraSaPredmeta.setVisible(true);
		}
		
	}

}
