package com.example.project;

public class CupomFiscal {
	
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
			_numero = Integer.toString(NUMERO);
		}
		
		String _complemento = " " + COMPLEMENTO;

		String _bairro = "";
		if(!"".equals(BAIRRO)){
			_bairro = BAIRRO + " - " ;
		}

		if (MUNICIPIO.isEmpty()){
			return "O campo município do endereço é obrigatório";
		}
		String _municipio = MUNICIPIO + " - ";

		if (ESTADO.isEmpty()){
			return "O campo estado do endereço é obrigatório";
		}
		
		String _cep = "";
		if(!"".equals(CEP)){
			_cep = "CEP:" + CEP;
		}
		
		String _telefone = "";
		if(!"".equals(TELEFONE)){
			_telefone = "Tel " + TELEFONE;
                        
                        if(!"".equals(CEP)){
				_telefone = " " + _telefone;
			}
		}
		
		String _observacao = "";
		if (!"".equals(OBSERVACAO)){
			_observacao = OBSERVACAO;
		}

		if (CNPJ.isEmpty()){
			return "O campo CNPJ da loja é obrigatório";
		}
		String _cnpj = "CNPJ: " + CNPJ;

		if (INSCRICAO_ESTADUAL.isEmpty()){
			return "O campo inscrição estadual da loja é obrigatório";
		}
		String _inscricaoEstadual = "IE: " + INSCRICAO_ESTADUAL;
		
		
		String cupomPronto = String.format("%s",NOME_LOJA) + p_L;
		cupomPronto += String.format("%s, %s%s",_logradouro,_numero,_complemento) + p_L;
		cupomPronto += String.format("%s%s - %s",_bairro,_municipio,ESTADO) + p_L;
		cupomPronto += String.format("%s%s",_cep,_telefone) + p_L;
		cupomPronto += String.format("%s",_observacao) + p_L;
		cupomPronto += String.format("CNPJ: %s",_cnpj) + p_L;
		cupomPronto += String.format("IE: %s",_inscricaoEstadual) + p_L;
                
                return cupomPronto;

	public static void main(final String[] args) {
		imrpimirCupom();
	}

}
