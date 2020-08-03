package br.cam.qintess.aula07;

public class Principal {

	public static void main(String[] args) {
// instância da classe
		Lutador[] l = new Lutador[6];
// instância da classe com passagem de parametro
		l[0] = new Lutador("Prety Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadown", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador("Nerdaad", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
// chamada para o metodo
//		l[0].apresentar();
//		l[1].apresentar();
//		l[2].apresentar();
//		l[3].apresentar();
//		l[4].apresentar();
//		l[5].apresentar();
		
		Luta uec01 = new Luta();
		uec01.marcarLuta(l[1], l[5]);
		uec01.lutar();
		//chamada método depois da luta
		l[1].status(); // categoria
		l[5].status(); // categoria
	}

}
