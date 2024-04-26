package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();
		
		String elemento;
		int opcao;

		do {
		System.out.println("""
		****************************************

		1 - Adicionar Cliente na fila
		2 - Listar todos os Clientes
		3 - Retirar Cliente da Fila
		0 - Sair

		****************************************
		""");
		System.out.println("Digite uma opção: ");
		opcao = leia.nextInt();
		leia.nextLine();

		switch(opcao) {
		case 0:
		   System.out.println("Programa Finalizado!");
		   break;
		case 1:
		   System.out.println("Entre com um nome: ");
		
		clientes.add(leia.nextLine());
		   System.out.println("Fila: \n");
		for ( String pessoa : clientes ) {
		   System.out.println(pessoa);
		}
		System.out.println("\nCliente Adicionado!");

		break;
		case 2:
		  System.out.println("Lista de Clientes na Fila: \n");
		for (String pessoa : clientes ) {
		  System.out.println(pessoa);
		}break;
		
		case 3:
		 if (clientes.isEmpty()) {
		   System.out.println("A Fila está vazia!");
		}
		 else {
		clientes.remove();

		System.out.println("Lista de Clientes na Fila: \n");
		 for (String pessoa : clientes ) {
		  System.out.println(pessoa);
		}
		  System.out.println("O Cliente foi Chamado!");

		}break;
		
		default:
		  System.out.println("Entre com uma opção válida!");
		  break;
		}
		} while (opcao != 0);

		}

		

	}


