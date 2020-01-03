package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnAboutActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		AboutDialog aboutDialog = new AboutDialog(MainWindow.getInstance());
		aboutDialog.setVisible(true);
		
	}

}
