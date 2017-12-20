/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;
import java.sql.*;
/**
 *
 * @author johan
 */
public class Procedimientos {
    public static void RegistroPadres(String a,String b,String c,String d,String e, String f)throws SQLException{
      CallableStatement entrada = Conexion_base_Datos.getConexion().prepareCall("{call AgregarPadre(?,?,?,?,?,?)}");
      
      entrada.setString(1, a);
      entrada.setString(2, b);
      entrada.setString(3, c);
      entrada.setString(4, d);
      entrada.setString(5, e);
      entrada.setString(6, f);
      
      entrada.execute();
    
    }
}
