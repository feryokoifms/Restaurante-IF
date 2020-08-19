
package main.java.br.com.ifms.restauranteIf.controller;

import java.io.Serializable;
import java.time.LocalDate;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.PessoaJuridica;

@ManagedBean(name = "pessoaJuridicaBean")
@SessionScoped
public class PessoaJuridicaController implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4936169610528430859L;
	PessoaJuridica pessoaJuridica = new PessoaJuridica();
	String msg = "";
	GenericDAO<PessoaJuridica> pessoaJuridicaDAO = new GenericDAO<PessoaJuridica>();
	public void addPessoa(){
        
		pessoaJuridica.setNome("fer");
		pessoaJuridica.setTelefone("5331");
		pessoaJuridica.setdataCadastro(LocalDate.now());
		pessoaJuridica.setdataNascimento(LocalDate.now());
		pessoaJuridica.setEndereco("Rua A");
		pessoaJuridica.setIe("567");
		pessoaJuridica.setCnpj("123");
		pessoaJuridicaDAO.novo(pessoaJuridica);
	}
}
