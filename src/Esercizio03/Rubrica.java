package Esercizio03;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
	private Map<String, String> rubrica = new HashMap<>();



	public void aggiungContatto(String nome, String telefono) {
		this.rubrica.put(nome, telefono);
	}

	public void rimuoviContatto(String nome) {
		System.out.printf("Hai rimosso dai tuoi contatti %s\n", nome);
		this.rubrica.remove(nome);
	}

	public void stampaRubrica() {

		System.out.println("**********");
		System.out.println("Rubrica telefonica:");
		for (Map.Entry<String, String> entry : this.rubrica.entrySet()) {
			String nome = entry.getKey();
			String numeroTelefono = entry.getValue();
			System.out.println("Nome: " + nome + ", Numero di telefono: " + numeroTelefono);

		}
		System.out.println("**********");
	}

	public void trovaNome(String telefono) {
		boolean trovatoNome = false;
	    for (Map.Entry<String, String> entry : rubrica.entrySet()) {
	        String nome = entry.getKey();
	        String numero = entry.getValue();
	        if (numero.equals(telefono)) {
	            System.out.println("Il numero " + telefono + " è di " + nome);
				trovatoNome = true;
	        }
	    }
		if (!trovatoNome) {
	        System.out.println("Non esiste nessun contatto a cui sia associato il numero: " + telefono);
	    }
	}

	public void trovaNumero(String nomeContatto) {
		boolean trovatoNum = false;
		for (Map.Entry<String, String> entry : rubrica.entrySet()) {
			String nome = entry.getKey();
			String numero = entry.getValue();
			if (nome.equals(nomeContatto)) {
				System.out.println("Il numero di " + nomeContatto + " è " + numero);
				trovatoNum = true;
			}
		}
		if (!trovatoNum) {
			System.out.println("Il numero di " + nomeContatto + " non è in memoria.");
		}
	}

	}

