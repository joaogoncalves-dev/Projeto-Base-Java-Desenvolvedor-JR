package br.com.joao.fundamentos;

import java.util.Scanner;

public class Dia5_Receberadosterminal {

	public static void main(String[] args) {
		
	       // dia 5: Hoje aprenderemos receber e imprimir dados via console (terminal)
		
		   // vamos prmeiro entender como receber e imprimir alguns tipos de variáveis
		   // o primeiro passo é usar o 'import java.util.Scanner;' o (Input) exige isso.

		   // o segundo passo é criar o objeto scanner 
		   // Ele lê a entrada do sistema (System.in).
		
		
		   //entendo a sintaxe : Scanner leitor = new Scanner(System.in);
		   //  Tipo da Variável: O tipo 'Scanner' (é uma Classe, por isso começa com maiúscula).
		   //  Nome da Variável: 'leitor' (o nome que eu dou para o objeto).
		   //  Operador: '=' (Atribuição, guarda o objeto na variável).
		   //  Construtor: 'new Scanner(System.in)' (Cria o objeto e diz para ele ler a entrada padrão do sistema, o teclado).
		
		Scanner leitor = new Scanner(System.in); 
		
		   // receber e imprimir dados do tipo string 
		
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		   // aqui, a variável 'nome' recebe a string (o texto) lido pelo leitor.
		   // o método 'nextline()' lê o texto completo até o usuário apertar enter.
		
		System.out.println("nome recebido: " + nome); //imprime o valor digitado pelo usuário.
		
		
		   //receber e imprimir dados do tipo int 
		
		
		System.out.println("digite sua idade: "); // pede para p usuário digitar sua idade.
		
		int idade = Integer.parseInt(leitor.nextLine());
		//usamos 'integer.parseint' para converter o texto em número.
		//se não usarmos, o java dá erro, pois o 'leitor' só lê string (texto)
		   // e a variável 'idade' só aceita int.
		
		System.out.println("sua idade é: "+idade ); // imprime a idade 
		
		
		   //receber e imprimir dados do tipo double 
		
		System.out.println("digite sua nota: ");
		double nota = Double.parseDouble(leitor.nextLine());
		    //usamos 'double.parsedouble' para converter o texto 
		    //em número decimal (ponto flutuante).
		
		System.out.println("sua nota é: " + nota );//imprime a nota
		
		leitor.close(); 
		    //fecha o leitor

	}

}
