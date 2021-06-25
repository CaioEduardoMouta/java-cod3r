package desafio;


public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	double velocidade;
	private int delta = 5;

	public int getDelta() {
		return delta;
	}


	
	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	
	public void acelerar() {
		if(velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}
		velocidade += getDelta();
	}
	
	public void frear() {
		if(velocidade >= 5) {
			velocidade -= 5;
		}else {
			velocidade = 0;
		}
		
	}
}
