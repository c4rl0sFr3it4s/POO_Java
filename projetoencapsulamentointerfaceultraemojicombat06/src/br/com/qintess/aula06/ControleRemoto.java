package br.com.qintess.aula06;

public class ControleRemoto implements Controlador{
//atributo
	private Integer volume;
	private Boolean ligado;
	private Boolean tocando;
//metodo construtor
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}
//metodos especiais
	private Integer getVolume() {
		return this.volume;
	}
	private void setVolume(Integer v) {
		this.volume = v;
	}
	private Boolean getLigado() {
		return this.ligado;
	}
	private void setLigado(Boolean l) {
		this.ligado = l;
	}
	private Boolean getTocando() {
		return this.tocando;
	}
	private void setTocando(Boolean t) {
		this.tocando = t;
	}
//metodos sobreescrito
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if (this.getLigado()) {
			System.out.println("Ligado = " + this.getLigado());
			System.out.print("Volume [" + this.getVolume() + "] ");
			for (int i = 0; i < this.getVolume(); i += 10) {
				System.out.print("|");
			}
			System.out.println("\nTocando = " + this.getTocando());
		}else {
			System.out.println("Ligue o controle primeiro... ");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu... ");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Impossível aumentar volume controle desligado. ");
			System.out.println("------------------------------------------------");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impossível diminuir volume controle desligado. ");
			System.out.println("------------------------------------------------");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}else {
			System.out.println("Não consegui reproduzir... ");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Não consegui pausar... ");
		}
	}

}//fim classe
