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
@Table(name = "relnarraperson")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relnarraperson.findAll", query = "SELECT r FROM Relnarraperson r")
    , @NamedQuery(name = "Relnarraperson.findByIdRelNarraPerson", query = "SELECT r FROM Relnarraperson r WHERE r.idRelNarraPerson = :idRelNarraPerson")})
public class Relnarraperson implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRelNarraPerson")
    private Integer idRelNarraPerson;
    @JoinColumn(name = "idNarrativo", referencedColumnName = "idNarrativo")
    @ManyToOne
    private Narrativo idNarrativo;
    @JoinColumn(name = "idPerson", referencedColumnName = "idPersonaje")
    @ManyToOne
    private Personaje idPerson;

    public Relnarraperson() {
    }

    public Relnarraperson(Integer idRelNarraPerson) {
        this.idRelNarraPerson = idRelNarraPerson;
    }

    public Integer getIdRelNarraPerson() {
        return idRelNarraPerson;
    }

    public void setIdRelNarraPerson(Integer idRelNarraPerson) {
        this.idRelNarraPerson = idRelNarraPerson;
    }

    public Narrativo getIdNarrativo() {
        return idNarrativo;
    }

    public void setIdNarrativo(Narrativo idNarrativo) {
        this.idNarrativo = idNarrativo;
    }

    public Personaje getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Personaje idPerson) {
        this.idPerson = idPerson;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelNarraPerson != null ? idRelNarraPerson.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relnarraperson)) {
            return false;
        }
        Relnarraperson other = (Relnarraperson) object;
        if ((this.idRelNarraPerson == null && other.idRelNarraPerson != null) || (this.idRelNarraPerson != null && !this.idRelNarraPerson.equals(other.idRelNarraPerson))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relnarraperson[ idRelNarraPerson=" + idRelNarraPerson + " ]";
    }
    
}
