package aula07;

public class Formas {
	
	protected double base;
	protected double altura;
	
	public Formas() {
		
	}

	public Formas(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void mostrarDados() {
		System.out.println("* * Relatório: * *");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("*=================*");
	}
	
}
