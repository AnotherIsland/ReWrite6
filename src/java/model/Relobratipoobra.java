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
@Table(name = "relobratipoobra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relobratipoobra.findAll", query = "SELECT r FROM Relobratipoobra r")
    , @NamedQuery(name = "Relobratipoobra.findByIdRelObraTipoobra", query = "SELECT r FROM Relobratipoobra r WHERE r.idRelObraTipoobra = :idRelObraTipoobra")})
public class Relobratipoobra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRelObraTipoobra")
    private Integer idRelObraTipoobra;
    @OneToMany(mappedBy = "idRelObraTipoobra")
    private Collection<Dramatico> dramaticoCollection;
    @JoinColumn(name = "idObraa", referencedColumnName = "idObra")
    @ManyToOne
    private Obra idObraa;
    @JoinColumn(name = "idTipoObra", referencedColumnName = "idTipoObra")
    @ManyToOne
    private Tipoobra idTipoObra;
    @OneToMany(mappedBy = "idRelObraTipoobra")
    private Collection<Resumen> resumenCollection;
    @OneToMany(mappedBy = "idRelObraTipoobra")
    private Collection<Ensayo> ensayoCollection;
    @OneToMany(mappedBy = "idRelObraTipoobra")
    private Collection<Articulo> articuloCollection;
    @OneToMany(mappedBy = "idRelObraTipoobra")
    private Collection<Lirico> liricoCollection;
    @OneToMany(mappedBy = "idRelObraTipoobra")
    private Collection<Narrativo> narrativoCollection;

    public Relobratipoobra() {
    }

    public Relobratipoobra(Integer idRelObraTipoobra) {
        this.idRelObraTipoobra = idRelObraTipoobra;
    }

    public Integer getIdRelObraTipoobra() {
        return idRelObraTipoobra;
    }

    public void setIdRelObraTipoobra(Integer idRelObraTipoobra) {
        this.idRelObraTipoobra = idRelObraTipoobra;
    }

    @XmlTransient
    public Collection<Dramatico> getDramaticoCollection() {
        return dramaticoCollection;
    }

    public void setDramaticoCollection(Collection<Dramatico> dramaticoCollection) {
        this.dramaticoCollection = dramaticoCollection;
    }

    public Obra getIdObraa() {
        return idObraa;
    }

    public void setIdObraa(Obra idObraa) {
        this.idObraa = idObraa;
    }

    public Tipoobra getIdTipoObra() {
        return idTipoObra;
    }

    public void setIdTipoObra(Tipoobra idTipoObra) {
        this.idTipoObra = idTipoObra;
    }

    @XmlTransient
    public Collection<Resumen> getResumenCollection() {
        return resumenCollection;
    }

    public void setResumenCollection(Collection<Resumen> resumenCollection) {
        this.resumenCollection = resumenCollection;
    }

    @XmlTransient
    public Collection<Ensayo> getEnsayoCollection() {
        return ensayoCollection;
    }

    public void setEnsayoCollection(Collection<Ensayo> ensayoCollection) {
        this.ensayoCollection = ensayoCollection;
    }

    @XmlTransient
    public Collection<Articulo> getArticuloCollection() {
        return articuloCollection;
    }

    public void setArticuloCollection(Collection<Articulo> articuloCollection) {
        this.articuloCollection = articuloCollection;
    }

    @XmlTransient
    public Collection<Lirico> getLiricoCollection() {
        return liricoCollection;
    }

    public void setLiricoCollection(Collection<Lirico> liricoCollection) {
        this.liricoCollection = liricoCollection;
    }

    @XmlTransient
    public Collection<Narrativo> getNarrativoCollection() {
        return narrativoCollection;
    }

    public void setNarrativoCollection(Collection<Narrativo> narrativoCollection) {
        this.narrativoCollection = narrativoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelObraTipoobra != null ? idRelObraTipoobra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relobratipoobra)) {
            return false;
        }
        Relobratipoobra other = (Relobratipoobra) object;
        if ((this.idRelObraTipoobra == null && other.idRelObraTipoobra != null) || (this.idRelObraTipoobra != null && !this.idRelObraTipoobra.equals(other.idRelObraTipoobra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relobratipoobra[ idRelObraTipoobra=" + idRelObraTipoobra + " ]";
    }
    
}
