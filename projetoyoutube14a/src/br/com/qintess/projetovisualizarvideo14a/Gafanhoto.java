package br.com.qintess.projetovisualizarvideo14a;

public class Gafanhoto extends Pessoa{
// atributos
	private String login;
	private int totAssistindo;
// construtor
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);// construtor de Pessoa sendo chamado
/*super que chama de pessoa
 * pessoa é a super classe e como gafanhoto herda de pessoa ele
 * tem que ter nome, idade, sexo 
 * */
		this.login = login;
		this.totAssistindo = 0;
		
	}
// metodo especificao
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String l) {
		this.login = l;
	}
	public int getTotAssistindo() {
		return this.totAssistindo;
	}
	public void setTotAssistindo(int ta) {
		this.totAssistindo = ta;
	}
// metodos internos heranca de diferença
	public void viewMaisUm() {
		this.setTotAssistindo(this.getTotAssistindo() + 1);
	}
//to string
	@Override
	public String toString() { //super.toString() vai chamar os dados de Pessoa
		return "Gafanhoto ["+ super.toString() + "\nlogin=" + login + 
				", totAssistindo=" + totAssistindo + "]";
	}
	
}//fim classe
