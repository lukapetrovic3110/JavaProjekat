package view;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HelpDialog extends JDialog{
	private static final long serialVersionUID = 3591599721565020284L;
	
	public HelpDialog(JFrame parentFrame,boolean modal)
	{
		super(parentFrame,modal);
		JOptionPane.showMessageDialog(null, "tekst", "Help", JOptionPane.PLAIN_MESSAGE);
	}
	
}
