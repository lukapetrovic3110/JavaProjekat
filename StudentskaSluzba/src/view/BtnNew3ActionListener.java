package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnNew3ActionListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		DialogDodavanjeProfesoraNaPredmet dialogDodavanjeProfesoraNaPredmet = new DialogDodavanjeProfesoraNaPredmet(MainWindow.getInstance(), true);
		dialogDodavanjeProfesoraNaPredmet.setVisible(true);
		
	}
}
