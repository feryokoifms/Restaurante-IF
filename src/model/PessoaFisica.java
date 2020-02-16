
package model;

import javax.persistence.Entity;

@Entity

public class PessoaFisica {
    
	public int cpf;
	public int rg;

    public PessoaFisica(int cpf, int rg) {
        this.cpf = cpf;
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
}