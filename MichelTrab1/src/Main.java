
public class Main {

	public static void main(String[] args) {
		
		// Trabalhador Chefe
		TrabalhadorChefe trab1 = new TrabalhadorChefe("Julio", "Carmo", 1000);
		System.out.println("***Testando TrabalhadorChefe***");
		System.out.println(trab1.toString());
		
		// Trabalhador Comissão
		
		TrabalhadorComissao trab2 = new TrabalhadorComissao("Iuli", "Carmo", 2000, 10, 5);
		System.out.println("\n***Testando TrabalhadorComissao***");
		System.out.println(trab2.toString());
		
		// Trabalhador Produção
		TrabalhadorProducao trab3 = new TrabalhadorProducao("Giulio", "Carmini", 30, 55);
		System.out.println("\n***Testando TrabalhadorProducao***");
		System.out.println(trab3.toString());
		
		// Trabalhador Horista
		TrabalhadorHorista trab4 = new TrabalhadorHorista("Julião", "Carmo", 15.5, 120);
		System.out.println("\n***Testando Trabalhadorhorista***");
		System.out.println(trab4.toString());
	}

}
