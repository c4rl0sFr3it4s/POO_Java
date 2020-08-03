package br.com.qintess.projetovisualizarvideo14a;

public class Principal {

	public static void main(String[] args) {
		// Video
		Video[] v = new Video[3];
		v[0] = new Video("Aula 01 de POO.");
		v[1] = new Video("Aula 12 de PHP.");
		v[2] = new Video("Aula 10 de HTML5");
//		System.out.println("## Video ##");
//		System.out.println(v[0].toString());
//		System.out.println("---------------------");
		// Gafanhoto
		Gafanhoto[] g = new Gafanhoto[2];
		g[0] = new Gafanhoto("Carlos", 40, "M", "carlosFreitas@gmail.com");
		g[1] = new Gafanhoto("Jubileu", 22, "M", "Juba");
//		System.out.println("## Gafanhoto ##");
//		System.out.println(g[0].toString());
//		System.out.println("-----------------------");
		// Visulizacao
		// cria um vetor
		Visualizacao visu[] = new Visualizacao[3];
		// instancia de Visualização
		visu[0] = new Visualizacao(g[0], v[1]); // carlos assiste aula 12 de PHP
		visu[0].avaliar(); // avaliar automático
		visu[1] = new Visualizacao(g[1], v[0]); // Jubileu assiste Aula 01 de POO
		visu[1].avaliar(35.0f); // avaliar por porcentagem
		visu[2] = new Visualizacao(g[0], v[2]); // carlos assiste Aula 10 de HTML5
		visu[2].avaliar(10); // avaliar por nota
		System.out.println("## Visualização ##");
		// chamada de metodos
		System.out.println(visu[0].toString() + "\n");
		System.out.println(visu[1].toString() + "\n");
		System.out.println(visu[2].toString() + "\n");
	}

}// fim classe
