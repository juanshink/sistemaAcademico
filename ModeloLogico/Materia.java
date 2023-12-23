package ModeloLogico;

import java.util.ArrayList;


public class Materia {
    
    private String nombre,tipo;
    public String promocion;
    private int cuatrimestre,año, notap, notaf;
    public ArrayList<Materia> listacorrelativas = null;

    public Materia() {
    }

    public Materia(String nombre, int cuatrimestre, String tipo, int año, String promocion) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.tipo = tipo;
        this.año = año;
        this.promocion = promocion;
        listacorrelativas = new ArrayList();
        notap = 0;
        notaf = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    public int getNotap() {
        return notap;
    }

    public void setNotap(int notap) {
        this.notap = notap;
            
    }

    public int getNotaf() {
        return notaf;
    }

    public void setNotaf(int notaf) {
        this.notaf = notaf;
    }
    
    public void añadirCorrelativa(Materia c){
    
        listacorrelativas.add(c);
    
    }
}
