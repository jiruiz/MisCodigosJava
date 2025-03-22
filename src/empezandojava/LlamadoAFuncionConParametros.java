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
public class LlamadoAFuncionConParametros {

    public static void main(String[] args) {
        int edadDelUsuario = obtenerNumeroNatural();
        if (esMayorDeEdad(edadDelUsuario)) {
            System.out.print("Dentro de 20 años, usted tendrá ");
            System.out.println(calcularSuma(edadDelUsuario, 20) + " años de edad.");
        }
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

    static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    static int calcularSuma(int a, int b) {
        return a + b;
    }
}
