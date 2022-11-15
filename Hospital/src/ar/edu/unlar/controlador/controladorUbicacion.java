/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.controlador;



import ar.edu.unlar.objeto.Ubicacion;
import ar.edu.unlar.util.FechaSQL;
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
public class controladorUbicacion {
    public Ubicacion mostrar(int id) {//empieza extraer
         Conexion metodoConexion = new Conexion();
            Connection con;
        
        con = metodoConexion.getConnection(); // conexion
        Ubicacion tipo = new Ubicacion();

        try {
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("Select * from ubicaciones where id_ubicacion=?");//signo de pregunta comodin para entrar datos 
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                tipo.setHospital(rs.getString(1));
                tipo.setNombre(rs.getString(2));   
                tipo.setId(rs.getInt(3));
               
                 //cargar controladores, hacer mostrar en otras clases
                
               
                
            }

        } catch (SQLException ex) {
            System.out.print(ex);
        }

        return tipo;
    }
      public ArrayList<Ubicacion> MostrarTodos() {
        Conexion metodoConexion = new Conexion();
        Connection con;
        con = metodoConexion.getConnection(); // conexion

        ArrayList<Ubicacion> array = new ArrayList<>();

        try {

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from ubicaciones");
       
            rs = ps.executeQuery();

            while (rs.next()) {

                Ubicacion obj = new Ubicacion();
                obj.setHospital(rs.getString(1));
                obj.setNombre(rs.getString(2));     
                obj.setId(rs.getInt(3));
                
             
                array.add(obj);

            }

        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return array;

    }
     public int guardar (Ubicacion u){
            
            Integer resultado = 0;
    
    String sql = "INSERT INTO ubicaciones(\n" +
"            hospital, nombre)\n" +
"    VALUES (?, ?)";
        try {
            Conexion metodoConexion = new Conexion();
            Connection con;

        con = metodoConexion.getConnection();
        con.setAutoCommit(false); //abro o incio mi transaccion
        PreparedStatement psql = con.prepareStatement(sql);
       
        psql.setString(1,u.getHospital()); 
        psql.setString(2,u.getNombre()); 
        
    
       
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
