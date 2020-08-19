
package main.java.br.com.ifms.restauranteIf.DAO;

import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.ItensVendas;
import main.java.br.com.ifms.restauranteIf.model.Produto;

public class ItensVendasDAO {
	ItensVendas itensVendas = new ItensVendas();
	GenericDAO<ItensVendas> itensVendasDAO = new GenericDAO<ItensVendas>();
	Produto produto = new Produto();

	public void addItensVendas(){
		itensVendas.setProduto(produto);
		itensVendas.setQuantidade(123);
		itensVendasDAO.novo(itensVendas);
	}
}