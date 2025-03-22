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
public class FuncionesDevuelvenValor {
     public static void main(String[] args)
    {
        obtenerNumeroNatural();
    }
      static int obtenerNumeroNatural()
    {
        int numero;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Ingrese un número natural: ");
            numero = entrada.nextInt();
        } while (numero <= 0);
        return numero;
    }
}
