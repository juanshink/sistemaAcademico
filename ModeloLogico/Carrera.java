package ModeloLogico;

import java.util.ArrayList;


public class Carrera {
    
    public String nombre;
    private int codigo,duracion,opcionales;
    public PlandeEstudio plandeestudio;
    public ArrayList<Materia> listamaterias;
    
    
    public Carrera() {
    }

    public Carrera(String nombre, int codigo,int duracion,int opcionales, PlandeEstudio plandeestudio) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.codigo = codigo;
        this.opcionales = opcionales;
        this.plandeestudio = plandeestudio;
        listamaterias = new ArrayList<>();
    }
   
     public static void agregarMateria(Carrera c, Materia m){
    c.listamaterias.add(m);   
    }
         
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getOpcionales() {
        return opcionales;
    }

    public void setOpcionales(int opcionales) {
        this.opcionales = opcionales;
    }
    
    public PlandeEstudio getPlandeestudio() {
        return plandeestudio;
    }

    public void setPlandeestudio(PlandeEstudio plandeestudio) {
        this.plandeestudio = plandeestudio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Materia> getListamaterias() {
        return listamaterias;
    }

    public void setListamaterias(ArrayList<Materia> listamaterias) {
        this.listamaterias = listamaterias;
    }
    
    

}
