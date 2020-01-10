package view.documentlisteners;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import view.DialogDodavanjePredmeta;

public class PredmetDocumentListener implements DocumentListener{
	
	public String regex;
	public JTextField komponenta;
	public DialogDodavanjePredmeta dialogPredmeti;
	
	public PredmetDocumentListener(DialogDodavanjePredmeta dialogPredmeti, JTextField komponenta, String regex)
	{
		this.regex = regex;
		this.komponenta = komponenta;
		this.dialogPredmeti = dialogPredmeti;
	}

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobroPopunjno();
		dialogPredmeti.checkifAllValid();
	}
	
	@Override
	public void insertUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobroPopunjno();
		dialogPredmeti.checkifAllValid();
	}
	@Override
	public void removeUpdate(DocumentEvent arg0) {
		proveriDaLiJeDobroPopunjno();
		dialogPredmeti.checkifAllValid();
	}
	
	private void proveriDaLiJeDobroPopunjno() {
		if(!(this.komponenta.getText().matches(regex))) {
			this.komponenta.setToolTipText("Morate ispravno popuniti polje!");
			dialogPredmeti.setInvalid(this.komponenta);
		} else {
			this.komponenta.setToolTipText(null);
			dialogPredmeti.setValid(this.komponenta);
		}
		
	}
	
}
