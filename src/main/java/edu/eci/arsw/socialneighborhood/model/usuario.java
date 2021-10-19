package edu.eci.arsw.socialneighborhood.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class usuario {
    @Id
    @Column(name = "id")
    public Integer id ;
    @Column(name = "tdoc")
    public String tdoc ;
    @Column(name = "ndoc")
    public Integer ndoc ;
    @Column(name = "nombres")
    public String nombres ;
    @Column(name = "apellidos")
    public String apellidos ;
    @Column(name = "fechadenacimiento")
    protected Date fechaDeNacimiento ;
    @Column(name = "email")
    public String email ;
    @Column(name = "contraseña")
    public String password ;

    public usuario(String tdoc, Integer ndoc, String nombres, String apellidos, Date fechaDeNacimiento, String email, String password) {
        this.tdoc = tdoc;
        this.ndoc = ndoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
        this.password = password;
    }

    public usuario(Integer id, String tdoc, Integer ndoc, String nombres, String apellidos, Date fechaDeNacimiento, String email, String password) {
        this.id = id;
        this.tdoc = tdoc;
        this.ndoc = ndoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTdoc() {
        return tdoc;
    }

    public void setTdoc(String tdoc) {
        this.tdoc = tdoc;
    }

    public Integer getNdoc() {
        return ndoc;
    }

    public void setNdoc(Integer ndoc) {
        this.ndoc = ndoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
