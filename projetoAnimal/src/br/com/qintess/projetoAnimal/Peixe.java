package br.com.qintess.projetoAnimal;

public class Peixe extends Animal{
// atributos
	private String corEscama;
// metodos diferenca
	public void soltarBolha() {
		System.out.println("Soltando Bolha");
	}
// metodos especiais
	public String getCorEscama() {
		return this.corEscama;
	}
	public void setCorEscama(String ce) {
		this.corEscama = ce;
	}
// metodos sobreposto
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}
	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}
	
}//fim da classe
