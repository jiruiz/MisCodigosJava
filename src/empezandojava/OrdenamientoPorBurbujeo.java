/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class OrdenamientoPorBurbujeo {
//Bubble Sort

    public static void main(String[] args) {
        int[] arreglo = {1, 5, 8, 0, 6, -3, -7, 9, 14, 6, 1, 0, 4};
        int tam = arreglo.length;
        System.out.print("El arreglo original: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        /*INICIO DEL ALGORITMO DE ORDENAMIENTO POR BURBUJEO*/
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        /*FIN DEL ALGORITMO DE ORDENAMIENTO POR BURBUJEO*/
        System.out.print("El arreglo ordenado: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
}
