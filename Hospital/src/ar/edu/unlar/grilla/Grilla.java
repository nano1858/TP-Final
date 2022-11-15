/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.grilla;

import ar.edu.unlar.objeto.Internacion;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
 */
public class Grilla extends AbstractTableModel {
       ArrayList<Internacion> alArray = new ArrayList<>();

    public Grilla(ArrayList<Internacion> datos) { //Cambiar nombre del array y la grilla
        this.alArray = datos;
    }

    @Override
    public int getRowCount() {
        return alArray.size(); 
    }

    @Override
    public int getColumnCount() {
        return 6; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
             Internacion obj = alArray.get(rowIndex);
                
          switch(columnIndex){
              case 0: return obj.getPaciente();
              case 1: return obj.getFecha();
              case 2: return obj.getDiagnostico();
              case 3: return obj.getCama().getId();
              case 4: return obj.getCama().getNumero();
              case 5: return obj.getCama().getEstado();
              
             
              
              
              
              default: return "";
          }
          
          
          
    }

    @Override
    public String getColumnName(int column) {
        
        switch(column){
              case 0: return "Paciente";
              case 1: return "Fecha";
              case 2: return "Diagnostico";
              case 3: return "Cama"; 
              case 4: return "Numero";
              case 5: return "Estado";
              
              
          
            
            default: return "";
        
                
        }
    }
    
    
}
