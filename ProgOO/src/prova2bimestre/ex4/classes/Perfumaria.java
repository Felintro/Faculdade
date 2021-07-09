package prova2bimestre.ex4.classes;

public class Perfumaria extends Produto {

	/* Atributos */

	private double pesoMl;
	private String essencia;

	/* Construtor */

	public Perfumaria(String marca, double valor, double pesoMl, String essencia) {
		super(marca, valor);
		this.pesoMl = pesoMl;
		this.essencia = essencia;
	}

	public Perfumaria() {

	}

	/* Gets e Sets */

	public double getPesoMl() {
		return pesoMl;
	}

	public void setPesoMl(double pesoMl) {
		this.pesoMl = pesoMl;
	}

	public String getEssencia() {
		return essencia;
	}

	public void setEssencia(String essencia) {
		this.essencia = essencia;
	}

	/* Implementação dos Métodos */

	@Override
	public double calcValorVenda() {
		return this.valor * 0.9;
	}

	@Override
	public String toString() {
		return super.toString() + "Volume: " + this.pesoMl + "\nEssência: " + this.essencia + "\nValor de venda: R$";
	}

}
