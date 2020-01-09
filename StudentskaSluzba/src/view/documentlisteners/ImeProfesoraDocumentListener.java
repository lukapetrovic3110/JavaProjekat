package view.documentlisteners;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import view.DialogDodavanjeProfesora;

public class ImeProfesoraDocumentListener implements DocumentListener {

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		proveriDaLiJePraznoPolje();
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		proveriDaLiJePraznoPolje();
		
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		proveriDaLiJePraznoPolje();
		
	}
	
	private void proveriDaLiJePraznoPolje() {	
		
		if (DialogDodavanjeProfesora.poljeime.getText().trim().length() == 0) {
			DialogDodavanjeProfesora.potvrdi.setEnabled(false);
			DialogDodavanjeProfesora.poljeime.setToolTipText("Morate uneti ime profesora!");
		}
		else
		{
			DialogDodavanjeProfesora.poljeime.setToolTipText(null);
			DialogDodavanjeProfesora.potvrdi.setEnabled(true);
		}
	}
}
