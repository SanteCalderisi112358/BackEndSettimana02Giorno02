package Esercizio04;

public class Studente {
	private String nome;
	private String cognome;
	private String matricola;

	public Studente(String _nome, String _cognome, String _matricola) {
		this.nome = _nome;
		this.cognome = _cognome;
		this.matricola = _matricola;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCogome() {
		return this.cognome;
	}

	public String getMatricol() {
		return this.matricola;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCognome: " + cognome + "\nMatricola: " + matricola;
	}
}
