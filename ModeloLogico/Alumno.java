package ModeloLogico;

import java.util.ArrayList;


public class Alumno {
    
    //private int Legajo = 0;
    public String nombre;
    private String apellido;
    private long dni;
    private int edad;
    private String direccion;
    private long contacto;
    public ArrayList<Cursada> cursada = new ArrayList<>();

    public Alumno() {
    } 
    
    public Alumno(String nombre, String apellido, long dni, int edad, String direccion, long contacto) {
 
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
        this.contacto = contacto;
        cursada = new ArrayList<>();
    }
    
    
    public static void agregarCursada(Alumno a, Cursada c){
        
    a.cursada.add(c);
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getContacto() {
        return contacto;
    }

    public void setContacto(long contacto) {
        this.contacto = contacto;
    }

    public ArrayList<Cursada> getCursada() {
        return cursada;
    }

    public void setCursada(ArrayList<Cursada> cursada) {
        this.cursada = cursada;
    }
    
    @Override
    public String toString() {
        return "Alumno{" +  ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", direccion=" + direccion + ", contacto=" + contacto + '}';
    }

   
    
    
   
}
