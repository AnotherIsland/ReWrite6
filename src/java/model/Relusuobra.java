/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author victor
 */
@Entity
@Table(name = "relusuobra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relusuobra.findAll", query = "SELECT r FROM Relusuobra r")
    , @NamedQuery(name = "Relusuobra.findByIdRelUSuObra", query = "SELECT r FROM Relusuobra r WHERE r.idRelUSuObra = :idRelUSuObra")})
public class Relusuobra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRelUSuObra")
    private Integer idRelUSuObra;
    @JoinColumn(name = "idObra", referencedColumnName = "idObra")
    @ManyToOne
    private Obra idObra;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne
    private Usuario idUsuario;

    public Relusuobra() {
    }

    public Relusuobra(Integer idRelUSuObra) {
        this.idRelUSuObra = idRelUSuObra;
    }

    public Integer getIdRelUSuObra() {
        return idRelUSuObra;
    }

    public void setIdRelUSuObra(Integer idRelUSuObra) {
        this.idRelUSuObra = idRelUSuObra;
    }

    public Obra getIdObra() {
        return idObra;
    }

    public void setIdObra(Obra idObra) {
        this.idObra = idObra;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelUSuObra != null ? idRelUSuObra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relusuobra)) {
            return false;
        }
        Relusuobra other = (Relusuobra) object;
        if ((this.idRelUSuObra == null && other.idRelUSuObra != null) || (this.idRelUSuObra != null && !this.idRelUSuObra.equals(other.idRelUSuObra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relusuobra[ idRelUSuObra=" + idRelUSuObra + " ]";
    }
    
}
