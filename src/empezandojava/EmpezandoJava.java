/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package empezandojava;
import java.util.Scanner;

/**
 *
 * @author juani
 */
public class EmpezandoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir en consola
        System.out.print("Hola Mundo");
        System.out.print("Otra línea");
        System.out.println("Tres\nlíneas\ndiferentes");

        // Declaración y operación de variables
        int a = 2;
        double b = 3.0;
        float c = (float) (20000 * a / b + 5);

        // Mostrar valores en diferentes formatos
        System.out.println("Valor en formato float: " + c);
        System.out.println("Valor en formato double: " + (double) c);
        System.out.println("Valor en formato byte: " + (byte) c);
        System.out.println("Valor en formato short: " + (short) c);
        System.out.println("Valor en formato int: " + (int) c);
        System.out.println("Valor en formato long: " + (long) c);

        // Usar Scanner para entrada de datos
        Scanner entrada = new Scanner(System.in);

        // Solicitar y leer valores del usuario
//          byte edad = entrada.nextByte();
//          short stockDelProducto = entrada.nextShort();
//          int dni = entrada.nextInt();
//          long masaDelSol = entrada.nextLong();
//          float superficie = entrada.nextFloat();
          double saldoEnCuenta = entrada.nextDouble();

        // Mostrar datos ingresados
//        System.out.println("\n--- Datos Ingresados ---");
//        System.out.println("Edad: " + edad);
//        System.out.println("Stock del Producto: " + stockDelProducto);
//        System.out.println("DNI: " + dni);
//        System.out.println("Masa del Sol: " + masaDelSol);
//        System.out.println("Superficie: " + superficie);
        System.out.println("Saldo en Cuenta: " + saldoEnCuenta);

        entrada.close(); // Cerrar el scanner
    }
        
                // Listado de caracteres de escape
         //     \n Nueva línea. Coloca el cursor de la pantalla al inicio de la 
         //    siguiente línea. 
         //    \t Tabulador horizontal. Desplaza el cursor de la pantalla hasta la 
         //    siguiente posición de tabulación. 
         //    \r
         //     Retorno de carro. Coloca el cursor de la pantalla al inicio de la 
         //    línea actual; no avanza a la siguiente línea.
         //     Cualquier carácter que se imprima después del retorno de carro
         //     sobrescribe los caracteres previamente impresos en esa línea.
         //     \b Retroceso. Borra el último carácter mostrado.
         //     \\ Barra diagonal inversa. Se usa para imprimir un carácter de 
         //    barra diagonal inversa.
         //     \” Doble comilla. Se usa para imprimir un carácter de doble 
         //    comilla.
         //     \’ Comilla simple. Se usa para imprimir un carácter de comilla simple

         //Operadores:
         //    = Asignación x = 3  --> 3
         //    += Suma y asignación x += 3 -->12
         //    -= Resta y asignación x -= 3 -->6 
         //    *= Multiplicacion y asignación x *= 3 -->27
         //    /= División y asignación  x /= 3 --> 3
         //    %= Módulo y asignación x %= 3 --> 0

             //Jerarquía
         // Operador/es    Asociatividad
         // ++ -- ! Derecha a izquierda
         // * / % Izquierda a derecha
         // + Izquierda a derecha
         // < <= > >= Izquierda a derecha
         // == != Izquierda a derech00a
         // && Izquierda a derecha 
         // || Izquierda a derecha
         // = += -= *= /= %= Derecha a izquierda
         
}
    

