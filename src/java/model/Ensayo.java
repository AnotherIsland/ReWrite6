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
@Table(name = "ensayo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ensayo.findAll", query = "SELECT e FROM Ensayo e")
    , @NamedQuery(name = "Ensayo.findByIdEnsayo", query = "SELECT e FROM Ensayo e WHERE e.idEnsayo = :idEnsayo")})
public class Ensayo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEnsayo")
    private Integer idEnsayo;
    @Lob
    @Column(name = "intro")
    private String intro;
    @Lob
    @Column(name = "desarrollo")
    private String desarrollo;
    @Lob
    @Column(name = "conclusion")
    private String conclusion;
    @JoinColumn(name = "idRelObraTipoobra", referencedColumnName = "idRelObraTipoobra")
    @ManyToOne
    private Relobratipoobra idRelObraTipoobra;
    @OneToMany(mappedBy = "idEnsayo")
    private Collection<Relrefeensayo> relrefeensayoCollection;

    public Ensayo() {
    }

    public Ensayo(Integer idEnsayo) {
        this.idEnsayo = idEnsayo;
    }

    public Integer getIdEnsayo() {
        return idEnsayo;
    }

    public void setIdEnsayo(Integer idEnsayo) {
        this.idEnsayo = idEnsayo;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getDesarrollo() {
        return desarrollo;
    }

    public void setDesarrollo(String desarrollo) {
        this.desarrollo = desarrollo;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public Relobratipoobra getIdRelObraTipoobra() {
        return idRelObraTipoobra;
    }

    public void setIdRelObraTipoobra(Relobratipoobra idRelObraTipoobra) {
        this.idRelObraTipoobra = idRelObraTipoobra;
    }

    @XmlTransient
    public Collection<Relrefeensayo> getRelrefeensayoCollection() {
        return relrefeensayoCollection;
    }

    public void setRelrefeensayoCollection(Collection<Relrefeensayo> relrefeensayoCollection) {
        this.relrefeensayoCollection = relrefeensayoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEnsayo != null ? idEnsayo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ensayo)) {
            return false;
        }
        Ensayo other = (Ensayo) object;
        if ((this.idEnsayo == null && other.idEnsayo != null) || (this.idEnsayo != null && !this.idEnsayo.equals(other.idEnsayo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Ensayo[ idEnsayo=" + idEnsayo + " ]";
    }
    
}
