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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "narrativo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Narrativo.findAll", query = "SELECT n FROM Narrativo n")
    , @NamedQuery(name = "Narrativo.findByIdNarrativo", query = "SELECT n FROM Narrativo n WHERE n.idNarrativo = :idNarrativo")})
public class Narrativo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNarrativo")
    private Integer idNarrativo;
    @Lob
    @Column(name = "exposicion")
    private String exposicion;
    @Lob
    @Column(name = "desarrollo")
    private String desarrollo;
    @Lob
    @Column(name = "desenlace")
    private String desenlace;
    @Lob
    @Column(name = "climax")
    private String climax;
    @JoinColumn(name = "idRelObraTipoobra", referencedColumnName = "idRelObraTipoobra")
    @ManyToOne
    private Relobratipoobra idRelObraTipoobra;
    @OneToMany(mappedBy = "idNarrativo")
    private Collection<Relnarraperson> relnarrapersonCollection;

    public Narrativo() {
    }

    public Narrativo(Integer idNarrativo) {
        this.idNarrativo = idNarrativo;
    }

    public Integer getIdNarrativo() {
        return idNarrativo;
    }

    public void setIdNarrativo(Integer idNarrativo) {
        this.idNarrativo = idNarrativo;
    }

    public String getExposicion() {
        return exposicion;
    }

    public void setExposicion(String exposicion) {
        this.exposicion = exposicion;
    }

    public String getDesarrollo() {
        return desarrollo;
    }

    public void setDesarrollo(String desarrollo) {
        this.desarrollo = desarrollo;
    }

    public String getDesenlace() {
        return desenlace;
    }

    public void setDesenlace(String desenlace) {
        this.desenlace = desenlace;
    }

    public String getClimax() {
        return climax;
    }

    public void setClimax(String climax) {
        this.climax = climax;
    }

    public Relobratipoobra getIdRelObraTipoobra() {
        return idRelObraTipoobra;
    }

    public void setIdRelObraTipoobra(Relobratipoobra idRelObraTipoobra) {
        this.idRelObraTipoobra = idRelObraTipoobra;
    }

    @XmlTransient
    public Collection<Relnarraperson> getRelnarrapersonCollection() {
        return relnarrapersonCollection;
    }

    public void setRelnarrapersonCollection(Collection<Relnarraperson> relnarrapersonCollection) {
        this.relnarrapersonCollection = relnarrapersonCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNarrativo != null ? idNarrativo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Narrativo)) {
            return false;
        }
        Narrativo other = (Narrativo) object;
        if ((this.idNarrativo == null && other.idNarrativo != null) || (this.idNarrativo != null && !this.idNarrativo.equals(other.idNarrativo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Narrativo[ idNarrativo=" + idNarrativo + " ]";
    }
    
}
