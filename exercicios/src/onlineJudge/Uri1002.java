package onlineJudge;

public class Uri1002 {
		
	public static void main(String[] args) {
	     double raio = 3.4;
		  // Final não pode ser trocada o valor da variavel
		  double n = 3.14159;
			
			double area = raio * raio * n;

			raio = 2;
			area = raio * raio * n;
			System.out.printf("A=%.4f %n", (area));
			//System.out.println("A="+ area);
	}
}

