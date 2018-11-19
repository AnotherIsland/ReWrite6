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
@Table(name = "relresurefe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relresurefe.findAll", query = "SELECT r FROM Relresurefe r")
    , @NamedQuery(name = "Relresurefe.findByIdRelResuRefe", query = "SELECT r FROM Relresurefe r WHERE r.idRelResuRefe = :idRelResuRefe")})
public class Relresurefe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRelResuRefe")
    private Integer idRelResuRefe;
    @JoinColumn(name = "idRefere", referencedColumnName = "idReferencias")
    @ManyToOne
    private Referencias idRefere;
    @JoinColumn(name = "idResumen", referencedColumnName = "idResumen")
    @ManyToOne
    private Resumen idResumen;

    public Relresurefe() {
    }

    public Relresurefe(Integer idRelResuRefe) {
        this.idRelResuRefe = idRelResuRefe;
    }

    public Integer getIdRelResuRefe() {
        return idRelResuRefe;
    }

    public void setIdRelResuRefe(Integer idRelResuRefe) {
        this.idRelResuRefe = idRelResuRefe;
    }

    public Referencias getIdRefere() {
        return idRefere;
    }

    public void setIdRefere(Referencias idRefere) {
        this.idRefere = idRefere;
    }

    public Resumen getIdResumen() {
        return idResumen;
    }

    public void setIdResumen(Resumen idResumen) {
        this.idResumen = idResumen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelResuRefe != null ? idRelResuRefe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relresurefe)) {
            return false;
        }
        Relresurefe other = (Relresurefe) object;
        if ((this.idRelResuRefe == null && other.idRelResuRefe != null) || (this.idRelResuRefe != null && !this.idRelResuRefe.equals(other.idRelResuRefe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relresurefe[ idRelResuRefe=" + idRelResuRefe + " ]";
    }
    
}
