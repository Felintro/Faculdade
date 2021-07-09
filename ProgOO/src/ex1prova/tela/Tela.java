package ex1prova.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import ex1prova.classes.ConverterMoeda;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Tela implements ActionListener {

	private JFrame tela;
	private JTextField vlReal;
	private JButton btEuro;
	private JButton btDolar;
	private JLabel titulo;
	private JLabel lblTexto;
	private JLabel lblVlConvertido;
	private JLabel lblNewLabel;

	public Tela() {
		
		tela = new JFrame();
		tela.setBounds(100, 100, 300, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.getContentPane().setLayout(null);
		
		titulo = new JLabel("Money Facility S/A");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		titulo.setBounds(10, 11, 264, 36);
		tela.getContentPane().add(titulo);
		
		vlReal = new JTextField();
		vlReal.setHorizontalAlignment(SwingConstants.CENTER);
		vlReal.setText("");
		vlReal.setBounds(10, 104, 264, 20);
		tela.getContentPane().add(vlReal);
		vlReal.setColumns(10);
		
		
		btDolar = new JButton("Conversão Dólar");
		btDolar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btDolar.addActionListener(this);
		btDolar.setBounds(142, 162, 132, 23);
		tela.getContentPane().add(btDolar);
		
		
		btEuro = new JButton("Conversão Euro");
		btEuro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btEuro.addActionListener(this);
		btEuro.setBounds(10, 162, 132, 23);
		tela.getContentPane().add(btEuro);
		
		lblTexto = new JLabel("Valor convertido:");
		lblTexto.setBounds(10, 217, 122, 14);
		tela.getContentPane().add(lblTexto);
		
		lblVlConvertido = new JLabel("");
		lblVlConvertido.setBounds(142, 217, 132, 14);
		tela.getContentPane().add(lblVlConvertido);
		
		lblNewLabel = new JLabel("Insira o valor em real aqui:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 85, 264, 14);
		tela.getContentPane().add(lblNewLabel);
		
		tela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		double valorConverter = Double.parseDouble(vlReal.getText());
		ConverterMoeda converter = new ConverterMoeda(valorConverter);
		String formatada;
		
		if(e.getSource() == btEuro) {
			
			formatada = String.format("%.2f", converter.getValorEuro());
			lblVlConvertido.setText("€" + formatada);
			
		} 
		
		else if (e.getSource() == btDolar) {
			formatada = String.format("%.2f", converter.getValorDolar());
			lblVlConvertido.setText("US$" + formatada);
			
		}
	}
}