package Lojinha;

import java.text.NumberFormat;
import java.util.Scanner;
import loja.util.Cores;
import loja.model.Camiseta;
import loja.model.Blusao;
import loja.model.Regata;
import loja.model.Blazer;
import loja.controller.LojaController;
import java.util.InputMismatchException;
import java.io.IOException;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LojaController produto = new LojaController();
		Scanner leia = new Scanner(System.in);
		

		int opcao, id, estoque,modelo;
		String tamanho,descricao,cor,estampa,material,estilo,decote;
		double preco;

		while (true) {
			
			
			System.out.println("                                                                                                                               ");
			System.out.println("                                      ___       ___  __                \r\n"
					+ "|\\  \\     |\\  \\|\\  \\         |\\   ____\\|\\___   ___\\\\   __  \\|\\   __  \\|\\  ___ \\     \r\n"
					+ "\\ \\  \\    \\ \\  \\/  /|_       \\ \\  \\___|\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\|\\  \\ \\   __/|    \r\n"
					+ " \\ \\  \\    \\ \\   ___  \\       \\ \\_____  \\   \\ \\  \\ \\ \\  \\\\\\  \\ \\   _  _\\ \\  \\_|/__  \r\n"
					+ "  \\ \\  \\____\\ \\  \\\\ \\  \\       \\|____|\\  \\   \\ \\  \\ \\ \\  \\\\\\  \\ \\  \\\\  \\\\ \\  \\_|\\ \\ \r\n"
					+ "   \\ \\_______\\ \\__\\\\ \\__\\        ____\\_\\  \\   \\ \\__\\ \\ \\_______\\ \\__\\\\ _\\\\ \\_______\\\r\n"
					+ "    \\|_______|\\|__| \\|__|       |\\_________\\   \\|__|  \\|_______|\\|__|\\|__|\\|_______|\r\n"
					+ "                                \\|_________|                                        \r\n"
					+ "                                                                                    \r\n"
					+ "                                                                                                                                        ");
			System.out.println("********************************************************************************************************************");
			System.out.println(" *                                                                                                                * ");
			System.out.println(" *                                   1 - Cadastrar produto                                                        * ");
			System.out.println(" *                                   2 - Listar produtos                                                          * ");
			System.out.println(" *                                   3 - Atualizar produto                                                        * ");
			System.out.println(" *                                   4 - Apagar o produto                                                         * ");
			System.out.println(" *                                   0 - Sair                                                                     * ");
			System.out.println(" *                                                                                                                * ");
			System.out.println("*********************************************************************************************************************");
			System.out.println("                                     Entre com a opção desejada:                                                  *  ");
			System.out.println("                                                                                                                  * " );

			opcao = leia.nextInt();
			
			if (opcao == 0) {
				System.out.println("\nLK STORE agradece a sua preferência, volte sempre!!");
				leia.close();
				System.exit(0);
			} 

		
			switch (opcao) {
            case 1:
            	
            	System.out.println("Cadastrar produtos");
            	
            	System.out.println("Insira o tamanho do produto:");
            	leia.skip("\\R");
            	tamanho = leia.nextLine();
            	
            	do {
            		
                 System.out.println("Insira o modelo do produto (1-Camiseta 2- Blusão 3- Regata 4- Blazer): ");
                 
                 modelo = leia.nextInt();
                    

            	}while (modelo< 1||modelo>4);
            	
            	System.out.println("\nDê a descrição do produto:");
            	leia.skip("\\R");
            	descricao = leia.nextLine();
            	
            	System.out.println("\nInforme o preço do produto:");
            	preco = leia.nextDouble();
            	
            	System.out.println("\nInforme a quantia em estoque:");
            	estoque = leia.nextInt();
            	
            	
            	switch (modelo) {
            	
            	case 1:
            		System.out.println("\nInsira a cor da camiseta: ");
            		leia.skip("\\R");
            		cor = leia.nextLine();
            		
            		System.out.println("\nInsira a estampa da camiseta: ");
            		estampa = leia.nextLine();
            		
            	    produto.cadastrar(new Camiseta(produto.incrementoId(),tamanho,modelo,descricao,preco,estoque,cor,estampa));
            	    break;
            	    
                 
            	case 2: 
            		System.out.println("\nInsira o material do blusão: ");
            		leia.skip("\\R");
            		material = leia.nextLine();
            		
            		System.out.println("\nQual o estilo do blusão: ");
            	    estilo = leia.nextLine();
            	    
            	    produto.cadastrar(new Camiseta(produto.incrementoId(),tamanho,modelo,descricao,preco,estoque,material,estilo));
            	    break;
            	
            	
            	case 3:
            		System.out.println("\nInsira a cor da regata: ");
            		leia.skip("\\R");
            		cor = leia.nextLine();
            		
            		System.out.println("\nQual decote da regata: ");
            		decote = leia.nextLine();
            		
            		produto.cadastrar(new Camiseta(produto.incrementoId(),tamanho,modelo,descricao,preco,estoque,cor,decote));
            		break;
            	
            	case 4:
            		System.out.println("\nInsira a cor do blazer: ");
            		leia.skip("\\R");
            		cor = leia.nextLine();
            		
            		System.out.println("\nInsira o estilo do blazer:");
            		estilo = leia.nextLine();
            		
            		produto.cadastrar(new Camiseta(produto.incrementoId(),tamanho,modelo,descricao,preco,estoque,cor,estilo));
            		break;
            	
            	}
            	keyPress();
               
                case 2:
                System.out.println("Listar produtos");
                produto.listarTodos();
                keyPress();

                break;
                case 3:
                System.out.println("Atualizar os produtos do sistema:");
                System.out.println();
                
                System.out.println("Insira o ID do produto: ");
                id = leia.nextInt();
                
                if (produto.buscarNaCollection(id) != null) {

                	System.out.println("Insira o tamanho do produto:");
                	leia.skip("\\R");
                	tamanho = leia.nextLine();

                	System.out.println("Insira o modelo do produto (1-Camiseta 2- Blusão 3- Regata 4- Blazer): ");
                    modelo = leia.nextInt();

                    System.out.println("\nDê a descrição do produto:");
                	leia.skip("\\R");
                	descricao = leia.nextLine();

                	System.out.println("\nInforme o preço do produto:");
                	preco = leia.nextDouble();
                	
                	System.out.println("\nInforme a quantia em estoque:");
                	estoque = leia.nextInt();

                    do {
                        System.out.println("Digite o tipo de Produto (Camiseta, Blusão, Regata, Blazer): ");
                        leia.nextLine(); 
                        String tipoInput = leia.nextLine();
                        if (tipoInput.equalsIgnoreCase("Camiseta")) {
                            modelo = 1;
                        } else if (tipoInput.equalsIgnoreCase("Blusão")) {
                            modelo = 2;
                        } else if (tipoInput.equalsIgnoreCase("Regata")) {
                            modelo = 3;
                        } else if (tipoInput.equalsIgnoreCase("Blazer")) {
                            modelo = 4;
                        }  else {
                            modelo = 0; // modelo inválido
                        }
                    } while (modelo < 1 || modelo > 4);

                    System.out.println("Insira a quantia de produtos no estoque: ");
                    estoque = leia.nextInt();

                    modelo = produto.retornarTipo(id);

                    switch (modelo) {
                        case 1 -> {
                        	System.out.println("\nInsira a cor da camiseta: ");
                    		leia.skip("\\R");
                    		cor = leia.nextLine();
                    		
                    		System.out.println("\nInsira a estampa da camiseta: ");
                    		estampa = leia.nextLine();
                    		
                    	    produto.cadastrar(new Camiseta(produto.incrementoId(),tamanho,modelo,descricao,preco,estoque,cor,estampa));
                    	    break;

                        }
                        case 2 -> {
                        	System.out.println("\nInsira o material do blusão: ");
                    		leia.skip("\\R");
                    		material = leia.nextLine();
                    		
                    		System.out.println("\nQual o estilo do blusão: ");
                    	    estilo = leia.nextLine();
                    	    
                    	    produto.cadastrar(new Camiseta(produto.incrementoId(),tamanho,modelo,descricao,preco,estoque,material,estilo));
                        }

                        case 3 -> {
                        	System.out.println("\nInsira a cor da regata: ");
                    		leia.skip("\\R");
                    		cor = leia.nextLine();
                    		
                    		System.out.println("\nQual decote da regata: ");
                    		decote = leia.nextLine();
                    		
                    		produto.cadastrar(new Camiseta(produto.incrementoId(),tamanho,modelo,descricao,preco,estoque,cor,decote));

                        }

                        case 4 -> {
                        	System.out.println("\nInsira a cor do blazer: ");
                    		leia.skip("\\R");
                    		cor = leia.nextLine();
                    		
                    		System.out.println("\nInsira o estilo do blazer:");
                    		estilo = leia.nextLine();
                    		
                    		produto.cadastrar(new Camiseta(produto.incrementoId(),tamanho,modelo,descricao,preco,estoque,cor,estilo));

                        }
                        
                        default -> {
                            System.out.println("Tipo de produto não encontrado!");
                        }
                    }

                } 

                	
                
                case 4:
            	System.out.println("Deletar os Produtos do Sistema ");
                System.out.println();
                System.out.println("Digite o ID do produto: ");
                id = leia.nextInt();
                produto.deletar(id);
                keyPress();
                break;
                
                case 5:
            	System.out.println("Consultar dados do produto por id");
                System.out.println();
                System.out.println("Digite o ID do produto: ");
                id = leia.nextInt();
                
                keyPress();

                break;
            
            default:
                System.out.println("\nOpção Inválida!\n");
                break;
        }
			
			}
		}

	private static void keyPress() {
		// TODO Auto-generated method stub
		
	}
}
	



			
            

	
	
