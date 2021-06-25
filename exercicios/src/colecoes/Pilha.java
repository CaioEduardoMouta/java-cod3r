package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Stack;

public class Pilha {
	
	public static void main(String[] args) {
		//Stack<String> pilha = new Stack<>();
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		//Ultimo que entrou na pilha vai ser o primeiro a sair
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		
		

	}
}
