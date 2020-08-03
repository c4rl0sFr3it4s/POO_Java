package br.cam.qintess.aula07;

import java.util.Random;
public class Luta {
//	atibutos
	private Lutador desafiado;
	private Lutador desafiante;
	private Integer rounds;
	private Boolean aprovada;

//metodos abstratos
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	public void setDesafiado(Lutador dd) {
		this.desafiado = dd;
	}
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	public void setDesafiante(Lutador da) {
		this.desafiante = da;
	}
	public Integer getRouds() {
		return this.rounds;
	}
	public void setRounds(Integer r) {
		this.rounds = r;
	}
	public Boolean getAprovada() {
		return this.aprovada;
	}
	public void setAprovada(Boolean a) {
		this.aprovada = a;
	}
//metodos internos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (( l1.getCategoria().equals(l2.getCategoria()) ) && l1 != l2) { // regra de negócio é categoria
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	public void lutar() {
		if (this.getAprovada()) {
			System.out.println("### Desafiado ###");
			this.desafiado.apresentar();
			System.out.println("--------------------------------");
			System.out.println("### Desafiante ###");
			this.desafiante.apresentar();
			
			Random vencedor = new Random(); 
			int op = vencedor.nextInt(3); // randomiza valor de 0, 1, 2
			switch (op) {
				case 0:// empate	
					System.out.println("--------------------------------");
					System.out.println("### Empatou! ###");
					System.out.println("Desafiado → " + this.desafiado.getNome());
					System.out.println("Desafiante → " + this.desafiante.getNome());
					System.out.println("--------------------------------");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
				break;
				case 1:// lutador 01 vence
					System.out.println("--------------------------------");
					System.out.println("### Venceu ###");
					System.out.println("Desafiado → " + this.desafiado.getNome());
					System.out.println("--------------------------------");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:// lutador 02 vence
					System.out.println("--------------------------------");
					System.out.println("### Venceu ###");
					System.out.println("Desafiante → " + this.desafiante.getNome());
					System.out.println("--------------------------------");
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					break;
			}
		} else {
			System.out.println("A luta não pode acontecer! ");
		}
	}
}
