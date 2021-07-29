package av1.ex2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao SYSCOM!");
		System.out.println("Aguarde enquanto o sistema inicia...");
		System.out.println("\n");
		System.out.println("Sistema Iniciado!\n");
		
		System.out.println("Insira o seu nome:\n");
		String nome = scan.nextLine();
		
		System.out.println("Insira o tipo de peixe:");
		System.out.println("1 - Carpa;");
		System.out.println("2 - Tilápia;");
		System.out.println("3 - Bagre");
		int especie = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Insira a quantidade pescada (em kg):");
		double qtdePesca = scan.nextDouble();
		scan.nextLine();
		
		Pesca pesca = new Pesca(nome, qtdePesca);
		
		System.out.println("\n");
		System.out.println("Prezado " + pesca.getNome() + ",\n");
		System.out.println("Segue abaixo sua nota fiscal:"); /* Capricho */
		
		System.out.println("\n...................................\n");
		System.out.println("            Nota Fiscal\n");
		System.out.println("Tipo...............Preço");
		System.out.println(".                  .");
		
		switch (especie) {
		
		case 1: System.out.println("Carpa..............R$30.00");
				break;
				
		case 2: System.out.println("Tilápia............R$43.00");
				break;
			
		case 3: System.out.println("Bagre..............R$25.00");
				break;
				
		}
		
		System.out.println("\nQuantidade: " + pesca.getQtdePesca() + " kg");
		System.out.println("Valor total: R$" + pesca.calcValorTotal(especie));
		System.out.println("\n...................................\n");
		
		scan.close();
	}

}