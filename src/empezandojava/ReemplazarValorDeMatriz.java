/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class ReemplazarValorDeMatriz {

    public static void main(String[] args) {
        int[][] numeros = {{7, 4, 9, -3}, {8, 6, -4, 0}, {-1, -3, 9, 6}};
        System.out.println("El valor en la 2da fila y 2da columna es " + numeros[1][1]);
        numeros[1][1] = 15;
        System.out.println("El nuevo valor en la 2da fila y 2da columna es " + numeros[1][1]);
    }
}
