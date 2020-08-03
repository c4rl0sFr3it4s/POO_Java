package projetoPessoas02;

public class Tecnico extends Aluno{
// atributos
	private int registroProfissional;
// metodos especificos
	public int getRegistroProfissional() {
		return this.registroProfissional;
	}
	public void setRegistroProfissional(int rp) {
		this.registroProfissional = rp;
	}
// metodos internos
	public void praticar() {
		System.out.println("Práticando! ");
	}
}
