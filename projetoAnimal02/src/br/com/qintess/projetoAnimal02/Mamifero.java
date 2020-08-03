package br.com.qintess.projetoAnimal02;

public abstract class Mamifero {
// atributos
	protected String corPelo;
// metodos especiais
	public String getCorPelo() {
		return this.corPelo;
	}
	public void setCorPelo(String cp) {
		this.corPelo = cp;
	}
// metodos abstratos
	public abstract void emitirSom();
	
}//fim da classe
