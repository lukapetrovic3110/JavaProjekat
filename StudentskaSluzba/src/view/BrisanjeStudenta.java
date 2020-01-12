package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.StudentController;

public class BrisanjeStudenta extends JOptionPane{
	
	private static final long serialVersionUID = 3591599721565020284L;
	
	public BrisanjeStudenta(JFrame parentFrame)
	{
		
		Object[] options = {"Potvrdi", "Odbaci"};

		/*ImageIcon imageIcon4=new ImageIcon(ImageIO.read(getClass().getResourceAsStream("delete.png")));
		Image i4 = imageIcon4.getImage();
		Image ii = i4.getScaledInstance(10, 10, Image.SCALE_SMOOTH);*/
		
		//setLocationRelativeTo(parentFrame);
		int n = JOptionPane.showOptionDialog(parentFrame,
			"Da li ste sigurni da zelite obrisati studenta?",
			"Brisanje studenta",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			new ImageIcon("src/icons/icon_delete.png"), // add icon
			options,
			options[1]);
		
		if (n == 0)
		{
			int rowSelected = PanelStudenti.tableStudenti.getSelectedRow();
			rowSelected = PanelStudenti.tableStudenti.convertRowIndexToModel(rowSelected);
			StudentController.getInstance().izbrisiStudenta(rowSelected);
		}	
		
	}
			
		
	
}
