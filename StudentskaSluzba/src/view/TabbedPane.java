package view;

/**
 *  @author ra25-2017
 */

import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class TabbedPane extends JTabbedPane
{
	private static final long serialVersionUID = -5733815749423597587L;
	JFrame frame;
	
	public static int tabindex;

	public TabbedPane(JFrame parentFrame)
	{
		frame = parentFrame;
	}
	
	public void setTabbedPane()
	{
		PanelStudenti panelStudenti = new PanelStudenti(frame.getWidth(), frame.getHeight());
		this.addTab("Studenti", null, panelStudenti, null);
		
		PanelProfesori panelProfesori = new PanelProfesori(frame.getWidth(), frame.getHeight());
		this.addTab("Profesori", null, panelProfesori, null);
		
		PanelPredmeti panelPredmeti = new PanelPredmeti(frame.getWidth(), frame.getHeight());
		this.addTab("Predmeti", null, panelPredmeti, null);
		
		frame.getContentPane().add(this);
	}
	
}
