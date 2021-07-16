package prova2bimestre.ex2.programa;

import javax.swing.JOptionPane;

import prova2bimestre.ex2.classes.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bem vindo a WEG!");
		
		String nome = JOptionPane.showInputDialog("Insira o nome do vendedor:");
		int tempoDeCasa = Integer.parseInt(JOptionPane.showInputDialog("Quanto tempo ele tem de casa?"));
		double venda = Double.parseDouble(JOptionPane.showInputDialog("Quanto ele vendeu esse mês?"));
		
		Funcionario f = new Funcionario(nome, tempoDeCasa, venda);
		
		JOptionPane.showMessageDialog(null, f);
		
		
	}

}
