/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LLamadaObjectos;

/**
 *
 * @author johan
 */
public class DatosFormulario
{
    String nombre,Direccion,telefono;
    int identificacion,Sueldo,Cedula;

    public void DatosFormulario(String nombre, String Direccion, String telefono, int identificacion, int Sueldo, int Cedula) {
        this.setNombre(nombre);
        this.setDireccion(Direccion);
        this.setTelefono(telefono);
        this.setIdentificacion(identificacion);
        this.setSueldo(Sueldo);
        this.setCedula(Cedula);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    
    
    
}
