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
public class Pago {
    
    public int getIdPago() {
        return IdPago;
    }

    public void setIdPago(int IdPago) {
        this.IdPago = IdPago;
    }

    public int getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Float getCuota() {
        return Cuota;
    }

    public void setCuota(Float Cuota) {
        this.Cuota = Cuota;
    }

    public Float getDescuento() {
        return Descuento;
    }

    public void setDescuento(Float Descuento) {
        this.Descuento = Descuento;
    }

    public Float getMonto() {
        return Monto;
    }

    public void setMonto(Float Monto) {
        this.Monto = Monto;
    }

    public Float getBalanceGeneral() {
        return BalanceGeneral;
    }

    public void setBalanceGeneral(Float BalanceGeneral) {
        this.BalanceGeneral = BalanceGeneral;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String Concepto) {
        this.Concepto = Concepto;
    }

    public Boolean getActivo() {
        return Activo;
    }

    public void setActivo(Boolean Activo) {
        this.Activo = Activo;
    }
    
    int IdPago;
    int IdEstudiante;
    Date Fecha;
    Float Cuota;
    Float Descuento;
    Float Monto;
    Float BalanceGeneral;
    String Concepto;
    Boolean Activo;
    
}
