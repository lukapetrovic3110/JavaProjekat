package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class TabbedPaneMouseListener implements MouseListener{

	@Override
	public void mousePressed(MouseEvent e) {
		if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelPredmeti)
		{
			JButton btnDodajStudentaNaPredmet = TabbedPane.tBar.getBtnDodavanjeStudentaNaPredmet();
			btnDodajStudentaNaPredmet.setVisible(true);
			btnDodajStudentaNaPredmet.setToolTipText("Dodaj studenta na predmet");
			
			JButton btnDodajProfesoraNaPredmet = TabbedPane.tBar.getBtnDodavanjeProfesoraNaPredmet();
			btnDodajProfesoraNaPredmet.setVisible(true);
			btnDodajProfesoraNaPredmet.setToolTipText("Dodaj profesora na predmet");
			
			JButton btnObrisiProfesoraSaPredmeta = TabbedPane.tBar.getBtnObrisiProfesora();
			btnObrisiProfesoraSaPredmeta.setVisible(true);
			btnObrisiProfesoraSaPredmeta.setToolTipText("Obrisi profesora sa predmeta");
			
			PanelPredmeti.tablePredmeti.clearSelection();
		}
		if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelStudenti)
		{
			JButton btnDodajStudentaNaPredmet = TabbedPane.tBar.getBtnDodavanjeStudentaNaPredmet();
			btnDodajStudentaNaPredmet.setVisible(false);
			
			JButton btnDodajProfesoraNaPredmet = TabbedPane.tBar.getBtnDodavanjeProfesoraNaPredmet();
			btnDodajProfesoraNaPredmet.setVisible(false);
			
			JButton btnObrisiProfesoraSaPredmeta = TabbedPane.tBar.getBtnObrisiProfesora();
			btnObrisiProfesoraSaPredmeta.setVisible(false);
			
			PanelStudenti.tableStudenti.clearSelection();
		}
		if(TabbedPane.tabbedPane.getSelectedComponent() == TabbedPane.panelProfesori)
		{
			JButton btnDodajStudentaNaPredmet = TabbedPane.tBar.getBtnDodavanjeStudentaNaPredmet();
			btnDodajStudentaNaPredmet.setVisible(false);
		
			JButton btnDodajProfesoraNaPredmet = TabbedPane.tBar.getBtnDodavanjeProfesoraNaPredmet();
			btnDodajProfesoraNaPredmet.setVisible(false);
		
			JButton btnObrisiProfesoraSaPredmeta = TabbedPane.tBar.getBtnObrisiProfesora();
			btnObrisiProfesoraSaPredmeta.setVisible(false);
			
			PanelProfesori.tableProfesori.clearSelection();
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
