package exprova.classes;

public final class Funcionario extends Colaborador {
	
	/* Atributos */
	
	private int cpf;
	private String endResidencial;
	private int numDependentes;
	private double tempoServico;
	
	/* Métodos Setters & Getters */
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEndResidencial() {
		return endResidencial;
	}

	public void setEndResidencial(String endResidencial) {
		this.endResidencial = endResidencial;
	}

	public int getNumDependentes() {
		return numDependentes;
	}

	public void setNumDependentes(int numDependente) {
		this.numDependentes = numDependente;
	}

	public double getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(double tempoServico) {
		this.tempoServico = tempoServico;
	}
	
	/* Construtores */
	
	public Funcionario(String empresa, String cnpj, String endComercial, String nomeColaborador, int cpf,
			String endResidencial, int numDependente, double tempoServico) {
		super(empresa, cnpj, endComercial, nomeColaborador);
		this.cpf = cpf;
		this.endResidencial = endResidencial;
		this.numDependentes = numDependente;
		this.tempoServico = tempoServico;
	}

	public Funcionario() {

	}
	
	/* Métodos da classe */ 
	
	@Override
	public double calcSalario(double salarioMinimo) {
		double salario = salarioMinimo * (tempoServico + numDependentes/5);
		return salario;
	}
	
	@Override
	public void relatorio() {
		
		super.relatorio();
		System.out.println("Tipo: Funcionário");
		System.out.println("CPF: " + cpf);
		System.out.println("Endereço Residencial: " + endResidencial);
		System.out.println("Número de dependentes: " + numDependentes);
		System.out.println("Tempo de serviço: " + tempoServico);
		
	}
	
}