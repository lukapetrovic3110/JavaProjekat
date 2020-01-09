package view.documentlisteners;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import view.DialogDodavanjeProfesora;

public class ProfesorDocumentListener implements DocumentListener {
	
	public String regex;
	public JTextField komponenta;
	public DialogDodavanjeProfesora dialogProfesori;
	
	public ProfesorDocumentListener(DialogDodavanjeProfesora dialogProfesori, JTextField komponenta, String regex)
	{
		this.regex = regex;
		this.komponenta = komponenta;
		this.dialogProfesori = dialogProfesori;
	}
	
	@Override
	public void changedUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobaroPopunjeno();
		dialogProfesori.checkifAllValid();
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobaroPopunjeno();
		dialogProfesori.checkifAllValid();
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobaroPopunjeno();
		dialogProfesori.checkifAllValid();
	}

	private void proveriDaLiJeDobaroPopunjeno() {
		if (!(this.komponenta.getText().matches(regex))) {
			this.komponenta.setToolTipText("Morate ispravno popuniti polje!");
			dialogProfesori.setInvalid(this.komponenta);
		} else {
			this.komponenta.setToolTipText(null);
			dialogProfesori.setValid(this.komponenta);
		}
	}
}
