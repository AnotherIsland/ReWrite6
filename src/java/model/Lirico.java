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
@Table(name = "lirico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lirico.findAll", query = "SELECT l FROM Lirico l")
    , @NamedQuery(name = "Lirico.findByIdLirico", query = "SELECT l FROM Lirico l WHERE l.idLirico = :idLirico")})
public class Lirico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLirico")
    private Integer idLirico;
    @JoinColumn(name = "idEstrofa", referencedColumnName = "idEstrofa")
    @ManyToOne
    private Estrofa idEstrofa;
    @JoinColumn(name = "idRelObraTipoobra", referencedColumnName = "idRelObraTipoobra")
    @ManyToOne
    private Relobratipoobra idRelObraTipoobra;

    public Lirico() {
    }

    public Lirico(Integer idLirico) {
        this.idLirico = idLirico;
    }

    public Integer getIdLirico() {
        return idLirico;
    }

    public void setIdLirico(Integer idLirico) {
        this.idLirico = idLirico;
    }

    public Estrofa getIdEstrofa() {
        return idEstrofa;
    }

    public void setIdEstrofa(Estrofa idEstrofa) {
        this.idEstrofa = idEstrofa;
    }

    public Relobratipoobra getIdRelObraTipoobra() {
        return idRelObraTipoobra;
    }

    public void setIdRelObraTipoobra(Relobratipoobra idRelObraTipoobra) {
        this.idRelObraTipoobra = idRelObraTipoobra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLirico != null ? idLirico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lirico)) {
            return false;
        }
        Lirico other = (Lirico) object;
        if ((this.idLirico == null && other.idLirico != null) || (this.idLirico != null && !this.idLirico.equals(other.idLirico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Lirico[ idLirico=" + idLirico + " ]";
    }
    
}
