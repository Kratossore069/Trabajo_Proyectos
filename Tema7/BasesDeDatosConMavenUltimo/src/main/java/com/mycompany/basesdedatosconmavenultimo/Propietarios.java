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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
@Entity
@Table(name = "PROPIETARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propietarios.findAll", query = "SELECT p FROM Propietarios p")
    , @NamedQuery(name = "Propietarios.findByPropietarioid", query = "SELECT p FROM Propietarios p WHERE p.propietarioid = :propietarioid")
    , @NamedQuery(name = "Propietarios.findByApodo", query = "SELECT p FROM Propietarios p WHERE p.apodo = :apodo")
    , @NamedQuery(name = "Propietarios.findByApellidos", query = "SELECT p FROM Propietarios p WHERE p.apellidos = :apellidos")})
public class Propietarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROPIETARIOID")
    private Integer propietarioid;
    @Size(max = 255)
    @Column(name = "APODO")
    private String apodo;
    @Size(max = 255)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @ManyToMany(mappedBy = "propietariosCollection", fetch = FetchType.EAGER)
    private Collection<Casas> casasCollection;

    public Propietarios() {
    }

    public Propietarios(Integer propietarioid) {
        this.propietarioid = propietarioid;
    }

    public Integer getPropietarioid() {
        return propietarioid;
    }

    public void setPropietarioid(Integer propietarioid) {
        this.propietarioid = propietarioid;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @XmlTransient
    public Collection<Casas> getCasasCollection() {
        return casasCollection;
    }

    public void setCasasCollection(Collection<Casas> casasCollection) {
        this.casasCollection = casasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propietarioid != null ? propietarioid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propietarios)) {
            return false;
        }
        Propietarios other = (Propietarios) object;
        if ((this.propietarioid == null && other.propietarioid != null) || (this.propietarioid != null && !this.propietarioid.equals(other.propietarioid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.basesdedatosconmavenultimo.Propietarios[ propietarioid=" + propietarioid + " ]";
    }
    
}
