package edu.eci.arsw.socialneighborhood.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class usuario {
    @Id
    @Column(name = "id")
    private Integer id ;
    @Column(name = "tdoc")
    private String tdoc ;
    @Column(name = "ndoc")
    private Integer ndoc ;
    @Column(name = "nombres")
    private String nombres ;
    @Column(name = "apellidos")
    private String apellidos ;
    @Column(name = "fechadenacimiento")
    private String fechaDeNacimiento;
    @Column(name = "email")
    private String email ;
    @Column(name = "contraseña")
    private String password ;
    @Column(name = "tipousuario")
    private String tipousuario;
    @Column(name = "nombrefoto")
    private String nombrefoto;

    public usuario(){

    }
    public usuario(String tdoc, Integer ndoc, String nombres, String apellidos, String fechaDeNacimiento, String email, String password, String tipousuario, String nombrefoto) {
        this.tdoc = tdoc;
        this.ndoc = ndoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
        this.password = password;
        this.tipousuario=tipousuario;
    }

    public usuario(Integer id, String tdoc, Integer ndoc, String nombres, String apellidos, String fechaDeNacimiento, String email, String password, String tipousuario, String nombrefoto) {
        this.id = id;
        this.tdoc = tdoc;
        this.ndoc = ndoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.email = email;
        this.password = password;
        this.tipousuario=tipousuario;
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

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
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

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    public String getNombrefoto() {
        return nombrefoto;
    }

    public void setNombrefoto(String nombrefoto) {
        this.nombrefoto = nombrefoto;
    }
}
