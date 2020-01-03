package controller;

import javax.swing.JOptionPane;

import model.BazaPredmeta;
import model.BazaStudenata;
import model.Predmet;
import model.PredmetMethods;
import model.Student;
import model.StudentMethods;
import model.Student.status;
import view.PanelPredmeti;
import view.PanelStudenti;

public class StudentController {
	private static StudentController instance = null;
	public static StudentController getInstance()
	{
		if(instance == null)
		{
			instance = new StudentController();
		}
		
		return instance;
	}
	private StudentController() {}
	/*public int getBrojStudenata() {
		
		return 0;
	}
	public Student getStudent(int indeks) {
		
		return 0;
	}*/

	
	public void dodajStudenta(String ime,String prezime,String datumr,String adresa,String tel,String 
			email,String brindeksa,String datumu,int godinastud,double prosek,status st)
	{
		StudentMethods.dodajStudenta(ime,prezime,datumr,adresa,tel,email,brindeksa,datumu,godinastud,prosek,st);
		PanelStudenti.azurirajPrikaz();
	}
	
	public void izmeniStudenta()
	{
		
	}
	
	public void izbrisiStudenta(int rowSelectedIndex)
	{
		if (rowSelectedIndex < 0)
		{
			JOptionPane.showMessageDialog(null, "Nije selektovan nijedan student u tabeli!\nNije moguce izvrsiti brisanje!");
			return ;
		}
		
		Student student = BazaStudenata.getInstance().getRow(rowSelectedIndex);
		StudentMethods.izbrisiStudenta(student.getBrindeksa());
		PanelStudenti.azurirajPrikaz();
	}
	
	
}
