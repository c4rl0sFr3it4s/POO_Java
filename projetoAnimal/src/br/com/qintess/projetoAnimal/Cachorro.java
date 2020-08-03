package br.com.qintess.projetoAnimal;

public class Cachorro extends Mamifero{
// metodos diferenca
	public void enterrarOsso() {
		System.out.println("Osso enterrado");
	}
	public void abanarRabo() {
		System.out.println("Rabo abanando");
	}
// metodo sobreposto
	@Override
	public void emitirSom() {
		System.out.println("Au au au");
	}
	
}// fim classe
