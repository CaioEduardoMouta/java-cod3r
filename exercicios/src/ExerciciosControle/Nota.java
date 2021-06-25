package ExerciciosControle;

public class Nota {

	public static void main(String[] args) {

		double n1 = 4;
		double n2 = 5;
		double media = n1 + n2/2;
		
		if(media >= 7) {
			System.out.println("aprovado");
		}else if(media >= 4) {
			System.out.println("recuperação");
		}else {
			System.out.println("Reprovado");
		}
	}
}
