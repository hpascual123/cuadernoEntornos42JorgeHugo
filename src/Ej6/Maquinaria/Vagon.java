/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6.Maquinaria;

/**
 *
 * @author usuario
 */
public class Vagon {

    //Atributos
    private int id;
    private double cargaMaxima;
    private double cargaActual;
    private String tipo;

    /**
     * Constructor, cuando se crea un vagon solo introduciré como parametro la
     * cargaMaxima. - El tipo lo desconozco, unas veces llevará una mercancía y
     * otras veces otra. - La carga Actual, nada más crearlo será 0. - Y el id,
     * lo voy a calcular de manera aleatoria.
     *
     * @param cargaMaxima
     */
    public Vagon(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
        this.tipo = ""; //Sin mercancia
        this.id = (int) (Math.random() * 99999); //Aleatorio
        this.cargaActual = 0; //Nada más crarlo, sin carga.
    }

    //Getters --> Todos
    public int getId() {
        return id;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public String getTipo() {
        return tipo;
    }

    //Setter --> Solamente el tipo y la carga actual
    /**
     * Este método va a pasar de setCargaActual al método cargar que pone en el
     * enunciado.
     *
     * @param cargaActual
     */
    public void cargar(double cargaActual) {
        if (cargaActual < this.cargaMaxima) {
            this.cargaActual = cargaActual;
        } else {
            System.err.println("Advertencia! Estas superando la carga máxima.");
        }

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método que vacia el vagón, voy a hacer uso del método cargar.
     */
    public void descargar() {
        cargar(0); //Método cargar y le paso 0.
        //También podría hace: this.cargaActual = 0;
    }

    /**
     * Método para comprobar si el vagón esta lleno.
     *
     * @return
     */
    public boolean estaLleno() {
        if (this.cargaActual >= this.cargaMaxima) {
            System.out.println("ADVERTENCIA! El vagón esta lleno.");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vagon{" + "id=" + id + ", cargaMaxima=" + cargaMaxima + ", cargaActual=" + cargaActual + ", tipo=" + tipo + '}';
    }

    //Comentario para comprobar si funciona el pull y el push

    // Comentario de Hugo para ver si podemos hacer commit

    // Comentario de Hugo para ver si Jorge puede hacer pull

    // Comentario de Jorge para ver si Hugo puede hacer pull. prueba error PRUEBA ERROR


}
