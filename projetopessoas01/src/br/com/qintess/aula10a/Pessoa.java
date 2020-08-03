package br.com.qintess.aula10a;

public class Pessoa {
// atributos
	private String nome;
	private Integer idade;
	private String sexo;
// metodos especiais
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
// metodo interno
	public void fazerAniversario() {
		this.idade++;
		System.out.println("Parabéns agora você tem " + this.getIdade());
	}
// to string
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
}// fim classe
