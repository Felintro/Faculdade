package av1.ex4;

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
		
		System.out.println("Insira o salário mínimo atual (em R$):");
		double salarioMinimo = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Insira a distância de seu trajeto (em km):");
		double distancia = scan.nextDouble();
		scan.nextLine();
		
		double salario = salarioMinimo * 3.5;
		
		Transporte transporte = new Transporte(nome, salario);
		
		System.out.println("Calculos em andamento!\nPor favor Aguarde...");
		
		for(int i=1; i<=5; i++) {
			
			System.out.println(i);
		
			try {
				Thread.sleep(1000); /* capricho */
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
		double valorUber = transporte.calcUber(distancia);
		double valorValeTransporte = transporte.calcValeTransporte();
		
		System.out.println("\n");
		System.out.println("...................................\n");
		System.out.println("Prezado " + transporte.getNome() + ",\n"
				+ "Seu salário é: R$" + transporte.getSalario() +
				"\nA distância do seu trajeto é: " + distancia + "km");
		
		System.out.println("\nResultado:\n");
		System.out.println("Valor Mensal do Uber: R$" + valorUber);
		System.out.println("Valor Mensal do Vale Transporte: R$" + valorValeTransporte);
		
		if (valorUber == valorValeTransporte) {
			
			System.out.println("Neste caso, os valores do Uber e Vale Tranporte são iguais!\n"
					+ "Portanto, não há vantagens em relação ao preço!\n"
					+ "Contudo, recomendamos ir de Uber por conta do conforto oferecido pelos carros!");
			
		} else if (valorValeTransporte < valorUber) {
			
			System.out.println("Neste caso, é mais vantajoso ir de ônibus!");
			
		} else System.out.println("Neste caso, é mais vantajoso ir de Uber!");
		
		System.out.println("\n...................................");

		scan.close();
	}

}