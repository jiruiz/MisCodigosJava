/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class OrdenamientoShell {

    public static void main(String[] args) {
        int[] arreglo = {1, 5, 8, 0, 6, -3, -7, 9, 14, 6, 1, 0, 4};
        int tam = arreglo.length;
        System.out.print("El arreglo original: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        /*INICIO DEL ALGORITMO DE ORDENAMIENTO POR SHELL*/
        int h = tam / 2;
        while (h > 0) {
            for (int i = h - 1; i < tam; i++) {
                int b = arreglo[i];
                int j = i;
                for (j = i; (j >= h) && (arreglo[j - h] > b); j -= h) {
                    arreglo[j] = arreglo[j - h];
                }
                arreglo[j] = b;
            }
            h = h / 2;
        }
        /*FIN DEL ALGORITMO DE ORDENAMIENTO POR SHELL*/
        System.out.print("El arreglo ordenado: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }

}
