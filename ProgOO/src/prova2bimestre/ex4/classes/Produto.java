package prova2bimestre.ex4.classes;

public class Produto {
	
	/* Atributos */
	
	protected String marca;
	protected double valor;
	
	/* Construtor */
	
	public Produto(String marca, double valor) {
		this.marca = marca;
		this.valor = valor;
	}
	
	public Produto() {
		
	}
	
	/* Gets e Sets */
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/* Métodos */

	@Override
	public String toString() {
		
		return "=====================\nMarca: " + this.marca + "Valor: " + this.valor + "\n";
		
	}
	
	public double calcValorVenda() {
		
		return this.valor;
		
	}
	
	
}
