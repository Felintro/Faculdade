package av1.ex2;

public class Pesca {
	
	private String nome;
	private double qtdePesca;
	
	/* Construtores */
	
	public Pesca() {
			
	}
	
	public Pesca(String nome, double qtdePesca) {
		this.nome = nome;
		this.qtdePesca = qtdePesca;
	}
	
	/* Setters e Getters */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getQtdePesca() {
		return qtdePesca;
	}
	public void setQtdePesca(double qtdePesca) {
		this.qtdePesca = qtdePesca;
	}
	
	/* Métodos da classe */

	public double calcValorTotal(int especie) {
		
		double precoKg=0;
		
		switch (especie) {
		
			case 1: /* Carpa */
					precoKg = 30;
					break;
					
			case 2: /* Tilápia */
					precoKg = 43;
					break;
				
			case 3: /* Bagre */
					precoKg = 25;
					break;
	
			default:
					System.out.println("Erro!");
					break;
		}
		
		double valorTotal = precoKg * this.qtdePesca;
		
		double acrescimo;
		
		if(this.qtdePesca <= 5) {
			
			acrescimo = 1.02;
			
		} else if(this.qtdePesca <= 10) {
			
			acrescimo = 1.05;
			
		} else acrescimo = 1.07;
		
		valorTotal *= acrescimo;
				
		return valorTotal;
		
	}
	
}