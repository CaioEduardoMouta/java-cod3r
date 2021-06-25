package desafio;

public interface Luxo  {

	public void ligarAr();
	abstract void desligarAr();
	
	default int VelocidadeDoAr() {
		return 1;
	}
}
