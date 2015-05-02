/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author neko
 */
@Entity
@Table(name = "proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p"),
    @NamedQuery(name = "Proveedores.findByIdProveedores", query = "SELECT p FROM Proveedores p WHERE p.idProveedores = :idProveedores"),
    @NamedQuery(name = "Proveedores.findByNombreprove", query = "SELECT p FROM Proveedores p WHERE p.nombreprove = :nombreprove"),
    @NamedQuery(name = "Proveedores.findByDireccion", query = "SELECT p FROM Proveedores p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Proveedores.findByRfc", query = "SELECT p FROM Proveedores p WHERE p.rfc = :rfc"),
    @NamedQuery(name = "Proveedores.findByCorreo", query = "SELECT p FROM Proveedores p WHERE p.correo = :correo"),
    @NamedQuery(name = "Proveedores.findByTelefono", query = "SELECT p FROM Proveedores p WHERE p.telefono = :telefono")})
public class Proveedores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proveedores")
    private Integer idProveedores;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre_prove")
    private String nombreprove;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "RFC")
    private String rfc;
    @Size(max = 45)
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Telefono")
    private int telefono;

    public Proveedores() {
    }

    public Proveedores(Integer idProveedores) {
        this.idProveedores = idProveedores;
    }

    public Proveedores(Integer idProveedores, String nombreprove, String direccion, String rfc, int telefono) {
        this.idProveedores = idProveedores;
        this.nombreprove = nombreprove;
        this.direccion = direccion;
        this.rfc = rfc;
        this.telefono = telefono;
    }

    public Integer getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(Integer idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getNombreprove() {
        return nombreprove;
    }

    public void setNombreprove(String nombreprove) {
        this.nombreprove = nombreprove;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedores != null ? idProveedores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.idProveedores == null && other.idProveedores != null) || (this.idProveedores != null && !this.idProveedores.equals(other.idProveedores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Proveedores[ idProveedores=" + idProveedores + " ]";
    }
    
}
