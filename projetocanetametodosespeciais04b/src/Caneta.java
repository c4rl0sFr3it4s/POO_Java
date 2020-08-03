
public class Caneta {
	
	private String modelo;
	private float ponta;
	
	public Caneta(String modelo, float ponta) {
		this.setModelo(modelo);
		this.setPonta(ponta);
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
	}
}
