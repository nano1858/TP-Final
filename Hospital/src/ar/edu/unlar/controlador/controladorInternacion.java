/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.controlador;


import ar.edu.unlar.objeto.Internacion;
import ar.edu.unlar.util.FechaSQL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class controladorInternacion {
    public ArrayList<Internacion> MostrarTodos() {
        Conexion metodoConexion = new Conexion();
        Connection con;
        con = metodoConexion.getConnection(); // conexion

        ArrayList<Internacion> array = new ArrayList<>();

        try {

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from internaciones");
       
            rs = ps.executeQuery();

            while (rs.next()) {

                Internacion obj = new Internacion();
                obj.setPaciente(rs.getString(1));
                obj.setFecha(rs.getDate(2));     
                obj.setDiagnostico(rs.getString(3));
                obj.setId(rs.getInt(4));
                controladorCama cc = new controladorCama();
                obj.setCama(cc.mostrar(rs.getInt(5)));
               
             
                array.add(obj);

            }

        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return array;

    }
     public int guardar (Internacion i){
            
            Integer resultado = 0;
    
    String sql = "INSERT INTO internaciones(\n" +
"            paciente, fecha, diagnostico, cama)\n" +
"    VALUES (?, ?, ?, ?)";
        try {
            Conexion metodoConexion = new Conexion();
            Connection con;

        con = metodoConexion.getConnection();
        con.setAutoCommit(false); //abro o incio mi transaccion
        PreparedStatement psql = con.prepareStatement(sql);
       
        psql.setString(1,i.getPaciente());
        psql.setDate(2, FechaSQL.convertirfechasql(i.getFecha()));
        psql.setString(3,i.getDiagnostico()); 
        psql.setInt(4,i.getCama().getId());
    
       
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
