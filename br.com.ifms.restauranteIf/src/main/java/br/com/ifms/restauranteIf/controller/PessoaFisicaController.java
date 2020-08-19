
package main.java.br.com.ifms.restauranteIf.controller;

import java.time.LocalDate;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.PessoaFisica;

@ManagedBean(name = "pessoaFisicaBean")
@SessionScoped
public class PessoaFisicaController {
	PessoaFisica pessoaFisica = new PessoaFisica();
	String msg = "";
	GenericDAO<PessoaFisica> pessoaFisicaDAO = new GenericDAO<PessoaFisica>();
	public void addPessoa(){
        
		pessoaFisica.setNome("Nome");
		pessoaFisica.setEndereco("Rua123");
		pessoaFisica.setTelefone("997365331");
		pessoaFisica.setdataNascimento(LocalDate.now());
		pessoaFisica.setdataCadastro(LocalDate.now());
		pessoaFisica.setCpf(123);
		pessoaFisica.setRg(456);
		pessoaFisicaDAO.novo(pessoaFisica);
	}
}
