package view;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import controller.PredmetController;
import model.BazaPredmeta;
import model.BazaProfesora;
import model.Predmet;
import model.Profesor;

public class OptionPaneBrisanjeProfesoraSaPredmeta extends JOptionPane{
	
	private static final long serialVersionUID = 3497501625586315362L;
	private Predmet predmet;
	private String profa;
	private String podaci[];
	private String brojLicnekarte;
	private ArrayList<Profesor> profesori = BazaProfesora.getInstance().getProfesori();
	private Profesor profesor;
	private ArrayList<Predmet> predmeti;
	
	public OptionPaneBrisanjeProfesoraSaPredmeta() 
	{
		Object[] options = { "Potvrdi", "Odustani" };	

		int n = JOptionPane.showOptionDialog(null, "Da li ste sigurni da zelite da obrisete profesora sa predmeta?", "Brisanje profesora sa predmeta",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("src/icons/icon_delete.png"), options, options[1]);

	
		if (n == 0)
		{
			int rowSelected = PanelPredmeti.tablePredmeti.getSelectedRow();
			rowSelected = PanelPredmeti.tablePredmeti.convertRowIndexToModel(rowSelected);
			
			predmet = BazaPredmeta.getInstance().getRow(rowSelected);
			profa = predmet.getProfa();
					
			podaci = profa.split(",");
			
			brojLicnekarte = podaci[0];
			
			brojLicnekarte = brojLicnekarte.substring(1, 10);
		
			for(Profesor p : profesori)
			{
				if(p.getBrlicne().equals(brojLicnekarte))
				{
					profesor = p;
				}
			}
			
			predmeti = profesor.getSpisakpredmeta();
			
			for(int i = 0; i < predmeti.size(); i++)
			{
				if(predmeti.get(i).getSifrapredmeta().equals(predmet.getSifrapredmeta()))
				{
					predmeti.remove(i);
					PanelProfesori.azurirajPrikaz();
				}
			
			}
			
			PredmetController.getInstance().obrisiProfesoraSaPredmeta(rowSelected);
		}	
	}
}
