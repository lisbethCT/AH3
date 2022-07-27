
package com.mycompany.crudconsola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Eliminar {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    
    public void eliminar(int carnet){
        String sql = "delete from alumno where codigo = ?";

        try{
            con = conectar.Conectar();
            ps= con.prepareStatement(sql);
            ps.setInt(1, carnet);
            
            ps.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
