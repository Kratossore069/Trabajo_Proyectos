/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basesdedatosconmavenultimo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
@Entity
@Table(name = "CASAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Casas.findAll", query = "SELECT c FROM Casas c")
    , @NamedQuery(name = "Casas.findByCasaid", query = "SELECT c FROM Casas c WHERE c.casaid = :casaid")
    , @NamedQuery(name = "Casas.findByMetros", query = "SELECT c FROM Casas c WHERE c.metros = :metros")})
public class Casas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CASAID")
    private Integer casaid;
    @Column(name = "METROS")
    private Integer metros;
    @JoinTable(name = "PROPIETARIOSCASAS", joinColumns = {
        @JoinColumn(name = "CASAID", referencedColumnName = "CASAID")}, inverseJoinColumns = {
        @JoinColumn(name = "PROPIETARIOID", referencedColumnName = "PROPIETARIOID")})
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Propietarios> propietariosCollection;

    public Casas() {
    }

    public Casas(Integer casaid) {
        this.casaid = casaid;
    }

    public Integer getCasaid() {
        return casaid;
    }

    public void setCasaid(Integer casaid) {
        this.casaid = casaid;
    }

    public Integer getMetros() {
        return metros;
    }

    public void setMetros(Integer metros) {
        this.metros = metros;
    }

    @XmlTransient
    public Collection<Propietarios> getPropietariosCollection() {
        return propietariosCollection;
    }

    public void setPropietariosCollection(Collection<Propietarios> propietariosCollection) {
        this.propietariosCollection = propietariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (casaid != null ? casaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casas)) {
            return false;
        }
        Casas other = (Casas) object;
        if ((this.casaid == null && other.casaid != null) || (this.casaid != null && !this.casaid.equals(other.casaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.basesdedatosconmavenultimo.Casas[ casaid=" + casaid + " ]";
    }
    
}
