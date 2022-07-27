
package com.mycompany.crudconsola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Modificar {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    
    public void modificar(int codigo,String nombre, String direccion, int tel){
        String sql = "update alumno set nombre = ?, direccion = ?, telefono = ? where codigo = ?";
        try{
            con = conectar.Conectar();
            ps= con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setInt(3, tel);
            ps.setInt(4, codigo);
            
            ps.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
