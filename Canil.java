package br.unipe.java.unidade1;

/**
 * Classe que define o comportamento para o canil.
 * @author: Felipe
 * @date: 16 de fev de 2017
 *@Time: 20:58:36
 */
public class Canil {

	/**
	 * Esse método realiza o alojamento
	 * do animal para adoção ou extermínio.
	 */
	public void alojar(){
		System.out.println("Alojando cachorro");
	}
	
	/**
	 * 
	 * Esse método realiza extermínio de cachorro
	 * @param nome do animal que será exterminado
	 */
	public void exterminaCachorro(String nome){
		System.out.println("Exterminando cachorro");
	}

}
