package view;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class AboutDialog extends JDialog{
	private static final long serialVersionUID = 3591599721565020284L;
	public AboutDialog(JFrame parentFrame,boolean modal) {
		super(parentFrame,modal);
		JOptionPane.showMessageDialog(null, "tekst", "About", JOptionPane.PLAIN_MESSAGE);
	};


}	
