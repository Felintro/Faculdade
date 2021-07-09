package ex1prova.classes;

public class ConverterMoeda {
	
	private double valorReal;
	private double valorDolar;
	private double valorEuro;
	
	/* Construtor */
	
	public ConverterMoeda(double vlReal) {
		this.valorReal = vlReal;
		this.valorDolar = vlReal * 5.01;
		this.valorEuro = vlReal * 5.97;
	}
	
	/* Métodos Getters */
	
	public double getValorReal() {
		return valorReal;
	}
	
	public double getValorDolar() {
		return valorDolar;
	}
	
	public double getValorEuro() {
		return valorEuro;
	}
	
}
