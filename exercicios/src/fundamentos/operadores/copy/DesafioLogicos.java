package fundamentos.operadores.copy;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		
		//Trabalho na quinta(V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		boolean televisao50 = trabalho1 && trabalho2;
		boolean televisao32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Levar a tv de 50\" ?" + televisao50);
		System.out.println("Levar a tv de 32\" ?" + televisao32);
		System.out.println("Comprou sorvete" + comprouSorvete);
		System.out.println("Mais saudável?" + maisSaudavel);
		
		
		
	}
}
