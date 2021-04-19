package exprova.classes;

public final class Terceiro extends Colaborador {
	
	/* Atributos */
	
	private String inscrEstadual;
	private double horasTrabalhadas;
	
	/* Métodos Setters & Getters */
	
	public String getInscrEstadual() {
		return inscrEstadual;
	}

	public void setInscrEstadual(String inscrEstadual) {
		this.inscrEstadual = inscrEstadual;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	/* Construtores */

	public Terceiro(String empresa, String cnpj, String endComercial, String nomeColaborador, String inscrEstadual,
			double horasTrabalhadas) {
		super(empresa, cnpj, endComercial, nomeColaborador);
		this.inscrEstadual = inscrEstadual;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public Terceiro() {
		super();
	}

	/* Métodos da classe */
	@Override
	public final double calcSalario(double salarioMinimo) {
		double salario = (horasTrabalhadas*salarioMinimo) / 10 ;
		return salario;
	}
	
	@Override
	public void relatorio() {
		
		super.relatorio();
		System.out.println("Tipo: Terceiro");
		System.out.println("Inscrição Estadual: " + inscrEstadual);
		System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
		
	}
	
}
