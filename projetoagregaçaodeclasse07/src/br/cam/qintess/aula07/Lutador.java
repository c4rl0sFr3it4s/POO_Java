package br.cam.qintess.aula07;

public class Lutador {
// atributos
	private String nome;
	private String nacionalidade;
	private Integer idade;
	private float altura;
	private float peso;
	private String categoria;
	private Integer vitorias;
	private Integer derrotas;
	private Integer empates;
	
// metodo construtor
	public Lutador(String no, String na, Integer id, float al, 
						float pe, Integer vi, Integer de, Integer em) {
		this.setNome(no);
		this.setNascionalidade(na);
		this.setIdade(id);
		this.setAltura(al);
		this.setPeso(pe);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(em);
	}
// metodos especiais
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	public void setNascionalidade(String na) {
		this.nacionalidade = na;
	}
	public Integer getIdade() {
		return this.idade;
	}
	public void setIdade(Integer i) {
		this.idade = i;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float a) {
		this.altura = a;
	}
	public float getPeso() {
		return this.peso;
	}
	public void setPeso(float p) {
// regra de negócio para peso
		this.peso = p;
		this.setCategoria();
	}
	public String getCategoria() {
		return this.categoria;
	}
	public void setCategoria() {
// regra de negócio para peso
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3){
			this.categoria = "Leve";
		}else if (this.peso <= 83.9){
			this.categoria = "Médio";
		}else if (this.peso <= 120.2){
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}
	public Integer getVitorias() {
		return this.vitorias;
	}
	public void setVitorias(Integer v) {
		this.vitorias = v;
	}
	public Integer getDerrotas() {
		return this.derrotas;
	}
	public void setDerrotas(Integer d) {
		this.derrotas = d;
	}
	public Integer getEmpates() {
		return this.empates;
	}
	public void setEmpates(Integer e) {
		this.empates = e;
	}
//metodos internos
	public void apresentar() {
		System.out.println("--------------------------------");
		System.out.println("Categoria " + this.getCategoria());
		System.out.println("Vem ai o Lutador " + this.getNome() + ", pesando," + this.getPeso() + "Kg, ");
		System.out.println("do páis " + this.getNacionalidade() + ", idade " + this.getIdade() + " anos ");
		System.out.println("com " + this.getAltura() + " de Altura, " + this.getVitorias() + " vitórias, ");
		System.out.println(this.getDerrotas() + " derrotas e " + this.getEmpates() + " empate.");
	}
	public void status() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nascionalidade: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() - 1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
}// fim da classe
