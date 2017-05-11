package br.edu.iffarroupilha.bolicho.visao.web;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.edu.iffarroupilha.bolicho2.controle.ClienteControle;
import br.edu.iffarroupilha.bolicho2.modelo.Cliente;

@Resource
public class ClienteController {
	
	private ClienteControle controle;
	private Result result;

	public ClienteController(ClienteControle controle, Result result) {
		
		this.controle = controle;
		this.result = result;
		
	}
	
	public void listar(){
		
		List itens = controle.buscarTodos(Cliente.class);
		result.include("clientes", itens);
		
		
	}
	
	public void gravar(){
		ClienteControle controle = new ClienteControle();
		
		//Objeto temporario
		Cliente c = new Cliente();
		c.setNome("Pedro");
		c.setCpf(1235);
		
		controle.gravar( c );
	}
}
