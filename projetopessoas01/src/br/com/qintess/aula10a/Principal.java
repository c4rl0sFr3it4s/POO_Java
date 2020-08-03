package br.com.qintess.aula10a;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();
		Funcionario f1 = new Funcionario();
		Professor pro1 = new Professor();
		// instancia pessoa
		p1.setNome("Creuza");
		p1.setIdade(15);
		p1.setSexo("F");
		//p1.fazerAniversario();
		System.out.println("## Pessoa ##");
		System.out.println(p1.toString());
		// instancia aluno
		a1.setNome("Carlos");
		a1.setIdade(40);
		a1.setSexo("M");
		a1.setMatricual(11111);
		a1.setCurso("Bacharelado Sistemas de Informação");
		// a1.cancelarMatricula();
		System.out.println("## Aluno ##");
		System.out.println("Nome:" + a1.getNome());
		System.out.println("Idade:" + a1.getIdade());
		System.out.println("Sexo:" + a1.getSexo());
		System.out.println("Matricula:" + a1.getMatricula());
		System.out.println("Curso:" + a1.getCurso());
		// instancia funcionario
		f1.setNome("Maria");
		f1.setIdade(70);
		f1.setSexo("F");
		//f1.setSetor("Recepcionista");
		f1.mudarTrabalho("Atendente");
		f1.setTrabalhando(true);
		System.out.println("## Funcionário ##");
		System.out.println("Nome:" + f1.getNome());
		System.out.println("Idade: " + f1.getIdade());
		System.out.println("Sexo:" + f1.getSexo());
		System.out.println("Setor:" + f1.getSetor());
		System.out.println("Trabalhando:" + f1.getTrabalhando());
		// instancia professor
		pro1.setNome("Pilon");
		pro1.setIdade(57);
		pro1.setSexo("M");
		pro1.setEspecialidade("Estrutura de dados");
		pro1.setSalario(2.500f);
		System.out.println("## Professor ##");
		System.out.println("Nome:" + pro1.getNome());
		System.out.println("Idade:" + pro1.getIdade());
		System.out.println("Sexo:" + pro1.getSexo());
		System.out.println("Especialidade:" + pro1.getEspecialidade());
		System.out.println("Salário:" + pro1.getSalario());
		
	}

}
