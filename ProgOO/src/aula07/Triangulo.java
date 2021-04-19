package aula07;

public class Triangulo extends Formas {
	
	/* Atributos */
	
	private String tipoTriangulo;
	
	/* Construtores */

	public Triangulo(double base, double altura, String tipoTriangulo) {
		super(base, altura);
		this.tipoTriangulo = tipoTriangulo;
	}
	
	public Triangulo() {
		super();
	}

	/* Getters e Setters */

	public String getTipoTriangulo() {
		return tipoTriangulo;
	}


	public void setTipoTriangulo(String tipoTriangulo) {
		this.tipoTriangulo = tipoTriangulo;
	}
	
	/* M�todos */
	
	public double calculoArea() {
		
		return (base * altura) / 2;
		
	}

}
