package Controladores;

import Interfaz.PanelCorrelativas;
import ModeloLogico.Carrera;
import ModeloLogico.Facultad;
import ModeloLogico.Materia;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;


public class ControladorPanelCorrelativas {

    public ControladorPanelCorrelativas() {
    }
       
    public static void actualizarcomboCarreras(JComboBox listacarreras){

        listacarreras.removeAllItems();
        
         for (Carrera c : Facultad.carrerasFacultad){
              
                PanelCorrelativas.cbCarreras.addItem(c.getNombre());}
    
    }   
      
    public static void actualizarcomboMaterias(){

        String nomcarrera = (String) PanelCorrelativas.cbCarreras.getSelectedItem();
        int indice1 = ControladorGeneral.buscarCarrera(nomcarrera);  // SIMPLIFICAR LA BUSQUEDA 
        Carrera c1 = Facultad.carrerasFacultad.get(indice1);
       
        PanelCorrelativas.cbMaterias.removeAllItems();
   
         for (Materia m : c1.listamaterias){
              
                PanelCorrelativas.cbMaterias.addItem(m.getNombre());} 
    } 

    public static void actualizarlistaMaterias(){
      
           String nomcarrera = (String) PanelCorrelativas.cbCarreras.getSelectedItem();
           int indice1 = ControladorGeneral.buscarCarrera(nomcarrera);  // SIMPLIFICAR LA BUSQUEDA 
           Carrera c1 = Facultad.carrerasFacultad.get(indice1);
           
           String nommateria = (String) PanelCorrelativas.cbMaterias.getSelectedItem();
           
           DefaultListModel listModel = new DefaultListModel();
            //Recorro el contenido del ArrayList
                    int x = 0;
                    for(int i=0; i<c1.listamaterias.size(); i++) {
                    
                    //Añado el nombre de cada elemento del ArrayList en el modelo de la lista
                    //menos el nombre de la materia seleccionada
                            
                            if (!c1.listamaterias.get(i).getNombre().equals(nommateria)){
                                    
                                listModel.add(x, c1.listamaterias.get(i).getNombre());
                                x++;}
                       
                            //uso la variable x para posicionarme en el principio de la lista
                         }    
            
            //Asocio el modelo de lista al JList
             PanelCorrelativas.listaMaterias.setModel(listModel);

      }

    public static void actualizarlistaCorrelativas(){
         
        String nomcarrera = (String) PanelCorrelativas.cbCarreras.getSelectedItem();
        int indice1 = ControladorGeneral.buscarCarrera(nomcarrera);  // SIMPLIFICAR LA BUSQUEDA 
        Carrera c1 = Facultad.carrerasFacultad.get(indice1);

        String nommateria = (String) PanelCorrelativas.cbMaterias.getSelectedItem();
        
        //IDENTIFICO LA MATERIA Y ACTUALIZO LAS CORRELATIVAS
        int indice2 = ControladorGeneral.buscarMaterias(c1,nommateria);
        Materia m = c1.listamaterias.get(indice2);

        DefaultListModel listModel = new DefaultListModel();
                     
        for(int i=0; i<m.listacorrelativas.size(); i++) {
                    
                        listModel.add(i,m.listacorrelativas.get(i).getNombre());
                    }
        
                    
        //Asocio el modelo de lista al JList
        PanelCorrelativas.listaCorrelativas.setModel(listModel);
    }
    
    public static void agregarCorrelativa(){
   
    // IDENTIFICO LA CARRERA
        String nomcarrera = (String) PanelCorrelativas.cbCarreras.getSelectedItem();
        int indice1 = ControladorGeneral.buscarCarrera(nomcarrera);  // SIMPLIFICAR LA BUSQUEDA 
        Carrera c1 = Facultad.carrerasFacultad.get(indice1);
        
    // IDENTIFICO EL NOMBRE DE LA MATERIA A LA QUE SE LE AGREGA UNA CORRELATIVA
        String nommateria = (String) PanelCorrelativas.cbMaterias.getSelectedItem();
        
    // BUSCO EL OBJETO MATERIA 
        int indice2 = ControladorGeneral.buscarMaterias(c1, nommateria);
        Materia m = c1.listamaterias.get(indice2);
        
        
    // IDENTIFICO EL NOMBRE DE LA CORRELATIVA
    
        String nomcorrelativa = (String) PanelCorrelativas.listaMaterias.getSelectedValue();
    
    // BUSCO EL OBJETO CORRELATIVA
    
        int indice3 = ControladorGeneral.buscarMaterias(c1, nomcorrelativa);
        Materia correlativ = c1.listamaterias.get(indice3);
        
     // YA TENGO LA MATERIA Y SU CORRELATIVA
     // POR LO QUE AHORA AÑADO LA CORRELATIVA A SU MATERIA
     
        m.añadirCorrelativa(correlativ);
        actualizarlistaCorrelativas();
  
    }
    
    public static void quitarCorrelativa(){
    
        //IDENTIFICO EL NOMBRE DE LA CORRELATIVA A ELIMINAR
        String nomcorrelativa = (String) PanelCorrelativas.listaCorrelativas.getSelectedValue();
         
        //IDENTIFICO EL NOMBRE DE LA MATERIA A LA QUE SE LE AGREGA UNA CORRELATIVA
        String nommateria = (String) PanelCorrelativas.cbMaterias.getSelectedItem();
       
        // IDENTIFICO LA CARRERA
        String nomcarrera = (String) PanelCorrelativas.cbCarreras.getSelectedItem();
        int indice1 = ControladorGeneral.buscarCarrera(nomcarrera);  // SIMPLIFICAR LA BUSQUEDA 
        Carrera c1 = Facultad.carrerasFacultad.get(indice1);
        
        // BUSCO EL OBJETO MATERIA 
        int indice2 = ControladorGeneral.buscarMaterias(c1, nommateria);
        Materia m = c1.listamaterias.get(indice2);
        
        for(int i=0; i<m.listacorrelativas.size(); i++) {
                    
            if (m.listacorrelativas.get(i).getNombre().equals(nomcorrelativa)){
                         m.listacorrelativas.remove(i);
            }
        }
        actualizarlistaCorrelativas();
        }
     
    }
 
