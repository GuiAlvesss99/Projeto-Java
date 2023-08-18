package loja.model;

import java.text.NumberFormat;

public abstract class ProdutosModel {
    private int id;
    private String tamanho;
    private int modelo;
    private String descricao; 
    private double preco;
    private int estoque;
   
        
	public ProdutosModel(int id, String tamanho, int modelo, String descricao, double preco, int estoque) {
		this.id = id;
		this.tamanho = tamanho;
		this.modelo = modelo;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}


	

	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getTamanho() {
		return tamanho;
	}



	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}





	public int getModelo() {
		return modelo;
	}




	public void setModelo(int modelo) {
		this.modelo = modelo;
	}





	public String getDescricao() {
		return descricao;
	}




	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}





	public double getPreco() {
		return preco;
	}





	public void setPreco(double preco) {
		this.preco = preco;
	}





	public int getEstoque() {
		return estoque;
	}






	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}





	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
    
    }
    
    
    public void visualizar() {
        String modelo = "";
        switch (this.modelo) {
            case 1:
                modelo = "Camiseta";
                break;

            case 2:
                modelo = "Blusão";
                break;

            case 3:
                modelo = "Regata";
                break;

            case 4:
                modelo = "Blazer";
                break;
        }

    
        System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto: ");
		System.out.println("***********************************************************");
		System.out.println("Id do produto:"+this.id);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Descrição da roupa: " + this.descricao);
		System.out.println("Valor da roupa: " + this.formatarMoeda());
		System.out.println("Quantidade em estoque: " + this.estoque);
    }

    
}