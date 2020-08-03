package projetoPessoas02;

public class Principal {
	public static void main(String[] args) {
		//metodo principal
		/*Pessoa p1 = new Pessoa();
		 * não pode ser instânciado por ser uma classe abstrata
		 * */ 
		// instância Visitante
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println("## Visistante ##");
		System.out.println("-----------------------------------");
		System.out.println(v1.toString());
		System.out.println("----------------------------------");
		Aluno a1 = new Aluno();
		a1.setNome("Claúdio");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.setCurso("Sistemas");
		a1.setMatricula(11111);
		System.out.println("## Aluno ##");
		a1.pagarMensalidade(); // aluno
		Bolsista b1 = new Bolsista();
		b1.setMatricula(22222);
		b1.setNome("Jubileu");
		b1.setBolsa(112f);
		b1.setSexo("M");
		System.out.println("## Bolsista ##");
		b1.pagarMensalidade(); // bolsista está sobreescrito
		Tecnico t1 = new Tecnico();
		t1.setNome("Gustavo");
		t1.setIdade(34);
		t1.setSexo("M");
		t1.setCurso("Programação");
		t1.setRegistroProfissional(2020);
		System.out.println("## Técnico ##");
		System.out.println(t1.getIdade());
		t1.fazerAniversario();
		System.out.println(t1.toString());
		t1.praticar();
		
	}
}
