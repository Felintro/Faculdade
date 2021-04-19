package exprova.programa;

import java.util.Scanner;

import exprova.classes.Colaborador;
import exprova.classes.Estagiario;
import exprova.classes.Funcionario;
import exprova.classes.Terceiro;

public final class Empresa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao SYSCOM!");
		System.out.println("Aguarde enquanto o sistema inicia...");
		System.out.println("\n");
		System.out.println("Sistema Iniciado!\n");
		
		System.out.println("Insira o nome da empresa:\n");
		String empresa = leitor.nextLine();

		System.out.println("Insira o salário mínimo:\n");
		double salarioMinimo = leitor.nextDouble();
		
		System.out.println("Insira o número do cnpj:\n");
		String cnpj = leitor.nextLine();
		
		System.out.println("Selecione o tipo do colaborador:\n");
		System.out.println("1 - Funcionário");
		System.out.println("2 - Estagiário");
		System.out.println("3 - Terceiro\n\n");
		int tipo = leitor.nextInt();
		
		System.out.println("Insira o endereço comercial:\n");
		String endComercial = leitor.nextLine();
		
		System.out.println("Insira o nome do colaborador:\n");
		String nomeColaborador = leitor.nextLine();
		
		
		Colaborador c1 = new Colaborador();
		
		if(tipo == 1) {
			
			System.out.println("Insira o CPF:\n");
			int cpf = leitor.nextInt();
			
			System.out.println("Insira o endereço residencial:\n");
			String endResidencial = leitor.nextLine();
			
			System.out.println("Insira o número de dependentes:\n");
			int numDependentes = leitor.nextInt();
			
			System.out.println("Insira o tempo de serviço (em anos):\n");
			double tempoServico = leitor.nextDouble();
			
			c1 = new Funcionario(empresa, cnpj, endComercial, nomeColaborador, cpf, 
					endResidencial, numDependentes, tempoServico);
			
		} else 
			
			if (tipo == 2) {
			
				System.out.println("Insira seu número de cadastro do CEEI:\n");
				int cadCEEI = leitor.nextInt();
				
				c1 = new Estagiario(empresa, cnpj, endComercial, nomeColaborador, cadCEEI);
				
			} else 
				
				if (tipo == 3) {
					
					System.out.println("Insira quantas horas foram trabalhadas:\n");
					double horasTrabalhadas = leitor.nextDouble();
					
					System.out.println("Insira a inscrição estadual:\n");
					String inscrEstadual = leitor.nextLine();
					
					c1 = new Terceiro(empresa, cnpj, endComercial, nomeColaborador, inscrEstadual, horasTrabalhadas);
				
				} else { 
					
					System.out.println("Erro!\n\n");
					System.out.println("O sistema será encerrado!");

				}
		
		c1.relatorio();
		System.out.println("Salário: " + c1.calcSalario(salarioMinimo));
		System.out.println("........Fim Relatório Geral........");
		
	}

}