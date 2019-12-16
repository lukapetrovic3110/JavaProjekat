package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class StatusBar extends JPanel
{
	private JFrame frame;
	
	public StatusBar(JFrame parentFrame)
	{
		frame = parentFrame;
	}
	
	public void DrawStatusBar()
	{
	
		this.setBorder(new BevelBorder(BevelBorder.LOWERED));
		frame.add(this, BorderLayout.SOUTH);
		this.setPreferredSize(new Dimension(frame.getWidth(), 30));
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
	
		JLabel headerLabel = new JLabel("Studentska Sluzba", SwingConstants.LEFT);
		headerLabel.setHorizontalAlignment(JLabel.LEFT);
		this.add(headerLabel, 0);
		
		String vreme = new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());
		JLabel timeLabel = new JLabel(vreme, SwingConstants.RIGHT);
		timeLabel.setHorizontalAlignment(JLabel.RIGHT);
		this.add(timeLabel, 1);
		
		String datum = new SimpleDateFormat("dd.MM.YYYY").format(Calendar.getInstance().getTime());
		JLabel dateTimeLabel = new JLabel(datum, SwingConstants.RIGHT);
		dateTimeLabel.setHorizontalAlignment(JLabel.RIGHT);
		this.add(dateTimeLabel, 2);
		
		//String datum = new SimpleDateFormat("HH:mm dd.MM.YYYY").format(Calendar.getInstance().getTime());
		//JLabel dateTimeLabel = new JLabel(datum, SwingConstants.RIGHT);
		//dateTimeLabel.setHorizontalAlignment(JLabel.RIGHT);
		//this.add(dateTimeLabel, 1);
		
		//VREME: https://books.google.rs/books?id=3Qtf7mDvtbMC&pg=PA148&lpg=PA148&dq=how+to+position+
		//jlabel+in+status+bar&source=bl&ots=--Se2euqji&sig=ACfU3U1ru8bZgDz9rKUeUgrtNAoM_l-HtQ&hl=en&sa=X&ved=2
		//ahUKEwict7nmv7rmAhXD-6QKHb6fDlQQ6AEwCXoECAkQAQ#v=onepage&q=how%20to%20position%20jlabel%20in%20status%20bar&f=false
		
		//frame.setVisible(true);
	}
	
	
}
