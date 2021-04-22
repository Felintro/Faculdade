package exprova.classes;

public class Colaborador {
	
	/* Atributos */
	
	private String empresa;
	private String cnpj;
	private String endComercial;
	private String nomeColaborador;
	
	/* Construtores */
	
	public Colaborador(String empresa, String cnpj, String endComercial, String nomeColaborador) {
		this.empresa = empresa;
		this.cnpj = cnpj;
		this.endComercial = endComercial;
		this.nomeColaborador = nomeColaborador;
	}
	
	public Colaborador() {
		
	}
	
	/* M�todos Setters & Getters */
	
	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndComercial() {
		return endComercial;
	}
	
	public void setEndComercial(String endComercial) {
		this.endComercial = endComercial;
	}
	
	public String getNomeColaborador() {
		return nomeColaborador;
	}
	
	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}
	
	/* M�todos da classe */ 
	
	public double calcSalario(double salarioMinimo) {
		return salarioMinimo;
	}
	
	public void relatorio() {

		System.out.println("........Relat�rio Geral........");
		System.out.println("Empresa: " + empresa);
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Endere�o Comercial: " + endComercial);
		System.out.println("Nome do colaborador: " + nomeColaborador);

	}

}
