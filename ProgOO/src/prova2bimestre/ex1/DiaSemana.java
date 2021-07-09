package prova2bimestre.ex1;

public class DiaSemana {

	private String diaMenorVenda;
	private double venda[] = new double[7];
	private int diaIndex;

	public DiaSemana(double[] venda) {
		this.venda = venda;
		setDiaMenorVenda(venda);
	}

	public String getDiaMenorVenda() {
		return diaMenorVenda;
	}

	public double getVenda(int i) {
		return venda[i];
	}

	public void setDiaMenorVenda(double venda[]) {

		double menor = venda[0];

		for (int i = 0; i <= 6; i++) {

			if (venda[i] < menor) {

				menor = venda[i];

				switch (i) {
					case 0:
						diaMenorVenda = "Domingo";
						diaIndex = 0;
						break;
	
					case 1:
						diaMenorVenda = "Segunda-Feira";
						diaIndex = 1;
						break;
	
					case 2:
						diaMenorVenda = "Terça-Feira";
						diaIndex = 2;
						break;
	
					case 3:
						diaMenorVenda = "Quarta-Feira";
						diaIndex = 3;
						break;
	
					case 4:
						diaMenorVenda = "Quinta-Feira";
						diaIndex = 4;
						break;
	
					case 5:
						diaMenorVenda = "Sexta-Feira";
						diaIndex = 5;
						break;
	
					case 6:
						diaMenorVenda = "Sábado";
						diaIndex = 6;
						break;
	
					default:
						System.out.println("Erro!");
				}

			}

		}

	}

	@Override
	public String toString() {
		return "=====================" + "\nDia de menor venda: " + diaMenorVenda + "\nValor vendido: R$"
				+ venda[diaIndex] + "\n=====================";
	}

}
