package ModeloLogico;

import java.util.ArrayList;


public class Cursada {
     
    private Alumno alumno;
    public Carrera carrera;
    public ArrayList<Materia> listamaterias;
    
    public ArrayList<Materia> listamateriasDisponibles;
    public ArrayList<Materia> listamateriasAprobadas;

    public Cursada() {
    }

    public Cursada(Alumno alumno, Carrera carrera) {
        this.alumno = alumno;
        this.carrera = carrera;
        listamaterias = new ArrayList<>();
        
        listamateriasDisponibles = new ArrayList<>();
        listamateriasAprobadas = new ArrayList<>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
    
    public void agregarMateriaCursada(Cursada c, Materia m){
    
      
        c.listamaterias.add(m);
       
    } 
    
     public void agregarMateriaDisponible(Cursada c, Materia m){

       c.listamateriasDisponibles.add(m);
     }

     public void agregarMateriaAprobadas(Cursada c,Materia m){
     
      c.listamateriasAprobadas.add(m);
      //c.listamateriasCursando.remove(m);
     }
     
     public void limpiarListaDispo(Cursada c){
         
       c.listamateriasDisponibles.clear();
       
     }

}
