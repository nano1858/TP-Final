/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.grilla;


import ar.edu.unlar.objeto.Cama;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class GrillaCama extends AbstractTableModel{
      ArrayList<Cama> alCama = new ArrayList<>();

    public GrillaCama(ArrayList<Cama> datos) { //Cambiar nombre del array y la grilla
        this.alCama = datos;
    }

    @Override
    public int getRowCount() {
        return alCama.size(); 
    }

    @Override
    public int getColumnCount() {
        return 2; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            Cama obj = alCama.get(rowIndex);
                
          switch(columnIndex){
              case 0: return obj.getNumero();
              case 1: return obj.getEstado();
              case 2: return obj.getHabitacion().getId();
              
             
              
              
              
              default: return "";
          }
          
          
          
    }

    @Override
    public String getColumnName(int column) {
        
        switch(column){
              case 0: return "Numero";
              case 1: return "Ubicacion";
              case 2: return "Habitacion";
              
              
          
            
            default: return "";
        
                
        }
    }
    
}
