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
@Table(name = "reldialogopersona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reldialogopersona.findAll", query = "SELECT r FROM Reldialogopersona r")
    , @NamedQuery(name = "Reldialogopersona.findByIdrelDialogoPersona", query = "SELECT r FROM Reldialogopersona r WHERE r.idrelDialogoPersona = :idrelDialogoPersona")})
public class Reldialogopersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrelDialogoPersona")
    private Integer idrelDialogoPersona;
    @JoinColumn(name = "idDialogos", referencedColumnName = "idDialogos")
    @ManyToOne
    private Dialogos idDialogos;
    @JoinColumn(name = "idPersonaje", referencedColumnName = "idPersonaje")
    @ManyToOne
    private Personaje idPersonaje;

    public Reldialogopersona() {
    }

    public Reldialogopersona(Integer idrelDialogoPersona) {
        this.idrelDialogoPersona = idrelDialogoPersona;
    }

    public Integer getIdrelDialogoPersona() {
        return idrelDialogoPersona;
    }

    public void setIdrelDialogoPersona(Integer idrelDialogoPersona) {
        this.idrelDialogoPersona = idrelDialogoPersona;
    }

    public Dialogos getIdDialogos() {
        return idDialogos;
    }

    public void setIdDialogos(Dialogos idDialogos) {
        this.idDialogos = idDialogos;
    }

    public Personaje getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Personaje idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrelDialogoPersona != null ? idrelDialogoPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reldialogopersona)) {
            return false;
        }
        Reldialogopersona other = (Reldialogopersona) object;
        if ((this.idrelDialogoPersona == null && other.idrelDialogoPersona != null) || (this.idrelDialogoPersona != null && !this.idrelDialogoPersona.equals(other.idrelDialogoPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Reldialogopersona[ idrelDialogoPersona=" + idrelDialogoPersona + " ]";
    }
    
}
