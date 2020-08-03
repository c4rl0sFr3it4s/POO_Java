package projetoPessoas02;

public class Professor extends Pessoa{
// atributos
	private String especialidade;
	private float salario;
// métodos especiais
	public String getEspecialidade() {
		return this.especialidade;
	}
	public void setEspecialidade(String e) {
		this.especialidade = e;
	}
	public float getSalario() {
		return this.salario;
	}
	public void setSalario(float s) {
		this.salario = s;
	}
// metodos internos
	public void receberAumento(float au) {
		this.setSalario(this.getSalario() + au);
	}
}// fim da classe
