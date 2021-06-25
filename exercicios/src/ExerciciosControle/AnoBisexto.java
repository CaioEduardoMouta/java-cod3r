package ExerciciosControle;

import javax.swing.JOptionPane;

public class AnoBisexto {

	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o numero");
		int numero = Integer.parseInt(valor);
		
		if(numero % 4 == 0) {
			System.out.println("Ano Bisexto!");
		}else  {
			System.out.println("Ano normal");
		}
	}
}
