package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//(*F - 32 * 5/9 = * C)
		
		//constante 
		final double x = 32;
		final double y = 5 / 9.0;
		//variavel
		double F = 86;
		double C = (F - x) * y;
		System.out.println("A temperatura é" + C );
		
		F = 150;
		C = ( F - x) * y;
		System.out.println("O resultado é" + C);
	}
}
