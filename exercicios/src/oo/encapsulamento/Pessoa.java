package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome,int idade) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}	
	public String getSobrenome() {
		return sobrenome;
	}

	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Getter
	public int getIdade() {
		return idade;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
		
	}
	@Override
	public String toString() {
		return "Ola eu sou o" + getNome()
		+ "tenho " + getIdade() + "anos." ;
	
		
	}
}
