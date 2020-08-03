package br.com.qintess.exercicio02;

public class AlcoolGel {
	float tamanho;
	String cor;
	String marca;
	boolean tampa;
	String dataValidade;
	int quantidade;
	
	void tampar() {
		this.tampa = true;
	}
	
	void destampar() {
		this.tampa = false;
	}
	
	void status() {
		System.out.println("Tamanho " + this.tamanho);
		System.out.println("Cor " + this.cor);
		System.out.println("Marca " + this.marca);
		System.out.println("Está tampada " + this.tampa);
		System.out.println("Data de validade " + this.dataValidade);
		System.out.println("Quantidade " + this.quantidade);
	}
}
