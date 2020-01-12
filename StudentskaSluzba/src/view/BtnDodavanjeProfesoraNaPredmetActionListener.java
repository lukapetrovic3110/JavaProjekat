package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BtnDodavanjeProfesoraNaPredmetActionListener implements ActionListener{
	private int rowSelectedIndex;
	@Override
	public void actionPerformed(ActionEvent e) {
		DialogDodavanjeProfesoraNaPredmet dialogDodavanjeProfesoraNaPredmet = new DialogDodavanjeProfesoraNaPredmet(MainWindow.getInstance(), true);
		rowSelectedIndex = PanelPredmeti.tablePredmeti.getSelectedRow();
		
		if (rowSelectedIndex < 0)
		{
			JOptionPane.showMessageDialog(null, "Nije selektovan predmet u tabeli!\nNije moguce dodati profesora na predmet!");
			dialogDodavanjeProfesoraNaPredmet.setVisible(false);
		}
		else 
		{
			dialogDodavanjeProfesoraNaPredmet.setVisible(true);
		}
	}
}
