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
public class Nomina {
    
    public int getIdNomina() {
        return IdNomina;
    }

    public void setIdNomina(int IdNomina) {
        this.IdNomina = IdNomina;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public Float getSueldoBruto() {
        return SueldoBruto;
    }

    public void setSueldoBruto(Float SueldoBruto) {
        this.SueldoBruto = SueldoBruto;
    }

    public Float getDescuento() {
        return Descuento;
    }

    public void setDescuento(Float Descuento) {
        this.Descuento = Descuento;
    }

    public Float getImpuesto() {
        return Impuesto;
    }

    public void setImpuesto(Float Impuesto) {
        this.Impuesto = Impuesto;
    }

    public Float getSueldoNeto() {
        return SueldoNeto;
    }

    public void setSueldoNeto(Float SueldoNeto) {
        this.SueldoNeto = SueldoNeto;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean Activo) {
        this.Activo = Activo;
    }
    int IdNomina;
    int IdEmpleado;
    Float SueldoBruto;
    Float Descuento;
    Float Impuesto;
    Float SueldoNeto;
    Boolean Activo;
    
    
}
