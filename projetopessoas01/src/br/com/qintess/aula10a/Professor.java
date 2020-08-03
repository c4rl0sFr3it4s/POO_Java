package br.com.qintess.aula10a;

public class Professor extends Pessoa{
// atributos
	private String especialidade;
	private float salario;
// metodos especiais
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
		this.setSalario(au);
	}
}// fim classe
