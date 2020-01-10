package controller;

import model.BazaStudenata;
import model.Student;
import model.Student.status;
import model.StudentMethods;
import view.PanelStudenti;
import view.StudentiJTable;

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
			email,String brindeksa,String datumu,String godinastud,double prosek,status st)
	{
		StudentMethods.dodajStudenta(ime,prezime,datumr,adresa,tel,email,brindeksa,datumu,godinastud,prosek,st);
		PanelStudenti.azurirajPrikaz();
	}
	
	public void izmeniStudenta(String ime,String prezime,String datumr,String adresa,String tel,String 
			email,String brindeksa,String datumu,String godinastud,double prosek,status st)
	{
		StudentMethods.izmeniStudenta(ime,prezime,datumr,adresa,tel,email,brindeksa,datumu,godinastud,prosek,st);
		PanelStudenti.azurirajPrikaz();
	}
	
	public void izbrisiStudenta(int rowSelectedIndex)
	{
		Student student = BazaStudenata.getInstance().getRow(rowSelectedIndex);
		StudentMethods.izbrisiStudenta(student.getBrindeksa());
		PanelStudenti.azurirajPrikaz();
	}
	
	public String[] izlistajPredmeteZaStudente(int rowSelectedIndex)
	{
		Student student = BazaStudenata.getInstance().getRow(rowSelectedIndex);
		String[] podaci = StudentMethods.izlistajPredmeteZaStudente(student.getBrindeksa());
		PanelStudenti.azurirajPrikaz();
		return podaci;
	}
	
	
}
