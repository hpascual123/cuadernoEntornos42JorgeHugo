/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6.Maquinaria;

import Ej6.Personal.Maquinista;

/**
 *
 * @author usuario
 */
public class Tren {
    
    //Un tren necesita una locomotora, objeto locomotora con todos sus datos.
    private Locomotora locomotoraAsignada;
    //Un tren necesita 5 vagones, utilizo un array de 5 vagones.
    //También se podría hacer con arrayList
    private Vagon[] arrayVagones = new Vagon[5];
    //El numero de vagones conectados
    private int numeroVagonesConectados;
    //Un tren necesita un Maquinista, con todos sus datos
    private Maquinista maquinistaAsignado;

    /**
     * Al crearlo le indico la locomotora, 
     * el numeroVagones por defecto 0, sin vagones,
     * y le asigno un maquinista.
     * @param locomotoraAsignada
     * @param numeroVagonesConectados
     * @param maquinistaAsignado 
     */
    public Tren(Locomotora locomotoraAsignada, Maquinista maquinistaAsignado) {
        this.locomotoraAsignada = locomotoraAsignada;
        this.numeroVagonesConectados = 0;
        this.maquinistaAsignado = maquinistaAsignado;
    }

    //Getter --> Puedo consultar cualquier dato
    public Locomotora getLocomotoraAsignada() {
        return locomotoraAsignada;
    }

    public Vagon[] getArrayVagones() {
        return arrayVagones;
    }

    public int getNumeroVagonesConectados() {
        return numeroVagonesConectados;
    }

    public Maquinista getMaquinistaAsignado() {
        return maquinistaAsignado;
    }
    
    //Set --> Puede cambiar el numeroVagones y el maquinista
    public void setNumeroVagonesConectados(int numeroVagonesConectados) {
        this.numeroVagonesConectados = numeroVagonesConectados;
    }
    
    /**
     * Cambio el método setMaquinistaAsignado por asignarMaquinista(Maquinista m)
     * Es lo mismo
     * @param maquinistaAsignado 
     */
    public void asignarMaquinista(Maquinista m) {
        this.maquinistaAsignado = m;
    }
    
    /**
     * Método para añadir otro vagón
     * @param v 
     */
    public void engancharVagon(Vagon v){
        arrayVagones[numeroVagonesConectados] = v;
        numeroVagonesConectados++;
    }
    
    /**
     * Método que muestra la locomotora, maquinista y vagones.
     */
    public void mostrarTren(){
        System.out.println("MAQUINISTA:");
        System.out.println(maquinistaAsignado.toString());
        System.out.println("LOCOMOTORA:");
        System.out.println(locomotoraAsignada.toString());
        System.out.println("VAGONES:");
        for (int i = 0; i < numeroVagonesConectados; i++) {
            System.out.println(arrayVagones[i].toString());
        }   
    }
    
    /**
     * Método qeu suma y devuelve la carga de todos los Vagones
     * @return 
     */
    public double cargaTotal(){
        double cargaTotalCalculada = 0;
        //Recorro el array de los vagones
        for (int i = 0; i < numeroVagonesConectados; i++) {
            //Obtengo la carga y la sumo a lacargaTotal
            cargaTotalCalculada = cargaTotalCalculada + arrayVagones[i].getCargaActual();
        }
        //Devuelvo la cargaTotalCalculada, la suma de la carga actual de 
        //todos los vagones
        return cargaTotalCalculada;
    }
    /** 
     * Método que regula la velocidad del tren en caso de que supere el límite
    */
    public String limiteVelocidad(Locomotora l){
        String mensaje = " ";
        //Compruebo la velocidad del tren
        if (l.getVelocidad() >= 280){
            //Le asigno una velocidad inferior
            mensaje += "El tren ha superado el límite de velocidad, regulando velocidad";
            l.setVelocidad(250);
            return mensaje;
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return "Tren{" + "locomotoraAsignada=" + locomotoraAsignada + ", arrayVagones=" + arrayVagones + ", numeroVagonesConectados=" + numeroVagonesConectados + ", maquinistaAsignado=" + maquinistaAsignado + '}';
    }
    
    
    
    
}
