package Teste;

import desafio.Carro;
import desafio.Civic;
import desafio.Ferrari;

public class corrida {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(450);
		
		Carro c = new Civic(200);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.frear();
		System.out.println(ferrari);
		
		Ferrari f = new Ferrari(450);
		f.ligarTurbo();
		
		c.acelerar();
		System.out.println(c);
		c.frear();
		System.out.println(c);
		
		c.frear();
		System.out.println(c);
		
		
	}
}
