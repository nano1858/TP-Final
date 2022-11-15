/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.grilla;


import ar.edu.unlar.objeto.Habitacion;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class GrillaHabitacion extends AbstractTableModel{
      ArrayList<Habitacion> alHabitacion = new ArrayList<>();

    public GrillaHabitacion(ArrayList<Habitacion> datos) { //Cambiar nombre del array y la grilla
        this.alHabitacion = datos;
    }

    @Override
    public int getRowCount() {
        return alHabitacion.size(); 
    }

    @Override
    public int getColumnCount() {
        return 2; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
             Habitacion obj = alHabitacion.get(rowIndex);
                
          switch(columnIndex){
              case 0: return obj.getNumero();
              case 1: return obj.getUbicacion().getHospital();
              
             
              
              
              
              default: return "";
          }
          
          
          
    }

    @Override
    public String getColumnName(int column) {
        
        switch(column){
              case 0: return "Numero";
              case 1: return "Ubicacion";
              
              
              
          
            
            default: return "";
        
                
        }
    }
    
}
