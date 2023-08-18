package loja.controller;

import java.util.ArrayList;


import loja.model.ProdutosModel;
import loja.repository.LojaRepository;

public class LojaController implements LojaRepository{
	private ArrayList<ProdutosModel> listaProdutos = new ArrayList<ProdutosModel>();
	
	private int id =0;

	@Override
	public void listarTodos() {
	for (var produto : listaProdutos)	{
		produto.visualizar();
		
	}
		
	}

	@Override
	public void cadastrar(ProdutosModel produtosmodel) {
		listaProdutos.add(produtosmodel);
		System.out.println("\nO produto:"+produtosmodel.getId()+"foi cadastrado com sucesso!");
		
	}

	@Override
	public void atualizar(ProdutosModel produtosmodel) {
		
         ProdutosModel produto = buscarNaCollection(produtosmodel.getId());
		
		if(produto !=null) {
			listaProdutos.set(listaProdutos.indexOf(listaProdutos), produtosmodel);
			System.out.println("\nO produto foi atualizado!! ");
			
		}else
			System.out.println("\nO produto não foi encontrado!!"); 		
		
	}
	
	

	

	@Override
	public void deletar(int numero) {
		   ProdutosModel produto = buscarNaCollection (numero);
		   if (produto != null) {
			  if (listaProdutos.remove(produto)==true) {
				  System.out.println("\nO produto foi deletado!");
			  }
		   }else {
			   System.out.println("\nO produto não foi encontrado!!");
		   }

		   
		}
	
	       public ProdutosModel buscarNaCollection(int numero) {
		     for (var produto : listaProdutos) {
			  if (produto.getId()== numero) {
				 return produto;
				 
			  }
		     }
			  return null;
	       }
	       
	       public int incrementoId() {
	    	   return ++id;
	       }
	       public int retornarTipo(int Id) {
	    	   for (var produto : listaProdutos) {
	    		   if(produto.getId()==Id) {
	    			   return produto.getModelo();
	    		   }
	    	   }
	    	   return 0;
	       }
	}
	       	
	


