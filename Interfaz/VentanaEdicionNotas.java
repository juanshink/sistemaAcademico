/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Controladores.ControladorPanelGestorNotas;

/**
 *
 * @author juans
 */
public class VentanaEdicionNotas extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEdicionNotas
     */
    public VentanaEdicionNotas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlnombre = new javax.swing.JLabel();
        botonGuardarYSalir = new javax.swing.JButton();
        jldni = new javax.swing.JLabel();
        jlapellido = new javax.swing.JLabel();
        jtMateria = new javax.swing.JTextField();
        jlEdiciondeAlumno = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jcNewnotap = new javax.swing.JComboBox<>();
        jcNewnotaf = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(72, 84, 84));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jlnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelGestorN/jlMateria(edicion).png"))); // NOI18N

        botonGuardarYSalir.setBackground(new java.awt.Color(72, 84, 84));
        botonGuardarYSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelGestorN/botonGuardarySalir(edicion).png"))); // NOI18N
        botonGuardarYSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarYSalirActionPerformed(evt);
            }
        });

        jldni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelGestorN/jlNotaF(edicion).png"))); // NOI18N

        jlapellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelGestorN/jlNotaP(edicion).png"))); // NOI18N

        jlEdiciondeAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelGestorN/jlMenudeEdicion(edicion).png"))); // NOI18N

        jcNewnotap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jcNewnotap.setAutoscrolls(true);
        jcNewnotap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNewnotapActionPerformed(evt);
            }
        });

        jcNewnotaf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jcNewnotaf.setAutoscrolls(true);
        jcNewnotaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcNewnotafActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonGuardarYSalir)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlapellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcNewnotap, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jldni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jcNewnotaf, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlEdiciondeAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jlnombre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlEdiciondeAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jlnombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlapellido)
                    .addComponent(jcNewnotap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jldni)
                    .addComponent(jcNewnotaf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(botonGuardarYSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarYSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarYSalirActionPerformed
        ControladorPanelGestorNotas notas = new ControladorPanelGestorNotas();
        
        notas.modificarNotas();

        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_botonGuardarYSalirActionPerformed

    private void jcNewnotapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNewnotapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcNewnotapActionPerformed

    private void jcNewnotafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcNewnotafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcNewnotafActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarYSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JComboBox<String> jcNewnotaf;
    public static javax.swing.JComboBox<String> jcNewnotap;
    private javax.swing.JLabel jlEdiciondeAlumno;
    private javax.swing.JLabel jlapellido;
    private javax.swing.JLabel jldni;
    private javax.swing.JLabel jlnombre;
    public static javax.swing.JTextField jtMateria;
    // End of variables declaration//GEN-END:variables
}
