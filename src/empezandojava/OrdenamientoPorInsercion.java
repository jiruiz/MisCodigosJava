/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class OrdenamientoPorInsercion {
//Insertion Sort
    public static void main(String[] args) {
        int[] arreglo = {1, 5, 8, 0, 6, -3, -7, 9, 14, 6, 1, 0, 4};
        int tam = arreglo.length;
        System.out.print("El arreglo original: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        /*INICIO DEL ALGORITMO DE ORDENAMIENTO POR INSERCION*/
        for (int i = 1; i < tam; i++) {
            int temp = arreglo[i];
            int izq = 0;
            int der = i - 1;
            while (izq <= der) {
                int medio = (izq + der) / 2;
                if (temp < arreglo[medio]) {
                    der = medio - 1;
                } else {
                    izq = medio + 1;
                }
            }
            for (int j = i - 1; j >= izq; j--) {
                arreglo[j + 1] = arreglo[j];
            }
            arreglo[izq] = temp;
        }
        /*FIN DEL ALGORITMO DE ORDENAMIENTO POR INSERCION*/
        System.out.print("El arreglo ordenado: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
}
