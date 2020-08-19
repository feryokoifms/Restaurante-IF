
package main.java.br.com.ifms.restauranteIf.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.Mesa;

@ManagedBean(name = "mesaBean")
@SessionScoped
public class MesaController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9204672600243570344L;
	Mesa mesa = new Mesa();
	String msg = "";
	GenericDAO<Mesa> mesaDAO = new GenericDAO<Mesa>();
	public void addMesa(){
		
	}
}
