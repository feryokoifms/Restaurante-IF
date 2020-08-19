
package main.java.br.com.ifms.restauranteIf.controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.Cliente;
import main.java.br.com.ifms.restauranteIf.model.ItensVendas;
import main.java.br.com.ifms.restauranteIf.model.Mesa;
import main.java.br.com.ifms.restauranteIf.model.Vendas;

@ManagedBean(name = "vendasBean")
@SessionScoped
public class VendasController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4593485515401939049L;
	Vendas vendas = new Vendas();
	String msg = "";
	GenericDAO<Vendas> vendasDAO = new GenericDAO<Vendas>();
	List<ItensVendas> itensVendas;
	Cliente cliente = new Cliente();
	Mesa mesa = new Mesa();

	public void addVendas() {
		vendas.setCliente(cliente);
		vendas.setDataVenda(LocalDate.now());
		vendas.setHoraVenda(LocalTime.now());
		vendas.setMesa(mesa);
		vendas.setItensVendas(itensVendas);
		vendas.setTotalVenda(20.20);
		vendasDAO.novo(vendas);
	}
}
