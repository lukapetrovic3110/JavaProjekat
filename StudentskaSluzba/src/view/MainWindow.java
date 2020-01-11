package view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

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

		Image mainicon = toolKit.getImage("src/icons/icon_main_window.png");
		this.setIconImage(mainicon); 

		StatusBar statusBar = new StatusBar(this);
		statusBar.DrawStatusBar();
		
		MenuBar menuBar = new MenuBar(this);
		menuBar.SetMenuBar();
		
		ToolBar toolBar = new ToolBar(this);
		toolBar.setToolBar();
		
		TabbedPane tabbedPane = new TabbedPane(this, toolBar);
		tabbedPane.setTabbedPane();
		
		this.addWindowListener(new ZatvaranjeAplikacijeWindowListener());
		
		setVisible(true);
	}
	
}