
package main.java.br.com.ifms.restauranteIf.DAO;

import java.time.LocalDate;
import main.java.br.com.ifms.restauranteIf.jpaUtil.GenericDAO;
import main.java.br.com.ifms.restauranteIf.model.PessoaFisica;

public class PessoaFisicaDAO {
	PessoaFisica pessoaFisica = new PessoaFisica();
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