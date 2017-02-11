
public class TrabalhadorProducao extends Trabalhador implements CalcularSalario {

	private double salarioPorItem;
	private int qtdItem;
	
	public TrabalhadorProducao(String primeiroNome, String sobreNome, double salarioPorItem, int qtdItem) {
		this.setPrimeiroNome(primeiroNome);
		this.setSobreNome(sobreNome);
		this.salarioPorItem = salarioPorItem;
		this.qtdItem = qtdItem;
	}

	public void setSalarioPorItem(double salarioPorItem) {
		this.salarioPorItem = salarioPorItem;
	}

	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}

	@Override
	public double calcular() {
		return this.salarioPorItem * this.qtdItem;
	}

	public String toString(){
		return "Trabalhador por produção: " + super.toString() + "\nSalário: " + this.calcular();
	}

}
