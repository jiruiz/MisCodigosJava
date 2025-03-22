/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class OrdenamientoPorSeleccion {
//Selection Sort
    public static void main(String[] args) {
        int[] arreglo = {1, 5, 8, 0, 6, -3, -7, 9, 14, 6, 1, 0, 4};
        int tam = arreglo.length;
        System.out.print("El arreglo original: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        /*INICIO DEL ALGORITMO DE ORDENAMIENTO POR SELECCION*/
        for (int i = 0; i < tam; i++) {
            int imin = i;
            for (int j = i + 1; j < tam; j++) {
                if (arreglo[j] < arreglo[imin]) {
                    imin = j;
                }
            }
            int aux = arreglo[i];
            arreglo[i] = arreglo[imin];
            arreglo[imin] = aux;
        }
        /*FIN DEL ALGORITMO DE ORDENAMIENTO POR SELECCION*/
        System.out.print("El arreglo ordenado: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
}
