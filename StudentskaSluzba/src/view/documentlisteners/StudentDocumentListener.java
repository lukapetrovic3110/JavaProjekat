package view.documentlisteners;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import view.DodavanjeStudenta;

public class StudentDocumentListener implements DocumentListener{

	public String regex;
	public JTextField komponenta;
	public DodavanjeStudenta dialogStudenti;

	public StudentDocumentListener(DodavanjeStudenta dialogStudenti, JTextField komponenta, String regex) {
		this.regex = regex;
		this.komponenta = komponenta;
		this.dialogStudenti = dialogStudenti;
	}
	


	@Override
	public void changedUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobroPopunjeno();
		dialogStudenti.checkifAllValid();
		
	}


	@Override
	public void insertUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobroPopunjeno();
		dialogStudenti.checkifAllValid();
		
	}


	@Override
	public void removeUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobroPopunjeno();
		dialogStudenti.checkifAllValid();
		
	}
	
	private void proveriDaLiJeDobroPopunjeno() {
		if (!(this.komponenta.getText().matches(regex))) {
			this.komponenta.setToolTipText("Morate ispravno popuniti polje!");
			dialogStudenti.setInvalid(this.komponenta);
		} else {
			this.komponenta.setToolTipText(null);
			dialogStudenti.setValid(this.komponenta);
		}
	}
	
}
