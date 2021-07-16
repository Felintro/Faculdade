package prova2bimestre.ex1;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bem vindo a Panificadora A Predileta!");
		double venda[] = new double[7];
		String dia = "";

		for(int i = 0; i <= 6; i++) {
			
			switch(i) {
			
				case 0: 
					dia = "Domingo";
					break;
					
				case 1: 
					dia = "Segunda-Feira";
					break;
					
				case 2: 
					dia = "Terça-Feira";
					break;
					
				case 3: 
					dia = "Quarta-Feira";
					break;
					
				case 4:
					dia = "Quinta-Feira";
					break;
					
				case 5:
					dia = "Sexta-Feira";
					break;
					
				case 6:
					dia = "Sábado";
					break;
					
				default: System.out.println("Erro!");
			}
			
			venda[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a venda de " + dia));
			
		}
		
		DiaSemana d = new DiaSemana(venda);
		JOptionPane.showMessageDialog(null, d);
	
	}

}
