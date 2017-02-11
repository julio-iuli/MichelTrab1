
public class TrabalhadorChefe extends Trabalhador implements CalcularSalario {

	private double salarioSemanal;
	
	public TrabalhadorChefe(){};
	
	public TrabalhadorChefe (String primeiroNome, String sobreNome, double salarioSemanal) {
		this.setPrimeiroNome(primeiroNome);
		this.setSobreNome(sobreNome);
		this.salarioSemanal = salarioSemanal;
	}
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public double calcular() {
		return 4 * salarioSemanal;
	}
	
	public String toString(){
		return "Chefe: " + super.toString() + "\nSalário: " + this.calcular();
	}

}
