package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnNew2ActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		DialogDodavanjeStudentaNaPredmet dialogDodavanjeStudentaNaPredmet = new DialogDodavanjeStudentaNaPredmet(MainWindow.getInstance(), true);
		dialogDodavanjeStudentaNaPredmet.setVisible(true);
	}

}
