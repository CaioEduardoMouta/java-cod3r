package oo.encapsulamento.casaA;

//import oo.encapsulamento.Sogra;
import oo.encapsulamento.Sogro;

public class Genro {

	private String segredo = "Minha sogra fala demais";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Numa falarei.." + euMesmo.segredo);
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);
		
		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja);
		
		//Sogra sogrinha = new Sogra();
		//Informação do nivel protected
		//System.out.println(sogrinha.segredoDeFamilia);
	}
}
