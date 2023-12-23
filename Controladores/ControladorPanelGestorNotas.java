package Controladores;

import Interfaz.PanelGestorNotas;
import Interfaz.VentanaEdicionNotas;
import ModeloLogico.Alumno;
import ModeloLogico.Cursada;
import ModeloLogico.Facultad;
import ModeloLogico.Materia;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ControladorPanelGestorNotas {
    
    public static void actualizarcomboAlumnos(JComboBox listaalumnos){
    
        listaalumnos.removeAllItems();
        
         for (Alumno a : Facultad.alumnosFacultad){
              
                PanelGestorNotas.listaalumnos.addItem(a.getNombre() +" "+a.getApellido());}
                    
    }
    
    public static void identificarAlumno(){
        
        String nomalum = (String) PanelGestorNotas.listaalumnos.getSelectedItem();
        int indice2 = ControladorGeneral.buscarAlumno(nomalum);
        Alumno a1 = Facultad.alumnosFacultad.get(indice2);
        
        actualizarTablaCarrera(a1.cursada);
        
        }
    
    public static void actualizarTablaCarrera(ArrayList<Cursada> listacursada){
    
        DefaultTableModel datos = (DefaultTableModel) PanelGestorNotas.tablaCursaCa.getModel();
        
        Integer aux = PanelGestorNotas.tablaCursaCa.getRowCount();
        for (Integer i =0; i< aux; i++){
        datos.removeRow(0);
        }        
     
        for (Cursada c : listacursada) {
             Object carrera [] = new Object[1];
             carrera[0]= c.getCarrera().getNombre();
             datos.addRow(carrera);
        }
    
    }
    
    public static void actualizarTablaGestor(){
        
        //Identifico el nombre de la carrera que esta seleccionada
        int row = PanelGestorNotas.tablaCursaCa.getSelectedRow(); 
        String nomcarrera = (String) PanelGestorNotas.tablaCursaCa.getValueAt(row, 0);
        
         //Identifico al alumno y lo igualo a una variable
        String nomalum = (String) PanelGestorNotas.listaalumnos.getSelectedItem();
        int indice2 = ControladorGeneral.buscarAlumno(nomalum);
        Alumno a1 = Facultad.alumnosFacultad.get(indice2); 
        
        // Busco la cursada con las variables obtenidas e igualo a una nueva variable  
        int indice = ControladorGeneral.buscarCursada(a1,nomcarrera);
        Cursada c = a1.cursada.get(indice);
        
        // Creo un modelo para la tabla
        DefaultTableModel datos = (DefaultTableModel) PanelGestorNotas.tablaGestor.getModel();
            
        //Elimino las filas de la tabla
        Integer aux = PanelGestorNotas.tablaGestor.getRowCount();
        for (Integer i =0; i< aux; i++){
        datos.removeRow(0);
        }
       
        //Agrego a la tabla las materias de la cursada
           for (Materia m : c.listamaterias){
                Object materia[] = new Object[3];
                    materia[0]= m.getNombre();
                    materia[1]= m.getNotap();
                    materia[2]= m.getNotaf();
                    
                datos.addRow(materia);}
} 
    
    public static void mostrarMenuEdicionNotas(){
    
       // IDENTIFICO LA MATERIA
       int row1 = PanelGestorNotas.tablaGestor.getSelectedRow();
       String nommateria = (String) PanelGestorNotas.tablaGestor.getValueAt(row1, 0); 
       
        VentanaEdicionNotas edicion = new VentanaEdicionNotas();
        edicion.setVisible(true);               
                         
        VentanaEdicionNotas.jtMateria.setText(nommateria);
                        
    }
    
    public static void modificarNotas(){
       
   // IDENTIFICO LA Carrera
       int row = PanelGestorNotas.tablaCursaCa.getSelectedRow();
       String nomcarrera = (String) PanelGestorNotas.tablaCursaCa.getValueAt(row, 0); 
        
       // IDENTIFICO LA MATERIA
       int row1 = PanelGestorNotas.tablaGestor.getSelectedRow();
       String nommateria = (String) PanelGestorNotas.tablaGestor.getValueAt(row1, 0);   
       
        //Identifico al alumno y lo igualo a una variable
        String nomalum = (String) PanelGestorNotas.listaalumnos.getSelectedItem();
        int indice2 = ControladorGeneral.buscarAlumno(nomalum);
        Alumno a1 = Facultad.alumnosFacultad.get(indice2); 
        
        System.out.println(a1.getNombre());
        
        // Busco la cursada con las variables obtenidas e igualo a una nueva variable  
        int indice = ControladorGeneral.buscarCursada(a1,nomcarrera);
        Cursada c = a1.cursada.get(indice);
      
        
        for (Materia m : c.listamaterias){
            
            if (m.getNombre() == nommateria){
        
                m.setNotap(Integer.parseInt(VentanaEdicionNotas.jcNewnotap.getSelectedItem().toString()));
                m.setNotaf(Integer.parseInt(VentanaEdicionNotas.jcNewnotaf.getSelectedItem().toString()));
                
                if ((m.getNotap() >= 4) && (m.getNotaf() >= 4)){
                    c.agregarMateriaAprobadas(c, m);}

        }}
        actualizarTablaGestor();
    }
} 

