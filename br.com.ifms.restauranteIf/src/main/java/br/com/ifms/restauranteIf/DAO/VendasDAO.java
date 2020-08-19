
package main.java.br.com.ifms.restauranteIf.DAO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.Cliente;
import main.java.br.com.ifms.restauranteIf.model.ItensVendas;
import main.java.br.com.ifms.restauranteIf.model.Mesa;
import main.java.br.com.ifms.restauranteIf.model.Vendas;

public class VendasDAO {

	Vendas vendas = new Vendas();
	GenericDAO<Vendas> vendasDAO = new GenericDAO<Vendas>();
	List<ItensVendas> itensVendas;
	Cliente cliente = new Cliente();
	Mesa mesa = new Mesa();
	public void addVendas(){
		vendas.setCliente(cliente);
		vendas.setDataVenda(LocalDate.now());
		vendas.setHoraVenda(LocalTime.now());
		vendas.setMesa(mesa);
		vendas.setItensVendas(itensVendas);
		vendas.setTotalVenda(12.30);
		vendasDAO.novo(vendas);
	}
}