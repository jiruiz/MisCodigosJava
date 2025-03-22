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
public class BusquedaSecuencialEnArreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = {1, 5, 8, 0, 6, -3, -7, 9, 14, 6, 1, 0, 4};
        int tam = arreglo.length;
        int datoABuscar;
        int posicionDelDatoABuscar = -1;
        System.out.print("Ingrese dato entero a buscar: ");
        datoABuscar = entrada.nextInt();
        /*INICIO DE BUSQUEDA SECUENCIAL*/
        for (int i = 0; i < tam; i++) {
            if (arreglo[i] == datoABuscar) {
                posicionDelDatoABuscar = i;
                break;
            }
        }
        /*FIN DE BUSQUEDA SECUENCIAL*/
        if (posicionDelDatoABuscar == -1) {
            System.out.println("No se encontró al " + datoABuscar);
        } else {
            System.out.print("El " + datoABuscar + " se encuentra en ");
            System.out.println("la posición " + posicionDelDatoABuscar);
        }
    }
}
