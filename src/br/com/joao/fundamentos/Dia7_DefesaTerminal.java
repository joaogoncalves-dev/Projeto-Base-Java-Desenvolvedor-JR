package br.com.joao.fundamentos;

import java.util.Scanner ;

public class Dia7_DefesaTerminal {
	
	public static void main (String[]args) {
		
    //DIA 7: Hoje aprenderemos como funciona a robustez (defesa) do código no terminal utilizando
    //Scanner com try-catch
		
		//inicializando a ferramenta de leitura.
		Scanner Leitor = new Scanner(System.in);
		
		//variáveis de controle.
		boolean entradaValida = false ; //a flag que controlará o loop 'while'.
		double notaFinal = 0.0 ; //variável que guardará o valor final. 
		
		System.out.println("Sistema de leeitura de dados");

		//loop while vai repetetir enquanto a entrada for inválida
		//(ou seja, enquanto entradaValida for false).
		while(!entradaValida ) {
			
			 System.out.println("Digite a nota do aluno (Ex: 8.5):");
			 String imput = Leitor.nextLine();
			 
			// No bloco try tentamos a conversão, que é o ponto de risco.
			 try {
				 
				// aplica a correção de vírgula e tenta converter a string para double.
				 notaFinal = Double.parseDouble(imput.replace(",", "."));
				 
				// se o código chegou aqui, não houve erro!
				 entradaValida = true ;// ou seja o o loop para e o código executa a primeira linha 
				                       //fora do loop, o que siginifica que a entrada foi correta.
				 
				  }
			 
			// bloco catch: captura o erro numberformatexception.
			catch (NumberFormatException e) {
				
				// a mensagem de erro é exibida, e o loop while repete.
				System.out.println("\n[erro] Valor inválido! \nPor favor digite apenas números (use ponto para decimais) ");
				
			}
		}
		
		System.out.println("RESULTADO");
		// o resultado só é exibido quando o valor for garantidamente um número.
		System.out.println("Nota do aluno validada é: "+notaFinal);
		
		Leitor.close(); //boa prática fechar o scanner.
	}
	
	

}
