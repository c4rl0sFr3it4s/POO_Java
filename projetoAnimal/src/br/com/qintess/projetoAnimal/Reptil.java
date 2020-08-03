package br.com.qintess.projetoAnimal;

public class Reptil extends Animal{
// atributos
	private String corDaEscama;
// metodos especiais
	public String getCorDaEscama() {
		return this.corDaEscama;
	}
	public void setCorDaEscama(String ce) {
		this.corDaEscama = ce;
	}
// metodos sobrepostos
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo vegetal");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de Réptil");
	}
	
}//fim da classe
