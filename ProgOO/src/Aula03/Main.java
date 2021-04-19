package Aula03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o nome:");
		String nome = leitor.nextLine();
		
		System.out.println("Insira a nota 1:");
		double nota1 = leitor.nextDouble();
		
		System.out.println("Insira o nota 2:");
		double nota2 = leitor.nextDouble();
		
		Aluno aluno = new Aluno(nome, nota1, nota2);
		
		aluno.relatorio();
	}
	
}