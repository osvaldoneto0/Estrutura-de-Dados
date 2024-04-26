package fila;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
	        Stack<String> livros = new Stack<String>();

	        String objeto;
	        int opcao = -1;

	        while (opcao != 0) {
	            System.out.println("1 - Adicionar livro na pilha");
	            System.out.println("2 - Listar todos os livros");
	            System.out.println("3 - Retirar livro da pilha");
	            System.out.println("0 - Sair");
	            System.out.println("****************************");
	            System.out.println("Entre com a opção desejada");
	            opcao = leia.nextInt();
	            leia.nextLine(); // Limpar o buffer do scanner

	            switch (opcao) {
	                case 0:
	                    System.out.println("Programa Finalizado!");
	                    break;
	                case 1:
	                    System.out.println("Digite o nome: ");
	                    objeto = leia.nextLine();
	                    livros.push(objeto);
	                    System.out.println("\nLivro Adicionado!\n");
	                    break;
	                case 2:
	                    System.out.println("Lista de livros na pilha: \n");
	                    for (String livro : livros) {
	                        System.out.println(livro);
	                    }
	                    System.out.println();
	                    break;
	                case 3:
	                	if(livros.isEmpty()) {
	                		System.out.println("A pilha está vazia!");
	                		System.out.println();
	                	} else {
	                		livros.pop();
	                	}
	                	System.out.println("Um livro foi retirado da pilha");
	                	System.out.println();
	                	for (String livro : livros) {
	                		System.out.println(livros);
	                	}
	                	System.out.println();
	                	break;
	                	default:
	                		System.out.println("Entre com uma opção valida!");
	                		break;
	            }
	        }
	    }
	}