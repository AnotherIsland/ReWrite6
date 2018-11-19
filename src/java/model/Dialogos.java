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
@Table(name = "dialogos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dialogos.findAll", query = "SELECT d FROM Dialogos d")
    , @NamedQuery(name = "Dialogos.findByIdDialogos", query = "SELECT d FROM Dialogos d WHERE d.idDialogos = :idDialogos")
    , @NamedQuery(name = "Dialogos.findByAcotaciones", query = "SELECT d FROM Dialogos d WHERE d.acotaciones = :acotaciones")})
public class Dialogos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDialogos")
    private Integer idDialogos;
    @Lob
    @Column(name = "contenido")
    private String contenido;
    @Column(name = "acotaciones")
    private String acotaciones;
    @OneToMany(mappedBy = "idDialogo")
    private Collection<Relactodialo> relactodialoCollection;
    @OneToMany(mappedBy = "idDialogos")
    private Collection<Reldialogopersona> reldialogopersonaCollection;

    public Dialogos() {
    }

    public Dialogos(Integer idDialogos) {
        this.idDialogos = idDialogos;
    }

    public Integer getIdDialogos() {
        return idDialogos;
    }

    public void setIdDialogos(Integer idDialogos) {
        this.idDialogos = idDialogos;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAcotaciones() {
        return acotaciones;
    }

    public void setAcotaciones(String acotaciones) {
        this.acotaciones = acotaciones;
    }

    @XmlTransient
    public Collection<Relactodialo> getRelactodialoCollection() {
        return relactodialoCollection;
    }

    public void setRelactodialoCollection(Collection<Relactodialo> relactodialoCollection) {
        this.relactodialoCollection = relactodialoCollection;
    }

    @XmlTransient
    public Collection<Reldialogopersona> getReldialogopersonaCollection() {
        return reldialogopersonaCollection;
    }

    public void setReldialogopersonaCollection(Collection<Reldialogopersona> reldialogopersonaCollection) {
        this.reldialogopersonaCollection = reldialogopersonaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDialogos != null ? idDialogos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dialogos)) {
            return false;
        }
        Dialogos other = (Dialogos) object;
        if ((this.idDialogos == null && other.idDialogos != null) || (this.idDialogos != null && !this.idDialogos.equals(other.idDialogos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Dialogos[ idDialogos=" + idDialogos + " ]";
    }
    
}
