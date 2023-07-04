package Esercizio03;

public class Esercizio03 {

	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica();
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