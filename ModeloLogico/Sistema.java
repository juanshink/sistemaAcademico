package ModeloLogico;

import Interfaz.VentanaP;
import Controladores.ControladorPanelAlumnos;
import Controladores.ControladorPanelCarrera;


public class Sistema {
    
    
    public static void main (String[] args){
       
        VentanaP vp = new VentanaP();
        vp.setVisible(true);
        
        agregarPlanes();
        agregarDatos();  
        agregarAnalistaDeSistemas();
        
    }
    
    public static void agregarPlanes(){
        
        PlandeEstudio p1 = new PlanA("Plan A");
        PlandeEstudio p2 = new PlanB("Plan B");
        PlandeEstudio p3 = new PlanC("Plan C");
        PlandeEstudio p4 = new PlanD("Plan D");
        PlandeEstudio p5 = new PlanE("Plan E");
        
        Facultad.planesCarreras.add(p1);
        Facultad.planesCarreras.add(p2);
        Facultad.planesCarreras.add(p3);
        Facultad.planesCarreras.add(p4);
        Facultad.planesCarreras.add(p5);
        
        
    }
    
    public static void agregarDatos(){
        
    
     Alumno a1 = new Alumno("Juan Shinka","Mendez",38087989,28,"Los navegantes 199",290165275);
     Alumno a2 = new Alumno("Rocio","Fernandez",33769774,34,"Los navegantes 199",297539614);
     
     ControladorPanelAlumnos.agregarAlumno(a1);
     ControladorPanelAlumnos.agregarAlumno(a2);
   
     
     
     PlandeEstudio pa = Facultad.planesCarreras.get(0);
     
     Carrera c1 = new Carrera ("Licenciatura en Sistemas",1525,5,5,pa);  
     
              Materia m1 = new Materia("Algebra",1,"Obligatoria",1,"No");
              Materia m2 = new Materia("Programacion Orientada a Objetos",4,"Obligatoria",2,"Si");

               Carrera.agregarMateria(c1,m1);
               Carrera.agregarMateria(c1,m2);
       
    ControladorPanelCarrera.agregarCarrera(c1);
        
     //////////////////////////////////////
     
     PlandeEstudio pc = Facultad.planesCarreras.get(2);
     Carrera c2 = new Carrera ("Licenciatura en Bellas Artes",0420,5,5,pc);
        
            Materia m3 = new Materia("Historia del Arte",1,"Obligatoria",7,"No");
        
        Carrera.agregarMateria(c2, m3);
        
     ControladorPanelCarrera.agregarCarrera(c2);
     
     ///////////////////////////////////////
     
     PlandeEstudio pd = Facultad.planesCarreras.get(3);
     Carrera c3 = new Carrera ("Tecnicatura en Turismo",1545,3,4,pd);
    
            Materia m4 = new Materia("Comunicacion Social",1,"Obligatoria",8,"No");
            
            Carrera.agregarMateria(c3,m4);
            
     ControladorPanelCarrera.agregarCarrera(c3);
        
     
     
     ///////// CURSADAS
     
     // creo la cursada
     Cursada cur1 = new Cursada(a1,c1);
     
     // la vinculo al alumno
     Alumno.agregarCursada(a1,cur1);
     
     // agrego materias a la cursada
     cur1.agregarMateriaCursada(cur1,m1);
     cur1.agregarMateriaCursada(cur1,m2);
     
    }
     
