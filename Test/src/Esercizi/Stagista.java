package Esercizi;

public class Stagista implements IConfronta {
	private String nome;
	private String cognome;
	private int eta;

	public Stagista(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public boolean minoreDi(int a) {
		boolean cond=false;
		if(eta<a)
			cond=true;
			return cond;
			
	}

	@Override
	public String toString() {
		return "Stagista [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	

}
