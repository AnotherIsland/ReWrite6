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
@Table(name = "relapendiarti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relapendiarti.findAll", query = "SELECT r FROM Relapendiarti r")
    , @NamedQuery(name = "Relapendiarti.findByIdRelApendiArti", query = "SELECT r FROM Relapendiarti r WHERE r.idRelApendiArti = :idRelApendiArti")})
public class Relapendiarti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRelApendiArti")
    private Integer idRelApendiArti;
    @JoinColumn(name = "idApendice", referencedColumnName = "idApendices")
    @ManyToOne
    private Apendices idApendice;
    @JoinColumn(name = "idArticulo", referencedColumnName = "idArticulo")
    @ManyToOne
    private Articulo idArticulo;

    public Relapendiarti() {
    }

    public Relapendiarti(Integer idRelApendiArti) {
        this.idRelApendiArti = idRelApendiArti;
    }

    public Integer getIdRelApendiArti() {
        return idRelApendiArti;
    }

    public void setIdRelApendiArti(Integer idRelApendiArti) {
        this.idRelApendiArti = idRelApendiArti;
    }

    public Apendices getIdApendice() {
        return idApendice;
    }

    public void setIdApendice(Apendices idApendice) {
        this.idApendice = idApendice;
    }

    public Articulo getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Articulo idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelApendiArti != null ? idRelApendiArti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relapendiarti)) {
            return false;
        }
        Relapendiarti other = (Relapendiarti) object;
        if ((this.idRelApendiArti == null && other.idRelApendiArti != null) || (this.idRelApendiArti != null && !this.idRelApendiArti.equals(other.idRelApendiArti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relapendiarti[ idRelApendiArti=" + idRelApendiArti + " ]";
    }
    
}
