
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;

@Entity

public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public long id;
	public LocalDate dataVenda;
	public Double totalVenda;
	public List<?> itensVenda;
    
    @OneToOne
    private Mesa mesa;
    private Cliente cliente;

    public Vendas(long id, LocalDate dataVenda, Double totalVenda, List<?> itensVenda) {
        this.id = id;
        this.dataVenda = dataVenda;
        this.totalVenda = totalVenda;
        this.itensVenda = itensVenda;
    	
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

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public List<?> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<?> itensVenda) {
        this.itensVenda = itensVenda;
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
    }
}