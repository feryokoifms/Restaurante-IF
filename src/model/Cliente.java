
package model;

import java.time.LocalDate;
import javax.persistence.Entity;

@Entity

public class Cliente {
	
    public LocalDate dataCadastro;

    public Cliente(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setdataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}