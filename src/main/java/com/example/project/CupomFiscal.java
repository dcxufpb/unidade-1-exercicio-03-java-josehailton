package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";
	
	private static String p_L = System.lineSeparator();
	
	public static void imprimirCupom(){
		
		if (NOME_LOJA.isEmpty()){
			return "O campo nome da loja é obrigatório";
		}
		
		if (LOGRADOURO.isEmpty()){
			return"O campo logradouro do endereço é obrigatório";
		}
		
		String _logradouro = LOGRADOURO + ", ";
		String _numero = "0";
		
		if (NUMERO == 0){
			_numero = "s/n";
		}else{
			_numero = NUMERO;
		}
		
		String _complemento = " " + COMPLEMENTO;

		String _BAIRRO = "";
		if(BAIRRO != ""){
			_BAIRRO = BAIRRO + " - " ;
		}

		if (MUNICIPIO.isEmpty()){
			System.out.printf("O campo município do endereço é obrigatório");
			return;
		}
		String _municipio = MUNICIPIO + " - ";

		if (ESTADO.isEmpty()){
			System.out.printf("O campo estado do endereço é obrigatório");
			return;
		}
		
		String _CEP = "";
		if(CEP != ""){
			_CEP = "CEP:" + CEP;
		}
		
		String _TELEFONE = "";
		if(TELEFONE != ""){
			_TELEFONE = "Tel " + TELEFONE;
		}
		
		

		if (CNPJ.isEmpty()){
			return "O campo CNPJ da loja é obrigatório";
		}
		String _cnpj = "CNPJ: " + CNPJ;

		if (INSCRICAO_ESTADUAL.isEmpty()){
			return "O campo inscrição estadual da loja é obrigatório";
		}
		String _inscricao_estadual = "IE: " + INSCRICAO_ESTADUAL;
		
		
		System.out.println (NOME_LOJA + p_L +
		_logradouro + _numero + _complemento + p_L +
		_bairro + _municipio + ESTADO + p_L +
		_cep + _telefone + p_L +
		OBSERVACAO + p_L +
		_cnpj + p_L +
		_inscricao_estadual + p_L);	
	}

	public static void main(final String[] args) {
		imrpimirCupom();
	}

}
