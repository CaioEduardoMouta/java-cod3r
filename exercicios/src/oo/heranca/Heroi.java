package oo.heranca;

public class Heroi extends Jogador {
	
	//tem que chamar explicitamente 
	
	public Heroi(int x, int y){
		super(0,0);
	}
	
	public boolean atacar(Jogador oponente) {
	boolean ataque1 = super.atacar(oponente);
	boolean ataque2 = super.atacar(oponente);
	return ataque1 || ataque2;
	
	
}

}
