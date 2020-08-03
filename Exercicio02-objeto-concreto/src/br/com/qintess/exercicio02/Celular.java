package br.com.qintess.exercicio02;

public class Celular {
// atributos
	String cor; 
	float cumprimento;
	float largura;
	String tela;
	String modelo;
	boolean botaoLigaDesliga;
	int volume;
	boolean phone;
	
	public Celular() {
		this.botaoLigaDesliga = false;
		this.volume = 0;
		this.phone = false;
	}
	
	void ligar() {
		this.botaoLigaDesliga = true;
	}
	
	void desligar() {
		this.botaoLigaDesliga = false;
	}
	
	void aumentarVolume(int vo) {
		this.volume = vo;
		System.out.println("Volume aumentado para " + this.volume);
		System.out.println("-------------------------------------");
	}
	
	void abaixarVolume(int ab) {
		this.volume = ab;
		System.out.println("Volume abaixado para " + this.volume);
		System.out.println("-------------------------------------");
	}
	
	void ligarPhone() {
		this.phone = true;
	}
	
	void desligarPhone() {
		this.phone = false;
	}
	
	void status() {
		System.out.println("Cor " + this.cor);
		System.out.println("Cumprimento " + this.cumprimento);
		System.out.println("Largura " + this.largura);
		System.out.println("Tela " + this.tela);
		System.out.println("Modelo " + this.modelo);
		System.out.println("Está ligado " + this.botaoLigaDesliga);
		System.out.println("Volume " + this.volume);
		System.out.println("Phone plugado " + this.phone);
	}
}// fim classe
