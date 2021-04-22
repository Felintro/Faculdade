package prova.fatura;

public class Cliente {
	
	private String nome;
	private double valorFatura;
	
	/* Construtores: */
	
	public Cliente() {
	
	}
	
	public Cliente(String nome, double valorFatura) {
		this.nome = nome;
		this.valorFatura = valorFatura;
	}
	
	/* Getters e Setters */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorFatura() {
		return valorFatura;
	}
	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}
	
	/* Métodos da classe: */
	
	public double calcValor(int tipoPagamento) {
		
		if(tipoPagamento == 1)
			return valorFatura * 0.93;
		
		else if(tipoPagamento == 2) 
			return valorFatura * 1.125;
		
		else {
			System.out.println("Selecionar 1 ou 2");
			return 0;
			
		}
		
	}
	
	public void relatorio(int tipoPagamento) {
		
		System.out.println("........Relatório Geral........");
		System.out.println("Nome do cliente: " + this.getNome());
		System.out.println("Valor da fatura: " + this.getValorFatura());
		System.out.println("Valor a pagar: " + this.calcValor(tipoPagamento));
		
		if(tipoPagamento == 1) System.out.println("Pagamento adiantado!");
		
			else if (tipoPagamento == 2) System.out.println("Pagamento efetuado em atraso!");
		
				else System.out.println("Erro!\n\nSelecione o tipo corretamente!");
		
		System.out.println("........Fim do relatório........");
	}
	
}