package br.com.joao.fundamentos;

public class LacosDeRepeticao {

    public static void main(String[] args) {
        
        
        // dia 3: hoje vamos entender como funcionam os laços de repetição (loops)
        // o objetivo dos loops é fazer o código executar uma tarefa automaticamente
        // várias vezes, sem precisar escrever a mesma linha.
        

        // 1. loop for: para contagens definidas (sabemos quando parar) 
        
        System.out.println("início: contador for");
        
        // vamos repetir o código 5 vezes.
        // o 'for' é o loop ideal quando sabemos exatamente o início e o fim da repetição.
        
        // estrutura detalhada do for:
        // for (int contador = 1; contador <= 5; contador++) {    
        //  aqui fica o que o programa vai fazer a cada volta.
        // }
        
        // pra entender melhor vamos detalhar cada parte.
        // for (int contador = 1;      1º ponto: onde começa? (inicialização). nosso contador começa em 1.
        //      contador <= 5;        2º ponto: até onde vai? (condição). o loop roda enquanto o contador for menor ou igual a 5.
        //      contador++) {         3º ponto: como aumenta? (incremento). após cada volta, o contador é somado +1.
       
        for (int contador = 1; contador <= 5; contador++) {
            
            // a cada 'volta' do loop, esta linha é executada.
            System.out.println("o for está na repetição número: " + contador); 
        }

        System.out.println("fim: o for executou as 5 voltas ");


        // 2. loop while: para repetições baseadas em condição (não sabemos o total de voltas) 
        
        // usamos o 'while' (enquanto) quando a repetição depende de uma condição
        // que será alterada dentro do loop.
        
        int progressoAtual = 0; 
        final int meta_do_dia = 30; // usando final, como aprendemos no dia 1, para manter o valor fixo.
        
        System.out.println("\ninício: loop while (atingir a meta) ");
        
        // o loop verifica: enquanto progressoAtual (0) for menor que a meta_do_dia (30).
        while (progressoAtual < meta_do_dia) {
            
            // ação do loop:
            progressoAtual += 10; // adiciona 10 ao progresso a cada repetição.
            
            // nota importante: esta linha de alteração (progressoAtual += 10) é a chave.
            // é ela que garante que a condição do 'while' se torne falsa em algum momento (30 < 30).
            // se não houvesse alteração, o loop seria infinito (podendo acarretar problemas).
            
            //implementando o que aprendemos no dia anterior sobre estruturas condicionais.
            //aqui faço uma verificação final: evita o erro de dizer que "está faltando" quando a meta já foi batida.
            if (progressoAtual < meta_do_dia) {
                 System.out.println("progresso atual: " + progressoAtual + " (faltando para a meta de " + meta_do_dia + ")");
            } else {
                 System.out.println("progresso atual: " + progressoAtual + " (meta atingida!)");
            }
        }
        
        System.out.println("fim: o while parou automaticamente ");
    }
}