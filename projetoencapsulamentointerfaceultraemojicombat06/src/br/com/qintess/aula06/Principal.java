package br.com.qintess.aula06;

public class Principal {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.play();
		c.maisVolume();
		c.abrirMenu();
	}
}
