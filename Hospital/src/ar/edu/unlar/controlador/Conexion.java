/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**

 */
public class Conexion {
 private static Conexion instance = new Conexion();
	public static final String URL = "jdbc:postgresql://localhost:5432/Hospital"; //cambiar base de datos
	public static final String USER = "postgres";
	public static final String PASSWORD = "147258";
	public static final String DRIVER_CLASS = "org.postgresql.Driver"; // Agregar libreria
	
    public Conexion() {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection createConnection() {
		Connection connection = null;
		
                
                try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
                        System.out.println("Se conecto exitosamente");
		} catch (SQLException e) {
			System.out.println("ERROR: Unable to Connect to Database.");
		}
                
		return connection;
	}	
	
	public static Connection getConnection() {
		return instance.createConnection();
	}
    
}
