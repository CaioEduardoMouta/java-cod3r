package colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		//Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana");
	   	fila.offer("Bia"); //Lança uma exceção
	   	fila.add("Carlos");
	   	fila.offer("Daniel");
	   	fila.add("Rafaela");
	   	fila.offer("Gui");
	   	
	   	
	   	//Diferença é o comportamento ocorre 
	   	//quando a fila está vazia!
	   	System.out.println(fila.peek()); //retorna null
	   	System.out.println(fila.peek());
	   	System.out.println(fila.element()); // Retorna erro quando está vazio
	   	System.out.println(fila.element());
	   	
	   	
	   	System.out.println(fila.poll()); //Retona  o primeiro elemento da 
	   	//fila já removendos
	   	System.out.println(fila.remove());//retorna um erro quando está vazio
	}
}
