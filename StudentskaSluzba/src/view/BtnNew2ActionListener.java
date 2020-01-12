package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BtnNew2ActionListener implements ActionListener{
	private int rowSelectedIndex;
	@Override
	public void actionPerformed(ActionEvent e) {
		DialogDodavanjeStudentaNaPredmet dialogDodavanjeStudentaNaPredmet = new DialogDodavanjeStudentaNaPredmet(MainWindow.getInstance(), true);
		rowSelectedIndex = PanelPredmeti.tablePredmeti.getSelectedRow();
		
		if (rowSelectedIndex < 0)
		{
			JOptionPane.showMessageDialog(null, "Nije selektovan student u tabeli!\nNije moguce dodati studenta na predmet!");
			dialogDodavanjeStudentaNaPredmet.setVisible(false);
		}
		else 
		{
			dialogDodavanjeStudentaNaPredmet.setVisible(true);
		}
	}

}
