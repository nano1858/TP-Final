/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.UI;

import ar.edu.unlar.controlador.controladorCama;
import ar.edu.unlar.controlador.controladorHabitacion;
import ar.edu.unlar.controlador.controladorInternacion;
import ar.edu.unlar.controlador.controladorUbicacion;
import ar.edu.unlar.grilla.Grilla;
import ar.edu.unlar.objeto.Cama;
import ar.edu.unlar.objeto.Habitacion;
import ar.edu.unlar.objeto.Internacion;
import ar.edu.unlar.objeto.Ubicacion;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Marcos
 */
public class AbmInternacion extends javax.swing.JInternalFrame {
     ArrayList<Internacion> alInternacion = new ArrayList();
    ArrayList<Internacion> al2 = new ArrayList<>();
    controladorInternacion ci = new controladorInternacion();
    /**
     * Creates new form AbmInternacion
     */
    public AbmInternacion() {
        
        initComponents();
        alInternacion = ci.MostrarTodos();
        Grilla grilla = new Grilla(alInternacion);
        jtInternacion.setModel(grilla);
        ComboCama();
//        ComboUbicacion();
        ComboHabitacion();
    }
     public void ComboCama() {
        ArrayList<Cama> alCama= new ArrayList<>();

             controladorCama cc= new controladorCama();//cc controlador cliente 

        alCama = cc.MostrarTodos();//crear arraylist e instanciar objeto

     Cama[] d = new Cama[alCama.size()];
        for (int i = 0; i < alCama.size(); i++) { // size cuenta objetos cliente que van entrando
            d[i] = alCama.get(i);
        }

        //cargo modelo
        DefaultComboBoxModel<Cama> boxModel = new DefaultComboBoxModel<>(d);

        jcbCama.setModel(boxModel);
        jcbCama.setSelectedItem(null);
    }
//      public void ComboUbicacion() {
//        ArrayList<Ubicacion> alUbicacion= new ArrayList<>();
//
//             controladorUbicacion cu= new controladorUbicacion();//cc controlador cliente 
//
//        alUbicacion = cu.MostrarTodos();//crear arraylist e instanciar objeto
//
//     Ubicacion[]d  = new Ubicacion[alUbicacion.size()];
//        for (int i = 0; i < alUbicacion.size(); i++) { // size cuenta objetos cliente que van entrando
//            d[i] = alUbicacion.get(i);
//        }
//
//        //cargo modelo
//        DefaultComboBoxModel<Ubicacion> boxModel = new DefaultComboBoxModel<>(d);
//
//        jcbUbicacion.setModel(boxModel);
//        jcbUbicacion.setSelectedItem(null);
//    }
      public void ComboHabitacion() {
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
        jcbCama = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInternacion = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jcbHabitacion = new javax.swing.JComboBox();
        jbAgregar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfDiagnostico = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("Cama");

        jcbCama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jtInternacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtInternacion);

        jLabel3.setText("Habitacion");

        jcbHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbAgregar.setText("Agregar");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha");

        jLabel5.setText("Paciente");

        jLabel6.setText("Diagnostico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAgregar)
                            .addGap(18, 18, 18)
                            .addComponent(jbGuardar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAgregar))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcbHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Internacion internacion = new Internacion(); 
        internacion.setCama((Cama) jcbCama.getSelectedItem());
        internacion.setFecha(jdFecha.getDate());
        internacion.setPaciente(jtfPaciente.getText());
        internacion.setDiagnostico(jtfDiagnostico.getText());
       
       
        
        controladorInternacion ci = new controladorInternacion();
        ci.guardar(internacion);

        
         alInternacion.add(internacion);       
        Grilla grilla = new Grilla(alInternacion); 
        jtInternacion.setModel(grilla); 
        
// TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox jcbCama;
    private javax.swing.JComboBox jcbHabitacion;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTable jtInternacion;
    private javax.swing.JTextField jtfDiagnostico;
    private javax.swing.JTextField jtfPaciente;
    // End of variables declaration//GEN-END:variables
}