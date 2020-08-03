package br.com.qintess.aula09b;

public class Livro implements Publicacao{
// atributos
	private String titulo;
	private String autor;
	private Integer totPaginas;
	private Integer pagAtual;
	private boolean aberto;
	private Pessoa leitor;
// construtor
	public Livro(String titulo, String autor, Integer totPaginas, Pessoa leitor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotPaginas(totPaginas);
		this.setPagAtual(0);
		this.setAberto(false);
		this.setLeitor(leitor);
	}
//to string ele retorna uma string
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + 
				"\npagAtual=" + pagAtual + ", aberto=" + aberto + 
				"\nleitor=" + leitor.getNome() + ", idade=" + leitor.getIdade() + ", sexo=" + leitor.getSexo() + "]"; // o leitor é referencia de uma classe
	}
// métodos especiais
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String a) {
		this.autor = a;
	}
	public Integer getTotPaginas() {
		return this.totPaginas;
	}
	public void setTotPaginas(Integer tp) {
		this.totPaginas = tp;
	}
	public Integer getPagAtual() {
		return this.pagAtual;
	}
	public void setPagAtual(Integer pa) {
		this.pagAtual = pa;
	}
	public Boolean getAberto() {
		return this.aberto;
	}
	public void setAberto(Boolean a) {
		this.aberto = a;
	}
	public Pessoa getLeitor() {
		return this.leitor;
	}
	public void setLeitor(Pessoa pessoa) {
		this.leitor = pessoa;
	}
	
//métodos sobreescritos
	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}
	
	@Override
	public void folhear(int p) {
		if(p > this.pagAtual) {
			this.pagAtual = 0;
		}else {
			this.pagAtual = p;
		}
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
	}

}
