
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public Long id;
	public String descricao;
	public int estoque;
	public int estoqueMin;
	public Double valor;

    public Produto(Long id, String descricao, int estoque, int estoqueMin, Double valor) {
        this.id = id;
        this.descricao = descricao;
        this.estoque = estoque;
        this.estoqueMin = estoqueMin;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}