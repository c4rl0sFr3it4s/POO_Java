package br.com.qintess.projetoAnimal02;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		System.out.println("## Cachorro ##");
		c.setCorPelo("Marron");
		System.out.println("Peso:" + c.getCorPelo());
		c.reagir("Olá"); //frase
		c.reagir(8, 2); // hora, min
		c.reagir(true); // dono
		c.reagir(2, 10.0f); // idade, peso
		c.emitirSom(); // emitir som
	}

}
