package loja.model;

public class Blusao extends ProdutosModel{
	
	private String material;
	private String estilo;
	
	
    public Blusao(int id, String tamanho, int modelo, String descricao, double preco, int estoque, String material,
			String estilo) {
		super(id, tamanho, modelo, descricao, preco, estoque);
		this.material = material;
		this.estilo = estilo;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getEstilo() {
		return estilo;
	}


	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}


	public void visulizar() {
    	super.visualizar(); //chama o metodo da classe produtosmodel
    	
    	System.out.println("Material do blusão: "+this.material);
    	System.out.println("Estilo do blusão: "+this.estilo);
    }
}
