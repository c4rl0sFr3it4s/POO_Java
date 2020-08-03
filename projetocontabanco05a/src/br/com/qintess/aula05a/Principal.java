package br.com.qintess.aula05a;

public class Principal {
	public static void main(String[] args) {
		ContaBanco cliente01 = new ContaBanco();
		cliente01.abrirConta("CC");
		cliente01.setNumConta(11111);
		cliente01.setDono("Carlos Eduardo de Freitas");
		cliente01.setStatus(true);
//		System.out.println("Número da conta: " + cliente01.getNumConta());
//		System.out.println("Tipo de conta: " + cliente01.getTipo());
//		System.out.println("Dono: " + cliente01.getDono());
//		System.out.println("Saldo: " + cliente01.getSaldo());
//		System.out.println("Status: " + cliente01.getStatus()); 
		cliente01.estado();
	}

}
