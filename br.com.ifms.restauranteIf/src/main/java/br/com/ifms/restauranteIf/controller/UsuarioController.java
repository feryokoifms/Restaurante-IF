
package main.java.br.com.ifms.restauranteIf.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.Usuario;

@ManagedBean(name = "usuarioBean")
@SessionScoped
public class UsuarioController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9208848324112410709L;
	Usuario usuario = new Usuario();
	String msg = "";

	GenericDAO<Usuario> usuarioDAO = new GenericDAO<Usuario>();

	public void addUsuario() {
		usuario.setLogin("abc");
		usuario.setSenha("456");

	}
}
