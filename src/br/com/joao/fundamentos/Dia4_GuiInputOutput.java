package br.com.joao.fundamentos;

import javax.swing.JOptionPane;

public class Dia4_GuiInputOutput {
	
public static void main(String[]args) {
		
		// dia 4: - Input e Output no JOption
		// hoje vamos focar em entender como funciona a Entrada de dados,
		// amanhâ aprenderemos como deixar o código intacto contra
	    // erros de usuários ao receber dados
		
		
		
		//---------------------------------------------------------------------------------
		
		   //receber e imprimir dados via GUI ()JOptionPane - janelas de diálago)
		
		
		   // primeiro importamos a biblioteca  javax.swing.JOptionPane; com um import
		
		   // receber e imprimir dados do tipo string 
		
		String nome = JOptionPane.showInputDialog(null, "digite seu nome: ");
	    
		JOptionPane.showMessageDialog(null, "olá " + nome);
	    
	       // receber e imprimir dados do tipo int
	    
		String inputIdade = JOptionPane.showInputDialog(null, "digite sua idade: ");
		int idade = Integer.parseInt(inputIdade);
	    
		JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
	 
	       // receber e imprimir dados do tipo double (GUI)
	    
		String inputNota = JOptionPane.showInputDialog(null, "digite sua nota: ");
		double nota = Double.parseDouble(inputNota);
	    
		JOptionPane.showMessageDialog(null, "sua nota é: " + nota);
		
	}

}
