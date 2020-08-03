package br.com.qintess.aula09b;

public class Pessoa {
// atributo
	private String nome;
	private Integer idade;
	private String sexo;
// construtor
	public Pessoa(String nome, Integer idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
// métodos especiais
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public Integer getIdade() {
		return this.idade;
	}
	public void setIdade(Integer i) {
		this.idade = i;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String s) {
		this.sexo = s;
	}
// métodos internos
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
}
