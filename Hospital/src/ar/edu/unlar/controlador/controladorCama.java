/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.controlador;

import ar.edu.unlar.objeto.Cama;

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
public class controladorCama {
     public Cama mostrar(int id) {//empieza extraer
         Conexion metodoConexion = new Conexion();
            Connection con;
        
        con = metodoConexion.getConnection(); // conexion
        Cama tipo = new Cama();

        try {
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("Select * from camas where id_cama=?");//signo de pregunta comodin para entrar datos 
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                tipo.setNumero(rs.getInt(1));
                tipo.setEstado(rs.getString(2));   
                tipo.setId(rs.getInt(3));
               
                 //cargar controladores, hacer mostrar en otras clases
                
               
                
            }

        } catch (SQLException ex) {
            System.out.print(ex);
        }

        return tipo;
    }
      public ArrayList<Cama> MostrarTodos() {
        Conexion metodoConexion = new Conexion();
        Connection con;
        con = metodoConexion.getConnection(); // conexion

        ArrayList<Cama> array = new ArrayList<>();

        try {

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from camas");
       
            rs = ps.executeQuery();

            while (rs.next()) {

                Cama obj = new Cama();
                obj.setNumero(rs.getInt(1));
                obj.setEstado(rs.getString(2));     
                obj.setId(rs.getInt(3));
               
             
                array.add(obj);

            }

        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return array;

    }
        public int guardar (Cama Alc){
            
            Integer resultado = 0;
    
    String sql = "INSERT INTO camas(\n" +
"            numero, estado, habitacion)\n" +
"    VALUES (?, ?, ?)";
        try {
            Conexion metodoConexion = new Conexion();
            Connection con;

        con = metodoConexion.getConnection();
        con.setAutoCommit(false); //abro o incio mi transaccion
        PreparedStatement psql = con.prepareStatement(sql);
       
           
                  psql.setInt(1,Alc.getNumero()); 
                  psql.setString(2, Alc.getEstado());
                  psql.setInt(3,Alc.getHabitacion().getId());
                
           
          
      
        
    
       
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
