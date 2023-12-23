package ModeloLogico;

public abstract class PlandeEstudio {
    
    String nombre;
    
    
    public PlandeEstudio(String nombre) {
        this.nombre = nombre;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void puedeCursar(Cursada c, Materia m);
      
    
}
