package br.com.qintess.aula09b;

public class Principal {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		//instância de pessoa
		p[0] = new Pessoa("Carlos Freitas", 40, "Masculino");
		p[1] = new Pessoa("Gustavo", 53, "Masculino");
		p[2] = new Pessoa("Ana", 12, "Feminino");
		//instânciao de livro
		l[0] = new Livro("A rainha vermelha", "Victoria Aveyard", 500, p[0]);
		l[1] = new Livro("O orfanato da Srta. Peregrine", "Ransom Riggs", 350, p[1]);
		l[2] = new Livro("Trono de vidro", "Sarah J. Maas", 983, p[2]);
		// livro 1
		l[0].abrir();
		l[0].folhear(200);
		l[0].avancarPag();
		System.out.println(l[0].detalhes()); // metodos leitor ele retorna uma string
		// livro 2
		l[1].abrir();
		System.out.println(l[1].detalhes());
		//livro 3
		System.out.println(l[2].detalhes());
	}

}
