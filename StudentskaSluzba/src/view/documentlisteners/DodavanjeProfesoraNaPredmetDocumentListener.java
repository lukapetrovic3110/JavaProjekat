package view.documentlisteners;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import view.DialogDodavanjeProfesoraNaPredmet;

public class DodavanjeProfesoraNaPredmetDocumentListener implements DocumentListener{
	
	public String regex;
	public JTextField komponenta;
	public DialogDodavanjeProfesoraNaPredmet dialogDodavanjeProfesoraNaPredmet;
	
	public DodavanjeProfesoraNaPredmetDocumentListener(DialogDodavanjeProfesoraNaPredmet dialogDodavanjeProfesoraNaPredmet, JTextField komponenta, String regex)
	{
		this.regex = regex;
		this.komponenta = komponenta;
		this.dialogDodavanjeProfesoraNaPredmet = dialogDodavanjeProfesoraNaPredmet;
	}

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobroPopunjno();
		dialogDodavanjeProfesoraNaPredmet.checkifAllValid();
	}
	
	@Override
	public void insertUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobroPopunjno();
		dialogDodavanjeProfesoraNaPredmet.checkifAllValid();
	}
	@Override
	public void removeUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobroPopunjno();
		dialogDodavanjeProfesoraNaPredmet.checkifAllValid();
	}
	
	private void proveriDaLiJeDobroPopunjno() {
		if(!(this.komponenta.getText().matches(regex))) {
			this.komponenta.setToolTipText("Morate ispravno popuniti polje!");
			dialogDodavanjeProfesoraNaPredmet.setInvalid(this.komponenta);
		} else {
			this.komponenta.setToolTipText(null);
			dialogDodavanjeProfesoraNaPredmet.setValid(this.komponenta);
		}
		
	}
}
