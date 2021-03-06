package br.edu.iffarroupilha.bolicho2.controle;

import br.edu.iffarroupilha.bolicho2.modelo.Cliente;

/**
*<p>
*Classe de logica para a entidade cliente
*</p>
**/
public class ClienteControle extends AControle{
	
	/**
	 * <p>
	 * Valida se os dados do cliente est�o corretos
	 * </p>
	 * @param cli
	 * @return
	 */
	public String validarCliente(Cliente cli){
		if (cli != null) {
			if (cli.getCpf() == 0) {
				return "Informe o CPF";
			} else if(cli.getNome() == null || cli.getNome().isEmpty()){
				return "Por favor, informe um nome";
			}
		} else {
			return "Dados do cliente n�o informado!";
		}
		return null;
	}
	

}