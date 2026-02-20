/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6.Personal;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class JefeEstacion {

    //ATRIBUTOS
    private String nombre;
    private LocalDate fechaNombramiento; //Voy a utilizar una variable de tipo fecha
    private String dni;

    /**
     * Constructor con todos los datos.
     * @param nombre
     * @param fechaNombramiento
     * @param dni 
     */
    public JefeEstacion(String nombre, LocalDate fechaNombramiento, String dni) {
        this.nombre = nombre;
        this.fechaNombramiento = fechaNombramiento;
        this.dni = dni;
    }

    
    //GETTER --> Es probable que consulte cada uno de los datos
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNombramiento() {
        return fechaNombramiento;
    }

    public String getDni() {
        return dni;
    }
    
    //Setter --> En principio nada va a ser modificable.

    /**
     * Calcula los años desde el nombramiento. 
     * @return, devuelvo los años para mostrarlos desde el main, pero como no me
     * pide que devuelva nada, perfectamente los podría mostrar por la consola, con
     * un System.out.println();
     */
    public int mostrarAntiguedad() {
        //Solo me pide los años
        int anos = LocalDate.now().getYear() - this.fechaNombramiento.getYear();
        //Si quisiera también podría calcular los meses y los años. 
        //Y devolver una cadena con los dias y meses exactos.
        int meses = LocalDate.now().getMonthValue() - this.fechaNombramiento.getMonthValue();
        int dias = LocalDate.now().getDayOfYear() - this.fechaNombramiento.getDayOfYear();
        return anos;
    }

    /**
     * Muestro los datos
     * @return 
     */
    @Override
    public String toString() {
        return "JefeEstacion{" + "nombre=" + nombre + ", fechaNombramiento=" + fechaNombramiento + ", dni=" + dni + '}';
    }
    
    

}
