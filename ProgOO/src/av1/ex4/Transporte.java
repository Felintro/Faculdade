package av1.ex4;

public class Transporte {
	
	private String nome;
	private double salario;
	
	/* Construtores */
	
	public Transporte() {
	
	}

	public Transporte(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	/* Setters e Getters */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalarioMensal(double salario) {
		this.salario = salario;
	}
	
	/* Métodos da classe */
	
	public double calcValeTransporte ( ) {
		return this.salario * 0.06;
	}
	
	public double calcUber (double distancia) {
		return distancia * 20 * 1.5;
	}
	
}