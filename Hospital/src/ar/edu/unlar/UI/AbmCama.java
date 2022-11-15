/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.UI;

import ar.edu.unlar.controlador.controladorCama;
import ar.edu.unlar.controlador.controladorHabitacion;
import ar.edu.unlar.controlador.controladorUbicacion;
import ar.edu.unlar.grilla.GrillaCama;
import ar.edu.unlar.objeto.Cama;
import ar.edu.unlar.objeto.Habitacion;
import ar.edu.unlar.objeto.Ubicacion;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Marcos
 */
public class AbmCama extends javax.swing.JInternalFrame {
    ArrayList <Cama> alCama = new ArrayList();
    controladorCama cc = new controladorCama();
    /**
     * Creates new form AbmCama
     */
    public AbmCama() {
        initComponents();
        
        ComboHabitacion();
        
        
        alCama = cc.MostrarTodos();
        GrillaCama gc = new GrillaCama(alCama);
        jtCama.setModel(gc);
    }
      public void ComboHabitacion () {
        ArrayList<Habitacion> alHabitacion= new ArrayList<>();

             controladorHabitacion ch= new controladorHabitacion();//cc controlador cliente 

        alHabitacion = ch.MostrarTodos();//crear arraylist e instanciar objeto

     Habitacion[]d  = new Habitacion[alHabitacion.size()];
        for (int i = 0; i < alHabitacion.size(); i++) { // size cuenta objetos cliente que van entrando
            d[i] = alHabitacion.get(i);
        }

        //cargo modelo
        DefaultComboBoxModel<Habitacion> boxModel = new DefaultComboBoxModel<>(d);

        jcbHabitacion.setModel(boxModel);
        jcbHabitacion.setSelectedItem(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCama = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jcbHabitacion = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jtfEstado = new javax.swing.JTextField();

        jLabel1.setText("Numero");

        jLabel2.setText("Estado");

        jtCama.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtCama);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jcbHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Habitacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbHabitacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfNumero)
                            .addComponent(jtfEstado))
                        .addGap(55, 55, 55)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGuardar)
                            .addComponent(jButton2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Cama c = new Cama();
        controladorCama cc = new controladorCama();
        
        c.setNumero(Integer.parseInt(jtfNumero.getText()));
        c.setEstado(jtfEstado.getText());
        c.setHabitacion((Habitacion) jcbHabitacion.getSelectedItem());
        
        cc.guardar(c);
        
        alCama = cc.MostrarTodos();
        GrillaCama gc = new GrillaCama(alCama);
        jtCama.setModel(gc);
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox jcbHabitacion;
    private javax.swing.JTable jtCama;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfNumero;
    // End of variables declaration//GEN-END:variables
}