package av1.ex3;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao SYSCOM!");
		System.out.println("Aguarde enquanto o sistema inicia...");
		System.out.println("\n");
		System.out.println("Sistema Iniciado!\n");
		
		System.out.println("Insira o seu ID:");
		int id = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Insira seu nome:");
		String nome = scan.nextLine();
		
		System.out.println("Insira seu CPF:");
		String cpf = scan.nextLine();
		
		Funcionario f1 = new Funcionario();
		
		System.out.println("Insira o tipo:\n1 - Gerente\n2 - Colaborador");
		int tipo = scan.nextInt();
		scan.nextLine();
		
		if(tipo == 1) { /* Gerente */
			
			System.out.println("Insira seu departamento:");
			String dpto = scan.nextLine();
			
			f1 = new Gerente(id, nome, cpf, dpto);
			
			
		} else if(tipo == 2) { /* Colaborador */
			
			System.out.println("Insira seu estado civil:");
			String estadoCivil = scan.nextLine();
			
			f1 = new Colaborador(id, nome, cpf, estadoCivil);
			
			
		} else System.out.println("Erro, o sistema será encerrado...");
		
		System.out.println("Insira o valor da sua compra:");
		double valorCompra = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("\n");
		System.out.println("Prezado " + f1.getNome() + ",\n");
		System.out.println("Segue abaixo seus dados:");
		System.out.println("ID: " + f1.getId());
		System.out.println("Nome: " + f1.getNome());
		System.out.println("CPF: " + f1.getCpf());
		System.out.println("Seu " + f1.mostraAtributo() + f1.mostraParametro());
		
		System.out.println("\n...................................\n");
		System.out.println("            Venda:\n");
		System.out.println("Valor da compra: " + valorCompra);
		System.out.println("Total: " + f1.calcularDesconto(valorCompra));
		System.out.println("\n...................................\n");
		
		
	}
	
}