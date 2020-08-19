/**
 * 
 */
package main.java.br.com.ifms.restauranteIf.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.ItensVendas;
import main.java.br.com.ifms.restauranteIf.model.Produto;

/**
 * @author Fernando
 *
 */
@ManagedBean(name = "itensVendasBean")
@SessionScoped
public class ItensVendasController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6669605028909217519L;
	ItensVendas itensVendas = new ItensVendas();
	String msg = "";
	GenericDAO<ItensVendas> itensVendasDAO = new GenericDAO<ItensVendas>();
	Produto produto = new Produto();

	public void addItensVendas(){
		itensVendas.setProduto(produto);
		itensVendas.setQuantidade(123);
		itensVendasDAO.novo(itensVendas);
	}
}
