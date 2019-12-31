package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;

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
		
		btnNew.addActionListener(new BtnNewActionListener());
		
		ImageIcon imgBtnNew = new ImageIcon("src/icons/icon_add.png");
		btnNew.setIcon(imgBtnNew);
		
		this.add(btnNew);
		
		this.addSeparator();
		
		JButton btnEdit = new JButton();
		btnEdit.setMargin(new Insets(0, 0, 0, 0));
		btnEdit.setPreferredSize(new Dimension(35,35));
		btnEdit.setToolTipText("Izmeni");
		
		btnEdit.addActionListener(new BtnEditActionListener());
		
		ImageIcon imgBtnEdit = new ImageIcon("src/icons/icon_edit.png");
		btnEdit.setIcon(imgBtnEdit);

		this.add(btnEdit);
		
		this.addSeparator();
		
		JButton btnDelete = new JButton();
		btnDelete.setMargin(new Insets(0, 0, 0, 0));
		btnDelete.setPreferredSize(new Dimension(35,35));
		btnDelete.setToolTipText("Obrisi");
		
		btnDelete.addActionListener(new BtnDeleteActionListener());
		
		ImageIcon imgBtnDelete = new ImageIcon("src/icons/icon_delete.png");
		btnDelete.setIcon(imgBtnDelete);
		this.add(btnDelete);
		
		this.addSeparator();
		
	    btnNew2 = new JButton();
		btnNew2.setMargin(new Insets(0, 0, 0, 0));
		btnNew2.setPreferredSize(new Dimension(35,35));
		
		btnNew2.addActionListener(new BtnNew2ActionListener());
		
		ImageIcon imgBtnNew2 = new ImageIcon("src/icons/icon_add.png");
		btnNew2.setIcon(imgBtnNew2);
		btnNew2.setVisible(false);
		this.add(btnNew2);
		
		this.addSeparator();
		
		btnNew3 = new JButton();
		btnNew3.setMargin(new Insets(0, 0, 0, 0));
		btnNew3.setPreferredSize(new Dimension(35,35));
		
		btnNew3.addActionListener(new BtnNew3ActionListener());
		
		ImageIcon imgBtnNew3 = new ImageIcon("src/icons/icon_add_prof.png");
		btnNew3.setIcon(imgBtnNew3);
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
		
		ImageIcon imgBtnSearch = new ImageIcon("src/icons/icon_search.png");
		btnSearch.setIcon(imgBtnSearch);
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
