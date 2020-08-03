package br.com.qintess.aula02;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada " + this.tampada);
	}
	
	public float getPonta() {
		return ponta;
	}


	public void setPonta(float ponta) {
		this.ponta = ponta;
	}


	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro não posso RABISCAR.");
		} else {
			System.out.println("Estou RABISCANDO. ");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
		
	}
	
}// fim da classe
