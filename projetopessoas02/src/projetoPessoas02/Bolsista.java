package projetoPessoas02;

public class Bolsista extends Aluno{
// atributos
	private float bolsa;
// metodos especiais
	public float getBolsa() {
		return this.bolsa;
	}
	public void setBolsa(float b) {
		this.bolsa = b;
	}
// metodos internos
	public void renovarBolsa() {
		System.out.println("Bolsa renovada! de " + this.getNome());
	}
	@Override
	public void pagarMensalidade() { // herança de diferenca
		System.out.println(this.getNome() + " é Bolsista pagamento facilitado. ");
	}
	
}
