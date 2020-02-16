
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Mesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public long id;
	public int numero;
	public Boolean status;
	
    @OneToOne
    public Cliente cliente;
    
    public Mesa (long id, int numero, boolean status) {
    	this.id = id;
        this.numero = numero;
        this.status = status;
    }
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}	
}