/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author johan
 */
public class Conexion_base_Datos 
{
      static Connection contacto = null;
      
      public static Connection getConexion(){
          String url ="jdbc:sqlserver://DESKTOP-TRUQEQJ\\SQLEXPRESS\\local:1433;databaseName=ProyectoFinal";
          
          try{
          
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          } catch (ClassNotFoundException e){
          
          JOptionPane.showMessageDialog(null, "No se puede realizar la conexion"+ e.getMessage(),
          "Error de Conexion",JOptionPane.ERROR_MESSAGE);
          }
          try {
            contacto = DriverManager.getConnection(url,"sa","elpelotero");
          
          } catch (SQLException e){
          
             JOptionPane.showMessageDialog(null, "Error"+ e.getMessage(),
             "Error de Conexion",JOptionPane.ERROR_MESSAGE);
          }
          return contacto;
      }
      
      public static ResultSet Consulta(String consulta){
          Connection con = getConexion();
          
          Statement declara;
          
          try{
          
              declara=con.createStatement();
              ResultSet respuesta = declara.executeQuery(consulta);
              
              return respuesta;
          }catch (SQLException e){
              
          JOptionPane.showMessageDialog(null, "Error"+ e.getMessage(),
          "Error de Conexion",JOptionPane.ERROR_MESSAGE);
          
         }
      
      return null;
      }
}