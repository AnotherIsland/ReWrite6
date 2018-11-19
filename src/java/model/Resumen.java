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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "resumen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resumen.findAll", query = "SELECT r FROM Resumen r")
    , @NamedQuery(name = "Resumen.findByIdResumen", query = "SELECT r FROM Resumen r WHERE r.idResumen = :idResumen")
    , @NamedQuery(name = "Resumen.findByClaves", query = "SELECT r FROM Resumen r WHERE r.claves = :claves")
    , @NamedQuery(name = "Resumen.findByIdReferencias", query = "SELECT r FROM Resumen r WHERE r.idReferencias = :idReferencias")})
public class Resumen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idResumen")
    private Integer idResumen;
    @Lob
    @Column(name = "contenido")
    private String contenido;
    @Column(name = "claves")
    private String claves;
    @Column(name = "idReferencias")
    private Integer idReferencias;
    @JoinColumn(name = "idRelObraTipoobra", referencedColumnName = "idRelObraTipoobra")
    @ManyToOne
    private Relobratipoobra idRelObraTipoobra;
    @OneToMany(mappedBy = "idResumen")
    private Collection<Relresurefe> relresurefeCollection;

    public Resumen() {
    }

    public Resumen(Integer idResumen) {
        this.idResumen = idResumen;
    }

    public Integer getIdResumen() {
        return idResumen;
    }

    public void setIdResumen(Integer idResumen) {
        this.idResumen = idResumen;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getClaves() {
        return claves;
    }

    public void setClaves(String claves) {
        this.claves = claves;
    }

    public Integer getIdReferencias() {
        return idReferencias;
    }

    public void setIdReferencias(Integer idReferencias) {
        this.idReferencias = idReferencias;
    }

    public Relobratipoobra getIdRelObraTipoobra() {
        return idRelObraTipoobra;
    }

    public void setIdRelObraTipoobra(Relobratipoobra idRelObraTipoobra) {
        this.idRelObraTipoobra = idRelObraTipoobra;
    }

    @XmlTransient
    public Collection<Relresurefe> getRelresurefeCollection() {
        return relresurefeCollection;
    }

    public void setRelresurefeCollection(Collection<Relresurefe> relresurefeCollection) {
        this.relresurefeCollection = relresurefeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResumen != null ? idResumen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resumen)) {
            return false;
        }
        Resumen other = (Resumen) object;
        if ((this.idResumen == null && other.idResumen != null) || (this.idResumen != null && !this.idResumen.equals(other.idResumen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Resumen[ idResumen=" + idResumen + " ]";
    }
    
}
