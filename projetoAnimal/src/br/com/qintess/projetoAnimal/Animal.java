package br.com.qintess.projetoAnimal;

public abstract class Animal {
//atributos
	protected float peso;
	protected int idade;
	protected int membros;
// metodos especiais
	public float getPeso() {
		return this.peso;
	}
	public void setPeso(float p) {
		this.peso = p;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int i) {
		this.idade = i;
	} 
	public int getMembros() {
		return this.membros;
	}
	public void setMembros(int m) {
		this.membros = m;
	}
// metodos abstratos
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();

}//fim da classe
