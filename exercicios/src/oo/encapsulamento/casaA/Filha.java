package oo.encapsulamento.casaA;

import oo.encapsulamento.Sogra;
import oo.encapsulamento.Sogro;

public class Filha extends Sogra {

	String segredoDoCasal = "Meu marido est� quase sendo demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais n�o sabem que " + euMesma.segredoDoCasal);
		System.out.println(euMesma.segredoDeFamilia);
		//Genro meuAmor = new Genro();
		//System.out.println(meuAmor.segredo);
		
		Sogro papai = new Sogro();
		System.out.println(papai.gostaDeCerveja);
		
		//Sogra mamae = new Sogra();
		//System.out.println(mamae.segredoDeFamilia);
	}
}
