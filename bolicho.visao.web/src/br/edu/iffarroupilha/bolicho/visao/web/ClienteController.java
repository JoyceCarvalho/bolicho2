package br.edu.iffarroupilha.bolicho.visao.web;

import br.com.caelum.vraptor.Resource;
import br.edu.iffarroupilha.bolicho2.controle.ClienteControle;
import br.edu.iffarroupilha.bolicho2.modelo.Cliente;

@Resource
public class ClienteController {
	
	public void listar(){
		System.out.println("aqui vamos buscar os clientes!!");
	}
	
	public void gravar(){
		ClienteControle controle = new ClienteControle();
		
		//Objeto temporario
		Cliente c = new Cliente();
		c.setNome("João");
		c.setCpf(1234);
		
		controle.gravar( c );
	}
}
