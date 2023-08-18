package loja.model;

public class Blazer extends ProdutosModel {
	private String cor;
	private String estilo;
	public Blazer(int tamanho, String modelo, String descricao, double preco, int estoque, String cor, String estilo) {
		super(tamanho, modelo, estoque, descricao, preco, estoque);
		this.cor = cor;
		this.estilo = estilo;
		
		// TODO Auto-generated constructor stub
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	public void visualizar() {
		super.visualizar(); //chama o metodo da classe produtosmodel
		
		System.out.println("Cor do blazer: "+this.cor);
		System.out.println("Estilo do blazer : "+this.estilo);
	}

}
