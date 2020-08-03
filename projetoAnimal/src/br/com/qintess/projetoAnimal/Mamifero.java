package br.com.qintess.projetoAnimal;

public class Mamifero extends Animal{
// atributos
	private String corDoPelo;
// metodos especificos
	public String getCorDePelo() {
		return this.corDoPelo;
	}
	public void setCorDePelo(String cp) {
		this.corDoPelo = cp;
	}
// metodos sobrepostos
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}
	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de mamifero");
	}
	
}//fim da classe
