package br.com.qintess.exercicio02;

public class Principal {

	public static void main(String[] args) {
		AlcoolGel alcool = new AlcoolGel();
		alcool.tamanho = 25.0f;
		alcool.cor = "Transparente";
		alcool.marca = "Yan Alcool Gel";
		alcool.dataValidade = "17-06-2020";
		alcool.quantidade = 50;
		
		//alcool.destampar();
		alcool.tampar();
		alcool.status();
	}

}
