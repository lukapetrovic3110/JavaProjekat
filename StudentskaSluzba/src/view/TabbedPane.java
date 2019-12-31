package view;

/**
 *  @author ra25-2017
 */

import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class TabbedPane extends JTabbedPane
{
	private static final long serialVersionUID = -5733815749423597587L;
	
	private JFrame frame;
	public static ToolBar tBar;
	
	public static PanelProfesori panelProfesori;
	public static PanelPredmeti panelPredmeti;
	public static PanelStudenti panelStudenti;
	public static TabbedPane tabbedPane;
	
	public static int ind;
	
	public TabbedPane(JFrame parentFrame, ToolBar toolBar)
	{
		frame = parentFrame;
		tBar = toolBar;
	}
	
	public void setTabbedPane()
	{
		tabbedPane = new TabbedPane(frame, tBar);
		
		panelStudenti = new PanelStudenti(frame.getWidth(), frame.getHeight());
		tabbedPane.add("Studenti", panelStudenti);
		
		panelProfesori = new PanelProfesori(frame.getWidth(), frame.getHeight());
		tabbedPane.add("Profesori", panelProfesori);
		
		panelPredmeti = new PanelPredmeti(frame.getWidth(), frame.getHeight());
		tabbedPane.add("Predmeti", panelPredmeti);
		
		TabbedPaneMouseListener tabbePaneMouseListener = new TabbedPaneMouseListener();
		tabbedPane.addMouseListener(tabbePaneMouseListener);
			
		frame.getContentPane().add(tabbedPane);
	}
}
