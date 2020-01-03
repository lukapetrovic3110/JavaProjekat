package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BtnDeleteActionListener implements ActionListener{
	
	private int rowSelectedIndex;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelStudenti)
		{
			BrisanjeStudenta brisanjeStudenta = new BrisanjeStudenta(MainWindow.getInstance());
			brisanjeStudenta.setVisible(true);
		}
		else if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelProfesori)
		{
			rowSelectedIndex = PanelProfesori.tableProfesori.getSelectedRow();
			
			if (rowSelectedIndex < 0)
			{
				JOptionPane.showMessageDialog(null, "Nije selektovan profesor u tabeli!\nNije moguce izvrsiti brisanje!");
			}
			else
			{
				OptionPaneBrisanjeProfesora oPaneBrisanjeProfesora = new OptionPaneBrisanjeProfesora();
				oPaneBrisanjeProfesora.setVisible(true);
			}
		}
		else
		{
			rowSelectedIndex = PanelPredmeti.tablePredmeti.getSelectedRow();
			
			if (rowSelectedIndex < 0)
			{
				JOptionPane.showMessageDialog(null, "Nije selektovan predmet u tabeli!\nNije moguce izvrsiti brisanje!");
			}
			else
			{
				OptionPaneBrisanjePredmeta oPaneBrisanjePredmeta = new OptionPaneBrisanjePredmeta();
				oPaneBrisanjePredmeta.setVisible(true);
			}
			
		}
			
	}
}
