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
@Table(name = "obra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Obra.findAll", query = "SELECT o FROM Obra o")
    , @NamedQuery(name = "Obra.findByIdObra", query = "SELECT o FROM Obra o WHERE o.idObra = :idObra")
    , @NamedQuery(name = "Obra.findByTitulo", query = "SELECT o FROM Obra o WHERE o.titulo = :titulo")
    , @NamedQuery(name = "Obra.findByFecha", query = "SELECT o FROM Obra o WHERE o.fecha = :fecha")
    , @NamedQuery(name = "Obra.findByConsejos", query = "SELECT o FROM Obra o WHERE o.consejos = :consejos")})
public class Obra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idObra")
    private Integer idObra;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "consejos")
    private String consejos;
    @OneToMany(mappedBy = "idObraa")
    private Collection<Relobratipoobra> relobratipoobraCollection;
    @OneToMany(mappedBy = "idObra")
    private Collection<Relusuobra> relusuobraCollection;

    public Obra() {
    }

    public Obra(Integer idObra) {
        this.idObra = idObra;
    }

    public Integer getIdObra() {
        return idObra;
    }

    public void setIdObra(Integer idObra) {
        this.idObra = idObra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConsejos() {
        return consejos;
    }

    public void setConsejos(String consejos) {
        this.consejos = consejos;
    }

    @XmlTransient
    public Collection<Relobratipoobra> getRelobratipoobraCollection() {
        return relobratipoobraCollection;
    }

    public void setRelobratipoobraCollection(Collection<Relobratipoobra> relobratipoobraCollection) {
        this.relobratipoobraCollection = relobratipoobraCollection;
    }

    @XmlTransient
    public Collection<Relusuobra> getRelusuobraCollection() {
        return relusuobraCollection;
    }

    public void setRelusuobraCollection(Collection<Relusuobra> relusuobraCollection) {
        this.relusuobraCollection = relusuobraCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idObra != null ? idObra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Obra)) {
            return false;
        }
        Obra other = (Obra) object;
        if ((this.idObra == null && other.idObra != null) || (this.idObra != null && !this.idObra.equals(other.idObra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Obra[ idObra=" + idObra + " ]";
    }
    
}
