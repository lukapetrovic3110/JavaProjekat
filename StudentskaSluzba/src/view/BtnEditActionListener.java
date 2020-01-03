package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnEditActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelStudenti)
		{
			DodavanjeStudenta dodavanjeStudenta = new DodavanjeStudenta(MainWindow.getInstance(), true);
			dodavanjeStudenta.setTitle("Izmeni podatke studenta");
			dodavanjeStudenta.setVisible(true);
		}
		else if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelProfesori)
		{
			DialogDodavanjeProfesora dialogDodavanjeProfesora = new DialogDodavanjeProfesora(MainWindow.getInstance(), true);
			dialogDodavanjeProfesora.setTitle("Izmeni podatke profesora");
			dialogDodavanjeProfesora.setVisible(true);
		}
		else
		{
			DialogDodavanjePredmeta dialogDodavanjePredmeta = new DialogDodavanjePredmeta(MainWindow.getInstance(), true, true);
			dialogDodavanjePredmeta.setTitle("Izmeni podatke predmeta");
			dialogDodavanjePredmeta.setVisible(true);
		}
	}
}
