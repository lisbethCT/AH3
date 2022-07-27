
package com.mycompany.crudconsola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insertar {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    
    public void crear(String nombre, String direccion, int tel){
    
        String sql = "insert into alumno(nombre,direccion,telefono) values (?,?,?)";
    
        try {
            con = conectar.Conectar();
            ps = con.prepareStatement(sql);
            //ps.setInt(1, codigo);
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setInt(3, tel);
            ps.executeUpdate();
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
