
package model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class ItensVendas {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public long id;
	public LocalDate dataVenda;
	public int quantidade;
    
    @OneToMany
    public Produto produto;
    
    public ItensVendas (long id, LocalDate dataVenda, int quantidade) {
    	this.id = id;
        this.dataVenda = dataVenda;
        this.quantidade = quantidade;
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}