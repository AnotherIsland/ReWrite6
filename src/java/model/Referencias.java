/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author victor
 */
@Entity
@Table(name = "referencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Referencias.findAll", query = "SELECT r FROM Referencias r")
    , @NamedQuery(name = "Referencias.findByIdReferencias", query = "SELECT r FROM Referencias r WHERE r.idReferencias = :idReferencias")
    , @NamedQuery(name = "Referencias.findByTipoRef", query = "SELECT r FROM Referencias r WHERE r.tipoRef = :tipoRef")
    , @NamedQuery(name = "Referencias.findByAutor", query = "SELECT r FROM Referencias r WHERE r.autor = :autor")
    , @NamedQuery(name = "Referencias.findByA\u00f1o", query = "SELECT r FROM Referencias r WHERE r.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "Referencias.findByFechaConsulta", query = "SELECT r FROM Referencias r WHERE r.fechaConsulta = :fechaConsulta")
    , @NamedQuery(name = "Referencias.findByDatos", query = "SELECT r FROM Referencias r WHERE r.datos = :datos")})
public class Referencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReferencias")
    private Integer idReferencias;
    @Column(name = "tipoRef")
    private String tipoRef;
    @Column(name = "autor")
    private String autor;
    @Column(name = "a\u00f1o")
    private String año;
    @Column(name = "fechaConsulta")
    @Temporal(TemporalType.DATE)
    private Date fechaConsulta;
    @Column(name = "datos")
    private String datos;
    @OneToMany(mappedBy = "idRefere")
    private Collection<Relresurefe> relresurefeCollection;
    @OneToMany(mappedBy = "idReferencia")
    private Collection<Relrefeensayo> relrefeensayoCollection;
    @OneToMany(mappedBy = "idRefe")
    private Collection<Relrefarti> relrefartiCollection;

    public Referencias() {
    }

    public Referencias(Integer idReferencias) {
        this.idReferencias = idReferencias;
    }

    public Integer getIdReferencias() {
        return idReferencias;
    }

    public void setIdReferencias(Integer idReferencias) {
        this.idReferencias = idReferencias;
    }

    public String getTipoRef() {
        return tipoRef;
    }

    public void setTipoRef(String tipoRef) {
        this.tipoRef = tipoRef;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    @XmlTransient
    public Collection<Relresurefe> getRelresurefeCollection() {
        return relresurefeCollection;
    }

    public void setRelresurefeCollection(Collection<Relresurefe> relresurefeCollection) {
        this.relresurefeCollection = relresurefeCollection;
    }

    @XmlTransient
    public Collection<Relrefeensayo> getRelrefeensayoCollection() {
        return relrefeensayoCollection;
    }

    public void setRelrefeensayoCollection(Collection<Relrefeensayo> relrefeensayoCollection) {
        this.relrefeensayoCollection = relrefeensayoCollection;
    }

    @XmlTransient
    public Collection<Relrefarti> getRelrefartiCollection() {
        return relrefartiCollection;
    }

    public void setRelrefartiCollection(Collection<Relrefarti> relrefartiCollection) {
        this.relrefartiCollection = relrefartiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReferencias != null ? idReferencias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Referencias)) {
            return false;
        }
        Referencias other = (Referencias) object;
        if ((this.idReferencias == null && other.idReferencias != null) || (this.idReferencias != null && !this.idReferencias.equals(other.idReferencias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Referencias[ idReferencias=" + idReferencias + " ]";
    }
    
}
