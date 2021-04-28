package av1.ex3;

public final class Colaborador extends Funcionario {
	
	private String estadoCivil;
	
	/* Construtores */

	public Colaborador() {
		super();
	}

	public Colaborador(int id, String nome, String cpf, String estadoCivil) {
		super(id, nome, cpf);
		this.estadoCivil = estadoCivil;
	}
	
	/* Getters e Setters */

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	/* Métodos da superclasse */

	@Override
	public double calcularDesconto(double valorCompra) {
		
		return valorCompra * 0.93;
		
	}
	
	@Override
	public String mostraParametro() {
		return estadoCivil;
	}
	
	@Override
	public String mostraAtributo() {
		return "Estado Civil: ";
	}
	
	
}
