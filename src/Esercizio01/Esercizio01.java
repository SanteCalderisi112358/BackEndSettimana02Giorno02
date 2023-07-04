package Esercizio01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Esercizio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Inserire numero pari al numero di nomi che si vogliono salvare");
			int lunghezza = Integer.parseInt(input.nextLine());
			Set<String> nomiArray = new HashSet<>();

			controlloNomi(nomiArray, input, lunghezza);
			// stampaNomiDuplicati(nomiArray);
			System.out.println("ciao");
		} catch (NumberFormatException e) {
			System.out.println("Inserire numero intero");
		} finally {
			input.close();
		}

	}

	public static void controlloNomi(Set<String> array, Scanner input, int lunghezza) {
		int i = 0;
		List<String> nomiDuplicati = new ArrayList<String>();
		String nome;
		try {
			do {
				System.out.println("Inserire nuovo nome");
				nome = input.nextLine();

				for (String nomeNuovo : array) {
					if (nomeNuovo.equals(nome)) {
						nomiDuplicati.add(nome);
					}
				}
				array.add(nome);
				i++;
			} while (i != lunghezza);
		} catch (NumberFormatException e) {
			e.getStackTrace();
		}

		System.out.println("\n");
		System.out.println("********** Lista di nomi distinti **********");
		for (String nomeNonDuplicato : array) {
			System.out.println(nomeNonDuplicato);
		}
		System.out.printf("++++++++++ Totali: %d ++++++++++", array.size());

		System.out.println("\n");
		System.out.println("********** Lista di nomi duplicati **********");

		for (String nomeDuplicato : nomiDuplicati) {
			System.out.println(nomeDuplicato);
		}
		System.out.printf("++++++++++ Totali: %d ++++++++++", nomiDuplicati.size());
	}

//	public static void stampaNomiDuplicati(Set<String> array) {
//		System.out.println("Nomi duplicati:\n");
//		for (String nome : array) {
//			System.out.println(nome);
//		}
//	}
}
