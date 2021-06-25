package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas Notas:");
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double[qtdeNotas]; // esse valor vai ser
		//recebido pelo for
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a notas" + i + 1 + ": ");
			notas [i] = entrada.nextDouble();
		} 
		
		double total = 0;
		for( double nota:notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A m�dia �" + media + "!");
		entrada.close();
	}
}