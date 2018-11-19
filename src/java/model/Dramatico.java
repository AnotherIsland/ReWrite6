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
@Table(name = "dramatico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dramatico.findAll", query = "SELECT d FROM Dramatico d")
    , @NamedQuery(name = "Dramatico.findByIdDramatico", query = "SELECT d FROM Dramatico d WHERE d.idDramatico = :idDramatico")})
public class Dramatico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDramatico")
    private Integer idDramatico;
    @JoinColumn(name = "idRelObraTipoobra", referencedColumnName = "idRelObraTipoobra")
    @ManyToOne
    private Relobratipoobra idRelObraTipoobra;
    @JoinColumn(name = "idActos", referencedColumnName = "idActos")
    @ManyToOne
    private Actos idActos;

    public Dramatico() {
    }

    public Dramatico(Integer idDramatico) {
        this.idDramatico = idDramatico;
    }

    public Integer getIdDramatico() {
        return idDramatico;
    }

    public void setIdDramatico(Integer idDramatico) {
        this.idDramatico = idDramatico;
    }

    public Relobratipoobra getIdRelObraTipoobra() {
        return idRelObraTipoobra;
    }

    public void setIdRelObraTipoobra(Relobratipoobra idRelObraTipoobra) {
        this.idRelObraTipoobra = idRelObraTipoobra;
    }

    public Actos getIdActos() {
        return idActos;
    }

    public void setIdActos(Actos idActos) {
        this.idActos = idActos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDramatico != null ? idDramatico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dramatico)) {
            return false;
        }
        Dramatico other = (Dramatico) object;
        if ((this.idDramatico == null && other.idDramatico != null) || (this.idDramatico != null && !this.idDramatico.equals(other.idDramatico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Dramatico[ idDramatico=" + idDramatico + " ]";
    }
    
}
