/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class Sobrecarga {

    public static void main(String[] args) {
        int[] arreglo = {4, 8, 6, 2, 5};
        System.out.print("La suma de 3 y 5 como enteros: ");
        System.out.println(calcularSuma(3, 5));
        System.out.print("La suma de los valores del arreglo: ");
        System.out.println(calcularSuma(arreglo));
    }

    static int calcularSuma(int a, int b) {
        return a + b;
    }

    static int calcularSuma(int[] numeros) {
        int sumatoria = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumatoria += numeros[i];
        }
        return sumatoria;
    }
}
