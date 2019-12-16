package view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
//import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
//import java.io.IOException;

//import javax.imageio.ImageIO;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.KeyStroke;

public class MainWindow  extends JFrame
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
		Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenDimension.width / 2, screenDimension.height / 2);
		setLocationRelativeTo(null);
		//SetMenuBar();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
		this.setIconImage(icon);

		StatusBar statusBar = new StatusBar(this);
		statusBar.DrawStatusBar();
		
		MenuBar menuBar = new MenuBar(this);
		menuBar.SetMenuBar();
		
		
		setVisible(true); //poslednja metoda koja se poziva
	}
	
	
	
	
}
