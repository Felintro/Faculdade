package av1.ex3;

public final class Gerente extends Funcionario {
	
	private String dpto;
	
	/* Construtores */
	
	public Gerente() {
		super();
	}

	public Gerente(int id, String nome, String cpf, String dpto) {
		super(id, nome, cpf);
		this.dpto = dpto;
	}
	
	/* Getters e Setters */

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}
	
	/* Métodos da superclasse */
	
	@Override
	public double calcularDesconto(double valorCompra) {
		return valorCompra * 0.9;
	}
	
	@Override
	public String mostraParametro() {
		return dpto;
	}
	
	@Override
	public String mostraAtributo() {
		return "Departamento: ";
	}

}
