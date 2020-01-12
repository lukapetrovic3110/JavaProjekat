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
	private JButton btnDodavanjeStudentaNaPredmet;
	private JButton btnDodavanjeProfesoraNaPredmet;
	private JButton btnObrisiProfesora;
	
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
		
		btnDodavanjeStudentaNaPredmet = new JButton();
		btnDodavanjeStudentaNaPredmet.setMargin(new Insets(0, 0, 0, 0));
		btnDodavanjeStudentaNaPredmet.setPreferredSize(new Dimension(35,35));
		
		btnDodavanjeStudentaNaPredmet.addActionListener(new BtnDodavanjeStudentaNaPredmetActionListener());
		
		ImageIcon imgBtnNew2 = new ImageIcon("src/icons/icon_add.png");
		btnDodavanjeStudentaNaPredmet.setIcon(imgBtnNew2);
		btnDodavanjeStudentaNaPredmet.setVisible(false);
		this.add(btnDodavanjeStudentaNaPredmet);
		
		this.addSeparator();
		
		btnDodavanjeProfesoraNaPredmet = new JButton();
		btnDodavanjeProfesoraNaPredmet.setMargin(new Insets(0, 0, 0, 0));
		btnDodavanjeProfesoraNaPredmet.setPreferredSize(new Dimension(35,35));
		
		btnDodavanjeProfesoraNaPredmet.addActionListener(new BtnDodavanjeProfesoraNaPredmetActionListener());
		
		ImageIcon imgBtnNew3 = new ImageIcon("src/icons/icon_add_prof.png");
		btnDodavanjeProfesoraNaPredmet.setIcon(imgBtnNew3);
		btnDodavanjeProfesoraNaPredmet.setVisible(false);
		this.add(btnDodavanjeProfesoraNaPredmet);
		
		
		this.addSeparator();
		
		btnObrisiProfesora = new JButton();  // dugme za brisanje profesora sa predmeta
		btnObrisiProfesora.setMargin(new Insets(0, 0, 0, 0));
		btnObrisiProfesora.setPreferredSize(new Dimension(35,35));
		
		btnObrisiProfesora.addActionListener(new BtnObrisiProfesoraActionListener());
		
		ImageIcon imgBtnObrisiProfesora = new ImageIcon("src/icons/icon_delete.png");
		btnObrisiProfesora.setIcon(imgBtnObrisiProfesora);
		btnObrisiProfesora.setVisible(false);
		this.add(btnObrisiProfesora);
		
		this.add(Box.createHorizontalStrut(frame.getWidth()/8));
		
		JTextField txtSearch = new JTextField();
		txtSearch.setToolTipText("Polje za pretragu");
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
	
	public JButton getBtnDodavanjeStudentaNaPredmet() {
		return btnDodavanjeStudentaNaPredmet;
	}

	public void setBtnDodavanjeStudentaNaPredmet(JButton btnDodavanjeStudentaNaPredmet) {
		this.btnDodavanjeStudentaNaPredmet = btnDodavanjeStudentaNaPredmet;
	}
	
	public JButton getBtnDodavanjeProfesoraNaPredmet() {
		return btnDodavanjeProfesoraNaPredmet;
	}

	public void setBtnDodavanjeProfesoraNaPredmet(JButton btnDodavanjeProfesoraNaPredmet) {
		this.btnDodavanjeProfesoraNaPredmet = btnDodavanjeProfesoraNaPredmet;
	}

	public JButton getBtnObrisiProfesora() {
		return btnObrisiProfesora;
	}

	public void setBtnObrisiProfesora(JButton btnObrisiProfesora) {
		this.btnObrisiProfesora = btnObrisiProfesora;
	}

}
