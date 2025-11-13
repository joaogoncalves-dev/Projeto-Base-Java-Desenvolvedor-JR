package br.com.joao.poo.modelos;

public class AppProduto {

    public static void main(String[] args) {
        
      
    	//dia12: iniciaremos POO(Programação Oriantada a Objeto): abordaremos os temas Classes, 
    	//Objetos, Construtores e Encapsulamento assim entendendo como criar e manipular objetos.

        //CRIAÇÃO DE OBJETOS (INSTANCIAMENTO)
        //Cada 'new Produto() cria um objeto ÚNICO, chamando o construtor.
        Produto monitor = new Produto("Monitor Gamer", 1500.00);
        Produto mouse = new Produto("Mouse Wireless", 85.50);

        //USO DE MÉTODOS E ALTERAÇÃO DE ESTADO
        //o objeto monitor executa seu próprio método de adicionar estoque.
        monitor.adicionarEstoque(10); 
        mouse.adicionarEstoque(59);
        
        //chamando o método de cálculo do objeto 'monitor'.
        double valorImposto = monitor.calcularValorFinal(0.18); 
        
        
        //EXIBIÇÃO DE RESULTADOS (GETTERS)
        System.out.println("produto: " + monitor.getNome());
        System.out.println("estoque atual: " + monitor.getEstoque() + " unidades");
        System.out.println("valor com imposto (18%): r$ " + String.format("%.2f", valorImposto));
        //Entendendo a sintaxe.
        //String.format( ) Transforma dados em texto (string) formatado.
        //"%.2f" é a 'receita" de como o número deve aparecer.
        //%f: Indica que o valor é um número decimal (float).
        //.2: Indica que deve ter 2 casas decimais após a vírgula/ponto.
        
        System.out.println("\nProduto: " + mouse.getNome());
        System.out.println("Estoque inicial: " + mouse.getEstoque() + " unidades");
        System.out.println("Preço de venda: R$ " + String.format("%.2f", mouse.getPreco())); 

       
    }
}