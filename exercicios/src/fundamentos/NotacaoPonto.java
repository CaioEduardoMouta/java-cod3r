package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		

		String s = "Bom dia ?" .toUpperCase().replace("?", "Bia").concat("!");
		
		System.out.println(s);
		
		String x = "CAIO".toLowerCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Caio");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador "."
		
		int a = 3;
		System.out.println(a);
	}
}
