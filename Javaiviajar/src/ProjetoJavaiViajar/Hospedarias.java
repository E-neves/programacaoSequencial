package ProjetoJavaiViajar;

public class Hospedarias {

	private String nome;
	private double preco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public Hospedarias(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	
	@Override
	public String toString() {
		return "Compras [nome da pousada: " + nome + ", preço da diária: R$" + preco + "]";
	}
	
	
	
	
}
