
public class PessoaFisica extends Cliente {

	String cpf;
	int zonaImovel, tipoResidencia;
	float taxaImovel = 0.02f;
	float taxaImovelUrbano = 0.01f;
	float taxaSuburbano = 0.005f;
	float taxaResidencia = 0.005f;
	
	public PessoaFisica(String nome, String endereco, String cpf, int zonaImovel, int tipoResidencia){
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.zonaImovel = zonaImovel;
		this.tipoResidencia = tipoResidencia;
		
	}

	public float valorContratoResidencial() {

		switch (zonaImovel) {

		case 1:
			if (tipoResidencia == 1) {
				valorSeguro = ((valorImovel * taxaImovel)) + ((valorImovel * taxaImovelUrbano)) + ((valorImovel * taxaResidencia));
			}
			else{
				valorSeguro = ((valorImovel * taxaImovel)) + ((valorImovel * taxaImovelUrbano));
			}
		case 2:
			if(tipoResidencia == 1){
				valorSeguro = ((valorImovel * taxaImovel)) + ((valorImovel * taxaSuburbano)) + ((valorImovel * taxaResidencia));
			}
			else{
				valorSeguro = ((valorImovel * taxaImovel)) + ((valorImovel * taxaSuburbano));
			}
		case 3:
			if (tipoResidencia == 1){
				valorSeguro = ((valorImovel * taxaImovel)) + ((valorImovel * taxaResidencia));
			}
			else{
				valorSeguro = ((valorImovel * taxaImovel));
			}

		}
		return valorSeguro;

	}

}