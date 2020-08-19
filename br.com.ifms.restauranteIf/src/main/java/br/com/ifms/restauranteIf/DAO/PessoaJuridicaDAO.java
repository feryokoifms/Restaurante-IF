
package main.java.br.com.ifms.restauranteIf.DAO;

import java.time.LocalDate;
import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.PessoaJuridica;



public class PessoaJuridicaDAO {
	PessoaJuridica pessoaJuridica = new PessoaJuridica();
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