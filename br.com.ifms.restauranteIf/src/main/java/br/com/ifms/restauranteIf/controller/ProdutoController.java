/**
 * 
 */
package main.java.br.com.ifms.restauranteIf.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.Produto;

/**
 * @author Fernando
 *
 */
@ManagedBean(name = "produtoBean")
@SessionScoped
public class ProdutoController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8476321868451922983L;
	Produto produto = new Produto();
	String msg = "";
	GenericDAO<Produto> produtoDAO = new GenericDAO<Produto>();

	public void addProduto() {

		produto.setId(123);
		produto.setDescricao("abc");
		produto.setEstoque(123);
		produto.setEstoqueMin(12);
		produto.setValor(10.00);

	}
}
