package fundamentos;


public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		// Final n?o pode ser trocada o valor da variavel
		final double pi = 3.14159;
		
		double area = pi * raio * raio;
		
		
		System.out.println(area);
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Area =" + area);
	}
}
