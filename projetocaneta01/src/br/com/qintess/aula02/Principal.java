package br.com.qintess.aula02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.setPonta(0.5f);
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		//instancia de caneta c2
		Caneta c2 = new Caneta();
		c2.cor = "Vermelho";
		c2.modelo = "Bic Cristal";
		c2.setPonta(7.0f);
		c2.carga = 70;
		c2.tampar();
		c2.status();
		
	}

}
