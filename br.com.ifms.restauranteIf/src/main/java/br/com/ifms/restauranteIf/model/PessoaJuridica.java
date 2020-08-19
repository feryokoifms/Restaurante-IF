
package main.java.br.com.ifms.restauranteIf.model;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica  extends Cliente{
    
	private String cnpj;
	private String ie;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
}