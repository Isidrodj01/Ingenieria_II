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
public class Empleado {
    
     public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
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

    public int getIdPosicion() {
        return IdPosicion;
    }

    public void setIdPosicion(int IdPosicion) {
        this.IdPosicion = IdPosicion;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Float getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Float Sueldo) {
        this.Sueldo = Sueldo;
    }

    public Boolean getEsDocente() {
        return EsDocente;
    }

    public void setEsDocente(Boolean EsDocente) {
        this.EsDocente = EsDocente;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean Activo) {
        this.Activo = Activo;
    }
    int IdEmpleado;
    String Cedula;
    String Nombre;
    String Direccion;
    String Telefono;
    int IdPosicion;
    Date FechaInicio;
    Float Sueldo;
    Boolean EsDocente;
    String Area;
    String Nivel;
    Boolean Activo;
    
}
