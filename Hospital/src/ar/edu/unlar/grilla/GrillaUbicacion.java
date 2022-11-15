/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.grilla;


import ar.edu.unlar.objeto.Ubicacion;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class GrillaUbicacion extends AbstractTableModel {
       ArrayList<Ubicacion> alUbicacion = new ArrayList<>();

    public GrillaUbicacion(ArrayList<Ubicacion> datos) { //Cambiar nombre del array y la grilla
        this.alUbicacion = datos;
    }

    @Override
    public int getRowCount() {
        return alUbicacion.size(); 
    }

    @Override
    public int getColumnCount() {
        return 2; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
             Ubicacion obj = alUbicacion.get(rowIndex);
                
          switch(columnIndex){
              case 0: return obj.getHospital();
              case 1: return obj.getNombre();
              
             
              
              
              
              default: return "";
          }
          
          
          
    }

    @Override
    public String getColumnName(int column) {
        
        switch(column){
              case 0: return "Hospital";
              case 1: return "Area";
              
              
              
          
            
            default: return "";
        
                
        }
    }
    
}
