package Aula03;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	
	}
	
	public double calcularMedia(double nota1, double nota2) {
		return (this.nota1 + this.nota2) / 2;
	}
	
	public void relatorio() {
		
		System.out.println(
				"Nome: " + this.nome + "\nNota 1: " + this.nota1 + "\nNota 2: " + this.nota2 + "\nMédia: " + calcularMedia(this.nota1, this.nota2)
		);
	}
	

}