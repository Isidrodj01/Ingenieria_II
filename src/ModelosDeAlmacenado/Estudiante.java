/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosDeAlmacenado;

import java.sql.Date;

/**
 *
 * @author johan
 */
public class Estudiante {
    
    public int getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public int getIdPadre() {
        return IdPadre;
    }

    public void setIdPadre(int IdPadre) {
        this.IdPadre = IdPadre;
    }

    public int getIdMadre() {
        return IdMadre;
    }

    public void setIdMadre(int IdMadre) {
        this.IdMadre = IdMadre;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean Activo) {
        this.Activo = Activo;
    }
    int IdEstudiante;
    String Nombre;
    String Direccion;
    String Telefono;
    Date FechaNacimiento;
    String CorreoElectronico;
    int IdPadre;
    int IdMadre;
    Boolean Activo;
    
}
