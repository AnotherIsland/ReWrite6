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
@Table(name = "relestrofatipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relestrofatipo.findAll", query = "SELECT r FROM Relestrofatipo r")
    , @NamedQuery(name = "Relestrofatipo.findByIdRelEstrofaTipo", query = "SELECT r FROM Relestrofatipo r WHERE r.idRelEstrofaTipo = :idRelEstrofaTipo")})
public class Relestrofatipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRelEstrofaTipo")
    private Integer idRelEstrofaTipo;
    @JoinColumn(name = "idEstrofa", referencedColumnName = "idEstrofa")
    @ManyToOne
    private Estrofa idEstrofa;
    @JoinColumn(name = "idTipo", referencedColumnName = "idTipo")
    @ManyToOne
    private Tipo idTipo;

    public Relestrofatipo() {
    }

    public Relestrofatipo(Integer idRelEstrofaTipo) {
        this.idRelEstrofaTipo = idRelEstrofaTipo;
    }

    public Integer getIdRelEstrofaTipo() {
        return idRelEstrofaTipo;
    }

    public void setIdRelEstrofaTipo(Integer idRelEstrofaTipo) {
        this.idRelEstrofaTipo = idRelEstrofaTipo;
    }

    public Estrofa getIdEstrofa() {
        return idEstrofa;
    }

    public void setIdEstrofa(Estrofa idEstrofa) {
        this.idEstrofa = idEstrofa;
    }

    public Tipo getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Tipo idTipo) {
        this.idTipo = idTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelEstrofaTipo != null ? idRelEstrofaTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relestrofatipo)) {
            return false;
        }
        Relestrofatipo other = (Relestrofatipo) object;
        if ((this.idRelEstrofaTipo == null && other.idRelEstrofaTipo != null) || (this.idRelEstrofaTipo != null && !this.idRelEstrofaTipo.equals(other.idRelEstrofaTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relestrofatipo[ idRelEstrofaTipo=" + idRelEstrofaTipo + " ]";
    }
    
}
