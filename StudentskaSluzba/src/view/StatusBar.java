package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;

public class StatusBar extends JPanel
{
	private static final long serialVersionUID = 2157576763164092408L;
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
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	
		JLabel headerLabel = new JLabel("Studentska Sluzba");
		this.add(headerLabel);
		
		this.add(Box.createHorizontalGlue());
		
		
		JLabel timeLabel = new JLabel();
		
		
		
		Timer timee = new javax.swing.Timer(1000, new ActionListener() {
			 
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date now = new java.util.Date();
				String ss=DateFormat.getTimeInstance().format(now);
				//ss=ss.substring(0, ss.length() - 2); ne zelim PM
                timeLabel.setText(ss+"   ");
 
            }
        });
        timee.start();
		
        this.add(timeLabel);
		
		
		String datum = new SimpleDateFormat("dd.MM.yyyy.").format(Calendar.getInstance().getTime());
		JLabel dateTimeLabel = new JLabel(datum);
		this.add(dateTimeLabel);
		
	
		
		//frame.setVisible(true);
	}
	
	
}
