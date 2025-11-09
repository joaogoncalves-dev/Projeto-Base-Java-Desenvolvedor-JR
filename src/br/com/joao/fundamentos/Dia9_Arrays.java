package br.com.joao.fundamentos;

public class Dia9_Arrays {
	
	public static void main(String[]args) {
		
		
		//Dia 9: Hoje vamos entender um pouco como manipular dados com Arrays, também conhecido 
		//como vetores.
		
		//Criação do array(vetor)
        //Sintaxe: [Tipo][] nome = {valor1, valor2, ...};
        //Criamos um array de 4 notas. Os índices vão de 0 a 3
		double[] notas = {5.7, 8.7, 8.6, 7.6};
		
		//Variáveis auxiliares
		double soma = 0.0;
		
		//Percorrer o array (a chave é usar o loop FOR)
        
        //O loop 'for' é usado para visitar cada elemento do Array:
        //Inicialização: i = 0 (Começa no primeiro índice)
        //Condição: i < notas.length (Continua enquanto i for menor que o tamanho total do Array, que é 4)
        //Incremento: i++ (Vai para o próximo índice)
		
		for(int i=0;i<notas.length;i++) {
			
			//Acessando o valor: notas[i]
			System.out.println("Nota no Índice " + i + " (Compartimento " + (i + 1) + "): " + notas[i]);
		
			
            soma = soma + notas[i];
          //Acumulando a soma, entendo a sintaxe parte a parte.
            
		    //1. notas[i] (pegando o valor atual):
            //o 'i' é o contador do loop (0, 1, 2, 3...).
            //'notas[i]' diz ao programa: vá para o array 'notas' e pegue o valor que está na posição 'i' (no compartimento atual).

		    //2. soma + notas[i] (fazendo a soma):
            //o programa pega o total antigo que já estava guardado na variável 'soma'.
            //ele soma esse total antigo com a nota atual que acabou de pegar (notas[i]).

            //3. soma = ... (atualizando o total):
            //o resultado dessa soma é guardado novamente na variável 'soma'.
            //isso sobrescreve o total antigo, acumulando o novo valor.
		}
		
		double media = soma / notas.length;
		//A média é calculada dividindo a 'soma' total dos valores (o numerador)
		
		//pelo número total de elementos no array (o denominador).
        //notas.length é a propriedade que informa o tamanho exato do vetor (quantas notas existem).
		//o resultado é guardado na variável 'media' (double).
		
		
        System.out.println("Soma total das notas: " + soma);
        System.out.println("A média da equipe é: " + media);
	}

}
