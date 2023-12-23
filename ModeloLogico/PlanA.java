package ModeloLogico;


public class PlanA extends PlandeEstudio{

    public PlanA(String nombre) {
        super(nombre);
    }
     
    @Override
    public void puedeCursar(Cursada c, Materia m){
       
    boolean aux=false;    
        
    // BUSCO SI LA MATERIA A AGREGAR TIENE CORRELATIVAS
       if (m.listacorrelativas.isEmpty()){
           c.agregarMateriaDisponible(c,m);  // si no tiene agrego a la lista de disponibles
           }
       else{
           for (Materia m1 : m.listacorrelativas) { // recorro la lista
                aux = m1.getNotap() >= 4; // si hay alguna desaprobada aux es falso
                }

            if (aux == true ){
            c.agregarMateriaDisponible(c, m);}
       }
}  
    
}

    

                