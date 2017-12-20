/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosDeAlmacenado;

/**
 *
 * @author johan
 */
public class Posicion {
    public int getIdPosicion() {
        return IdPosicion;
    }

    public void setIdPosicion(int IdPosicion) {
        this.IdPosicion = IdPosicion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    int IdPosicion;
    String Descripcion;
    
}
