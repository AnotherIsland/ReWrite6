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
@Table(name = "estrofa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estrofa.findAll", query = "SELECT e FROM Estrofa e")
    , @NamedQuery(name = "Estrofa.findByIdEstrofa", query = "SELECT e FROM Estrofa e WHERE e.idEstrofa = :idEstrofa")
    , @NamedQuery(name = "Estrofa.findByVersos", query = "SELECT e FROM Estrofa e WHERE e.versos = :versos")})
public class Estrofa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstrofa")
    private Integer idEstrofa;
    @Column(name = "versos")
    private String versos;
    @OneToMany(mappedBy = "idEstrofa")
    private Collection<Lirico> liricoCollection;
    @OneToMany(mappedBy = "idEstrofa")
    private Collection<Relestrofatipo> relestrofatipoCollection;

    public Estrofa() {
    }

    public Estrofa(Integer idEstrofa) {
        this.idEstrofa = idEstrofa;
    }

    public Integer getIdEstrofa() {
        return idEstrofa;
    }

    public void setIdEstrofa(Integer idEstrofa) {
        this.idEstrofa = idEstrofa;
    }

    public String getVersos() {
        return versos;
    }

    public void setVersos(String versos) {
        this.versos = versos;
    }

    @XmlTransient
    public Collection<Lirico> getLiricoCollection() {
        return liricoCollection;
    }

    public void setLiricoCollection(Collection<Lirico> liricoCollection) {
        this.liricoCollection = liricoCollection;
    }

    @XmlTransient
    public Collection<Relestrofatipo> getRelestrofatipoCollection() {
        return relestrofatipoCollection;
    }

    public void setRelestrofatipoCollection(Collection<Relestrofatipo> relestrofatipoCollection) {
        this.relestrofatipoCollection = relestrofatipoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstrofa != null ? idEstrofa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estrofa)) {
            return false;
        }
        Estrofa other = (Estrofa) object;
        if ((this.idEstrofa == null && other.idEstrofa != null) || (this.idEstrofa != null && !this.idEstrofa.equals(other.idEstrofa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Estrofa[ idEstrofa=" + idEstrofa + " ]";
    }
    
}
