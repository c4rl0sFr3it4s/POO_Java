package br.com.qintess.projetoAnimal;

public class Ave extends Animal{
// atributos
	private String corPena;
// metodos de diferenca
	public void fazerNinho() {
		System.out.println("Ninho construido");
	}
// metodos especiais
	public String getCorPena() {
		return this.corPena;
	}
	public void setCorPena(String cp) {
		this.corPena = cp;
	}
// metodos sobreposto
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}
	
}//fim da classe
