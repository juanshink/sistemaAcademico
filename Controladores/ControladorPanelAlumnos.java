package Controladores;

import ModeloLogico.Alumno;
import ModeloLogico.Facultad;
import Interfaz.PanelAlumnos;
import Interfaz.VentanaEdicionAlumno;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControladorPanelAlumnos {
    
    public ControladorPanelAlumnos() {
    }
  
    public void crearAlumno(){
    
    boolean x = verificarExistencia(Long.parseLong(PanelAlumnos.textdni.getText()));
    
    if (x == true) {
        Alumno e = new Alumno();
                
        e.setNombre (PanelAlumnos.textnombre.getText());
        e.setApellido(PanelAlumnos.textapellido.getText());
        e.setDni(Long.parseLong(PanelAlumnos.textdni.getText()));
        e.setEdad(Integer.parseInt(PanelAlumnos.textedad.getText()));
        e.setContacto(Long.parseLong(PanelAlumnos.textcontacto.getText()));
        e.setDireccion(PanelAlumnos.textdireccion.getText());

        agregarAlumno(e);
        actualizarTabla();   
    }
    else {JOptionPane.showMessageDialog(null,"Ya existe un estudiante asociado al DNI ingresado");}
        
    }   
    
    public static void agregarAlumno(Alumno e){
            
        Facultad.alumnosFacultad.add(e);
      
    }
    
    public static boolean verificarExistencia(long dni){   //// identifica que hay un mismo dni pero igualmente lo carga en la lista
         
    boolean aux = true;
        
        for (Alumno a: Facultad.alumnosFacultad){
        
            if(dni == a.getDni())
                aux = false;
        }  
    
    return aux;
    }
       
    public static void actualizarTabla(){
       
         DefaultTableModel datos = (DefaultTableModel) PanelAlumnos.tablaAlumnos.getModel();
        
        
        Integer aux = PanelAlumnos.tablaAlumnos.getRowCount();
        for (Integer i =0; i< aux; i++){
        datos.removeRow(0);
            }
            
        for (Alumno e : Facultad.alumnosFacultad) {
             Object estudiantes [] = new Object[6];
             estudiantes[0]= e.getNombre();
             estudiantes[1]= e.getApellido();
             estudiantes[2]= e.getDni();
             estudiantes[3]= e.getEdad();
             estudiantes[4]= e.getDireccion();
             estudiantes[5]= e.getContacto();
             datos.addRow(estudiantes);
        }
        
        
    }
    
    public static boolean validarDatosIngresados(){
          
        if(     !PanelAlumnos.textdireccion.getText().isEmpty()&& !PanelAlumnos.textnombre.getText().isEmpty() &&
                !PanelAlumnos.textapellido.getText().isEmpty()&& !PanelAlumnos.textdni.getText().isEmpty() &&
                !PanelAlumnos.textedad.getText().isEmpty()&& !PanelAlumnos.textcontacto.getText().isEmpty())
               
        {
                    if  (PanelAlumnos.textedad.getText().length() == 2 && PanelAlumnos.textapellido.getText().length() >= 3 && 
                         PanelAlumnos.textnombre.getText().length() >= 3 && PanelAlumnos.textdni.getText().length() >= 8 && 
                         PanelAlumnos.textcontacto.getText().length() > 8)
                         {return true;}
                    
                    else {JOptionPane.showMessageDialog(null,"COMPLETE LOS CAMPOS CORRECTAMENTE");
                          return false;}
                }
        else{JOptionPane.showMessageDialog(null,"PRIMERO COMPLETE TODOS LOS CAMPOS");
             return false;}        
}
      
    public static void mostrarMenuEdicionAlumno(){
    
        // IDENTIFICO EL ALUMNO
       int row = PanelAlumnos.tablaAlumnos.getSelectedRow();
       String nomalumno = (String) PanelAlumnos.tablaAlumnos.getValueAt(row, 0);   
        
       VentanaEdicionAlumno edicion = new VentanaEdicionAlumno();
       edicion.setVisible(true);
        
        for(int i=0; i<Facultad.alumnosFacultad.size(); i++) {
                    
            if (Facultad.alumnosFacultad.get(i).getNombre().equals(nomalumno)){
                
                         Alumno a1 = Facultad.alumnosFacultad.get(i);
                         
                         // PRIMERO MUESTRO TODOS LOS DATOS EN LOS JTEXTFIELD
                         
                         VentanaEdicionAlumno.jtNewNombre.setText(a1.getNombre());
                         VentanaEdicionAlumno.jtNewApellido.setText(a1.getApellido());
                         VentanaEdicionAlumno.jtNewDni.setText(Long.toString(a1.getDni()));
                         VentanaEdicionAlumno.jtNewEdad.setText(Integer.toString(a1.getEdad()));
                         VentanaEdicionAlumno.jtNewDireccion.setText(a1.getDireccion());
                         VentanaEdicionAlumno.jtNewContacto.setText(Long.toString(a1.getContacto()));
    
    }}}
    
    public static void modificarAlumno(){
            
       int row = PanelAlumnos.tablaAlumnos.getSelectedRow();
       String nomalu = (String) PanelAlumnos.tablaAlumnos.getValueAt(row, 0); 
       Alumno a1 = ControladorGeneral.encontrarAlumno(nomalu);
       
        // LUEGO SE MODIFICA EL O LOS CAMPOS NECESARIOS Y SE SETEAN
                         
            a1.setNombre (VentanaEdicionAlumno.jtNewNombre.getText());
            a1.setApellido(VentanaEdicionAlumno.jtNewApellido.getText());
            a1.setDni(Long.parseLong(VentanaEdicionAlumno.jtNewDni.getText()));
            a1.setEdad(Integer.parseInt(VentanaEdicionAlumno.jtNewEdad.getText()));
            a1.setDireccion(VentanaEdicionAlumno.jtNewDireccion.getText());
            a1.setContacto(Long.parseLong(VentanaEdicionAlumno.jtNewContacto.getText()));
            
        actualizarTabla();
        }
    
    public static void eliminarAlumno(){
    
       // IDENTIFICO EL ALUMNO
       int row = PanelAlumnos.tablaAlumnos.getSelectedRow();
       String nomalumno = (String) PanelAlumnos.tablaAlumnos.getValueAt(row, 0);   
        
       
        
        for(int i=0; i<Facultad.alumnosFacultad.size(); i++) {
                    
            if (Facultad.alumnosFacultad.get(i).getNombre().equals(nomalumno)){
                         Facultad.alumnosFacultad.remove(i);
            }
        }
        actualizarTabla();
        }
}
    
    
