package br.com.joao.fundamentos;

import javax.swing.JOptionPane;

public class Dia3_LacosDeRepeticao { // o nome da classe começa com maiúscula (convenção java)
	
	public static void main(String[]args) {
		
		
		// dia 3: Hoje aprenderemos usar laços de repetição, usaremos o for e while.
		// são importantes para evitar a repetição manual de código 
		//e garantir que um processo continue até que uma meta seja atingida.
		
		
		
		
		// 1. exemplo do loop for (contagem simples) 
		
		// o 'for' é o melhor para quando sabemos exatamente quantas vezes precisamos contar  ex:(1 até 10).
		
		// entendo a estrutura: 
		// for(ponto de partida ; condição de parada ; incremento em cada volta){
		
		
		for (int i = 1; i <= 10; i++) {
			//for (int i = 1(ponto de partida diz que i vai começar de 1)
			//; i <= 10(condição: vai dar voltas no laço enquanto i for menor ou igual a 10)
			//; i++) (incremento: vai imcrementar 1 em cada volta do laço) {
			
			System.out.println("contagem for: " + i); // aqui coloca-se o que vai acontecer
			                                          // em cada volta 
			
		}
		
		
		//  2. exemplo do loop while (progresso da meta) 
		
		int progressoAtual = 0;
		final int meta_do_dia = 10 ; 
		
		// loop while: executa enquanto progressoAtual for menor que meta_do_dia (10).
		while (progressoAtual < meta_do_dia) {
			
			progressoAtual += 1 ; // a chave do 'while' é essa linha: garante que o loop avança e, um dia, vai parar.
			
			// a lógica de decisão (dia 2) agora está aqui dentro do loop!
			if (progressoAtual < meta_do_dia) {
				// se a condição ainda for verdadeira:
				JOptionPane.showMessageDialog(null, "o progresso atual está em " + progressoAtual +", a meta de " + meta_do_dia  + " ainda não foi alcançada. ");
				//método para imprimir em uma caixa de texto no centro da tela
				//explicado no dia 1 
			
			}	else{
				// quando a condição for falsa (ou seja, progressoAtual >= meta_do_dia):
				// eu uso o else para mostrar a mensagem de conclusão.
				JOptionPane.showMessageDialog(null, "o progresso atual está em " + progressoAtual + ", a meta de " + meta_do_dia  + " foi alcançada! \nParabens");
			}	
		}
		
		
	}

}