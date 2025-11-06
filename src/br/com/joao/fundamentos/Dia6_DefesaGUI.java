package br.com.joao.fundamentos;

//*//import java.util.Scanner;
import javax.swing.JOptionPane;


public class Dia6_DefesaGUI {
	
	public static void main(String[]args) {
		
		// dia 4: - defesa integrada
		// hoje vamos focar em entender como deixar o código intacto 
        // contra erros de usuários ao receber dados
		
		
		
	    //------------------------------------------------------------------------------------
	    
	
		   

//Como eu defendo o código se a pessoa deixar em brango o campo de nome?

// Neste primeiro caso, não usa-se o try-catch para impedir a quebra do programa, pois
// o pragrama não quebra se isso ocorrer já que o sring aceitará números pois eles ficam
// em forma de string.

// Então usaremos um loop while e um if/else para verificar se a String contém apenas letras
//(ou não está vazia), assim  garantindo a qualidade do dado (Validação de Lógica).

		
	String nomeSemValidação = JOptionPane.showInputDialog(null, "Exemplo sem defesa, \nteste deixando vaziu \nDigite seu nome: ");
	JOptionPane.showMessageDialog(null," exemplo sem defesa, Seu nome é: "+nomeSemValidação+"\nO espaço ficou vaziu, pois não Houve defesa ");
		
		//essa código acima não usa Validação de Lógica.
		//teste deixar caixa de texto em branco
		//vai aparecer uma mensagem, seu nome "é: " (ou seja, seu nome é: seguido de um espaço vazio)
		
		
	    //mostraremos o jeito certo agora com Validação de Lógica.
		
		// 1. variáveis de controle: usadas para guiar a lógica
		
	    Boolean nomeValido = false ; // a 'flag' que o loop vai checar (começa como 'falha')
		String nome = ""; //Inicializamos a variável que guarda o resultado final
		
		
		// aqui, o loop 'while' garante que a pergunta se repita
		// enquanto a variável 'nomeValido' for falsa (ou seja, enquanto o nome for inválido).
		// a cada repetição, o programa abre a caixa de diálogo para pedir o nome novamente.
		while (!nomeValido) {
			nome = JOptionPane.showInputDialog(null, "Exemplo com defesa,\nDeixe o campo vaziu \nDigite seu nome:" );
			
			
			// Aqui entra o if/else para verificar a qualidade do dado.
			
			//entendo a sintaxe:
		    // 1. (nome != null): Checa se o usuário NÃO clicou em 'Cancelar'.
		    // 2. && : Ambas as condições devem ser verdadeiras.
		    // 3. !nome.trim().isEmpty() :
		    //    -> .trim() remove espaços em branco no início e fim.
		    //    -> .isEmpty() verifica se sobrou algo (se está vazio).
		    //    -> ! inverte o resultado: SÓ TRUE se a string NÃO estiver vazia.
			if( nome != null && !nome.trim().isEmpty()) {
				
				nomeValido = true;
				// se nenhuma das regras do 'if' for atendida (ex: nome vazio ou nulo),
				// este bloco 'else' executa.
			} else {
				
				JOptionPane.showMessageDialog(null, "O nome não pode ser vazio. Tente novamente.");
				// o loop 'while' repete automaticamente, pois 'nomeValido' continua false.
			}
			

			
		}
	
		JOptionPane.showMessageDialog(null, "Nome Válido Recebido: " +nome);
		// esta linha só é alcançada quando o loop 'while' é encerrado, 
		// o que garante que o nome é válido e não está vazio.
		
		//------------------------------------------------------------------------------------ 
		
		//Lógica de defesa (try-catch + while)
		
		
		   // para facilitar nosso aprendizado usaremos essa colinha
		   // de como a defesa integrada (tratamento de exceções) funciona e como implementar.
		
	       // o objetivo é fazer o código não quebrar se o usuario digitar algo errado que acarreterá
		   // erro após executar código.
		   // se ocorrer o código vai repetir a pergunta até dar certo.
		

		// 1. variáveis de controle: usadas para guiar a lógica
		// boolean entradaValida = false; // a 'flag' que o loop vai checar (começa como 'falha')
		// int idade = 0;                 // variável que irá receber o valor (deve ser inicializada)

		// 2. estrutura while (repetição):
		// while (!entradaValida) { ... }  // roda enquanto a entrada não for válida.

		// 3. estrutura try-catch (defesa):

		// try { ... }
		//   -> o bloco onde colocamos o código que pode falhar (ex: integer.parseint()).

		// catch (numberformatexception e) { ... }
		//   -> o bloco executado somente se o código no 'try' falhar.
		//   -> 'numberformatexception' é o erro específico quando tentamos converter texto em número.
		//   -> se o catch for ativado, a flag de controle (entradaValida) permanece false, e o while repete.

		// 4. saída de sucesso:
		// se o código dentro do 'try' funcionar, usamos: entradaValida = true;
		//   -> isso faz o loop while se tornar falso e o programa segue em frente.
		
		// --------------------------------------------------------------------------
		
		// agora que entendemos um pouco da estrutura, vamos testar na pratica.
		
		
		//2. Lógica de defesa para número com (try-catch + while
				
				
				
				// O objetivo é fazer o código não quebrar se o usuário digitar letras na idade.
				
				boolean entradaNumericaValida = false; // Nova flag para o novo loop
				int idadeDefesa = 0; // Variável para guardar o resultado
				
				// Loop: Roda enquanto a entrada não for válida.
				while (!entradaNumericaValida) {
				    
				    String input = JOptionPane.showInputDialog("teste colocar letra \nou deixar vaziu \nDigite sua idade :"); 
				    
				    // BLOCO TRY: Tentamos a conversão, que é o ponto de risco
				    try {
				        idadeDefesa = Integer.parseInt(input); // Ponto Crítico de Quebra!
				        
				        // SUCESSO: Se a conversão funcionar, o loop pode parar.
				        entradaNumericaValida = true;           
				    } 
				    // BLOCO CATCH: Captura o erro NumberFormatException e impede a quebra
				    catch (NumberFormatException e) {
				        // Mostramos a mensagem de erro e o loop repete.
				        JOptionPane.showMessageDialog(null, "Valor inválido! Tente novamente (APENAS NÚMEROS).");
				    }
				}
			    
			    // Saída Final da Defesa
			    JOptionPane.showMessageDialog(null, "Sucesso! A idade é: " + idadeDefesa);
				
				
			} 
			
		}
	
	

		
		