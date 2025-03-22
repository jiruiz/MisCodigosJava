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
public class SolucionAlProblemasAlUsarNextLine {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresar dato numérico: ");
        int datoNumerico = entrada.nextInt();
        entrada.nextLine(); // CAPTURAMOS ESE SALTO DE LINEA Y LO PERDEMOS A PROPOSITO
        System.out.print("Ingresar cadena 1: ");
        String cadena1 = entrada.nextLine();
        System.out.print("Ingresar cadena 2: ");
        String cadena2 = entrada.nextLine();
        System.out.println("¿Cómo quedaron las variables?");
        System.out.println("Variable datoNumerico: " + datoNumerico);
        System.out.println("Variable cadena1: " + cadena1);
        System.out.println("Variable cadena2: " + cadena2);
    }
}
