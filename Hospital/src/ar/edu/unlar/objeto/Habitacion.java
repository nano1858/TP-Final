/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.objeto;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Habitacion {
    private int numero, id; 
   
    private Ubicacion ubicacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

   

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    

    @Override
    public String toString() {
        return "Habitacion " + "numero=" + numero;
    }

   

}
