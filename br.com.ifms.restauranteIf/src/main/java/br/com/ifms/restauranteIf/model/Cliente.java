
package main.java.br.com.ifms.restauranteIf.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Cliente extends Pessoa{
	
	private LocalDate dataCadastro;

	public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setdataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

	public void setLogin(String string) {
		
	}

	public static void setSenha(int i) {
		
	}
}