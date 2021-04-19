package exprova.classes;

public final class Estagiario extends Colaborador {
	
	/* Atributos */
	
	private int cadCEEI;
	
	/* M�todos Setters & Getters */
	
	public int getCadCEEI() {
		return cadCEEI;
	}

	public void setCadCEEI(int cadCEEI) {
		this.cadCEEI = cadCEEI;
	}
	
	/* Construtores */

	public Estagiario(String empresa, String cnpj, String endComercial, String nomeColaborador, int cadCEEI) {
		super(empresa, cnpj, endComercial, nomeColaborador);
		this.cadCEEI = cadCEEI;
	}
	
	public Estagiario() {
		super();
	}

	/* M�todos da classe */
	@Override
	public final double calcSalario(double salarioMinimo) {
		double salario = (2 * salarioMinimo) / 3;
		return salario;
	}
	
	@Override
	public void relatorio() {
		
		super.relatorio();
		System.out.println("Tipo: Estagi�rio");
		System.out.println("Cadastro do CEEI: " + cadCEEI);

	}

}