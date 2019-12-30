package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

/**
 *  @author ra25-2017
 */

import javax.swing.JFrame;
import javax.swing.JTabbedPane;


public class TabbedPane extends JTabbedPane
{
	private static final long serialVersionUID = -5733815749423597587L;
	
	private JFrame frame;
	private ToolBar tBar;
	
	private PanelProfesori panelProfesori;
	private PanelPredmeti panelPredmeti;
	private PanelStudenti panelStudenti;
	
	public static int ind;
	
	public TabbedPane(JFrame parentFrame, ToolBar toolBar)
	{
		frame = parentFrame;
		tBar = toolBar;
	}
	
	public void setTabbedPane()
	{
		TabbedPane tabbedPane = new TabbedPane(frame, tBar);
		
		panelStudenti = new PanelStudenti(frame.getWidth(), frame.getHeight());
		tabbedPane.add("Studenti", panelStudenti);
		
		panelProfesori = new PanelProfesori(frame.getWidth(), frame.getHeight());
		tabbedPane.add("Profesori", panelProfesori);
		
		panelPredmeti = new PanelPredmeti(frame.getWidth(), frame.getHeight());
		tabbedPane.add("Predmeti", panelPredmeti);
		
		tabbedPane.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(tabbedPane.getSelectedComponent() == panelPredmeti)
				{
					JButton btnDodajStudentaNaPredmet = tBar.getBtnNew2();
					btnDodajStudentaNaPredmet.setVisible(true);
					btnDodajStudentaNaPredmet.setToolTipText("Dodaj studenta na predmet");
					
					JButton btnDodajProfesoraNaPredmet = tBar.getBtnNew3();
					btnDodajProfesoraNaPredmet.setVisible(true);
					btnDodajProfesoraNaPredmet.setToolTipText("Dodaj profesora na predmet");
				}
				if(tabbedPane.getSelectedComponent() == panelStudenti)
				{
					JButton btnDodajStudentaNaPredmet = tBar.getBtnNew2();
					btnDodajStudentaNaPredmet.setVisible(false);
					btnDodajStudentaNaPredmet.setToolTipText("Dodaj studenta na predmet");
					
					JButton btnDodajProfesoraNaPredmet = tBar.getBtnNew3();
					btnDodajProfesoraNaPredmet.setVisible(false);
					btnDodajProfesoraNaPredmet.setToolTipText("Dodaj profesora na predmet");
				}
				if(tabbedPane.getSelectedComponent() == panelProfesori)
				{
					JButton btnDodajStudentaNaPredmet = tBar.getBtnNew2();
					btnDodajStudentaNaPredmet.setVisible(false);
					btnDodajStudentaNaPredmet.setToolTipText("Dodaj studenta na predmet");
					
					JButton btnDodajProfesoraNaPredmet = tBar.getBtnNew3();
					btnDodajProfesoraNaPredmet.setVisible(false);
					btnDodajProfesoraNaPredmet.setToolTipText("Dodaj profesora na predmet");
				}
			}
		
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//System.out.println(this.getSelectedIndex());
		frame.getContentPane().add(tabbedPane);
	}
}
