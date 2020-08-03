package br.com.qintess.projetoAnimal;

public class Canguru extends Mamifero{
// metodos de diferenca
	public void usarBolsa() {
		System.out.println("Bolsa sendo usada");
	}
// metodos sobreposto
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
}//fim da classe
