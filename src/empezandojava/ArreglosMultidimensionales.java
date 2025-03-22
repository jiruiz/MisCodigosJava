/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class ArreglosMultidimensionales {

    public static void main(String[] args) {
        //int[][] numeros; // Sin inicializar

        //int[][] numeros = new int[3][4]; //Inicializada por defecto
        int[][] numeros = {{7, 4, 9, -3}, {8, 6, -4, 0}, {-1, -3, 9, 6}};
        int x = numeros[0][3];
        System.out.println("El valor de la 1ra fila y 4ta columna es " + x);
        System.out.println("El valor de la 2da fila y 2da columna es " + numeros[1][1]);
    }
}
