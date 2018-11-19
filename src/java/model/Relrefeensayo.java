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
@Table(name = "relrefeensayo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relrefeensayo.findAll", query = "SELECT r FROM Relrefeensayo r")
    , @NamedQuery(name = "Relrefeensayo.findByIdRelRefeEnsayo", query = "SELECT r FROM Relrefeensayo r WHERE r.idRelRefeEnsayo = :idRelRefeEnsayo")})
public class Relrefeensayo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRelRefeEnsayo")
    private Integer idRelRefeEnsayo;
    @JoinColumn(name = "idEnsayo", referencedColumnName = "idEnsayo")
    @ManyToOne
    private Ensayo idEnsayo;
    @JoinColumn(name = "idReferencia", referencedColumnName = "idReferencias")
    @ManyToOne
    private Referencias idReferencia;

    public Relrefeensayo() {
    }

    public Relrefeensayo(Integer idRelRefeEnsayo) {
        this.idRelRefeEnsayo = idRelRefeEnsayo;
    }

    public Integer getIdRelRefeEnsayo() {
        return idRelRefeEnsayo;
    }

    public void setIdRelRefeEnsayo(Integer idRelRefeEnsayo) {
        this.idRelRefeEnsayo = idRelRefeEnsayo;
    }

    public Ensayo getIdEnsayo() {
        return idEnsayo;
    }

    public void setIdEnsayo(Ensayo idEnsayo) {
        this.idEnsayo = idEnsayo;
    }

    public Referencias getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(Referencias idReferencia) {
        this.idReferencia = idReferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelRefeEnsayo != null ? idRelRefeEnsayo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relrefeensayo)) {
            return false;
        }
        Relrefeensayo other = (Relrefeensayo) object;
        if ((this.idRelRefeEnsayo == null && other.idRelRefeEnsayo != null) || (this.idRelRefeEnsayo != null && !this.idRelRefeEnsayo.equals(other.idRelRefeEnsayo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relrefeensayo[ idRelRefeEnsayo=" + idRelRefeEnsayo + " ]";
    }
    
}
