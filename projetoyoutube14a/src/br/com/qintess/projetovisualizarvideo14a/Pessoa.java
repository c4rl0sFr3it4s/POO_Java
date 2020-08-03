package br.com.qintess.projetovisualizarvideo14a;

public abstract class Pessoa {
// atributos
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;
// construtor
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
// metodos especiais
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int i) {
		this.idade = i;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String s) {
		this.sexo = s;
	}
	public float getExperiencia() {
		return this.experiencia;
	}
	public void setExperiencia(float e) {
		this.experiencia = e;
	}
//metodos internos
	protected void ganharExperiencia() {
		this.experiencia ++;
	}
	@Override
	public String toString() { // super de pessoa
		return "Pessoa [nome=" + nome + ", idade=" + idade + 
				", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}
	
}//fim classe
