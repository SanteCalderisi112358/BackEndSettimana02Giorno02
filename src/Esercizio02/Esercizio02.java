package Esercizio02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Esercizio02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire un numero: ");
		int lunghezza = Integer.parseInt(input.nextLine());
		List<Integer> arrayNumeriRandom = new ArrayList<Integer>();

		arrayNumeriRandom = random(lunghezza);
		stampaArrayRandom(arrayNumeriRandom);
		int[] arrayTotale = invertiArray(arrayNumeriRandom);
		stampaArrayInvertito(arrayTotale);

		boolean controllo = true;
		stampaBooleano(arrayNumeriRandom, controllo);
		input.close();

	}

	public static List<Integer> random(int numero) {
		List<Integer> array = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < numero; i++) {
			array.add(random.nextInt(101));
		}

		return array;
	}

	public static void stampaArrayRandom(List<Integer> array) {
		System.out.println("Numeri generati in maniera casuale tra 0 e 100");
		for (Integer el : array) {
			System.out.println(el);
		}
	}

	public static int[] invertiArray(List<Integer> array) {
		int[] arrayInt = new int[array.size()];
		int[] arrayIntInvertiti = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			arrayInt[i] = array.get(i);
		}
		for (int i = arrayInt.length - 1; i >= 0; i--) {
			arrayIntInvertiti[arrayInt.length - 1 - i] = arrayInt[i];
		}

		int[] arrayTot = new int[array.size() * 2];
		int index = 0;
		for (int i = 0; i < arrayInt.length; i++) {
			arrayTot[index++] = arrayInt[i];
		}
		for (int i = 0; i < arrayIntInvertiti.length; i++) {
			arrayTot[index++] = arrayIntInvertiti[i];
		}

		return arrayTot;
	}

	public static void stampaArrayInvertito(int[] array) {
		System.out.println("Lista dei numeri ordinati e invertiti");
		System.out.println(Arrays.toString(array));
	}

	public static void stampaBooleano(List<Integer> array, boolean controllo) {
		if (controllo) {
			System.out.println("Numeri in posizione pari:\n");
			for (int i = 0; i < array.size(); i++) {
				if (i % 2 == 0) {
					System.out.println(array.get(i));
				}
			}
		} else {
			System.out.println("Numeri in posizione dipari:\n");
			for (int i = 0; i < array.size(); i++) {
				if (i % 2 != 0) {
					System.out.println(array.get(i));
				}
			}
		}
	}
}
