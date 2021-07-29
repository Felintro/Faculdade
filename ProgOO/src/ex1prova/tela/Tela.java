package ex1prova.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Tela implements ActionListener {

	private JFrame tela;
	private JTextField salario;
	private JButton btCalcular;
	private JLabel titulo;
	private JLabel lblTexto;
	private JLabel lbImposto;
	private JLabel lbTexto;

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
		
		salario = new JTextField();
		salario.setHorizontalAlignment(SwingConstants.CENTER);
		salario.setText("");
		salario.setBounds(10, 104, 264, 20);
		tela.getContentPane().add(salario);
		salario.setColumns(10);
		
		
		btCalcular = new JButton("Calcular");
		btCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btCalcular.addActionListener(this);
		btCalcular.setBounds(79, 164, 132, 23);
		tela.getContentPane().add(btCalcular);
		
		lblTexto = new JLabel("Imposto devido:");
		lblTexto.setBounds(10, 217, 122, 14);
		tela.getContentPane().add(lblTexto);
		
		lbImposto = new JLabel("");
		lbImposto.setBounds(142, 217, 132, 14);
		tela.getContentPane().add(lbImposto);
		
		lbTexto = new JLabel("Insira seu salário aqui:");
		lbTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lbTexto.setBounds(10, 85, 264, 14);
		tela.getContentPane().add(lbTexto);
		
		tela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}