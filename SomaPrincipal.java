package br.unipe.java.unidade1;

import java.util.Scanner;

public class SomaPrincipal {

	public static void main(String[] args) {
		int x, y = 0;
		Scanner numero1 = new Scanner(System.in);
		Scanner numero2 = new Scanner(System.in);
		SomaNumero soma = new SomaNumero();
		
		System.out.println("Numero 1: ");
		x = numero1.nextInt();
		System.out.println("\nNumero 2: ");
		y = numero2.nextInt();
		
		soma.somar(x, y);
		
		numero1.close();
		numero2.close();
		

	}

}
