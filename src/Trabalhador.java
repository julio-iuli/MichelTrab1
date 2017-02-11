
public abstract class Trabalhador {
	
	private String primeiroNome, sobreNome;
	
	public Trabalhador(){}
	
	public Trabalhador(String primeiroNome, String sobreNome) {
		this.primeiroNome = primeiroNome;
		this.sobreNome = sobreNome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String toString() {
		return this.primeiroNome + " " + this.sobreNome;
	}

}
