package maxiPago.Test.Transactional;

import maxiPago.Gateway.Transaction;

public class CompleteAuth {
	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		
		try{
			transaction.Auth("100", //ID_LOJA
					"merchant_key", //CHAVE_LOJA
					"Order-001", //NUMERO_REFERENCIA
					5.00d, //VALOR
					"4111111111111111", //NUMERO_CARTAO
					"05", //MES_VALIDADE
					"2018", //ANO_VALIDADE
					"123", //CVV_CODIGO_SEGURANCA 
					"1", //PROCESSOR_ID
					"0", //NUMERO_PARCELAS
					"N", //COM_SEM_JUROS *Y = SIM N = NAO
					"127.0.0.1", //ENDERECO_IP
					"123.456.789-12", //CPF_CLIENTE
					
					//BILLING
					
					"Leonardo", //NOME_CLIENTE
					"Rua Pedro Luiz", //ENDERECO_CLIENTE
					"Casa", //ENDERECO2_CLIENTE
					"Guarulhos", //CIDADE_CLIENTE 
					"SP", //ESTADO_CLIENTE
					"07151-385", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 96478-0733", //TELEFONE_CLIENTE 
					"leonardo.nascimento@maxipago.com", //EMAIL_CLIENTE
					
					//SHIPPING
					
					"Leonardo", //NOME_CLIENTE
					"Rua Pedro Luiz", //ENDERECO_CLIENTE
					", Casa", //ENDERECO2_CLIENTE
					"Guarulhos", //CIDADE_CLIENTE 
					"SP", //ESTADO_CLIENTE
					", 07151-385", //CEP_CLIENTE
					"Brasil", //PAIS_CLIENTE
					"(11) 96478-0733", //TELEFONE_CLIENTE 
					"leonardo.nascimento@maxipago.com", //EMAIL_CLIENTE
					"BRL", //MOEDA_CLIENTE
					"Y", //REVISAO_FRAUD *Y = SIM N = NAO
					"TESTE", //SOFTDESCRIPTOR 
					2.00d
					);
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}