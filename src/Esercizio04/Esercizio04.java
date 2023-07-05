package Esercizio04;

import java.util.ArrayList;
import java.util.List;

public class Esercizio04 {

	public static void main(String[] args) {

		List<Studente> classe = new ArrayList<Studente>();
		GestioneStudenti gestoreStudente = new GestioneStudenti(classe);

		Studente studente01 = new Studente("Sante", "Calderisi", "007");
		Studente studente02 = new Studente("Erika", "Quitadamo", "008");

		gestoreStudente.aggiungiStudente(studente01);
		gestoreStudente.aggiungiStudente(studente02);
		gestoreStudente.stampaClasse();
	}


}
