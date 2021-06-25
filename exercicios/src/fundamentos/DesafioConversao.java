package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salario");
		String sal1 = salario.next().replace(",",".");
		System.out.print("Digite o segundo salário");
		String sal2 = salario.next().replace(",",".");
		System.out.print("Digite o terceiro salário");
		String sal3 = salario.next().replace(",",".");
		

		double numero1 = Double.parseDouble(sal1);
		double numero2 = Double.parseDouble(sal2);
		double numero3 = Double.parseDouble(sal3);
		
		
		double media = (numero1 + numero2 + numero3)/3;
		
		System.out.println("A média de reais é " + media );
		
		salario.close();
	}
}
