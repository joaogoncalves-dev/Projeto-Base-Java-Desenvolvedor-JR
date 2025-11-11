package br.com.joao.fundamentos;

import java.util.Scanner;

public class RevisaoCondicionais {
	
	public static void main (String[]args) {
		
		//Dia 11: hoje revisaremos estruturas condicionais com um exercício, para absorver ao máximo
		//o conteúdo.
		
		//Faça um programa que recebe a pontuação total do jogador e exibe uma mensagem 
		//classificando-o em uma das três categorias:

		//Categoria Ouro: Se a pontuação for maior ou igual a 1000 pontos.

		//Categoria Prata: Se a pontuação for maior ou igual a 500, mas menor que 1000.

		//Categoria Bronze: Se a pontuação for menor que 500.
		
		//Como o programa vai receber um dado do usuário,
		//o primeiro passo é importar a biblioteca java.util.scanner; usando um import. 
		
		//segundo passo: criar o leitor.
		Scanner Leitor = new Scanner(System.in); 
		
		//terceiro passo: pedir para o usuário informar o dado.
		System.out.println("Informe sua pontuação total: ");
		int pontucaoTotal = Integer.parseInt(Leitor.nextLine()); // transforma a string em int
		                                                         //e atribui o valor informado
		                                                         //a variavel pontuacaoTotal
		//recomendavel criar variáveis fixas para situações de corte
		final int CORTE_PARA_OURO = 1000 ;		
		final int CORTE_PARA_PRATA = 500;
		
		//quarto passo: aplica a lógica condicional que o exercício pede, utilizando o if, else if e else.
		if( pontucaoTotal >=CORTE_PARA_OURO) {  
			
			System.out.println("classificando-o em OURO");
		}else if (pontucaoTotal >= CORTE_PARA_PRATA ){
			
			System.out.println("classificando-o em PRATA");
		}else{
			
			System.out.println("classificando-o em BRONZE");
		}
		Leitor.close(); // fecha o leitor
	}

}
