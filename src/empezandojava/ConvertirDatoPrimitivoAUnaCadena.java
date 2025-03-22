/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class ConvertirDatoPrimitivoAUnaCadena {

    public static void main(String[] args) {
        String enteroACadena = Integer.toString(50); // Convierte el 50 en "50"
        String floatACadena = Float.toString(2.5f); // Convierte el 2.5 en "2.5"
        String doubleACadena = Double.toString(1.44); // Convierte el 1.44 en "1.44"
        String charACadena = Character.toString('x'); // Convierte la 'x' en "x"
        String booleanACadena = Boolean.toString(true); // Convierte true en "true"

        String otraForma = 2.56 + ""; // Convierte el 2.56 en "2.56"
    }
}
