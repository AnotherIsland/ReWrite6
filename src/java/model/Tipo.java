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
@Table(name = "tipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipo.findAll", query = "SELECT t FROM Tipo t")
    , @NamedQuery(name = "Tipo.findByIdTipo", query = "SELECT t FROM Tipo t WHERE t.idTipo = :idTipo")
    , @NamedQuery(name = "Tipo.findByNombre", query = "SELECT t FROM Tipo t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tipo.findByNumVersos", query = "SELECT t FROM Tipo t WHERE t.numVersos = :numVersos")
    , @NamedQuery(name = "Tipo.findByRima", query = "SELECT t FROM Tipo t WHERE t.rima = :rima")})
public class Tipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipo")
    private Integer idTipo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "numVersos")
    private Integer numVersos;
    @Column(name = "rima")
    private Integer rima;
    @OneToMany(mappedBy = "idTipo")
    private Collection<Relestrofatipo> relestrofatipoCollection;

    public Tipo() {
    }

    public Tipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumVersos() {
        return numVersos;
    }

    public void setNumVersos(Integer numVersos) {
        this.numVersos = numVersos;
    }

    public Integer getRima() {
        return rima;
    }

    public void setRima(Integer rima) {
        this.rima = rima;
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
        hash += (idTipo != null ? idTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipo)) {
            return false;
        }
        Tipo other = (Tipo) object;
        if ((this.idTipo == null && other.idTipo != null) || (this.idTipo != null && !this.idTipo.equals(other.idTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tipo[ idTipo=" + idTipo + " ]";
    }
    
}
