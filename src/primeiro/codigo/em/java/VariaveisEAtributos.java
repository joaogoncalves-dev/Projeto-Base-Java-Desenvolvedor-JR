package primeiro.codigo.em.java;

     
    
import javax.swing.JOptionPane;  //Importa a classe para mostrar caixas de diálogo (GUI) Graphical User Interface.
                                                                                   //Interface Gráfica do Usuário

public class VariaveisEAtributos {
	
	//Chamando a função principal (main), é o ponto de entrada de qualquer aplicação Java.
	// O Java Runtime Environment (JRE) executa o código que está aqui dentro dessa função principal.
	
	// public:   Modificador de Acesso
    // static:   Pode ser executado sem criar um Objeto da Classe.
    // void:     O método não devolve nenhum resultado ao terminar.
    // (String[] args): Recebe argumentos/dados externos 
    
	public static void main(String[ ]args) {
        
		// Hello World (Console vs. GUI (caixa de texto na tela)) e Variáveis.
		
		
		// forma de console: Saída simples no terminal.
		System.out.println("Hello Word.");
		
		// Forma gráfica (GUI): Abre uma caixa de diálogo na tela. 
		JOptionPane.showMessageDialog(null, "Hello Word.");  //o null serve para que a caixa gráfica de dialago fique no centro da tela.
		//só funciona se importar primeiro a biblioteca  javax.swing.JOptionPane;
		
		
		// --- Demonstração de Variáveis 
		
		// String: Armazena texto )
        String nome = "João Goncalves"; //sempre usar áspas dupla ("") após um número atribuído a uma variavel string .
        
        // int: Números inteiros.
        int idade = 22;
             
        // float: Número decimal de precisão simples (para valores de altura, distâncias curtas.
        float versaoJava = 21.01f; // EX: número da versão do Java.
        //sempre colocar o f após um número atribuído a uma variavel float.
        
        //double: Número decimal de alta precisão. Padrão para cálculos monetários ou científicos.
        double taxaCambio = 5.234567; //EX:Taxa de câmbio (exige precisão).
        
        // boolean: Lógica (apenas true ou false)
        boolean isDiaDeEstudo = true; // Ex: status do dia.
        
        // char: Armazena um único caractere. 
        char primeiraLetra = 'J'; //sempre colocar o aspas simples('') após uma letra atribída a uma variavel char. 
        
        // long: Número inteiro muito grande (para IDs de sistema, contagens grandes)
        long idTransacao = 1234567890123L; // EX:ID de transação de banco de dados.
        //sempre colocar o L após um número atribuído a uma variavel long,
        
        //  Imprimindo o Resultado 
        // System.out.println: A função padrão de saída do Java.
        // System:  Acesso à funcionalidade do sistema.
        // out:     O fluxo de saída padrão (o console).
        // println: Método que imprime e pula para a próxima linha.
       
        // no java para imprimir o valor de uma variavel usa-se o operador +.
        System.out.println("\n Dados Básicos "); //o \n serve para pular para a linha de baixo.
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("primeira letra do nome: " + primeiraLetra);
        System.out.println("Versão do Java: " + versaoJava);
        System.out.println("Nota do Projeto: " + taxaCambio);
        System.out.println("É dia de estudo? " + isDiaDeEstudo);
        System.out.println("código da transação: " + idTransacao);
    }
}
		
		
		
		
		