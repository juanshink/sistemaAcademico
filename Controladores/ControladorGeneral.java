package Controladores;

import Interfaz.PanelMaterias;
import ModeloLogico.Alumno;
import ModeloLogico.Carrera;
import ModeloLogico.Cursada;
import ModeloLogico.Facultad;
import java.util.stream.IntStream;

public class ControladorGeneral {
    
        public static int buscarCarrera(String s){

            int index  = IntStream.range(0, Facultad.carrerasFacultad.size())
            .filter(userInd-> Facultad.carrerasFacultad.get(userInd).nombre.equals(s))
            .findFirst().orElse(-1);
        return index;
        }
        
        public static int buscarAlumno(String s){
        
        int index=0;
        
        for (int i=0;i< Facultad.alumnosFacultad.size();i++){
        
            
        String cadena = Facultad.alumnosFacultad.get(i).getNombre()+" "+Facultad.alumnosFacultad.get(i).getApellido();
           if (cadena.equals(s)){
               index = i;  
           }}
                
        return index;
        
        }
        
        public static int buscarCursada(Alumno a, String s){
        
        int index  = IntStream.range(0, a.cursada.size())
            .filter(userInd-> a.cursada.get(userInd).carrera.getNombre().equals(s))
            .findFirst().orElse(-1);
        return index;
        }
        
         public static int buscarMaterias(Carrera c, String s){
        
        int index  = IntStream.range(0, c.listamaterias.size())
            .filter(userInd-> c.listamaterias.get(userInd).getNombre().equals(s))
            .findFirst().orElse(-1);
        return index;
        }
        
        public static void identificarCarrera(){
        
        String nomcarrera = (String) PanelMaterias.listacarreras.getSelectedItem(); // Selecciono el nombre de la carrera
        int indice = ControladorGeneral.buscarCarrera(nomcarrera);
        Carrera c = Facultad.carrerasFacultad.get(indice);
        }
        
        
        public static Alumno encontrarAlumno(String nombreAlumno){
        
        int index  = IntStream.range(0, Facultad.alumnosFacultad.size())
            .filter(userInd-> Facultad.alumnosFacultad.get(userInd).nombre.equals(nombreAlumno))
            .findFirst().orElse(-1);
        
        Alumno a = Facultad.alumnosFacultad.get(index);
        return a;
        }
        
        
         public static Cursada encontrarCursada(Alumno a, String s){
        
        int index  = IntStream.range(0, a.cursada.size())
            .filter(userInd-> a.cursada.get(userInd).carrera.getNombre().equals(s))
            .findFirst().orElse(-1);
        
        return a.cursada.get(index);
        }
       
}
