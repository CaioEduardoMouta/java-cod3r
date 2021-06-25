package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.aguarda(2.3);
		
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		caixaA.aguarda(2.3);
		
		System.out.println(caixaB.abrir());
	}
}
