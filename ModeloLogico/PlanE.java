package ModeloLogico;

import java.util.ArrayList;


public class PlanE extends PlandeEstudio {

    public PlanE(String nombre) {
        super(nombre);
    }
    
    
    @Override
    public void puedeCursar(Cursada c, Materia m){
       
     // BUSCO SI LA MATERIA A AGREGAR TIENE CORRELATIVAS
       if ((m.listacorrelativas.isEmpty()) && (verificarMateriasPrevias(c) == true)){
           
           c.agregarMateriaDisponible(c,m);  // si no tiene agrego a la lista de disponibles
           }
       else
           for (Materia m1 : m.listacorrelativas) {//sino recorro la lista
                if ((m1.getNotap()>4) && (verificarMateriasPrevias(c) == true) ) //si esta aprobada la agrego
                {c.agregarMateriaDisponible(c, m);}
           }
 
    }
     
    public ArrayList<Materia> crearMateriasPrevias(Carrera c,int CantidadCuatrimestre){
    
     ArrayList<Materia> listaPrevias = null;  
      
      for (int i=0;i<c.listamaterias.size();i++){
        
          if (c.listamaterias.get(i).getCuatrimestre() <= CantidadCuatrimestre)
              listaPrevias.add(c.listamaterias.get(i));
      }  
     return listaPrevias;
    }
    
    public boolean verificarMateriasPrevias(Cursada c){
    
    boolean x = false;
    ArrayList<Materia> listaPrevias = crearMateriasPrevias (c.carrera,3);
    
    if (listaPrevias.containsAll(c.listamateriasAprobadas)){
        x=true;
    }
    return x;
    }
   
}
