package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class HelpDialog extends JOptionPane{
	private static final long serialVersionUID = 359599721565020284L;
	
	public HelpDialog(JFrame parentFrame)
	{
		
		//JOptionPane.showMessageDialog(null, "tekst", "Help", JOptionPane.PLAIN_MESSAGE);
		String longMessage="dieGFJD\njsidnfuhgyda\nnkafsa\nfghj\ngtfhgjukh\ndfgh\nsd\nfdg\nfgfh\ndf\ndfd\n";
	    JTextArea textArea = new JTextArea(7, 30);
	    textArea.setText(longMessage);
	    textArea.setEditable(false);
	    JScrollPane scrollPane = new JScrollPane(textArea);
	    JOptionPane.showMessageDialog(parentFrame, scrollPane, "Help", JOptionPane.PLAIN_MESSAGE);
	    
	}
	
}
