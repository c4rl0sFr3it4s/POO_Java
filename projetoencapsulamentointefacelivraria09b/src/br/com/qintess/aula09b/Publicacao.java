package br.com.qintess.aula09b;

public interface Publicacao {
// métodos abstratos
	public abstract void abrir();
	public abstract void fechar();
	public abstract void folhear(int p); // passagem de parâmentro
	public abstract void avancarPag();
	public abstract void voltarPag();
}
