package view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame
{
	private static final long serialVersionUID = 7661406785264865341L;
	
	private static MainWindow instance = null;

	public static MainWindow getInstance() 
	{
		if (instance == null) {
			instance = new MainWindow();
		}
		return instance;
	}
	
	
	public MainWindow()
	{
		setTitle("Studentska sluzba");
		
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		Dimension screenDimension = toolKit.getScreenSize();
		
		int screenHeight = screenDimension.height;
		int screenWidth = screenDimension.width;
		
		setSize(screenWidth * 3/4, screenHeight * 3/4);
		
		setLocationRelativeTo(null);
	
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	
		
		try {
			ImageIcon imageIcon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("icon_main_window.png")));
			Image mainWindowImage = imageIcon.getImage();
			this.setIconImage(mainWindowImage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		StatusBar statusBar = new StatusBar(this);
		statusBar.DrawStatusBar();
		
		MenuBar menuBar = new MenuBar(this);
		menuBar.SetMenuBar();
		
		ToolBar toolBar = new ToolBar(this);
		toolBar.setToolBar();
		
		
		
		setVisible(true); //poslednja metoda koja se poziva za frame
		
		//BrisanjeStudenta b=new BrisanjeStudenta(this,true);
		//b.setVisible(true);
		//DodavanjeStudenta d=new DodavanjeStudenta(this,true);
		//d.setVisible(true);
		AboutDialog h=new AboutDialog(this,true);
		h.setVisible(true);
	}
	
}
