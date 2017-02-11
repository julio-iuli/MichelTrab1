
public class TrabalhadorComissao extends Trabalhador implements CalcularSalario {
	
	private double salario, comissao;
	private int quantidade;
	
	public TrabalhadorComissao(String primeiroNome, String sobreNome, double salario, double comissao, int quantidade) {
		this.setPrimeiroNome(primeiroNome);
		this.setSobreNome(sobreNome);
		this.salario = salario;
		this.comissao = comissao;
		this.quantidade = quantidade;
	}
		
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public double calcular() {
		return salario + (this.comissao * quantidade);
	}
	
	public String toString(){
		return "Trabalhador por comissão: " + super.toString()  + "\nSalário: " + this.calcular();
	}

}
