package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class BtnEditActionListener implements ActionListener{
	
	private int rowSelectedIndex;
	
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
			
	        rowSelectedIndex = PanelPredmeti.tablePredmeti.getSelectedRow();
			
			if (rowSelectedIndex < 0)
			{
				JOptionPane.showMessageDialog(null, "Nije selektovan predmet u tabeli!\nNije moguce izvrsiti izmenu!");
				dialogDodavanjePredmeta.setVisible(false);
			}
			else 
			{
				dialogDodavanjePredmeta.setVisible(true);
			}
		}
	}
}
