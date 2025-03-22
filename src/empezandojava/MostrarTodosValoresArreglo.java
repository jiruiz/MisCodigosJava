/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class MostrarTodosValoresArreglo {

    public static void main(String[] args) {
        int[] numeros = {7, 4, 9, -3, 0};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El " + (i + 1) + "º valor es " + numeros[i]);
        }
    }
}
