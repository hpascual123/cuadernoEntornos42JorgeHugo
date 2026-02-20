/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6.Personal;

/**
 *
 * @author usuario
 */
public class Mecanico {
    private String nombre;
    private int telefono;
    //Declaro los tres tipos de especialidades posibles.
    private enum Especialidad {HIDRAULICA, ELECTRICIDAD, MOTOR}
    private Especialidad atributoEspecialidad; //Declaro el atributo especialidad

    /**
     * Constructor con todos los datos.
     * @param nombre
     * @param telefono
     * @param atributoEspecialidad 
     */
    public Mecanico(String nombre, int telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.atributoEspecialidad = Especialidad.valueOf(especialidad.toUpperCase());;
    }
    
    
    
    //GETTERS --> Puedo consultar todos
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public Especialidad getAtributoEspecialidad() {
        return atributoEspecialidad;
    }
    
    //SETTER --> Solo genero Telefono y Especialidad, los dos únicos que podrían
    //ser modficados (La especialidad si no se pone, porque es raro que cambie 
    //también sería correcto.)
    
    /**
     * Este método era el de setTeelefono, pero lo he modificado por el de
     * cambiarTelefono, debido a que es lo mismo, solo cambia el nombre del método.
     * @param telefono 
     */
    public void cambiarTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    /**
     * Me permite modificar la especialidad.
     * @param atributoEspecialidad 
     */
    public void setAtributoEspecialidad(Especialidad atributoEspecialidad) {
        this.atributoEspecialidad = atributoEspecialidad;
    }
    
    /**
     * Método que devuelve una cadena con los datos del mecánico.
     * @return 
     */
    @Override
    public String toString() {
        return "Mecanico{" + "nombre=" + nombre + ", telefono=" + telefono + ", atributoEspecialidad=" + atributoEspecialidad + '}';
    }
    
    
    
}
