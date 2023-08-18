package loja.model;

public class Camiseta extends ProdutosModel {
	
	private String cor;
	private String estampa;
	
	public Camiseta(int id, String tamanho, int modelo, String descricao, double preco, int estoque, String cor,
			String estampa) {
		super(id, tamanho, modelo, descricao, preco, estoque);
		this.cor = cor;
		this.estampa = estampa;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getEstampa() {
		return estampa;
	}



	public void setEstampa(String estampa) {
		this.estampa = estampa;
	}



	

	
	
	@Override
	public void visualizar() { //chama o metodo da classe produtosmodel
		super.visualizar();
		
		System.out.println("Cor da camiseta: "+this.cor);
		System.out.println("Estampa da camiseta: "+this.estampa);
	}

}
