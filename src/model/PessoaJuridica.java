
package model;

import javax.persistence.Entity;

@Entity

public class PessoaJuridica {
    
	public String cnpj;
	public String ie;

    public PessoaJuridica(String cnpj, String ie) {
        this.cnpj = cnpj;
        this.ie = ie;
    }

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