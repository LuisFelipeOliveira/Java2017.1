import javax.swing.JOptionPane;

public class UsaAgencia {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		Menu menu = new Menu();
		int opcao = 0;
		String inputText;
		Float valorOperacao = 0.0f;
		
		while(true){
			
			inputText = menu.menuPrincipal();
			opcao = Integer.parseInt(inputText);
			if(opcao == 1){
				inputText = menu.inputValor();
				valorOperacao = Float.parseFloat(inputText);
				valorOperacao = conta.getSaldo()-valorOperacao;
				conta.setSaldo(valorOperacao);
				JOptionPane.showMessageDialog(null, "Sacado com sucesso!");
			}
			if(opcao == 2){
				inputText = menu.inputValor();
				valorOperacao = Float.parseFloat(inputText);
				valorOperacao = conta.getSaldo()+valorOperacao;
				conta.setSaldo(valorOperacao);
				JOptionPane.showMessageDialog(null, "Depositado com sucesso!");
			}
			if(opcao == 3){
				valorOperacao = conta.getSaldo();
				JOptionPane.showMessageDialog(null, "Seu saldo atual é: R$"+conta.getSaldo());
			}
			if(opcao == 4){
				String msg = "Adios!!";
				JOptionPane.showMessageDialog(null, msg);
				System.exit(0);
			}
		}
		
	}

}
