package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnHelpActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		HelpDialog helpDialog = new HelpDialog(MainWindow.getInstance());
		helpDialog.setVisible(true);
		
	}

}