    public static void agregarAnalistaDeSistemas(){
    
    PlandeEstudio pa = Facultad.planesCarreras.get(0);
    
    Carrera analista = new Carrera("Analista en Sistemas",3525,3,5,pa);
    
        Materia algebra = new Materia("Algebra",1,"Obligatoria",1,"No");
        Materia elementos = new Materia("Elementos de informatica",1,"Obligatoria",1,"Si");
        Materia expresion = new Materia("Expresion de Problemas Algoritmicos",1,"Obligatoria",1,"Si");
        Materia algoritmica1 = new Materia("Algoritmica y Programacion I",2,"Obligatoria",1,"No");
        Materia analisis = new Materia("Analisis Matematico",2,"Obligatoria",1,"No");
        Materia discreta = new Materia("Elementos de Logica y Matematica Discreta",2,"Obligatoria",1,"Si");
        Materia algoritmica2 = new Materia("Algoritmica y Programacion II",3,"Obligatoria",2,"Si");
        Materia arquitectura = new Materia("Arquitectura de Computadoras",3,"Obligatoria",2,"No");
        Materia estadistica = new Materia("Estadistica",3,"Obligatoria",2,"No");
        Materia sistemasyorg = new Materia("Sistemas y Organizaciones",4,"Obligatoria",2,"No");
        Materia basededatos = new Materia("Base de Datos I",4,"Obligatoria",2,"Si");
        Materia ingsoft1 = new Materia("Ingenieria de Software I",4,"Obligatoria",2,"No");
        Materia pydoo = new Materia("Programacion y Diseño Orientado a Objetos",4,"Obligatoria",2,"No");
        Materia ingsoft2 = new Materia("Ingenieria de Software II",5,"Obligatoria",3,"No");
        Materia concurrencia = new Materia("Introduccion a la Concurrencia",5,"Obligatoria",3,"Si");
        Materia laboratorio = new Materia ("Laboratorio de Programacion y Lenguajes",5,"Obligatoria",3,"No");
        Materia laborsoft = new Materia ("Laboratorio de Software",5,"Obligatoria",3,"No");
        Materia sistope = new Materia ("Sistemas Operativos",6,"Obligatoria",3,"No");
        Materia ingles = new Materia ("Ingles",6,"Obligatoria",1,"No");
       
        
       Carrera.agregarMateria(analista, algebra);
       
       Carrera.agregarMateria(analista,elementos);
       
       Carrera.agregarMateria(analista,ingles);
       
       Carrera.agregarMateria(analista,expresion);
       
       Carrera.agregarMateria(analista,algoritmica1);
       algoritmica1.añadirCorrelativa(expresion);
       
       Carrera.agregarMateria(analista,analisis);
       
       Carrera.agregarMateria(analista,discreta);
       
       Carrera.agregarMateria(analista,algoritmica2);
       algoritmica2.añadirCorrelativa(algoritmica1);
       algoritmica2.añadirCorrelativa(discreta);
       algoritmica2.añadirCorrelativa(ingles);
       
       Carrera.agregarMateria(analista,arquitectura);
       arquitectura.añadirCorrelativa(elementos);
       arquitectura.añadirCorrelativa(ingles);
       
       Carrera.agregarMateria(analista,estadistica);
       estadistica.añadirCorrelativa(algebra);
       estadistica.añadirCorrelativa(analisis);
       
       Carrera.agregarMateria(analista,sistemasyorg);
       sistemasyorg.añadirCorrelativa(ingles);
       
       Carrera.agregarMateria(analista,basededatos);
       basededatos.añadirCorrelativa(algoritmica2);
       
       Carrera.agregarMateria(analista,ingsoft1);
       ingsoft1.añadirCorrelativa(algoritmica1);
       ingsoft1.añadirCorrelativa(sistemasyorg);
       
       Carrera.agregarMateria(analista,pydoo);
       pydoo.añadirCorrelativa(algoritmica2);
       
       Carrera.agregarMateria(analista,ingsoft2);
       ingsoft2.añadirCorrelativa(basededatos);
       ingsoft2.añadirCorrelativa(ingsoft1);
       
       Carrera.agregarMateria(analista,concurrencia);
       concurrencia.añadirCorrelativa(arquitectura);
       concurrencia.añadirCorrelativa(algoritmica2);
       
       Carrera.agregarMateria(analista,laboratorio);
       laboratorio.añadirCorrelativa(basededatos);
       laboratorio.añadirCorrelativa(pydoo);
       
       Carrera.agregarMateria(analista,laborsoft);
       laborsoft.añadirCorrelativa(basededatos);
       laborsoft.añadirCorrelativa(pydoo);
       laborsoft.añadirCorrelativa(ingsoft1);
       
       Carrera.agregarMateria(analista,sistope);
       sistope.añadirCorrelativa(concurrencia);
       
       
       
       ControladorPanelCarrera.agregarCarrera(analista);
        
    }

}
