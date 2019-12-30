package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 * @author Luka RA25-2017
 */

public class ToolBar extends JToolBar{

	private static final long serialVersionUID = 4268951943328073987L;
	
	private JFrame frame;
	private JButton btnNew2;
	private JButton btnNew3;
	
	public ToolBar(JFrame parentFrame)
	{
		frame = parentFrame;
	} 
	
	public void setToolBar() 
	{
		JButton btnNew = new JButton();
		btnNew.setMargin(new Insets(0, 0, 0, 0));
		btnNew.setPreferredSize(new Dimension(35,35));
		btnNew.setToolTipText("Dodaj");
		try {
			btnNew.setIcon(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("icon_add.png"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.add(btnNew);
		
		this.addSeparator();
		
		JButton btnEdit = new JButton();
		btnEdit.setMargin(new Insets(0, 0, 0, 0));
		btnEdit.setPreferredSize(new Dimension(35,35));
		btnEdit.setToolTipText("Izmeni");
		
		try {
			btnEdit.setIcon(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("icon_edit.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.add(btnEdit);
		
		this.addSeparator();
		
		JButton btnDelete = new JButton();
		btnDelete.setMargin(new Insets(0, 0, 0, 0));
		btnDelete.setPreferredSize(new Dimension(35,35));
		btnDelete.setToolTipText("Obrisi");
		
		try {
			btnDelete.setIcon(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("icon_delete.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.add(btnDelete);
		
		this.addSeparator();
		
	    btnNew2 = new JButton();
		btnNew2.setMargin(new Insets(0, 0, 0, 0));
		btnNew2.setPreferredSize(new Dimension(35,35));
		try {
			btnNew2.setIcon(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("icon_add.png"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnNew2.setVisible(false);
		this.add(btnNew2);
		
		
		this.addSeparator();
		
		btnNew3 = new JButton();
		btnNew3.setMargin(new Insets(0, 0, 0, 0));
		btnNew3.setPreferredSize(new Dimension(35,35));
		try {
			btnNew3.setIcon(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("icon_add_prof.png"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnNew3.setVisible(false);
		this.add(btnNew3);
		
		this.add(Box.createHorizontalStrut(frame.getWidth()/8));
		
		JTextField txtSearch = new JTextField();
		txtSearch.setToolTipText("TxtZaPretragu");
		txtSearch.setPreferredSize(new Dimension(frame.getWidth()/15,35));
		this.add(txtSearch);
		
		this.addSeparator();
		
		JButton btnSearch = new JButton();
		btnSearch.setMargin(new Insets(0, 0, 0, 0));
		btnSearch.setPreferredSize(new Dimension(35,35));
		btnSearch.setToolTipText("Pretraga");
		
		try {
			btnSearch.setIcon(new ImageIcon(ImageIO.read(getClass().getResourceAsStream("icon_search.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.add(btnSearch);
		
		setFloatable(false);
		
		frame.add(this, BorderLayout.NORTH);
	}
	
	public JButton getBtnNew2() {
		return btnNew2;
	}

	public void setBtnNew2(JButton btnNew2) {
		this.btnNew2 = btnNew2;
	}
	
	public JButton getBtnNew3() {
		return btnNew3;
	}

	public void setBtnNew3(JButton btnNew3) {
		this.btnNew3 = btnNew3;
	}
}
