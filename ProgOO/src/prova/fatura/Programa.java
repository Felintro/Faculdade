package prova.fatura;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Bem-vindo ao SYSCOM!");
		System.out.println("Aguarde enquanto o sistema inicia...");
		
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(".");
			
		}
		
		System.out.println("Sistema Iniciado!\n");
		
		int escolha = 1;
		
		do {
		
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Insira os dados conforme abaixo:");
			
			System.out.println("Nome do cliente:");
			String nomeCliente = leitor.nextLine();
			
			System.out.println("Insira o valor da fatura:");
			double valorFatura = leitor.nextDouble();
			leitor.nextLine();
			
			System.out.println("Selecione o tipo do pagamento:\n1 - Pagamento Adiantado\n2 - Pagamento em atraso");
			int tipoPagamento = leitor.nextInt();
			leitor.nextLine();
			
			Cliente cliente = new Cliente(nomeCliente, valorFatura);
			
			cliente.relatorio(tipoPagamento);
			
			System.out.println("\nDeseja efetuar nova cobrança ?\n1 - Sim\n2 - Não");
			
			escolha = leitor.nextInt();
			leitor.nextLine();
			
		} while (escolha == 1);
		
		System.out.println("Sistema encerrado!");
		
	}

}