
package main.java.br.com.ifms.restauranteIf.DAO;

import java.time.LocalDate;
import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.Cliente;

public class ClienteDAO {
	Cliente cliente = new Cliente();
	GenericDAO<Cliente> clienteDAO = new GenericDAO<Cliente>();
	
	public void addCliente(){
		cliente.setNome("fernando");
		cliente.setTelefone("997365331");
		cliente.setEndereco("Rua pres vargas 2060");
		cliente.setdataNascimento(LocalDate.now());
		cliente.setLogin("");
		cliente.setSenha("");
		
		clienteDAO.novo(cliente);
	}
}