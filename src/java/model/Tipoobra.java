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
@Table(name = "tipoobra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoobra.findAll", query = "SELECT t FROM Tipoobra t")
    , @NamedQuery(name = "Tipoobra.findByIdTipoObra", query = "SELECT t FROM Tipoobra t WHERE t.idTipoObra = :idTipoObra")
    , @NamedQuery(name = "Tipoobra.findByTipoObra", query = "SELECT t FROM Tipoobra t WHERE t.tipoObra = :tipoObra")})
public class Tipoobra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoObra")
    private Integer idTipoObra;
    @Column(name = "TipoObra")
    private String tipoObra;
    @OneToMany(mappedBy = "idTipoObra")
    private Collection<Relobratipoobra> relobratipoobraCollection;

    public Tipoobra() {
    }

    public Tipoobra(Integer idTipoObra) {
        this.idTipoObra = idTipoObra;
    }

    public Integer getIdTipoObra() {
        return idTipoObra;
    }

    public void setIdTipoObra(Integer idTipoObra) {
        this.idTipoObra = idTipoObra;
    }

    public String getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    @XmlTransient
    public Collection<Relobratipoobra> getRelobratipoobraCollection() {
        return relobratipoobraCollection;
    }

    public void setRelobratipoobraCollection(Collection<Relobratipoobra> relobratipoobraCollection) {
        this.relobratipoobraCollection = relobratipoobraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoObra != null ? idTipoObra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoobra)) {
            return false;
        }
        Tipoobra other = (Tipoobra) object;
        if ((this.idTipoObra == null && other.idTipoObra != null) || (this.idTipoObra != null && !this.idTipoObra.equals(other.idTipoObra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tipoobra[ idTipoObra=" + idTipoObra + " ]";
    }
    
}
