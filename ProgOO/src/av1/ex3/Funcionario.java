package av1.ex3;

public class Funcionario {
	
	private int id;
	private String nome;
	private String cpf;
	
	/* Construtores */
	
	public Funcionario() {
		
	}
	
	public Funcionario(int id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	/* Getters e Setters */

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double calcularDesconto(double valorCompra) {
		return valorCompra;
	}
	
	public String mostraParametro() {
		return "";
	}
	
	public String mostraAtributo() {
		return "";
	}

}