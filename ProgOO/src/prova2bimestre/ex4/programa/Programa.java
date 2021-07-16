package prova2bimestre.ex4.programa;

import javax.swing.JOptionPane;

import prova2bimestre.ex4.classes.Maquiagem;
import prova2bimestre.ex4.classes.Perfumaria;
import prova2bimestre.ex4.classes.Produto;

public class Programa {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "KdaVez+Bela");
		JOptionPane.showMessageDialog(null, "Uma ótima oferta a 1 clique de distância!");
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de produto:\n1 - Perfumaria\n2 - Maquiagem"));
		
		String marca = JOptionPane.showInputDialog("Insira a marca do produto:");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto:"));
		
		Produto produto = new Produto();
		
		if (escolha == 1) {
			
			JOptionPane.showMessageDialog(null, "Escolha: Perfume");
			
			double pesoMl = Double.parseDouble(JOptionPane.showInputDialog("Insira o volume em MLs do produto:"));
			String essencia = JOptionPane.showInputDialog("Insira a essência do produto:");
			
			produto = new Perfumaria(marca, valor, pesoMl, essencia);
			
		} else if (escolha == 2) {
			
			JOptionPane.showMessageDialog(null, "Escolha: Maquiagem");
			
			double pesoGramas = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso em gramas do produto:"));
			String tonalidade = JOptionPane.showInputDialog("Insira a tonalidade do produto:");
			
			produto = new Maquiagem(marca, valor, tonalidade, pesoGramas);
		}
		
		String valorFormatado = String.format("%.2f", produto.calcValorVenda());
		
		JOptionPane.showMessageDialog(null, produto.toString() + valorFormatado + "\n=====================");
		

	}

}
