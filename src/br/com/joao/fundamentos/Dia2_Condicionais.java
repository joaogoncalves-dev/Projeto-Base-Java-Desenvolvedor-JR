package br.com.joao.fundamentos;

import javax.swing.JOptionPane; // A biblioteca que utilizamos no código anterior
                                // para imprimir coisas em caixa de texto no centro na tela.

public class Dia2_Condicionais {
	
	public static void main(String[]args) {
		
		//Hoje iremos aprender sobre estruturas condicionais muito importante para melhorar a lógica na programação.
		
		//antes é importante entender como funcionam os operadores em java.
		
		//relacionais 
		//    ==  ->  Igual a (Ex: idade == 22)
	    //	  !=  ->  Diferente de (Ex: nome != "joao")
		//    >   ->  Maior que (Ex: nota > 7.0)
		//    <   ->  Menor que (Ex: valor < 100)
		//    >=  ->  Maior ou Igual a (Ex: frequencia >= 75)
		//	  <=  ->  Menor ou Igual a (Ex: tentativas <= 3)
		
		//lógicos
		//&&  ->  E Lógico (AND): Ambas as condições devem ser verdadeiras.
		//||  ->  OU Lógico (OR): Pelo menos uma condição deve ser verdadeira.
		//!   ->  NÃO Lógico (NOT): Inverte o resultado booleano.
		
		//entendendo a extrutura do if, else if e do else, basicamente funciona assim:
		
		// SE (condição 1) for TRUE
		//if (CONDICAO_1) {
	    // faça A
		//} 
		
		// SE NÃO, SE (condição 2) for TRUE
		//else if (CONDICAO_2) {
        // faça B
		//} 
		
		// SE NENHUMA for TRUE
		//else {
        // faça C
		//}
		
		//depois dessa breve revisão vamos por a mão na massa.
		
		
		//aqui está um breve exemplo de um sistema que últiliza uma estrutura condicional. após receber dois valores
		//referente a média da nota e da frequência do aluno, mostra através de uma caixa de texto no centro da tela 
		//se um aluno é aprovado, reprovado ou se está de recuperação.
		
		// ser aprovado: nota >= 60 e frequência >=75
		// ter direito a recuperação :nota < 60 e frequência >=75
		// ser reprovado diretamente :frequência menor < 75
		
		
		// Uma boa Prática é usar 'camelCase' (ex: primeira palavra minúscula,
		// e as palavras seguintes começam com letra maiúscula.)
		int notaAluno = 60;   
		int frequenciaAluno = 75 ; // Nesse exemplo se o aluno não tem a frenquência maior ou igual a 75
		//teste os três casos           // ele não tem direito a recuperação. 
		                                // assim a gente consegue demonstar o if, else if e o else
		
		// Variáveis de REGRA: Usa-se 'final' para que o valor não mude (Constante).
		// Sempre é bom utilizar constantes nesses casos, pois se a regra de corte mudar, 
		// eu só altero o valor aqui e o código inteiro já se corrige.
		final int CORTE_APROVAÇÃO_NOTA = 60; // Para constantes é sempre bom deixar todas as palavras maiúsculas 
		final int CORTE_FREQUENCIA = 75;     // separadas por ífem.
		
		//     ser aprovado:se a nota >= 60 e a frequência >=75 então dentro da função eu peço para imprimir Aprovado.
		if (notaAluno >= CORTE_APROVAÇÃO_NOTA && frequenciaAluno >= CORTE_FREQUENCIA) {
			
			
			JOptionPane.showMessageDialog(null, "Aluno Aprovado");
			
			// se a condição anterior não ocorrer, faço outra condição 
			// se a nota < 60 e frequência >=75  que significa : ter direito a recuperação 
		}else if (notaAluno < CORTE_APROVAÇÃO_NOTA && frequenciaAluno >= CORTE_FREQUENCIA) {
			                                                             //então dentro da função peço para imprimir 
			                                                             //aluno de recuperação.
			JOptionPane.showMessageDialog(null, "Aluno de recuperação"); 
			
			// se nenhuma das condições anteriores ocorrer, no caso a frequência menor < 75
			// faço o programa imprimir o que vai acontecer, aluno reprovado 
		} else {
			
			JOptionPane.showMessageDialog(null, "Aluno Reprovado"); //mando o programa imprimir reprovado.
		}
	
		
		
}
}