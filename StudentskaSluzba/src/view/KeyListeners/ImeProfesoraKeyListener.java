package view.KeyListeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ImeProfesoraKeyListener implements KeyListener{
	@Override
	public void keyTyped(KeyEvent keyEvent) {
		// nema promena
	}
	
	@Override
	public void keyReleased(KeyEvent keyEvent) {
		if (keyEvent.isActionKey() || keyEvent.getKeyCode() == KeyEvent.VK_ENTER
				|| keyEvent.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			return;
		}
		
		char c = keyEvent.getKeyChar();
		
		if(!((c >= 65 && c <= 90) || (c >= 97 && c <= 122)))
		{
			JTextField txtFieldIme = (JTextField) keyEvent.getComponent();
			String txt = txtFieldIme.getText();
			JOptionPane.showMessageDialog(null, "Mozete unositi samo slova!", "Upozorenje", JOptionPane.ERROR_MESSAGE);
			txtFieldIme.setText(txtFieldIme.getText().substring(0, txt.length()-1));
		}
	}
	
	
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		// ako je action key, nema provere
		if (keyEvent.isActionKey() || keyEvent.getKeyCode() == KeyEvent.VK_ENTER
				|| keyEvent.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			return;
		}
		JTextField txt = (JTextField) keyEvent.getComponent();
		if(txt.getText().length() == 15)
		{
			JOptionPane.showMessageDialog(null, "Možete uneti maksimalno 15 karaktera!");
			// txt.setText("");
			txt.setText(txt.getText().substring(0, 15));
		}
	}
}
