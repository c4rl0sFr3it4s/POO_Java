package br.com.qintess.exercicio02;

public class Principal {
	public static void main(String[] args) {
		Celular cel = new Celular();
		cel.cor = "Preto";
		cel.cumprimento = 161.4f;
		cel.largura = 76.96f;
		cel.tela = "6 - Polegadas";
		cel.modelo = "Samsumg";
		//cel.status();
		cel.ligar();
		cel.ligarPhone();
		cel.aumentarVolume(5);
		cel.status();
	}
}
