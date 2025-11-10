package br.com.joao.fundamentos;

public class Dia10_Matrizes {

   
    //Dia 10, Hoje aprenderemos mexer um pouco com matrizes e métodos modulares
    

    //criando o método (função) que recebe um array 2D ([][]) como parâmetro para somar todos os elementos.
    public static int somarMatriz(int[][] matriz) {
        int soma = 0;
        
        //O loop for aninhado é obrigatório para processar matrizes.
        for (int i = 0; i < matriz.length; i++) { //Percorre as LINHAS
            for (int j = 0; j < matriz[i].length; j++) { //Percorre as COLUNAS
                soma += matriz[i][j];
            }
        }
        return soma; //Devolve o resultado.
    }
    

    public static void main(String[] args) {
        
        
        
        //CRIAÇÃO DA MATRIZ (ARRAY DE DUAS DIMENSÕES - 3x3)
        int[][] matrizNumeros = {
            { 1, 2, 3 }, //Linha 0
            { 4, 5, 6 }, //Linha 1
            { 7, 8, 9 }  //Linha 2
        };
        
        System.out.println("MATRIZ ORIGINAL (3x3)");
        //O loop for aninhado é usado apenas para imprimir a matriz de forma organizada.
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                System.out.print(matrizNumeros[i][j] + " ");
            }
            System.out.println();
        }
        
        //USO DE MÉTODO PARA PROCESSAR A MATRIZ
        //Chamamos o método (definido acima) e guardamos o valor.
        int somaTotal = somarMatriz(matrizNumeros);
        
        
        System.out.println("Soma total de todos os elementos: " + somaTotal);
    }
}