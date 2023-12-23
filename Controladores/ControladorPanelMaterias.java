package Controladores;

import Interfaz.PanelMaterias;
import Interfaz.VentanaEdicionMaterias;
import ModeloLogico.Facultad;
import ModeloLogico.Carrera;
import ModeloLogico.Materia;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
        
public class ControladorPanelMaterias {

    public ControladorPanelMaterias() {
    }
    
    public static void crearMateria(){
        
        String nombre = (PanelMaterias.jtnombre.getText());
        Integer cuatrimestre = (Integer.valueOf(PanelMaterias.jtCuatrimestre.getText()));
        String tipo = (PanelMaterias.jcbtipo.getSelectedItem().toString());
        Integer año = (Integer.valueOf(PanelMaterias.jthoras.getText()));
        String promocion = (PanelMaterias.jcbpromocion.getSelectedItem().toString());
             
        Materia m = new Materia(nombre,cuatrimestre,tipo,año,promocion);
    
        String nomcarrera = (String) PanelMaterias.listacarreras.getSelectedItem(); // Selecciono el nombre de la carrera
        int indice = ControladorGeneral.buscarCarrera(nomcarrera);
        Carrera c = Facultad.carrerasFacultad.get(indice);
        
        Carrera.agregarMateria(c,m);
        actualizarTablaMaterias(c);
    
    }
    
    public static void actualizarCombodeCarreras(JComboBox listacarreras){
    
       listacarreras.removeAllItems();
        
       for (Carrera c : Facultad.carrerasFacultad){
              
                PanelMaterias.listacarreras.addItem(c.getNombre());}
    
    }
    
    public static void identificarCarrera(){
        
        String nomcarrera = (String) PanelMaterias.listacarreras.getSelectedItem(); // Selecciono el nombre de la carrera
        int indice = ControladorGeneral.buscarCarrera(nomcarrera);
        Carrera c = Facultad.carrerasFacultad.get(indice);     
              
        actualizarTablaMaterias(c);
  
    }

    
    public static void actualizarTablaMaterias(Carrera c){
        
        DefaultTableModel datos = (DefaultTableModel) PanelMaterias.tablamaterias.getModel();
           
        Integer aux = PanelMaterias.tablamaterias.getRowCount();  // elimino todos los elementos de la tabla
        for (Integer i =0; i< aux; i++){
        datos.removeRow(0);
        }

            for (Materia m : c.listamaterias) {    // cargo los elementos de la lista a la tabla
             
            Object materia [] = new Object[5]; 
             materia[0]= m.getNombre();
             materia[1]= m.getAño();
             materia[2]= m.getCuatrimestre();
             materia[3]= m.getTipo();
             materia[4]= m.getPromocion();
             
           
             datos.addRow(materia);
        
        
        }

}

public static void mostrarMenuEdicionMateria(){
    
         // IDENTIFICO LA CARRERA
       String nomcarrera = (String) PanelMaterias.listacarreras.getSelectedItem(); // Selecciono el nombre de la carrera
       int indice = ControladorGeneral.buscarCarrera(nomcarrera);
       Carrera c = Facultad.carrerasFacultad.get(indice);  
       
                
        // IDENTIFICO LA MATERIA
       int row = PanelMaterias.tablamaterias.getSelectedRow();
       String nommateria = (String) PanelMaterias.tablamaterias.getValueAt(row, 0);   
        
       VentanaEdicionMaterias edicion = new VentanaEdicionMaterias();
       edicion.setVisible(true);
        
        for(int i=0; i<c.listamaterias.size(); i++) {
                    
            if (c.listamaterias.get(i).getNombre().equals(nommateria)){
                
                         Materia m1 = c.listamaterias.get(i);
                         
                         // PRIMERO MUESTRO TODOS LOS DATOS EN LOS JTEXTFIELD
                         
                         VentanaEdicionMaterias.jtNewNombre.setText(m1.getNombre());
                         VentanaEdicionMaterias.jtNewAño.setText(Integer.toString(m1.getAño()));                        
                        
                         VentanaEdicionMaterias.jcbNewpromocion.setSelectedItem(m1.getPromocion());
                         VentanaEdicionMaterias.jcbNewtipo.setSelectedItem(m1.getTipo());
                         VentanaEdicionMaterias.jtNewCuatrimestre.setText(Integer.toString(m1.getCuatrimestre()));
    }}}
    
    public static void modificarMateria(){
       
       // IDENTIFICO LA CARRERA
       String nomcarrera = (String) PanelMaterias.listacarreras.getSelectedItem(); // Selecciono el nombre de la carrera
       int indice = ControladorGeneral.buscarCarrera(nomcarrera);
       Carrera c = Facultad.carrerasFacultad.get(indice);  
                      
        // IDENTIFICO LA MATERIA
       int row = PanelMaterias.tablamaterias.getSelectedRow();
       String nommateria = (String) PanelMaterias.tablamaterias.getValueAt(row, 0);  
       
       int indice2 = ControladorGeneral.buscarMaterias(c, nommateria);
       Materia m1 = c.listamaterias.get(indice2);
      
        // LUEGO SE MODIFICA EL O LOS CAMPOS NECESARIOS Y SE SETEAN

            m1.setNombre(VentanaEdicionMaterias.jtNewNombre.getText());
            m1.setAño(Integer.parseInt(VentanaEdicionMaterias.jtNewAño.getText()));
            m1.setPromocion(VentanaEdicionMaterias.jcbNewpromocion.getSelectedItem().toString());
            m1.setCuatrimestre(Integer.parseInt(VentanaEdicionMaterias.jtNewCuatrimestre.getText()));
            m1.setTipo(VentanaEdicionMaterias.jcbNewtipo.getSelectedItem().toString());
                
                         
        actualizarTablaMaterias(c);
    }

     public static void eliminarMateria(){
    
       // IDENTIFICO LA CARRERA
       
        String nomcarrera = (String) PanelMaterias.listacarreras.getSelectedItem(); // Selecciono el nombre de la carrera
        int indice = ControladorGeneral.buscarCarrera(nomcarrera);
        Carrera c = Facultad.carrerasFacultad.get(indice);
         
       // IDENTIFICO LA MATERIA
       int row = PanelMaterias.tablamaterias.getSelectedRow();
       String nommate = (String) PanelMaterias.tablamaterias.getValueAt(row, 0);   
       
        
        for(int i=0; i<c.listamaterias.size(); i++) {
 
            if (c.listamaterias.get(i).getNombre().equals(nommate)){
                c.listamaterias.remove(i);
            }
        }
        actualizarTablaMaterias(c);
        }  
    
    
    

}