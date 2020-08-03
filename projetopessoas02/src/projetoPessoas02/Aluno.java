package projetoPessoas02;

public class Aluno extends Pessoa{
// atributos
	private int matricula;
	private String curso;
// metodos especiais
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int m) {
		this.matricula = m;
	}
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String c) {
		this.curso = c;
	}
// metodos internos
	public void pagarMensalidade() {
		System.out.println("Mensalidade Paga! de " + this.getNome());
	}
}
