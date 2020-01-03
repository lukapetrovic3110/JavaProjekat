package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnNewActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelStudenti)
		{
			DodavanjeStudenta dodavanjeStudenta = new DodavanjeStudenta(MainWindow.getInstance(), true);
			dodavanjeStudenta.setVisible(true);
		}
		else if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelProfesori)
		{
			DialogDodavanjeProfesora dialogDodavanjeProfesora = new DialogDodavanjeProfesora(MainWindow.getInstance(), true);
			dialogDodavanjeProfesora.setVisible(true);
		}
		else
		{
			DialogDodavanjePredmeta dialogDodavanjePredmeta = new DialogDodavanjePredmeta(MainWindow.getInstance(), true, false);
			dialogDodavanjePredmeta.setVisible(true);
		}
			
	}

}
