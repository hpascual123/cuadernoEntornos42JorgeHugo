/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6.Maquinaria;

import Ej6.Personal.Maquinista;
import Ej6.Personal.Mecanico;
import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Locomotora {
    private String matricula; //Supongo 1234 ABC
    private double potencia;
    //Pasa este caso voy a utilizar un int para el año, más sencillo.
    private int añoFabricacion; 
    //Una locomotora tiene asociado un mecanico, de tipo Mecánico (con todos sus datos)
    private Mecanico mecanicoAsignado;
    //Una locomotora tiene una velocidad a la que va a moverse
    private int velocidad;

    //CONSTRUCTOR
    public Locomotora(String matricula, double potencia, int añoFabricacion, Mecanico mecanicoAsignado, int velocidad) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.añoFabricacion = añoFabricacion;
        this.mecanicoAsignado = mecanicoAsignado;
        this.velocidad = velocidad
    }
    
    //GETTER
    public String getMatricula() {
        return matricula;
    }

    public double getPotencia() {
        return potencia;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public Mecanico getMecanicoAsignado() {
        return mecanicoAsignado;
    }
    
    public int getVelocidad(){
        return velocidad;
    }

    //SETTER --> Lo único que podría cambiar es el maquinista.
    /**
     * setmecancicoaAsignado, es el mismo método que me piden asignarMecanico
     * @param mecanicoAsignado 
     */
    public void asignarMecanico(Mecanico mecanicoAsignado) {
        this.mecanicoAsignado = mecanicoAsignado;
    }
    
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    /**
     * Método que devuelve los años desde la fabricación.
     * @return 
     */
    public int antiguedad(){
        //Hago uso de la fecha actual
        //Resto el año actual menos el año que se creo.
        int antiguedad = LocalDate.now().getYear() - this.antiguedad();
        return antiguedad;
    }

    
    @Override
    public String toString() {
        return "Locomotoras{" + "matricula=" + matricula + ", potencia=" + potencia + ", a\u00f1oFabricacion=" + añoFabricacion + ", mecanicoAsignado=" + mecanicoAsignado + '}';
    }
    
    
    
}
