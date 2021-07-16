package prova2bimestre.ex4.classes;

public class Maquiagem extends Produto {

	/* Atributos */

	private double pesoGramas;
	private String tonalidade;

	/* Construtor */

	public Maquiagem(String marca, double valor, String tonalidade, double pesoGramas) {
		super(marca, valor);
		this.tonalidade = tonalidade;
		this.pesoGramas = pesoGramas;
	}
	
	public Maquiagem() {
		
	}

	/* Gets e Sets */

	public double getPesoGramas() {
		return pesoGramas;
	}

	public void setPesoGramas(double pesoGramas) {
		this.pesoGramas = pesoGramas;
	}

	public String getTonalidade() {
		return tonalidade;
	}

	public void setTonalidade(String tonalidade) {
		this.tonalidade = tonalidade;
	}

	/* Implementação dos métodos */

	@Override
	public double calcValorVenda() {
		return this.valor * 0.85;
	}

	@Override
	public String toString() {
		return super.toString() + "Peso: " + this.pesoGramas + "\nTonalidade: " + this.tonalidade + "\nValor de venda: R$";
	}

}
