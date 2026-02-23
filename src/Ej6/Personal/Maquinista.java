/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6.Personal;

/**
 *
 * @author usuario
 */
public class Maquinista {
    //ATRIBUTOS
    private String DNI;
    private double sueldo;
    private String nombre;
    private int edad;
    /**
     * Voy a volver a utilizar enum, para que veaís como funciona, pero también
     * se podría hacer con un String, int o double. No lo especifica en el enunciado.
     */
    enum Rango {ALTO, MEDIO, BAJO};
    private Rango rango; //Alto - Medio - Bajo
    
    //CONSTRUCTOR
    public Maquinista(String DNI, double sueldo, String nombre, String rango, int edad) {
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.rango = Rango.valueOf(rango.toUpperCase());
        this.edad = edad;
    }

    //GETTERS 
    public String getDNI() {
        return DNI;
    }

    public int getEdad(){
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Rango getRango() {
        return rango;
    }
    
    //SETTERS
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setRango(String rango) {
        this.rango = Rango.valueOf(rango.toUpperCase());
    }
    
    /**
     * aumentarSueldo(double cantidad)
     * @param cantidad  Recibe la cantidad y se aumenta al sueldo
     */
    public void aumentarSueldo(double cantidad){
        this.sueldo += cantidad;
    }
    
    /**
     * En mi caso, en los atributos he puesto tres tipos de rangos, 
     * BAJO - MEDIO - ALTO. Lo que voy ha hacer en este caso es que aumente al 
     * siguiente. Por ello no le voy a introducir ningún parametro de entrada.
     * 
     */
    public void ascenderRango(){
        if (this.rango == Rango.BAJO){
            this.rango = Rango.MEDIO;
        } else if (this.rango == Rango.MEDIO){
            this.rango = Rango.ALTO;
        } else {
            System.err.println("Este maquinista ya tiene el rango máximo.");
        }
    }

    /**
     * Comprueba la edad del maquinista para saber si se debe jubilar.
     * @param edad Recibe la edad del maquinista
     */
    public void jubilacion(int edad){
        if(edad > 60){
            System.out.println("El maquinista ha superado el máximo de edad, no está permitido a conducir trenes.");
        }
        else{
            System.out.println("El maquinista está en plenas facultades para poder conducir trenes.");
        }
    }
    
    /**
     * Método que devuelve una cadena de texto con la información del
     * maquinista.
     * @return 
     */
    @Override
public String toString() {
    return "Maquinista{" + 
        "DNI=" + DNI + 
        ", sueldo=" + sueldo + 
        ", nombre=" + nombre + 
        ", rango=" + rango + 
        ", edad=" + edad + 
        '}';
}
    
    
    
}
