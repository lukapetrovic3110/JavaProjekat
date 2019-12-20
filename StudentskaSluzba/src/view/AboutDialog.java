package view;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class AboutDialog extends JDialog{
	private static final long serialVersionUID = 3591599721565020284L;
	public AboutDialog(JFrame parentFrame,boolean modal) {
		super(parentFrame,modal);
		JOptionPane.showMessageDialog(null, "tekst", "About", JOptionPane.PLAIN_MESSAGE);
	};


}	
