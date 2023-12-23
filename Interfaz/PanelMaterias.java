package Interfaz;

import Controladores.ControladorPanelMaterias;
        
public class PanelMaterias extends javax.swing.JPanel {

    public PanelMaterias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        panelCrearMateria = new javax.swing.JPanel();
        jlCarrera = new javax.swing.JLabel();
        listacarreras = new javax.swing.JComboBox<>();
        jlNombre = new javax.swing.JLabel();
        jtnombre = new javax.swing.JTextField();
        jlAño = new javax.swing.JLabel();
        jthoras = new javax.swing.JTextField();
        jlRegimen = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        jcbtipo = new javax.swing.JComboBox<>();
        jlPromocion = new javax.swing.JLabel();
        jcbpromocion = new javax.swing.JComboBox();
        botonAgregarMateria = new javax.swing.JButton();
        jlCrearMateria = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtCuatrimestre = new javax.swing.JTextField();
        panelListaMaterias = new javax.swing.JPanel();
        jlListadodeMaterias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablamaterias = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(617, 531));

        PanelContenedor.setBackground(new java.awt.Color(204, 204, 255));
        PanelContenedor.setAlignmentX(0.0F);
        PanelContenedor.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        panelCrearMateria.setBackground(new java.awt.Color(72, 84, 84));

        jlCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/jlCarrera.png"))); // NOI18N

        listacarreras.setSelectedItem(null);
        listacarreras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listacarrerasItemStateChanged(evt);
            }
        });

        jlNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/jlNombre.png"))); // NOI18N

        jtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnombreActionPerformed(evt);
            }
        });

        jlAño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/jlAño.png"))); // NOI18N

        jlRegimen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/jlCuatrimestre.png"))); // NOI18N

        jlTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/jlTipo.png"))); // NOI18N

        jcbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Obligatoria", "Opcional" }));
        jcbtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbtipoActionPerformed(evt);
            }
        });

        jlPromocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/jlPromo.png"))); // NOI18N

        jcbpromocion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No" }));
        jcbpromocion.setSelectedItem(null);

        botonAgregarMateria.setBackground(new java.awt.Color(72, 84, 84));
        botonAgregarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/botonAgregarMateria.png"))); // NOI18N
        botonAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarMateriaActionPerformed(evt);
            }
        });

        jlCrearMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/jlCrearMateria.png"))); // NOI18N

        javax.swing.GroupLayout panelCrearMateriaLayout = new javax.swing.GroupLayout(panelCrearMateria);
        panelCrearMateria.setLayout(panelCrearMateriaLayout);
        panelCrearMateriaLayout.setHorizontalGroup(
            panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                                .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlNombre)
                                    .addComponent(jlCarrera))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(listacarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlRegimen)
                                    .addComponent(jlAño))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jthoras, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jtCuatrimestre))))
                        .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                                        .addComponent(jlPromocion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbpromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                                        .addComponent(jlTipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(botonAgregarMateria))))
                    .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlCrearMateria))
                    .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelCrearMateriaLayout.setVerticalGroup(
            panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCrearMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlCarrera)
                    .addComponent(listacarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbpromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre))
                .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearMateriaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jthoras, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAño))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCrearMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlRegimen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtCuatrimestre))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearMateriaLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(botonAgregarMateria)
                        .addGap(24, 24, 24))))
        );

        panelListaMaterias.setBackground(new java.awt.Color(72, 84, 84));

        jlListadodeMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/jlListadoDeMaterias.png"))); // NOI18N

        tablamaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Materia", "Año", "Cuatrimestre", "Tipo", "Promocionable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablamaterias);
        if (tablamaterias.getColumnModel().getColumnCount() > 0) {
            tablamaterias.getColumnModel().getColumn(0).setPreferredWidth(250);
            tablamaterias.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        botonModificar.setBackground(new java.awt.Color(72, 84, 84));
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/botonEditar.png"))); // NOI18N
        botonModificar.setPreferredSize(new java.awt.Dimension(195, 39));
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(72, 84, 84));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelMaterias/botonEliminar.png"))); // NOI18N
        botonEliminar.setPreferredSize(new java.awt.Dimension(196, 39));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListaMateriasLayout = new javax.swing.GroupLayout(panelListaMaterias);
        panelListaMaterias.setLayout(panelListaMateriasLayout);
        panelListaMateriasLayout.setHorizontalGroup(
            panelListaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaMateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListaMateriasLayout.createSequentialGroup()
                        .addGroup(panelListaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(panelListaMateriasLayout.createSequentialGroup()
                        .addGroup(panelListaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlListadodeMaterias)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelListaMateriasLayout.setVerticalGroup(
            panelListaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListaMateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlListadodeMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelListaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelListaMateriasLayout.createSequentialGroup()
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCrearMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelListaMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCrearMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelListaMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnombreActionPerformed

    private void listacarrerasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listacarrerasItemStateChanged
        ControladorPanelMaterias.identificarCarrera();
    }//GEN-LAST:event_listacarrerasItemStateChanged

    private void jcbtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbtipoActionPerformed

    private void botonAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarMateriaActionPerformed
        ControladorPanelMaterias.crearMateria();
    }//GEN-LAST:event_botonAgregarMateriaActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        ControladorPanelMaterias.eliminarMateria();// TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
     ControladorPanelMaterias.mostrarMenuEdicionMateria();   // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JButton botonAgregarMateria;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JComboBox jcbpromocion;
    public static javax.swing.JComboBox<String> jcbtipo;
    private javax.swing.JLabel jlAño;
    private javax.swing.JLabel jlCarrera;
    private javax.swing.JLabel jlCrearMateria;
    private javax.swing.JLabel jlListadodeMaterias;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPromocion;
    private javax.swing.JLabel jlRegimen;
    private javax.swing.JLabel jlTipo;
    public static javax.swing.JTextField jtCuatrimestre;
    public static javax.swing.JTextField jthoras;
    public static javax.swing.JTextField jtnombre;
    public static javax.swing.JComboBox<String> listacarreras;
    private javax.swing.JPanel panelCrearMateria;
    private javax.swing.JPanel panelListaMaterias;
    public static javax.swing.JTable tablamaterias;
    // End of variables declaration//GEN-END:variables
}
