package br.com.qintess.aula05a;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(this.getTipo().equals("CC")) {
			this.setSaldo(50);
		}else if (this.getTipo().equals("CP")) {
			this.setSaldo(150);
		}
	}
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro. ");
		}else if (this.getSaldo() < 0){
			System.out.println("Conta em Débito. ");
		}else {
			this.setStatus(false);
		}
	}
	public void depositar(float v) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
		}else {
			System.out.println("Impossível depositar! ");
		}
	}
	public void sacar(float s) {
		if(this.getStatus()) {
			if(this.getSaldo() > s) {
				this.setSaldo(this.getSaldo() - s);
			}else {
				System.out.println("Saldo insulficiênte! ");
			}
		}
	}
	public void pagarMensal() {
		float v;
		v = 0;
		if(this.getTipo().equals("CC")) {
			v = 12;
		}else if (this.getTipo().equals("CP")) {
			v = 20;
		}
		if(this.getStatus()) {
			if(this.saldo > v) {
				this.setSaldo(this.getSaldo() - v);
			}
		}
	}
	
	public void estado() {
		System.out.println("-------------------------------------");
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
