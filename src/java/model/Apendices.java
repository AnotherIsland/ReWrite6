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
import javax.persistence.Lob;
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
@Table(name = "apendices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apendices.findAll", query = "SELECT a FROM Apendices a")
    , @NamedQuery(name = "Apendices.findByIdApendices", query = "SELECT a FROM Apendices a WHERE a.idApendices = :idApendices")
    , @NamedQuery(name = "Apendices.findByTitulo", query = "SELECT a FROM Apendices a WHERE a.titulo = :titulo")})
public class Apendices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idApendices")
    private Integer idApendices;
    @Column(name = "titulo")
    private String titulo;
    @Lob
    @Column(name = "contenido")
    private String contenido;
    @OneToMany(mappedBy = "idApendice")
    private Collection<Relapendiarti> relapendiartiCollection;

    public Apendices() {
    }

    public Apendices(Integer idApendices) {
        this.idApendices = idApendices;
    }

    public Integer getIdApendices() {
        return idApendices;
    }

    public void setIdApendices(Integer idApendices) {
        this.idApendices = idApendices;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @XmlTransient
    public Collection<Relapendiarti> getRelapendiartiCollection() {
        return relapendiartiCollection;
    }

    public void setRelapendiartiCollection(Collection<Relapendiarti> relapendiartiCollection) {
        this.relapendiartiCollection = relapendiartiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idApendices != null ? idApendices.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apendices)) {
            return false;
        }
        Apendices other = (Apendices) object;
        if ((this.idApendices == null && other.idApendices != null) || (this.idApendices != null && !this.idApendices.equals(other.idApendices))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Apendices[ idApendices=" + idApendices + " ]";
    }
    
}
