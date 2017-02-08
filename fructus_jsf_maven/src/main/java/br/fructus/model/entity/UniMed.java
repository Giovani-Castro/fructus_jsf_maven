
package br.fructus.model.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="unidade_medida")
public class UniMed implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="Unidade",nullable=false)
    private String Unidade;
    @Column(name="descricao")
    private String descricao ;   

    public UniMed() {
    }

    public String getUnidade() {
        return Unidade;
    }

    public void setUnidade(String Unidade) {
        this.Unidade = Unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.Unidade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UniMed other = (UniMed) obj;
        if (!Objects.equals(this.Unidade, other.Unidade)) {
            return false;
        }
        return true;
    }

    
}
