package view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

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
		SetMenuBar();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
		this.setIconImage(icon);

		
		setVisible(true); //poslednja metoda koja se poziva
	}
	
	
	private void SetMenuBar() //postavlja menu bar
	{
		JMenuBar menuBar = new JMenuBar();//linija
	    // Menu
	    JMenu fileNew = new JMenu("File");
	    JMenu fileEdit = new JMenu("Edit");
	    JMenu fileHelp = new JMenu("Help");
	    // Menu Item (Drop down menus)
	    JMenuItem item1 = new JMenuItem("New", KeyEvent.VK_T);
	    JMenuItem item2 = new JMenuItem("Close");
	    JMenuItem item3 = new JMenuItem("Edit");
	    JMenuItem item4 = new JMenuItem("Delete");
	    JMenuItem item5 = new JMenuItem("Help");
	    JMenuItem item6 = new JMenuItem("About");
	    try 
	    {
			ImageIcon imageIcon=new ImageIcon(ImageIO.read(getClass().getResourceAsStream("menuBarAddIcon.png")));
			item1.setIcon(imageIcon);
		} 
	    catch (IOException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    KeyStroke ctrlNKeyStroke = KeyStroke.getKeyStroke("control N");
	    item1.setAccelerator(ctrlNKeyStroke);
	    
	    fileNew.add(item1);
	    fileNew.add(item2);
	    fileEdit.add(item3);
	    fileEdit.add(item4);
	    fileHelp.add(item5);
	    fileHelp.add(item6);
	    
	    menuBar.add(fileNew);
	    menuBar.add(fileEdit);
	    menuBar.add(fileHelp);
	    
	    setJMenuBar(menuBar); //od moje aplikacije menu bar setujem na ovaj novi menu bar koji sam napravila
	}
	
	
	
	
}
