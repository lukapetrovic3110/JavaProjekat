package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class TabbedPaneMouseListener implements MouseListener{

	@Override
	public void mousePressed(MouseEvent e) {
		if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelPredmeti)
		{
			JButton btnDodajStudentaNaPredmet = TabbedPane.tBar.getBtnNew2();
			btnDodajStudentaNaPredmet.setVisible(true);
			btnDodajStudentaNaPredmet.setToolTipText("Dodaj studenta na predmet");
			
			JButton btnDodajProfesoraNaPredmet = TabbedPane.tBar.getBtnNew3();
			btnDodajProfesoraNaPredmet.setVisible(true);
			btnDodajProfesoraNaPredmet.setToolTipText("Dodaj profesora na predmet");
		}
		if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelStudenti)
		{
			JButton btnDodajStudentaNaPredmet = TabbedPane.tBar.getBtnNew2();
			btnDodajStudentaNaPredmet.setVisible(false);
			btnDodajStudentaNaPredmet.setToolTipText("Dodaj studenta na predmet");
			
			JButton btnDodajProfesoraNaPredmet = TabbedPane.tBar.getBtnNew3();
			btnDodajProfesoraNaPredmet.setVisible(false);
			btnDodajProfesoraNaPredmet.setToolTipText("Dodaj profesora na predmet");
		}
		if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelProfesori)
		{
			JButton btnDodajStudentaNaPredmet = TabbedPane.tBar.getBtnNew2();
			btnDodajStudentaNaPredmet.setVisible(false);
			btnDodajStudentaNaPredmet.setToolTipText("Dodaj studenta na predmet");
			
			JButton btnDodajProfesoraNaPredmet = TabbedPane.tBar.getBtnNew3();
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
}
