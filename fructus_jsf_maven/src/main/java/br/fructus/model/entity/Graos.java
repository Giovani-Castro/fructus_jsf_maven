
package br.fructus.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToOne;


@Entity
@Table(name="graos")
public class Graos implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="IdGraos", nullable=false)
    private int IdGraos;
    @Column(name="Descrição", length= 20)
    private String Descrição;
    @JoinColumn(name="Unidade" , referencedColumnName = "Unidade")
    @ManyToOne(optional=false)
    private UniMed Unidade;

        
    public Graos() {
    }

    public int getIdGraos() {
        return IdGraos;
    }

    public void setIdGraos(int IdGraos) {
        this.IdGraos = IdGraos;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }

    public UniMed getUnidade() {
        return Unidade;
    }

    public void setUnidade(UniMed Unidade) {
        this.Unidade = Unidade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.IdGraos;
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
        final Graos other = (Graos) obj;
        if (this.IdGraos != other.IdGraos) {
            return false;
        }
        return true;
    }
    
    
    
    
}
