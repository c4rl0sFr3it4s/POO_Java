package br.com.qintess.aula10a;

public class Funcionario extends Pessoa{
// atributos
	private String setor;
	private Boolean trabalhando;
// metodos especiais
	public String getSetor() {
		return this.setor;
	}
	public void setSetor(String s) {
		this.setor = s;
	}
	public Boolean getTrabalhando() {
		return this.trabalhando;
	}
	public void setTrabalhando(Boolean t) {
		this.trabalhando = t;
	}
//metodos internos
	public void mudarTrabalho(String mt) {
		this.setSetor(mt);
	}
}
