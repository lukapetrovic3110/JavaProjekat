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
	
	static boolean panelstdunt = true;
	static boolean panelprofesor = false;
	static boolean panelpredmet = false;
	
	public TabbedPane(JFrame parentFrame)
	{
		frame = parentFrame;
	}
	
	public void setTabbedPane()
	{
		PanelStudenti panelStudenti = new PanelStudenti();
		this.addTab("Studenti", null, panelStudenti, null);
		
		PanelProfesori panelProfesori = new PanelProfesori();
		this.addTab("Profesori", null, panelProfesori, null);
		
		PanelPredmeti panelPredmeti = new PanelPredmeti();
		this.addTab("Predmeti", null, panelPredmeti, null);
		
		//System.out.println(this.getSelectedIndex());
		frame.getContentPane().add(this);
	}
}
