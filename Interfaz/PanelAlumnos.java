package Interfaz;


import Controladores.ControladorPanelAlumnos;


public class PanelAlumnos extends javax.swing.JPanel {

   
    public PanelAlumnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor4 = new javax.swing.JPanel();
        PanelAltaAlumno = new javax.swing.JPanel();
        textnombre = new java.awt.TextField();
        textapellido = new java.awt.TextField();
        textdni = new java.awt.TextField();
        textedad = new java.awt.TextField();
        textdireccion = new java.awt.TextField();
        textcontacto = new java.awt.TextField();
        botonAltaAlumno = new javax.swing.JButton();
        jlnombre = new javax.swing.JLabel();
        jlapellido = new javax.swing.JLabel();
        jldni = new javax.swing.JLabel();
        jldireccion = new javax.swing.JLabel();
        jledad = new javax.swing.JLabel();
        jlcontacto = new javax.swing.JLabel();
        jlFichadeinscripcion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PanelListaAlumnos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        botonEliminar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        jlListadodealumnos = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(742, 524));

        PanelContenedor4.setBackground(new java.awt.Color(204, 204, 255));
        PanelContenedor4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelContenedor4.setAlignmentX(0.0F);

        PanelAltaAlumno.setBackground(new java.awt.Color(72, 84, 84));

        textedad.setName(""); // NOI18N

        botonAltaAlumno.setBackground(new java.awt.Color(72, 84, 84));
        botonAltaAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/bdardealta.png"))); // NOI18N
        botonAltaAlumno.setPreferredSize(new java.awt.Dimension(196, 39));
        botonAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaAlumnoActionPerformed(evt);
            }
        });

        jlnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/jlnombre.png"))); // NOI18N

        jlapellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/jlapellido.png"))); // NOI18N

        jldni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/jldni.png"))); // NOI18N

        jldireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/jldireccion.png"))); // NOI18N
        jldireccion.setToolTipText("");

        jledad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/jledad.png"))); // NOI18N

        jlcontacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/jlcontacto.png"))); // NOI18N

        jlFichadeinscripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/jlfichadeincripcion.png"))); // NOI18N

        javax.swing.GroupLayout PanelAltaAlumnoLayout = new javax.swing.GroupLayout(PanelAltaAlumno);
        PanelAltaAlumno.setLayout(PanelAltaAlumnoLayout);
        PanelAltaAlumnoLayout.setHorizontalGroup(
            PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAltaAlumnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
            .addGroup(PanelAltaAlumnoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelAltaAlumnoLayout.createSequentialGroup()
                        .addComponent(jldireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addGroup(PanelAltaAlumnoLayout.createSequentialGroup()
                        .addGroup(PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jldni)
                            .addComponent(jlnombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(textdni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAltaAlumnoLayout.createSequentialGroup()
                        .addComponent(jlapellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAltaAlumnoLayout.createSequentialGroup()
                        .addComponent(jlcontacto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAltaAlumnoLayout.createSequentialGroup()
                        .addComponent(jledad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textedad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(PanelAltaAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jlFichadeinscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAltaAlumnoLayout.setVerticalGroup(
            PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAltaAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFichadeinscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAltaAlumnoLayout.createSequentialGroup()
                        .addGroup(PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlapellido)
                            .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textdni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jledad, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(PanelAltaAlumnoLayout.createSequentialGroup()
                        .addComponent(jlnombre)
                        .addGap(13, 13, 13)
                        .addComponent(jldni)))
                .addGap(10, 10, 10)
                .addGroup(PanelAltaAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jldireccion)
                    .addComponent(textdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcontacto)
                    .addComponent(textcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        PanelListaAlumnos.setBackground(new java.awt.Color(72, 84, 84));

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Edad", "Direccion", "Contacto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);
        if (tablaAlumnos.getColumnModel().getColumnCount() > 0) {
            tablaAlumnos.getColumnModel().getColumn(2).setPreferredWidth(60);
            tablaAlumnos.getColumnModel().getColumn(3).setPreferredWidth(8);
            tablaAlumnos.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        botonEliminar.setBackground(new java.awt.Color(72, 84, 84));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/botonEliminar.png"))); // NOI18N
        botonEliminar.setPreferredSize(new java.awt.Dimension(196, 39));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonModificar.setBackground(new java.awt.Color(72, 84, 84));
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/botonEditar.png"))); // NOI18N
        botonModificar.setPreferredSize(new java.awt.Dimension(195, 39));
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        jlListadodealumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PanelAlumnos/jllistadodealumnos.png"))); // NOI18N

        javax.swing.GroupLayout PanelListaAlumnosLayout = new javax.swing.GroupLayout(PanelListaAlumnos);
        PanelListaAlumnos.setLayout(PanelListaAlumnosLayout);
        PanelListaAlumnosLayout.setHorizontalGroup(
            PanelListaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelListaAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelListaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelListaAlumnosLayout.createSequentialGroup()
                        .addGroup(PanelListaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlListadodealumnos)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelListaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelListaAlumnosLayout.setVerticalGroup(
            PanelListaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListaAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlListadodealumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelListaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelListaAlumnosLayout.createSequentialGroup()
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelContenedor4Layout = new javax.swing.GroupLayout(PanelContenedor4);
        PanelContenedor4.setLayout(PanelContenedor4Layout);
        PanelContenedor4Layout.setHorizontalGroup(
            PanelContenedor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelListaAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelAltaAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelContenedor4Layout.setVerticalGroup(
            PanelContenedor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedor4Layout.createSequentialGroup()
                .addComponent(PanelAltaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelListaAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelContenedor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelContenedor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
  

    private void botonAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaAlumnoActionPerformed
       
        boolean validarDatosIngresados = ControladorPanelAlumnos.validarDatosIngresados(); 
        
        int dni = (Integer.parseInt(PanelAlumnos.textdni.getText()));
        boolean verificarExistencia = ControladorPanelAlumnos.verificarExistencia(dni);
        
        
        if ((validarDatosIngresados = true) && (verificarExistencia = true)){
            ControladorPanelAlumnos cpa = new ControladorPanelAlumnos();
            cpa.crearAlumno();   }
       
        
    }//GEN-LAST:event_botonAltaAlumnoActionPerformed
 
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
       ControladorPanelAlumnos.eliminarAlumno();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
       ControladorPanelAlumnos.mostrarMenuEdicionAlumno();
    }//GEN-LAST:event_botonModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAltaAlumno;
    public static javax.swing.JPanel PanelContenedor4;
    private javax.swing.JPanel PanelListaAlumnos;
    private javax.swing.JButton botonAltaAlumno;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlFichadeinscripcion;
    private javax.swing.JLabel jlListadodealumnos;
    private javax.swing.JLabel jlapellido;
    private javax.swing.JLabel jlcontacto;
    private javax.swing.JLabel jldireccion;
    private javax.swing.JLabel jldni;
    private javax.swing.JLabel jledad;
    private javax.swing.JLabel jlnombre;
    public static javax.swing.JTable tablaAlumnos;
    public static java.awt.TextField textapellido;
    public static java.awt.TextField textcontacto;
    public static java.awt.TextField textdireccion;
    public static java.awt.TextField textdni;
    public static java.awt.TextField textedad;
    public static java.awt.TextField textnombre;
    // End of variables declaration//GEN-END:variables
}
