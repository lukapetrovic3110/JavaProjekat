package main;

import java.io.IOException;

import model.BazaPredmeta;
import view.MainWindow;

/**
 * @author Luka ra25-2017
 */

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow.getInstance();

		
		try {
			BazaPredmeta.getInstance().serijalizacijaCitanje();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
