package ex1prova.classes;

public class Calculo {
	
	private double salario;
	private double imposto;

	/* Construtor */
	
	public Calculo(double salario) {
		this.salario = salario;
		calcularImposto();
	}
	
	/* Método */
	
	public void calcularImposto() {
		
		if(salario <= 1900) {
			imposto = 0;
		} else if (salario >= 1900.01 && salario <= 2800.65) {
			imposto = salario * 0.075 + 142.8;
		} else if (salario >= 2800.66 && salario <= 3750) {
			imposto = salario * 0.15 + 354.8;
		} else if (salario >= 3750.01 && salario <= 4500.68) {
			imposto = salario * 0.225 + 636.13;
		} else imposto = salario * 0.275 + 869.36;
	
	}
	
	/* Gets e sets */

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
}
