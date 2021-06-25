package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println("!!!");
		
		// não acessar nem atributo nem metodo de algo que está nulo
		
		// condição ternaria 
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		String s2 = null; // String tem que ser inicilizado antes de ser 
		//usado 
		//NullPoiterException = acessar um atributo dessa variavel nula
		
		
		System.out.println(s2.concat("???"));
	}
	
}
