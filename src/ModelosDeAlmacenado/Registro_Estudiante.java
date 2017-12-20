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
public class Registro_Estudiante {
    
     public int getIdRegistro() {
        return IdRegistro;
    }

    public void setIdRegistro(int IdRegistro) {
        this.IdRegistro = IdRegistro;
    }

    public int getIdAsignatura() {
        return IdAsignatura;
    }

    public void setIdAsignatura(int IdAsignatura) {
        this.IdAsignatura = IdAsignatura;
    }

    public int getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
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

    public Float getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Float Calificacion) {
        this.Calificacion = Calificacion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    int IdRegistro;
    int IdAsignatura;
    int IdEstudiante;
    int IdPadre;
    int IdMadre;
    Float Calificacion;
    Date Fecha;
    String Observacion;
    String Estado;
    
    
}
