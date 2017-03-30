package br.edu.iffarroupilha.bolicho2.controle;

import java.util.*;
/**
*<p>
*Controlador generico que agrupa as funções comuns de logicas, como gravar, buscar, etc
*</p>
*/
public abstract class AControle{
	//gravar ou atualizar uma informação em banco
	public void gravar(Object entidade){


	}
	//busca todos os registros de uma determinada entidade(classe)
	public List buscarTodos(Class classe){
		return null;
	}
	//excluir entidades
	public void excluir(Object entidade){
		
	}
	
	/**
	 * <p>
	 * Converte um termo em numero, caso esteja em formato invalido retorna-se zero
	 * </p>
	 * @param termo
	 * @return
	 */
	public int converteInteiro(String termo){
		try {
			return Integer.parseInt(termo);
		} catch (Exception e) {
			return 0;
		}
		
	}
	
}