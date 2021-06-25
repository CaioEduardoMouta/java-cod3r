package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
		
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Coloque o dia");
		String DiaSemana = entrada.next();
		
		
		//EQUALS IGNORECASE PARA COMPARAR STRING
		if (DiaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		} else if(DiaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		}else if(DiaSemana.equalsIgnoreCase("Terça")) {
			System.out.println(3);
		}else if(DiaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		}else if(DiaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		}else if(DiaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		} else if (DiaSemana.equalsIgnoreCase("Sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia Invalido");
		}
				
		entrada.close();
	}

	}


