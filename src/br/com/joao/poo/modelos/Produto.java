package br.com.joao.poo.modelos;

public class Produto {

    //ATRIBUTOS (O que o objeto tem)
    //Deixamos os atributos como private para proteger os dados (Encapsulamento).
    private String nome;
    private double preco;
    private int estoque;

    //CONSTRUTORES
    //O construtor é chamado na hora de criar o objeto (new Produto(...)).
    //Ele garante que o objeto seja inicializado com dados válidos.
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0; // comecei o estoque com 0.
    }

    //MÉTODOS(funções) O que o objeto faz

    //Método com retorno: calcula o valor final do produto com um imposto.
    public double calcularValorFinal(double impostoPercentual) {
        return preco * (1 + impostoPercentual);
    }
    
    //Método sem retorno (void): executa uma ação que altera um atributo.
    public void adicionarEstoque(int quantidade) {
        this.estoque += quantidade;
    }

    //GETTERS Para ler atributos privados
    //O getter é a única forma de ler os valores que estão private.
    public String getNome() {
        return nome;
    }
    
    public int getEstoque() {
        return estoque;
    }
    
    
    public double getPreco() {
        return this.preco; 
    }
}