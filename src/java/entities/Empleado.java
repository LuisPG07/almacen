/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author neko
 */
@Entity
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByIdempleado", query = "SELECT e FROM Empleado e WHERE e.idempleado = :idempleado"),
    @NamedQuery(name = "Empleado.findByNombreempl", query = "SELECT e FROM Empleado e WHERE e.nombreempl = :nombreempl"),
    @NamedQuery(name = "Empleado.findByDireccionEmpl", query = "SELECT e FROM Empleado e WHERE e.direccionEmpl = :direccionEmpl"),
    @NamedQuery(name = "Empleado.findByRFCempl", query = "SELECT e FROM Empleado e WHERE e.rFCempl = :rFCempl"),
    @NamedQuery(name = "Empleado.findByCorreoEmpl", query = "SELECT e FROM Empleado e WHERE e.correoEmpl = :correoEmpl"),
    @NamedQuery(name = "Empleado.findByTelEmpl", query = "SELECT e FROM Empleado e WHERE e.telEmpl = :telEmpl")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempleado")
    private Integer idempleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Nombre_empl")
    private String nombreempl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion_empl")
    private String direccionEmpl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "RFC_empl")
    private String rFCempl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "correo_empl")
    private String correoEmpl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tel_empl")
    private String telEmpl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private Collection<Usuario> usuarioCollection;

    public Empleado() {
    }

    public Empleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public Empleado(Integer idempleado, String nombreempl, String direccionEmpl, String rFCempl, String correoEmpl, String telEmpl) {
        this.idempleado = idempleado;
        this.nombreempl = nombreempl;
        this.direccionEmpl = direccionEmpl;
        this.rFCempl = rFCempl;
        this.correoEmpl = correoEmpl;
        this.telEmpl = telEmpl;
    }

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombreempl() {
        return nombreempl;
    }

    public void setNombreempl(String nombreempl) {
        this.nombreempl = nombreempl;
    }

    public String getDireccionEmpl() {
        return direccionEmpl;
    }

    public void setDireccionEmpl(String direccionEmpl) {
        this.direccionEmpl = direccionEmpl;
    }

    public String getRFCempl() {
        return rFCempl;
    }

    public void setRFCempl(String rFCempl) {
        this.rFCempl = rFCempl;
    }

    public String getCorreoEmpl() {
        return correoEmpl;
    }

    public void setCorreoEmpl(String correoEmpl) {
        this.correoEmpl = correoEmpl;
    }

    public String getTelEmpl() {
        return telEmpl;
    }

    public void setTelEmpl(String telEmpl) {
        this.telEmpl = telEmpl;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleado != null ? idempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idempleado == null && other.idempleado != null) || (this.idempleado != null && !this.idempleado.equals(other.idempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Empleado[ idempleado=" + idempleado + " ]";
    }
    
}
