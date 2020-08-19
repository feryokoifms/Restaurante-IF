
package main.java.br.com.ifms.restauranteIf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate dataVenda;
	private LocalTime horaVenda;
	private Double totalVenda;
	
    @OneToOne
    private Mesa mesa;
    @OneToOne
    private Cliente cliente;
    @ManyToMany
    private List<ItensVendas> itensVendas;

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
    
    public LocalTime getHoraVenda() {
		return horaVenda;
	}

	public void setHoraVenda(LocalTime horaVenda) {
		this.horaVenda = horaVenda;
	}

    public Double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
    
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
    }

	public List<?> getItensVendas() {
		return itensVendas;
	}
	public void setItensVendas(List<ItensVendas> itensVendas) {
		this.itensVendas = itensVendas;
	}
}