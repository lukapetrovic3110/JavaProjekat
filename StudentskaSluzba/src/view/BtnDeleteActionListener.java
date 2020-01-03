package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnDeleteActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelStudenti)
		{
			BrisanjeStudenta brisanjeStudenta = new BrisanjeStudenta(MainWindow.getInstance());
			brisanjeStudenta.setVisible(true);
		}
		else if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelProfesori)
		{
			OptionPaneBrisanjeProfesora oPaneBrisanjeProfesora = new OptionPaneBrisanjeProfesora();
			oPaneBrisanjeProfesora.setVisible(true);
		}
		else
		{
			OptionPaneBrisanjePredmeta oPaneBrisanjePredmeta = new OptionPaneBrisanjePredmeta();
			oPaneBrisanjePredmeta.setVisible(true);
		}
			
	}
}