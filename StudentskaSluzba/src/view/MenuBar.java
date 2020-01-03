package view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBar extends JMenuBar{
	
	private static final long serialVersionUID = 2135611299138644286L;
	private JFrame frame;
	
	public MenuBar(JFrame parentFrame)
	{
		frame = parentFrame;
	}
	
	public void SetMenuBar() //postavlja menu bar
	{
	    // Menu
	    JMenu fileNew = new JMenu("File");
	    JMenu fileEdit = new JMenu("Edit");
	    JMenu fileHelp = new JMenu("Help");
	    // Menu Item (Drop down menus)
	    JMenuItem item1 = new JMenuItem("New", KeyEvent.VK_T);
	    JMenuItem item2 = new JMenuItem("Close", KeyEvent.VK_T);
	    JMenuItem item3 = new JMenuItem("Edit", KeyEvent.VK_T);
	    JMenuItem item4 = new JMenuItem("Delete", KeyEvent.VK_T);
	    JMenuItem item5 = new JMenuItem("Help", KeyEvent.VK_T);
	    JMenuItem item6 = new JMenuItem("About", KeyEvent.VK_T);
	    
	    
	    try 
	    {
			ImageIcon imageIcon=new ImageIcon(ImageIO.read(getClass().getResourceAsStream("menuBarAddIcon.png")));
			Image i = imageIcon.getImage();
			Image newimg = i.getScaledInstance(10, 10, Image.SCALE_SMOOTH);
			
			imageIcon = new ImageIcon(newimg);
			item1.setIcon(imageIcon);
		} 
	    catch (IOException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    KeyStroke ctrlNKeyStroke = KeyStroke.getKeyStroke("control N");
	    item1.setAccelerator(ctrlNKeyStroke);
	    item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DodavanjeStudenta ds = new DodavanjeStudenta(frame, true);
				ds.setVisible(true);
			}
		});
	    
	    try 
	    {
			ImageIcon imageIcon2=new ImageIcon(ImageIO.read(getClass().getResourceAsStream("close.png")));
			Image i2 = imageIcon2.getImage();
			Image newimg2 = i2.getScaledInstance(10, 10, Image.SCALE_SMOOTH);
			
			imageIcon2 = new ImageIcon(newimg2);
			item2.setIcon(imageIcon2);
		} 
	    catch (IOException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    KeyStroke ctrlNKeyStroke2 = KeyStroke.getKeyStroke("control C"); 
	    item2.setAccelerator(ctrlNKeyStroke2);
	    
	    
	    try 
	    {
			ImageIcon imageIcon3=new ImageIcon(ImageIO.read(getClass().getResourceAsStream("edit.jpg")));
			Image i3 = imageIcon3.getImage();
			Image newimg3 = i3.getScaledInstance(10, 10, Image.SCALE_SMOOTH);
			
			imageIcon3 = new ImageIcon(newimg3);
			item3.setIcon(imageIcon3);
		} 
	    catch (IOException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    KeyStroke ctrlNKeyStroke3 = KeyStroke.getKeyStroke("control E"); 
	    item3.setAccelerator(ctrlNKeyStroke3);
	    
	    
	    try 
	    {
			ImageIcon imageIcon4=new ImageIcon(ImageIO.read(getClass().getResourceAsStream("delete.png")));
			Image i4 = imageIcon4.getImage();
			Image newimg4 = i4.getScaledInstance(10, 10, Image.SCALE_SMOOTH);
			
			imageIcon4 = new ImageIcon(newimg4);
			item4.setIcon(imageIcon4);
		} 
	    catch (IOException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    KeyStroke ctrlNKeyStroke4 = KeyStroke.getKeyStroke("control D"); 
	    item4.setAccelerator(ctrlNKeyStroke4);
	    
	    
	    try 
	    {
			ImageIcon imageIcon5=new ImageIcon(ImageIO.read(getClass().getResourceAsStream("help.jpg")));
			Image i5 = imageIcon5.getImage();
			Image newimg5 = i5.getScaledInstance(10, 10, Image.SCALE_SMOOTH);
			
			imageIcon5 = new ImageIcon(newimg5);
			item5.setIcon(imageIcon5);
		} 
	    catch (IOException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    KeyStroke ctrlNKeyStroke5 = KeyStroke.getKeyStroke("control H"); 
	    item5.setAccelerator(ctrlNKeyStroke5);
	    
	    
	    try 
	    {
			ImageIcon imageIcon6=new ImageIcon(ImageIO.read(getClass().getResourceAsStream("about.jpg")));
			Image i6 = imageIcon6.getImage();
			Image newimg6 = i6.getScaledInstance(10, 10, Image.SCALE_SMOOTH);
			
			imageIcon6 = new ImageIcon(newimg6);
			item6.setIcon(imageIcon6);
		} 
	    catch (IOException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    KeyStroke ctrlNKeyStroke6 = KeyStroke.getKeyStroke("control A"); 
	    item6.setAccelerator(ctrlNKeyStroke6);
	    
	    
	    fileNew.add(item1);
	    fileNew.add(item2);
	    fileEdit.add(item3);
	    fileEdit.add(item4);
	    fileHelp.add(item5);
	    fileHelp.add(item6);
	    
	    this.add(fileNew);
	    this.add(fileEdit);
	    this.add(fileHelp);
	    
	    frame.setJMenuBar(this); 
	
	}
	

}
