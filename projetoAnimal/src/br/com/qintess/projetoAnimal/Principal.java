package br.com.qintess.projetoAnimal;

public class Principal {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru cang = new Canguru();
		Cachorro ca = new Cachorro();
		Tartaruga ta = new Tartaruga();
		GoldFish go = new GoldFish();
		Arara ara = new Arara();
		
		// chamada de metodos
		System.out.println("## Mamifero ##");
		m.setPeso(35.3f);
		m.setCorDePelo("Marron");
		System.out.println("Peso:" + m.getPeso());
		System.out.println("Cor de Pelo:" + m.getCorDePelo());
		m.alimentar();
		m.locomover();
		m.emitirSom();
		System.out.println("----------------------");
		System.out.println("## Ave ##");
		a.setCorPena("Azul e Branca");
		a.setIdade(4);
		System.out.println("Cor da Pena:" + a.getCorPena());
		System.out.println("Idade:" + a.getIdade());
		a.alimentar();
		a.locomover();
		a.emitirSom();
		a.fazerNinho();
		System.out.println("----------------------");
		System.out.println("## Canguru ##");
		cang.locomover();
		cang.usarBolsa();
		System.out.println("----------------------");
		System.out.println("## Cachorro ##");
		// herança de animal
		ca.setMembros(4);
		ca.setPeso(7.0f);
		// caracteristicas do cachorro
		ca.setCorDePelo("Preto e Branco");
		ca.setIdade(7);
		System.out.println("Membros:" + ca.getMembros());
		System.out.println("Peso:" + ca.getPeso());
		System.out.println("Cor de Pelo:" + ca.getCorDePelo());
		System.out.println("Idade:" + ca.getIdade());
		ca.alimentar();
		ca.locomover();
		ca.emitirSom();
		ca.enterrarOsso();
		ca.abanarRabo();
		System.out.println("---------------------");
		
	}

}
