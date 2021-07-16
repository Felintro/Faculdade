package prova2bimestre.ex3.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import prova2bimestre.ex3.classes.Calculo;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Tela implements ActionListener {

	private JFrame tela;
	private JTextField jSalario;
	private JButton btCalcular;
	private JLabel titulo;
	private JLabel lbTexto1;
	private JLabel lbImposto;
	private JLabel lbTexto2;

	public Tela() {
			
		tela = new JFrame();
		tela.setBounds(100, 100, 300, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.getContentPane().setLayout(null);
		
		titulo = new JLabel("Felintro Contadores Associados");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		titulo.setBounds(10, 11, 264, 36);
		tela.getContentPane().add(titulo);
		
		jSalario = new JTextField();
		jSalario.setHorizontalAlignment(SwingConstants.CENTER);
		jSalario.setText("");
		jSalario.setBounds(10, 104, 264, 20);
		tela.getContentPane().add(jSalario);
		jSalario.setColumns(10);
		
		
		btCalcular = new JButton("Calcular");
		btCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btCalcular.addActionListener(this);
		btCalcular.setBounds(79, 164, 132, 23);
		tela.getContentPane().add(btCalcular);
		
		lbTexto1 = new JLabel("Imposto devido:");
		lbTexto1.setBounds(10, 217, 122, 14);
		tela.getContentPane().add(lbTexto1);
		
		lbImposto = new JLabel("");
		lbImposto.setBounds(142, 217, 132, 14);
		tela.getContentPane().add(lbImposto);
		
		lbTexto2 = new JLabel("Insira seu sal\u00E1rio aqui:");
		lbTexto2.setHorizontalAlignment(SwingConstants.CENTER);
		lbTexto2.setBounds(10, 85, 264, 14);
		tela.getContentPane().add(lbTexto2);
		
		tela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		double salario = Double.parseDouble(jSalario.getText());
		
		if(e.getSource() == btCalcular) {
			
			Calculo c = new Calculo(salario);
			
			String format = String.format("%.2f", c.getImposto());
			
			lbImposto.setText("R$" + format);
			
		}
		
	}
}