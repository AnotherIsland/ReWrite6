/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author victor
 */
@Entity
@Table(name = "actos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actos.findAll", query = "SELECT a FROM Actos a")
    , @NamedQuery(name = "Actos.findByIdActos", query = "SELECT a FROM Actos a WHERE a.idActos = :idActos")
    , @NamedQuery(name = "Actos.findByEscenario", query = "SELECT a FROM Actos a WHERE a.escenario = :escenario")})
public class Actos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idActos")
    private Integer idActos;
    @Column(name = "Escenario")
    private String escenario;
    @OneToMany(mappedBy = "idActos")
    private Collection<Dramatico> dramaticoCollection;
    @OneToMany(mappedBy = "idActos")
    private Collection<Relactodialo> relactodialoCollection;

    public Actos() {
    }

    public Actos(Integer idActos) {
        this.idActos = idActos;
    }

    public Integer getIdActos() {
        return idActos;
    }

    public void setIdActos(Integer idActos) {
        this.idActos = idActos;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    @XmlTransient
    public Collection<Dramatico> getDramaticoCollection() {
        return dramaticoCollection;
    }

    public void setDramaticoCollection(Collection<Dramatico> dramaticoCollection) {
        this.dramaticoCollection = dramaticoCollection;
    }

    @XmlTransient
    public Collection<Relactodialo> getRelactodialoCollection() {
        return relactodialoCollection;
    }

    public void setRelactodialoCollection(Collection<Relactodialo> relactodialoCollection) {
        this.relactodialoCollection = relactodialoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActos != null ? idActos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actos)) {
            return false;
        }
        Actos other = (Actos) object;
        if ((this.idActos == null && other.idActos != null) || (this.idActos != null && !this.idActos.equals(other.idActos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Actos[ idActos=" + idActos + " ]";
    }
    
}
