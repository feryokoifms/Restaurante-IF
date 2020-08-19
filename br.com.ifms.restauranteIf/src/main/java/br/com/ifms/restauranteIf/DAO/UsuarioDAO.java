
package main.java.br.com.ifms.restauranteIf.DAO;

import java.time.LocalDate;
import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.Cliente;
import main.java.br.com.ifms.restauranteIf.model.Usuario;

public class UsuarioDAO {
	Usuario usuario = new Usuario();
	GenericDAO<Usuario> usuarioDAO = new GenericDAO<Usuario>();
	
	public void addUsuario(){
		Cliente.setLogin();
		Cliente.setSenha(456);
	}
}