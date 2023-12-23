package Interfaz;


import Controladores.ControladorPanelCarrera;
import javax.swing.JOptionPane;


public class PanelCarreras extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public PanelCarreras() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        panelAgregarCarrera = new javax.swing.JPanel();
        jlnombre = new javax.swing.JLabel();
        jtnombre = new javax.swing.JTextField();
        jlplan = new javax.swing.JLabel();
        jcplan = new javax.swing.JComboBox<>();
        jlcodigo = new javax.swing.JLabel();
        jtcodigo = new javax.swing.JTextField();
        botonAgregarCarrera = new javax.swing.JButton();
        jlduracion = new javax.swing.JLabel();
        jtduracion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlnombre1 = new javax.swing.JLabel();
        jtopcionales = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarreras = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        botonEliminar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        PanelContenedor.setBackground(new java.awt.Color(204, 204, 255));
        PanelContenedor.setAlignmentX(0.0F);

        panelAgregarCarrera.setBackground(new java.awt.Color(72, 84, 84));

        jlnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelCarreras/jlNombre.png"))); // NOI18N

        jtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnombreActionPerformed(evt);
            }
        });

        jlplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelCarreras/jlPlanEstudio.png"))); // NOI18N
        jlplan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlplanMouseClicked(evt);
            }
        });

        jcplan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plan A", "Plan B", "Plan C", "Plan D", "Plan E" }));
        jcplan.setAutoscrolls(true);

        jlcodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelCarreras/jlCodigo.png"))); // NOI18N

        jtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcodigoActionPerformed(evt);
            }
        });

        botonAgregarCarrera.setBackground(new java.awt.Color(72, 84, 84));
        botonAgregarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelCarreras/bAgregarCarrera.png"))); // NOI18N
        botonAgregarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCarreraActionPerformed(evt);
            }
        });

        jlduracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelCarreras/jlDuracion.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelCarreras/jlCrearCarrera.png"))); // NOI18N

        jlnombre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelCarreras/jlCantOpcionales.png"))); // NOI18N

        javax.swing.GroupLayout panelAgregarCarreraLayout = new javax.swing.GroupLayout(panelAgregarCarrera);
        panelAgregarCarrera.setLayout(panelAgregarCarreraLayout);
        panelAgregarCarreraLayout.setHorizontalGroup(
            panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarCarreraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlplan)
                    .addComponent(jlnombre)
                    .addComponent(jlcodigo)
                    .addComponent(jlduracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcplan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtduracion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarCarreraLayout.createSequentialGroup()
                        .addComponent(jlnombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtopcionales, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelAgregarCarreraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonAgregarCarrera)
                        .addGap(122, 122, 122))))
            .addGroup(panelAgregarCarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAgregarCarreraLayout.setVerticalGroup(
            panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarCarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarCarreraLayout.createSequentialGroup()
                        .addGroup(panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlnombre1)
                            .addComponent(jtopcionales, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(botonAgregarCarrera))
                    .addGroup(panelAgregarCarreraLayout.createSequentialGroup()
                        .addGroup(panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlplan)
                            .addComponent(jcplan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlcodigo)
                            .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAgregarCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtduracion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlduracion))))
                .addGap(23, 23, 23))
        );

        jPanel1.setBackground(new java.awt.Color(72, 84, 84));

        tablaCarreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Codigo", "Duracion (Años)", "Opcionales", "Plan de Estudio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(tablaCarreras);
        if (tablaCarreras.getColumnModel().getColumnCount() > 0) {
            tablaCarreras.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelCarreras/jlListado.png"))); // NOI18N

        botonEliminar.setBackground(new java.awt.Color(72, 84, 84));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelCarreras/botonEliminar.png"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonEditar.setBackground(new java.awt.Color(72, 84, 84));
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelCarreras/botonEditar.png"))); // NOI18N
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(botonEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAgregarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAgregarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnombreActionPerformed

    private void jtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtcodigoActionPerformed

    private void botonAgregarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCarreraActionPerformed
       
        String nombre = (jlnombre.getText());
        boolean verificarExistencia = ControladorPanelCarrera.verificarExistencia(nombre);

        if ((verificarExistencia == true)){
            ControladorPanelCarrera.crearCarrera();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarCarreraActionPerformed

    private void jlplanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlplanMouseClicked
            JOptionPane.showMessageDialog(null," Plan A: aprobó las cursadas de las correlativas\n" +
            " Plan B: aprobó los finales de las correlativas\n" +
            " Plan C:   aprobó las cursadas de las correlativas y los finales de todas las materias de 5\n" +
            "cuatrimestres previos al que se quiere anotar\n" +
            " Plan D: aprobó las cursadas de las correlativas y los finales de todas las materias de 3\n" +
            "cuatrimestres previos al que se quiere anotar\n" +
            " Plan E: aprobó los finales de las correlativas y los finales de todas las materias de 3\n" +
            "cuatrimestres previos.");         // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jlplanMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        ControladorPanelCarrera.eliminarCarrera();// TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        ControladorPanelCarrera.mostrarMenuEdicionCarrera();// TODO add your handling code here:
    }//GEN-LAST:event_botonEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JButton botonAgregarCarrera;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JComboBox<String> jcplan;
    private javax.swing.JLabel jlcodigo;
    private javax.swing.JLabel jlduracion;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JLabel jlnombre1;
    private javax.swing.JLabel jlplan;
    public static javax.swing.JTextField jtcodigo;
    public static javax.swing.JTextField jtduracion;
    public static javax.swing.JTextField jtnombre;
    public static javax.swing.JTextField jtopcionales;
    private javax.swing.JPanel panelAgregarCarrera;
    public static javax.swing.JTable tablaCarreras;
    // End of variables declaration//GEN-END:variables
}
