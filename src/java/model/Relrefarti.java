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
@Table(name = "relrefarti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relrefarti.findAll", query = "SELECT r FROM Relrefarti r")
    , @NamedQuery(name = "Relrefarti.findByIdRelRefArti", query = "SELECT r FROM Relrefarti r WHERE r.idRelRefArti = :idRelRefArti")})
public class Relrefarti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRelRefArti")
    private Integer idRelRefArti;
    @JoinColumn(name = "idArticuloo", referencedColumnName = "idArticulo")
    @ManyToOne
    private Articulo idArticuloo;
    @JoinColumn(name = "idRefe", referencedColumnName = "idReferencias")
    @ManyToOne
    private Referencias idRefe;

    public Relrefarti() {
    }

    public Relrefarti(Integer idRelRefArti) {
        this.idRelRefArti = idRelRefArti;
    }

    public Integer getIdRelRefArti() {
        return idRelRefArti;
    }

    public void setIdRelRefArti(Integer idRelRefArti) {
        this.idRelRefArti = idRelRefArti;
    }

    public Articulo getIdArticuloo() {
        return idArticuloo;
    }

    public void setIdArticuloo(Articulo idArticuloo) {
        this.idArticuloo = idArticuloo;
    }

    public Referencias getIdRefe() {
        return idRefe;
    }

    public void setIdRefe(Referencias idRefe) {
        this.idRefe = idRefe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelRefArti != null ? idRelRefArti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relrefarti)) {
            return false;
        }
        Relrefarti other = (Relrefarti) object;
        if ((this.idRelRefArti == null && other.idRelRefArti != null) || (this.idRelRefArti != null && !this.idRelRefArti.equals(other.idRelRefArti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relrefarti[ idRelRefArti=" + idRelRefArti + " ]";
    }
    
}
