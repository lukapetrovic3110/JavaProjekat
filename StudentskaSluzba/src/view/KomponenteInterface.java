package view;

import javax.swing.JTextField;

public interface KomponenteInterface {
	
	void setValid(JTextField komponenta);
	void setInvalid(JTextField komponenta);
	boolean checkifAllValid();
}
