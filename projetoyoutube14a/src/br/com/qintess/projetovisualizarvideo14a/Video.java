package br.com.qintess.projetovisualizarvideo14a;

public class Video implements AcoesVideo{
// atributos
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
// metodo construtor
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
// metodos especiais
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public int getAvaliacao() {
		return this.avaliacao;
	}
	public void setAvaliacao(int a) { // avaliação vai ser a média de views que ele tem
		int nova = 0;
		nova = (int) ((this.avaliacao + a) / this.views); // pega a parte inteira
		this.avaliacao = nova;
	}
	public int getViews() {
		return this.views;
	}
	public void setViews(int v) {
		this.views = v;
	}
	public int getCurtidas() {
		return this.curtidas;
	}
	public void setCurtidas(int c) {
		this.curtidas = c;
	}
	public boolean getReproduzindo() {
		return this.reproduzindo;
	}
	public void setReproduzindo(boolean r) {
		this.reproduzindo = r;
	}
// metodos sobreposto
	@Override
	public void play() {
		this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
	}

	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas() + 1);
	}
	
	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + 
				", views=" + views + ", curtidas=" + curtidas + 
				", reproduzindo=" + reproduzindo + "]";
	}
	
}//fim da classe
