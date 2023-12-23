package Controladores;


import ModeloLogico.Carrera;
import ModeloLogico.Facultad;
import Interfaz.PanelCarreras;
import Interfaz.PanelMaterias;
import Interfaz.VentanaEdicionCarreras;
import Interfaz.VentanaP;
import ModeloLogico.PlandeEstudio;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ControladorPanelCarrera {

    public ControladorPanelCarrera() {
    }
    
    public static PlandeEstudio identificarPlan(String nombreplan){
        
        PlandeEstudio plan = null;
      
        for (PlandeEstudio p : Facultad.planesCarreras ){
            if(p.getNombre().equals(nombreplan)){ 
                plan=p;
            }
 
        }
        return plan;
    }
    
    public static void crearCarrera(){
 
        String plan = PanelCarreras.jcplan.getSelectedItem().toString();
        PlandeEstudio p = identificarPlan(plan);
        
        
        String nombre = PanelCarreras.jtnombre.getText();
        Integer codigo = Integer.valueOf(PanelCarreras.jtcodigo.getText());
        Integer duracion = Integer.valueOf(PanelCarreras.jtduracion.getText());
        Integer opcionales = Integer.valueOf(PanelCarreras.jtopcionales.getText());
        
        Carrera c = new Carrera(nombre,codigo,duracion,opcionales,p);
 
        agregarCarrera(c);
        actualizarTabla();
    
    }
    
    public static void agregarCarrera(Carrera c){
    
        Facultad.carrerasFacultad.add(c);
    }
    
     public static void actualizarTabla(){
       
        DefaultTableModel datos = (DefaultTableModel) PanelCarreras.tablaCarreras.getModel();
          
        Integer aux = PanelCarreras.tablaCarreras.getRowCount();
        for (Integer i =0; i< aux; i++){
        datos.removeRow(0);
        }
        
              
        for (Carrera c : Facultad.carrerasFacultad) {
             Object carrera [] = new Object[5]; 
             carrera[0]= c.getNombre();
             carrera[1]= c.getCodigo();
             carrera[2]= c.getDuracion();
             carrera[3]= c.getOpcionales();
             carrera[4]= c.getPlandeestudio().getNombre();
           
             datos.addRow(carrera);
        }

}
     
    public static boolean verificarExistencia(String nombre){   //// identifica que hay repeticion pero igualmente lo carga en la lista
                                                                // devuelve true?
    boolean aux = true;
        
    for (Carrera c: Facultad.carrerasFacultad){
        
        if(nombre.equals(c.getNombre())){
            aux = false;  
            JOptionPane.showMessageDialog(null,"Ya existe una carrera con el nombre ingresado");
        }
    }
    
    return aux;
    } 
 
    public static void agregarMaterias(){
    
      
        int fila = PanelCarreras.tablaCarreras.getSelectedRow();
        JOptionPane.showMessageDialog(null,Facultad.carrerasFacultad.get(fila).getNombre());

        PanelMaterias panel = new PanelMaterias();
        agregarPanel(panel);

    }
    
    private static void agregarPanel(JPanel panel){
       
        panel.setSize(680, 469);
        panel.setLocation(0,0);
        
        VentanaP.PanelContenedor.removeAll();
        VentanaP.PanelContenedor.add(panel, BorderLayout.CENTER);
        VentanaP.PanelContenedor.revalidate();
        VentanaP.PanelContenedor.repaint();
   
   }
    
        public static void mostrarMenuEdicionCarrera(){
    
        // IDENTIFICO EL ALUMNO
       int row = PanelCarreras.tablaCarreras.getSelectedRow();
       String nomcarrera = (String) PanelCarreras.tablaCarreras.getValueAt(row, 0);   
        
       VentanaEdicionCarreras edicion = new VentanaEdicionCarreras();
       edicion.setVisible(true);
        
        for(int i=0; i<Facultad.carrerasFacultad.size(); i++) {
                    
            if (Facultad.carrerasFacultad.get(i).getNombre().equals(nomcarrera)){
                
                         Carrera c1 = Facultad.carrerasFacultad.get(i);
                         
                         // PRIMERO MUESTRO TODOS LOS DATOS EN LOS JTEXTFIELD
                         
                         VentanaEdicionCarreras.jtNewNombre.setText(c1.getNombre());
                         
                         VentanaEdicionCarreras.jcNewplan.setSelectedItem(c1.getPlandeestudio().getNombre());
                         
                         VentanaEdicionCarreras.jcNewplan.setName(c1.getPlandeestudio().getNombre());
                         VentanaEdicionCarreras.jtNewCodigo.setText(Integer.toString(c1.getCodigo()));
                         VentanaEdicionCarreras.jtNewDuracion.setText(Integer.toString(c1.getDuracion()));
                         VentanaEdicionCarreras.jtNewOpcionales.setText(Integer.toString(c1.getOpcionales()));
                         
    
    }}}
    
    public static void modificarCarrera(){
       
        //IDENTIFICO LA CARRERA
       int row = PanelCarreras.tablaCarreras.getSelectedRow();
       String nomcarrera = (String) PanelCarreras.tablaCarreras.getValueAt(row, 0); 
       int indice = ControladorGeneral.buscarCarrera(nomcarrera);
       Carrera c = Facultad.carrerasFacultad.get(indice);
      
        // LUEGO SE MODIFICA EL O LOS CAMPOS NECESARIOS Y SE SETEAN

            c.setNombre(VentanaEdicionCarreras.jtNewNombre.getText());
            c.setCodigo(Integer.parseInt(VentanaEdicionCarreras.jtNewCodigo.getText()));
            c.setDuracion(Integer.parseInt(VentanaEdicionCarreras.jtNewDuracion.getText()));
            c.setOpcionales(Integer.parseInt(VentanaEdicionCarreras.jtNewOpcionales.getText()));
            
            String nombreplan = VentanaEdicionCarreras.jcNewplan.getSelectedItem().toString();
            c.setPlandeestudio(identificarPlan(nombreplan));
           
        actualizarTabla();
    }

    public static void eliminarCarrera(){
    
       // IDENTIFICO LA CARRERA
       int row = PanelCarreras.tablaCarreras.getSelectedRow();
       String nomcarrera = (String) PanelCarreras.tablaCarreras.getValueAt(row, 0);   
        
       
        
        for(int i=0; i<Facultad.carrerasFacultad.size(); i++) {
                    
            if (Facultad.carrerasFacultad.get(i).getNombre().equals(nomcarrera)){
                         Facultad.carrerasFacultad.remove(i);
            }
        }
        actualizarTabla();
        }
}