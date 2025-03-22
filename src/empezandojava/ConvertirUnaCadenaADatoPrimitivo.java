/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class ConvertirUnaCadenaADatoPrimitivo {

    public static void main(String[] args) {
        int cadenaAEntero = Integer.parseInt("5"); // Convierte el "5" en 5
        float cadenaAFloat = Float.parseFloat("2.5"); // Convierte el "2.5" en 2.5f
        double cadenaADouble = Double.parseDouble("1.44"); // Convierte el "1.44" en 1.44
        char cadenaAChar = "x".charAt(0); // Convierte la "x" en 'x'
        boolean cadenaABoolean = Boolean.parseBoolean("true"); // Convierte "true" en true
    }
}
