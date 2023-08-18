package loja.repository;

import loja.model.ProdutosModel;

public interface LojaRepository {
	
	
	//CRUD DO MENU LOJA 
	
	

	public void listarTodos();
	
	public void cadastrar(ProdutosModel ProdutosModel);
	
	public void atualizar(ProdutosModel ProdutosModel);
	
	public void deletar (int numero);
	
	
	
}
