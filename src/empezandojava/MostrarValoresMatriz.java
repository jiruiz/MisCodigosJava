/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class MostrarValoresMatriz {

    public static void main(String[] args) {
        int[][] numeros = {{7, 4, 9, -3}, {8, 6, -4, 0}, {-1, -3, 9, 6}};
        for (int f = 0; f < numeros.length; f++) {
            for (int c = 0; c < numeros[0].length; c++) {
                System.out.print(numeros[f][c] + "\t");
            }
            // Espacio en blanco para la siguiente fila
            System.out.println("");
        }
    }
}
