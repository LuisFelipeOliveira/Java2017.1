package br.unipe.java.unidade1;

import java.util.Scanner;

public class NomeIdade {
	
	public static void main(String[] args) {
		Scanner scan_nome = new Scanner(System.in);
		Scanner scan_idade = new Scanner(System.in);
		
		String nome;
		int idade = 0;
		
		System.out.println("Qual seu nome? ");
		nome =  scan_nome.nextLine();
		System.out.println("\nQual sua idade? ");
		idade =  scan_idade.nextInt();
		
		System.out.println("Seu nome é "+nome+" e sua idade é "+idade+"anos");
		
		scan_nome.close();
		scan_idade.close();
	}

}
