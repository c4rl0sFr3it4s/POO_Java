package br.com.qintess.aula10a;

public class Aluno extends Pessoa{
// atributos
	private Integer matricula;
	private String curso;
// metodos especiais
	public Integer getMatricula() {
		return this.matricula;
	}
	public void setMatricual(Integer m) {
		this.matricula = m;
	}
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String c) {
		this.curso = c;
	}
// metodo interno
	public void cancelarMatricula() {
		this.matricula = 0;
		this.setCurso("#############");
		System.out.println("Matricula cancelada. ");
	}

}
