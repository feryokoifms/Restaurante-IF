
package main.java.br.com.ifms.restauranteIf.controller;

import java.io.Serializable;
import java.time.LocalDate;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.Cliente;

@ManagedBean(name = "clienteBean")
@SessionScoped
public class ClienteController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2222934889377843924L;
	Cliente cliente = new Cliente();
	String msg = "";
GenericDAO<Cliente> clienteDAO = new GenericDAO<Cliente>();
	
	public void addCliente(){
		cliente.setNome("fernando");
		cliente.setTelefone("997365331");
		cliente.setEndereco("Rua pres vargas 2060");
		cliente.setdataNascimento(LocalDate.now());
		
		clienteDAO.novo(cliente);
	}
}
