package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = { 9.9,8.7, 7.2, 9.4};
		
		/* é obrigador definir o tamnnho do array */
		double[] notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 2.0;
		notasPedro[2] = 3.0;
		notasPedro[3] = 4.0;
		notasPedro[4] = 9.0;
		
		
		double totalPedro = 0;
		for(double nota: notasPedro) {
			totalPedro += nota;
		}
		/*for(int i = 0; i < notasPedro.length; i++) {
			totalPedro += notasPedro[i];
			System.out.println(totalPedro / notasPedro.length);
		}*/
	
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
	}
}
