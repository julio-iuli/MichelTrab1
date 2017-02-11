
public class TrabalhadorHorista extends Trabalhador implements CalcularSalario {

	private double salarioPorHora, horas;
	
	public TrabalhadorHorista(String primeiroNome, String sobreNome, double salarioPorHora, double horas){
		this.setPrimeiroNome(primeiroNome);
		this.setSobreNome(sobreNome);
		this.salarioPorHora = salarioPorHora;
		this.horas = horas;
	}
	
	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	@Override
	public double calcular() {
		return this.salarioPorHora * this.horas;
	}
	
	public String toString(){
		return "Trabalhador horista: " + super.toString() + "\nSalário: " + this.calcular();
	}

}
