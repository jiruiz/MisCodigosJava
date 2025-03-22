/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

import java.util.Scanner;

/**
 *
 * @author juani
 */
public class BusquedaBinariaEnArreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = {1, 5, 8, 0, 6, -3, -7, 9, 14, 6, 1, 0, 4};
        int tam = arreglo.length;
        int datoABuscar;
        int posicionDelDatoABuscar = -1;
        System.out.print("Ingrese dato entero a buscar: ");
        datoABuscar = entrada.nextInt();
        /*INICIO DE BUSQUEDA BINARIA*/
        int inferior = 0;
        int superior = tam - 1;
        int medio = (inferior + superior) / 2;
        do {
            if (datoABuscar == arreglo[medio]) {
                posicionDelDatoABuscar = medio;
            } else if (datoABuscar < arreglo[medio]) {
                superior = medio - 1;
            } else {
                inferior = medio + 1;
            }
            medio = (inferior + superior) / 2;
        } while ((inferior <= superior) && (posicionDelDatoABuscar == -1));
        /*FIN DE BUSQUEDA BINARIA*/
        if (posicionDelDatoABuscar == -1) {
            System.out.println("No se encontró al " + datoABuscar);
        } else {
            System.out.print("El " + datoABuscar + " se encuentra en ");
            System.out.println("la posición " + posicionDelDatoABuscar);
        }
    }
}
