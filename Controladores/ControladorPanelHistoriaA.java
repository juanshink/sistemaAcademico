package Controladores;

import Interfaz.PanelHistorialA;
import ModeloLogico.Facultad;
import ModeloLogico.Alumno;
import ModeloLogico.Cursada;
import ModeloLogico.Materia;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ControladorPanelHistoriaA {
    
public static void actualizarAlumnos(){
    
        PanelHistorialA.listaalumnos.removeAllItems();
        
         for (Alumno a : Facultad.alumnosFacultad){
              
                PanelHistorialA.listaalumnos.addItem(a.getNombre() +" "+a.getApellido());}
    }

public static void actualizarTablaCarrera(){
    
        String nomalum = (String) PanelHistorialA.listaalumnos.getSelectedItem();
        int indice2 = ControladorGeneral.buscarAlumno(nomalum);
        Alumno a1 = Facultad.alumnosFacultad.get(indice2);           
                    
        DefaultTableModel datos = (DefaultTableModel) PanelHistorialA.tablaCursaCa.getModel();
        
        Integer aux = PanelHistorialA.tablaCursaCa.getRowCount();
        for (Integer i =0; i< aux; i++){
        datos.removeRow(0);
        }        
     
        for (Cursada c : a1.cursada) {
             Object carrera [] = new Object[1];
             carrera[0]= c.getCarrera().getNombre();
             datos.addRow(carrera);
        }
    }

public static void actualizarTablaHistorial(){
        
    
        // IDENTIFICO EL NOMBRE DE LA CARRERA
        int row = PanelHistorialA.tablaCursaCa.getSelectedRow(); 
        String nomcarrera = (String) PanelHistorialA.tablaCursaCa.getValueAt(row, 0);   
           
        //IDENTIFICO EL ALUMNO
        String nomalum = (String) PanelHistorialA.listaalumnos.getSelectedItem(); 
        int indice = ControladorGeneral.buscarAlumno(nomalum);
        Alumno a1 = Facultad.alumnosFacultad.get(indice);
       
        int indice2 = ControladorGeneral.buscarCursada(a1,nomcarrera);
        Cursada curs = a1.cursada.get(indice2);
        
        DefaultTableModel datos = (DefaultTableModel) PanelHistorialA.tablahistorial.getModel();
            
        //Elimino las filas de la tabla
        Integer aux = PanelHistorialA.tablahistorial.getRowCount();
        for (Integer i =0; i< aux; i++){
        datos.removeRow(0);
        }
               
        
        for (Materia m : curs.listamaterias){
            
                 Object materia[] = new Object[6];

                    materia[0]= m.getNombre();
                    materia[1]= m.getAño();
                    materia[2]= m.getCuatrimestre();
                    materia[3]= m.getTipo();
                    materia[4]= m.getNotap();
                    materia[5]= m.getNotaf();
                            
                datos.addRow(materia);
        }
        
        // ORDENA LA TABLA
        TableRowSorter<TableModel> orden= new TableRowSorter<>(datos);
        PanelHistorialA.tablahistorial.setRowSorter(orden);
        
        estadodeCursada(curs);
 }
         

public static void estadodeCursada(Cursada curs){

 boolean x=true
         ;
 int opcionales = 0;
 
  for (Materia m : curs.listamaterias){
      if ("Opcional".equals(m.getTipo())){
       opcionales = opcionales +1;
      }
  }
 
 for (Materia m : curs.listamaterias)
         if ((m.getNotaf() < 4)){
             x=false;
            }

        if (x == true ){
        DefaultTableModel datos = (DefaultTableModel) PanelHistorialA.tablahistorial.getModel();
    
             Object materia[] = new Object[1]; 
             materia[0] ="¡¡Carrera finalizada!!";
            
        datos.addRow(materia);
        }
}

}
   