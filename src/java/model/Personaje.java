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
@Table(name = "personaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personaje.findAll", query = "SELECT p FROM Personaje p")
    , @NamedQuery(name = "Personaje.findByIdPersonaje", query = "SELECT p FROM Personaje p WHERE p.idPersonaje = :idPersonaje")
    , @NamedQuery(name = "Personaje.findByNombre", query = "SELECT p FROM Personaje p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Personaje.findByApariencia", query = "SELECT p FROM Personaje p WHERE p.apariencia = :apariencia")
    , @NamedQuery(name = "Personaje.findByMotivaciones", query = "SELECT p FROM Personaje p WHERE p.motivaciones = :motivaciones")
    , @NamedQuery(name = "Personaje.findByHabitos", query = "SELECT p FROM Personaje p WHERE p.habitos = :habitos")})
public class Personaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPersonaje")
    private Integer idPersonaje;
    @Column(name = "nombre")
    private String nombre;
    @Lob
    @Column(name = "personalidad")
    private String personalidad;
    @Column(name = "apariencia")
    private String apariencia;
    @Column(name = "motivaciones")
    private String motivaciones;
    @Column(name = "habitos")
    private String habitos;
    @OneToMany(mappedBy = "idPerson")
    private Collection<Relnarraperson> relnarrapersonCollection;
    @OneToMany(mappedBy = "idPersonaje")
    private Collection<Reldialogopersona> reldialogopersonaCollection;

    public Personaje() {
    }

    public Personaje(Integer idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public Integer getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Integer idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getApariencia() {
        return apariencia;
    }

    public void setApariencia(String apariencia) {
        this.apariencia = apariencia;
    }

    public String getMotivaciones() {
        return motivaciones;
    }

    public void setMotivaciones(String motivaciones) {
        this.motivaciones = motivaciones;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    @XmlTransient
    public Collection<Relnarraperson> getRelnarrapersonCollection() {
        return relnarrapersonCollection;
    }

    public void setRelnarrapersonCollection(Collection<Relnarraperson> relnarrapersonCollection) {
        this.relnarrapersonCollection = relnarrapersonCollection;
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
        hash += (idPersonaje != null ? idPersonaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personaje)) {
            return false;
        }
        Personaje other = (Personaje) object;
        if ((this.idPersonaje == null && other.idPersonaje != null) || (this.idPersonaje != null && !this.idPersonaje.equals(other.idPersonaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Personaje[ idPersonaje=" + idPersonaje + " ]";
    }
    
}
