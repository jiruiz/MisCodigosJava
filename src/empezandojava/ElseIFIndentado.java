/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class ElseIFIndentado {

    public static void main(String[] args) {
        int horaDelDia = 16;
        if (horaDelDia < 0 || horaDelDia > 23) {
            System.out.println("Hora inválida.");
        } else if (horaDelDia < 12) {
            System.out.println("Es la mañana.");
        } else if (horaDelDia == 12) {
            System.out.println("Es el mediodía.");
        } else if (horaDelDia < 20) {
            System.out.println("Es la tarde.");
        } else {
            System.out.println("Es la noche.");
        }
    }
}
