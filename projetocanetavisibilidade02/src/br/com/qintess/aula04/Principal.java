package br.com.qintess.aula04;

public class Principal {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.setModelo("Bic Cristal");
		c1.setPonta(0.5f);
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.setModelo("Faber Castel");
		c2.setPonta(0.7f);
		c2.status();
	}

}
