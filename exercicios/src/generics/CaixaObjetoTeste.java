package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.aguarda(2.3);
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.aguarda("Ol�");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}
