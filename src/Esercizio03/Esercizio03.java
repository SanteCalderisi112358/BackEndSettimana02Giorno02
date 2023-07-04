package Esercizio03;

import java.util.HashMap;
import java.util.Map;

public class Esercizio03 {

	public static void main(String[] args) {
		Map<String, String> elencoTelefonico = new HashMap<String, String>();
		Rubrica rubrica = new Rubrica(elencoTelefonico);

		rubrica.aggiungContatto("Luca Frizzi", "3273290876");
		rubrica.aggiungContatto("Marco Rossi", "3459876854");
		rubrica.aggiungContatto("Sante Calderisi", "3287609432");

		rubrica.stampaRubrica();

		rubrica.rimuoviContatto("Marco Rossi");

		rubrica.stampaRubrica();

		rubrica.trovaNome("32232");

		rubrica.trovaNumero("Sante Calderisi");
	}
}