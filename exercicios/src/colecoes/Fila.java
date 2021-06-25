package colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		//Offer e Add -> adicionam elementos na fila
		// Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana");
	   	fila.offer("Bia"); //Lan�a uma exce��o
	   	fila.add("Carlos");
	   	fila.offer("Daniel");
	   	fila.add("Rafaela");
	   	fila.offer("Gui");
	   	
	   	
	   	//Diferen�a � o comportamento ocorre 
	   	//quando a fila est� vazia!
	   	System.out.println(fila.peek()); //retorna null
	   	System.out.println(fila.peek());
	   	System.out.println(fila.element()); // Retorna erro quando est� vazio
	   	System.out.println(fila.element());
	   	
	   	
	   	System.out.println(fila.poll()); //Retona  o primeiro elemento da 
	   	//fila j� removendos
	   	System.out.println(fila.remove());//retorna um erro quando est� vazio
	}
}
