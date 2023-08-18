package loja.model;

public class Regata extends ProdutosModel{

	private String cor;
	private String decote;
	public Regata(int tamanho, String modelo, String descricao, double preco, int estoque, String cor, String decote) {
		super(tamanho, modelo, estoque, descricao, preco, estoque);
		this.cor = cor;
		this.decote = decote;
		
		// TODO Auto-generated constructor stub
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getDecote() {
		return decote;
	}
	public void setDecote(String decote) {
		this.decote = decote;
	}
	
	public void visualizar() {
		super.visualizar(); //chama o metodo da classe produtosmodel
		
		System.out.println("Cor da regata: "+this.cor);
		System.out.println("Decote da regata: "+this.decote);
	}
}
