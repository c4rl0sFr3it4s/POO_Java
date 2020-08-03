package br.com.qintess.projetovisualizarvideo14a;

public class Visualizacao {
// atributos
	private Gafanhoto espectador;
	private Video filme;
//construtor
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1); // mais 1 para o gafanhoto
		this.filme.setViews(this.filme.getViews() + 1); // mais 1 para o filme
	}
// metodo especiais
	public Gafanhoto getEspectador() {
		return this.espectador;
	}
	public void setEspectador(Gafanhoto gafanhoto) {
		this.espectador = gafanhoto;
	}
	public Video getVideo() {
		return this.filme;
	}
	public void setVideo(Video video) {
		this.filme = video;
	}
//metodos internos heranca de sobrecarga
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	public void avaliar(float porc) {
		int tot = 0;
		if(porc <= 20) { // notas de acordo com porcentagem
			tot += 3;
		}else if (porc <= 50) {
			tot += 5;
		}else if (porc <= 90) {
			tot += 8;
		}else {
			tot += 10;
		}
		this.filme.setAvaliacao(tot);
	}
//to string
	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
}
