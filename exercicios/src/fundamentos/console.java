package fundamentos;

import java.util.Scanner;

public class console {

	public static void main(String[] args) {
		
		System.out.print("Bom ");
		System.out.print("Dia !\n\n");
		
		System.out.println("Bom");
		System.out.println(" dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d",
				1 ,1, 2, 3, 4, 5);
		System.out.printf("Salário %.1f",1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome");
		String nome = entrada.nextLine();
		System.out.print("Digite o seu sobrenome");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite o sua idade");
		int idade = entrada.nextInt();
		
		entrada.next();
		
		System.out.printf("%s %s tem %d anos. =",  nome ,sobrenome , idade);
		
		entrada.close();
		
	}
}
