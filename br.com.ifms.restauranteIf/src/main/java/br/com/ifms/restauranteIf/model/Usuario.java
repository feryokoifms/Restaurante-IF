
package main.java.br.com.ifms.restauranteIf.model;

import javax.persistence.Entity;
@Entity
public class Usuario extends Pessoa{
	private String login;
	private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
        
        public void autentificar() {
       	 
        }
    }