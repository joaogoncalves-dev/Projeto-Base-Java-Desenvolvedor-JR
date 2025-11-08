package br.com.joao.fundamentos;

public class Dia8_Metodos {
	
	//dia8 hoje aprenderemos como funciona e como fazer uma função em java.
    //também buscareemos entender a sintaxe de métodos (funções).
   
    //a estrutura completa de um método (ou função) é:
    //public static [tipo de retorno] nomeDoMetodo([parâmetros]) { ... }
   
    //Como chamar (utilizar) a função:
	
	//Se o método não tiver retorno (VOID):
	//Você apenas o chama para ele executar a ação (ex: imprimir).
	//nomeDoMetodo(valor1, valor2);

	//Se o método tiver retorno ([TIPO]):
	//Você chama o método e ARMAZENA o valor que ele devolve em uma variável.
	//[tipo de retorno] resultado = nomeDoMetodo(valor1, valor2);
    
    // -----------------------------------------------------------------------------------
	
    //Implementação dos métodos.
    
    //método 1: com retorno de valor (return) 
	
    //public static double: o método devolve um valor do tipo double no final.
    public static double calcularMedia(double nota1, double nota2, double nota3) {
        
        double media = (nota1 + nota2 + nota3) / 3.0;
        
        return media; //a palavra 'return' devolve o valor para o ponto onde o método foi chamado.
    }
    
    //método 2: sem retorno de valor (void) 
    //void: indica que o método apenas executa uma ação e não devolve nenhum dado.
    public static void exibirMensagem(String texto) {
        
        System.out.println("sistema informa: " + texto);
    }
    
  //------------------------------------------------------------------
    
    //Método principal (MAIN - o ponto de partida) já entendos como funciona nos dias anteriores.
	public static void main (String[]args) {
        
        System.out.println("início do programa");
        //aqui mostra como funciona na prática a chamada de uma função.
        
        //1.chamamos o método calcularMedia (o que retorna valor)
        double mediaAluno = calcularMedia(8.5, 7.0, 9.5);
        System.out.println("1. a média calculada é: " + mediaAluno);
        
        //2.chamamos o método para outro cálculo
        double mediaEquipe = calcularMedia(6.0, 6.0, 6.0);
        System.out.println("2. a média da equipe é: " + mediaEquipe);
        
        //3.chamamos o método método exibirMensagem (o que não retorna valor)
        exibirMensagem("o cálculo das médias foi concluído.");
        
        System.out.println("fim do programa");
	}
}