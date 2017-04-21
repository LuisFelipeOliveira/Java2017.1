
public class PessoaJuridica extends Cliente {

	int qtdFuncionarios, qtdVisitasDiarias, ramo;
	String cnpj;
	float taxaImovelEmp = 0.04f;
	float taxaIndustria = 0.01f;
	float taxaComercio = 0.005f;
	float taxaFuncionarios = 0.002f;
	float taxaVisitas = 0.003f;
	
	
	public float valorContratoEmpresarial(){
		
		switch(ramo){
		
		case 1:
			if(qtdFuncionarios % 10 == 0){
				
			}
			valorSeguro = ((valorImovel * taxaImovelEmp)) + ((valorImovel * taxaIndustria)) + (valorImovel * (taxaFuncionarios * (qtdFuncionarios / 10))) + (valorImovel * (taxaVisitas * (qtdVisitasDiarias / 200)));
			break;
		case 2:
			valorSeguro = ((valorImovel * taxaImovelEmp)) + ((valorImovel * taxaComercio));
			
		}
		
		return valorSeguro;
	}

}