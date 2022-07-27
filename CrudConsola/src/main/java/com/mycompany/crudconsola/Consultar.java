
package com.mycompany.crudconsola;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Consultar {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    
    public void consultarBase(){
        String instruccion="select * from alumno";
        
        try{
            con=conectar.Conectar();
            ps=con.prepareStatement(instruccion);
            rs=ps.executeQuery();
            
            while(rs.next()){
                System.out.println("-------------------------------------");
                System.out.println("Codigo:    "+rs.getInt(1));
                System.out.println("Nombre:    "+rs.getString(2));
                System.out.println("Dirección: "+rs.getString(3));
                System.out.println("Teléfono:  "+rs.getInt(4));
                System.out.println("-------------------------------------");
            }
        }catch (Exception e){
            System.out.println(e);
        }           
    }
    
}
