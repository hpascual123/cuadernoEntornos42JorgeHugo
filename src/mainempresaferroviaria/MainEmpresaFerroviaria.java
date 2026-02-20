/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainempresaferroviaria;

import Ej6.Maquinaria.Locomotora;
import Ej6.Maquinaria.Tren;
import Ej6.Maquinaria.Vagon;
import Ej6.Personal.JefeEstacion;
import Ej6.Personal.Maquinista;
import Ej6.Personal.Mecanico;
import com.sun.source.tree.Tree;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author usuario
 */
public class MainEmpresaFerroviaria {

    /**
     * DESTACAR QUE ESTE EJERCICIO SE PUEDE REALIZAR DE MUCHAS MANERAS
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // 1 maquinista
        Maquinista alfonsoMaquinista = new Maquinista("77354678M", 1400, "Alfonso", "MEDIO");
        // 1 mecánico
        Mecanico mariaMecanica = new Mecanico("Maria", 674537865, "Motor");
        // 1 jefe de estación
        JefeEstacion juanJefe = new JefeEstacion("Juan", LocalDate.of(2020, Month.MARCH, 12), "12345678A");

        //1 locomotora y asignarle el mecánico, asignado en el constructor
        Locomotora locomotoraNueva = new Locomotora("1234 ABC", 123, 2019, mariaMecanica);
        locomotoraNueva.asignarMecanico(mariaMecanica); //Ya asignado arriba
        //3 vagones y cargarlos con mercancía
        Vagon vagon1 = new Vagon(2000); //Asigno la carga maxima
        Vagon vagon2 = new Vagon(2000);
        Vagon vagon3 = new Vagon(2000);
        vagon1.cargar(1300); //Les añado carga
        vagon2.cargar(800);
        vagon3.cargar(1560);
        // Crear un tren:
        Tren miTren = new Tren(locomotoraNueva, alfonsoMaquinista);
        // Asignar la locomotora, ya asignado en el constructor
        // Asignar el maquinista
        //Enganchar los vagones
        miTren.engancharVagon(vagon1);
        miTren.engancharVagon(vagon2);
        miTren.engancharVagon(vagon3);

        //Información del personal
        System.out.println(alfonsoMaquinista.toString());
        System.out.println(mariaMecanica.toString());
        System.out.println(juanJefe.toString());
        //Información vagones
        System.out.println(vagon1.toString());
        System.out.println(vagon2.toString());
        System.out.println(vagon3.toString());
        //Información de la locomotora 
        System.out.println(locomotoraNueva.toString());
        //Información del tren 
        System.out.println(miTren.toString());
        //Carga total transportada
        System.out.println(miTren.cargaTotal());
        
        /**
         * DESTACAR QUE ESTE EJERCICIO SE PUEDE REALIZAR DE MUCHAS MANERAS
         */

    }

}
