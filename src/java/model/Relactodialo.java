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
@Table(name = "relactodialo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relactodialo.findAll", query = "SELECT r FROM Relactodialo r")
    , @NamedQuery(name = "Relactodialo.findByIdRelActoDialo", query = "SELECT r FROM Relactodialo r WHERE r.idRelActoDialo = :idRelActoDialo")})
public class Relactodialo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRelActoDialo")
    private Integer idRelActoDialo;
    @JoinColumn(name = "idActos", referencedColumnName = "idActos")
    @ManyToOne
    private Actos idActos;
    @JoinColumn(name = "idDialogo", referencedColumnName = "idDialogos")
    @ManyToOne
    private Dialogos idDialogo;

    public Relactodialo() {
    }

    public Relactodialo(Integer idRelActoDialo) {
        this.idRelActoDialo = idRelActoDialo;
    }

    public Integer getIdRelActoDialo() {
        return idRelActoDialo;
    }

    public void setIdRelActoDialo(Integer idRelActoDialo) {
        this.idRelActoDialo = idRelActoDialo;
    }

    public Actos getIdActos() {
        return idActos;
    }

    public void setIdActos(Actos idActos) {
        this.idActos = idActos;
    }

    public Dialogos getIdDialogo() {
        return idDialogo;
    }

    public void setIdDialogo(Dialogos idDialogo) {
        this.idDialogo = idDialogo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelActoDialo != null ? idRelActoDialo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relactodialo)) {
            return false;
        }
        Relactodialo other = (Relactodialo) object;
        if ((this.idRelActoDialo == null && other.idRelActoDialo != null) || (this.idRelActoDialo != null && !this.idRelActoDialo.equals(other.idRelActoDialo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relactodialo[ idRelActoDialo=" + idRelActoDialo + " ]";
    }
    
}
