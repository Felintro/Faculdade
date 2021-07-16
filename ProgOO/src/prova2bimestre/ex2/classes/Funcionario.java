package prova2bimestre.ex2.classes;

public class Funcionario {

	/* Atributos */

	private String nome;
	private Categoria categoria;
	private int tempoDeCasa;
	private double venda;

	/* Construtores */

	public Funcionario(String nome, int tempoDeCasa, double venda) {
		this.nome = nome;
		this.tempoDeCasa = tempoDeCasa;
		this.venda = venda;
		setCategoria();
	}

	/* Métodos */

	public void setCategoria() {

		if (this.tempoDeCasa <= 5) {
			this.categoria = Categoria.BRONZE;
		} else if (this.tempoDeCasa <= 10) {
			this.categoria = Categoria.PRATA;
		} else
			this.categoria = Categoria.OURO;

	}

	public double comissao() {

		if (this.categoria == Categoria.BRONZE) {

			return this.venda * 0.02;

		} else if (this.categoria == Categoria.PRATA) {

			return this.venda * 0.05;

		} else
			return this.venda * 0.07;

	}

	public double pagamento() {

		return (1500 + this.comissao());

	}

	@Override
	public String toString() {
		return "=====================" + "\nNome: " + this.nome + "\nCategoria: " + this.categoria + "\nTempo de casa: "
				+ this.tempoDeCasa + " Anos" + "\nVenda: R$" + this.venda + "\nComissão: R$" + this.comissao()
				+ "\nSalário: R$" + this.pagamento() + "\n=====================";
	}

}
