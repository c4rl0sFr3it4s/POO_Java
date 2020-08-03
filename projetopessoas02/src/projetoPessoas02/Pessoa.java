package projetoPessoas02;

public abstract class Pessoa {
// atributos
	private String nome;
	private int idade;
	private String sexo;
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
// metodos internos
	public final void fazerAniversario() {
		this.idade ++;
	}
//to String
	@Override
	public String toString() {
		return "Dados [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
}// fim da classe
