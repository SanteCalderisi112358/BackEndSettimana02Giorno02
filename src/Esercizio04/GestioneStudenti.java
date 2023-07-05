package Esercizio04;

import java.util.List;

public class GestioneStudenti {
	List<Studente> classe;

	public GestioneStudenti(List<Studente> _classe) {
		this.classe = _classe;
	}


	public void aggiungiStudente(Studente studente) {
		this.classe.add(studente);
	}

	public void stampaClasse() {
		System.out.println("Elenco classe:");
		for (Studente studente : classe) {
			System.out.println(studente);
			System.out.println("**********");
		}
	}
}
