package Controladores;

import Interfaz.PanelInscripciones;
import ModeloLogico.Carrera;
import ModeloLogico.Facultad;
import ModeloLogico.Alumno;
import ModeloLogico.Cursada;
import ModeloLogico.Materia;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorPanelInscripciones {
    
    public ControladorPanelInscripciones() {
    }
   
    public  boolean verificarCarrerasquecursa(){
    
    Boolean x = true;
    
    
    String nomcarrera = (String) PanelInscripciones.listacarreras.getSelectedItem();
    String nomalum = (String) PanelInscripciones.listaalumnos.getSelectedItem();
    
    int indice2 = ControladorGeneral.buscarAlumno(nomalum);
        Alumno a1 = Facultad.alumnosFacultad.get(indice2);  
    
  
    for (int i=0;i<a1.cursada.size();i++){
        
            if (a1.cursada.get(i).getCarrera().getNombre().equals(nomcarrera))
                x = false;      
    }
       
     return x;
 }
       
    public  void identificarInscripcion(){
    
    String nomcarrera = (String) PanelInscripciones.listacarreras.getSelectedItem();
    String nomalum = (String) PanelInscripciones.listaalumnos.getSelectedItem();
    
    int indice1 = ControladorGeneral.buscarCarrera(nomcarrera);
        Carrera c1 = Facultad.carrerasFacultad.get(indice1);
           
    int indice2 = ControladorGeneral.buscarAlumno(nomalum);
        Alumno a1 = Facultad.alumnosFacultad.get(indice2);
    
    if (verificarCarrerasquecursa()==true){
        crearCursada(a1,c1);}
    else{
        JOptionPane.showMessageDialog(null,"EL ALUMNO YA CURSA LA CARRERA");}
    
    }
    
    public  void actualizarcomboCarreras(JComboBox listacarreras){

        listacarreras.removeAllItems();
        
         for (Carrera c : Facultad.carrerasFacultad){
              
                PanelInscripciones.listacarreras.addItem(c.getNombre());}
    
    }   
    
    public  void actualizarcomboAlumnos(JComboBox listaalumnos){
    
        listaalumnos.removeAllItems();
        
         for (Alumno a : Facultad.alumnosFacultad){
              
                PanelInscripciones.listaalumnos.addItem(a.getNombre() +" "+a.getApellido());}
                    
                        //+" "+a.getApellido();
                    // no puedo agregar el apellido porque cuando busco por indice
                    // no puedo mezclar nombre con apellido (VERIFICAR)
    }
    
    public  void crearCursada(Alumno a, Carrera c){
        
     Cursada cur = new Cursada(a,c);
     
     Alumno.agregarCursada(a,cur);
     actualizarTablaCarrera(a.cursada);
              
}
    
    public  void identificarAlumno(){
        
        String nomalum = (String) PanelInscripciones.listaalumnos.getSelectedItem();
        int indice2 = ControladorGeneral.buscarAlumno(nomalum);
        Alumno a1 = Facultad.alumnosFacultad.get(indice2);
        
        actualizarTablaCarrera(a1.cursada);
}

    public void actualizarTablaCarrera(ArrayList<Cursada> listacursada){
    
        DefaultTableModel datos = (DefaultTableModel) PanelInscripciones.tablaCursaCa.getModel();
        
        Integer aux = PanelInscripciones.tablaCursaCa.getRowCount();
        for (Integer i =0; i< aux; i++){
        datos.removeRow(0);
        }        
     
        for (Cursada c : listacursada) {
             Object carrera [] = new Object[1];
             carrera[0]= c.getCarrera().getNombre();
             datos.addRow(carrera);
        }
    
    }
   
    public void identificarCarrera(){
         
        //Identifico el nombre de la carrera que esta seleccionada
        int row = PanelInscripciones.tablaCursaCa.getSelectedRow(); 
        String nomcarrera = (String) PanelInscripciones.tablaCursaCa.getValueAt(row, 0);   
        
        //Busco la carrera y la igualo a una variable
        int indice1 = ControladorGeneral.buscarCarrera(nomcarrera);
        Carrera c1 = Facultad.carrerasFacultad.get(indice1);
        
        //Identifico al alumno y lo igualo a una variable
        String nomalum = (String) PanelInscripciones.listaalumnos.getSelectedItem();
        int indice2 = ControladorGeneral.buscarAlumno(nomalum);
        Alumno a1 = Facultad.alumnosFacultad.get(indice2); 
        
        // Busco la cursada con las variables obtenidas e igualo a una nueva variable  
        int indice = ControladorGeneral.buscarCursada(a1,nomcarrera);
        Cursada c = a1.cursada.get(indice);

        // Lista de las materias que cursa el alumno
        actualizarTablaMaterias(c.listamaterias);
        
        actualizarListaMateriasDisponibles(c1, c);
        }
    
    public  void actualizarListaMaterias(Cursada c){
        
        DefaultListModel listModel = new DefaultListModel();
            //Recorro el contenido del ArrayList
       
        PanelInscripciones.listaMateriasDisponibles.removeAll();
       
        
        for(int i=0; i<c.listamateriasDisponibles.size(); i++) {
              //Añado el nombre de cada elemento del ArrayList en el modelo de la lista
            listModel.add(i, c.listamateriasDisponibles.get(i).getNombre());
            }     
        
            //Asocio el modelo de lista al JList
           
        PanelInscripciones.listaMateriasDisponibles.setModel(listModel);
        
    }
    
    
    public  void actualizarListaMateriasDisponibles(Carrera ca, Cursada cu){
        
        cu.limpiarListaDispo(cu);
        
        for(int i=0; i<ca.listamaterias.size(); i++){
        
                Materia m = ca.listamaterias.get(i);
                 ca.plandeestudio.puedeCursar(cu, m);
        
        }
        
        actualizarListaMaterias(cu);
    
    }
    
    
    
   public  boolean verificarMateriasquecursa(Cursada c, Materia m){
    
    Boolean x = true;
  
    for (Materia aux : c.listamaterias){
        
            if (aux.getNombre().equals(m.getNombre()))
                x = false;      
    }
       
     return x;
    
    }
    

    public void inscribirMaterias (Materia m){
        
        // Identifico el alumno que quiere inscribirse
       
        String nomalum = (String) PanelInscripciones.listaalumnos.getSelectedItem();
        int indice2 = ControladorGeneral.buscarAlumno(nomalum);
        Alumno a1 = Facultad.alumnosFacultad.get(indice2); 

        // Identifico la carrera 
        
        int row = PanelInscripciones.tablaCursaCa.getSelectedRow(); 
        String nomcarrera = (String) PanelInscripciones.tablaCursaCa.getValueAt(row, 0); 
        
        
        // Comparo la carrera con las cursadas que hace el alumno
        // para obtener el indice de la cursada
        
        int indice = ControladorGeneral.buscarCursada(a1,nomcarrera);
        
        // creo la variable y le asigno la cursada encontrada
        
        Cursada c = a1.cursada.get(indice);
       
        // agrego la materia
       Materia x = new Materia();
       
       x=m;
        
        if ((verificarMateriasquecursa(c, x)) == true ){
                c.agregarMateriaCursada(c,x);
                actualizarTablaMaterias(c.listamaterias);}
        else
            {JOptionPane.showMessageDialog(null,"EL ALUMNO YA CURSA LA MATERIA");}
    
    
    }
    
    public  void actualizarTablaMaterias(ArrayList<Materia> listamaterias){
        
        DefaultTableModel datos = (DefaultTableModel) PanelInscripciones.tablaMateriasCursadas.getModel();
        
        Integer aux = PanelInscripciones.tablaMateriasCursadas.getRowCount();
        for (Integer i =0; i< aux; i++){
        datos.removeRow(0);
        }        
     
        for (Materia m : listamaterias) {
             Object materia[] = new Object[1];
             materia[0]= m.getNombre();
             datos.addRow(materia);
        }
    
    }
}
