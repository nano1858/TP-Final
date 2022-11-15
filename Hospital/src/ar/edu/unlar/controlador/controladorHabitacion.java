/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.controlador;


import ar.edu.unlar.objeto.Cama;
import ar.edu.unlar.objeto.Habitacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class controladorHabitacion {
     public Habitacion mostrar(int id) {//empieza extraer
         Conexion metodoConexion = new Conexion();
            Connection con;
        
        con = metodoConexion.getConnection(); // conexion
        Habitacion tipo = new Habitacion();
        ArrayList <Cama> Alcama2 = new ArrayList<>();
        try {
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("Select * from habitaciones where id_habitacion=?");//signo de pregunta comodin para entrar datos 
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                tipo.setNumero(rs.getInt(1));
                tipo.setId(rs.getInt(2));  
             controladorUbicacion cu = new controladorUbicacion();
             tipo.setUbicacion(cu.mostrar(rs.getInt(3)));
             
                 //cargar controladores, hacer mostrar en otras clases
                
               
                
            }

        } catch (SQLException ex) {
            System.out.print(ex);
        }

        return tipo;
    }
      public ArrayList<Habitacion> MostrarTodos() {
        Conexion metodoConexion = new Conexion();
        Connection con;
        con = metodoConexion.getConnection(); // conexion
        
        ArrayList<Cama> Alcama2 = new ArrayList<>();
        ArrayList<Habitacion> array = new ArrayList<>();

        try {

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from habitaciones");
       
            rs = ps.executeQuery();

            while (rs.next()) {

                Habitacion obj = new Habitacion();
                obj.setNumero(rs.getInt(1));
                obj.setId(rs.getInt(2));
                controladorUbicacion cu = new controladorUbicacion();
                obj.setUbicacion(cu.mostrar(rs.getInt(3)));
               
             
                array.add(obj);

            }

        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return array;
        
        

    }
        public int guardar (Habitacion h){
            
            Integer resultado = 0;
    
    String sql = "INSERT INTO habitaciones(\n" +
"            numero, ubicacion)\n" +
"    VALUES (?, ?)";
        try {
            Conexion metodoConexion = new Conexion();
            Connection con;

        con = metodoConexion.getConnection();
        con.setAutoCommit(false); //abro o incio mi transaccion
        PreparedStatement psql = con.prepareStatement(sql);
       
          
        psql.setInt(1,h.getNumero()); 
        psql.setInt(2, h.getUbicacion().getId());
        
    
       
        resultado = psql.executeUpdate();
        psql.close();
        con.commit();
            JOptionPane.showMessageDialog(null, "Se guardo");
    }catch(Exception e){

            System.out.println(e);
            System.out.println("Tenes un error");

}
       
   return resultado;
       
       
    } 
    
}

