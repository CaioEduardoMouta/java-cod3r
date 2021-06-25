package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.aguarda("Segredo !");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.aguarda(3.21221);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
	}
	
}
