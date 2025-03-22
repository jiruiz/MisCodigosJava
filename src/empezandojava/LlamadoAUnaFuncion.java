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
public class LlamadoAUnaFuncion {

    public static void main(String[] args) {
        limpiarPantalla();
        System.out.println("Obtuvimos el número " + obtenerNumeroNatural());
    }

    static int obtenerNumeroNatural() {
        int numero;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Ingrese un número natural: ");
            numero = entrada.nextInt();
        } while (numero <= 0);
        return numero;
    }

    static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
}
