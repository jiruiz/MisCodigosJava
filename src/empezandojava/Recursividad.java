/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empezandojava;

/**
 *
 * @author juani
 */
public class Recursividad {

    public static void main(String[] args) {
        cuentaRegresiva(3);
    }

    static void cuentaRegresiva(int n) {
        if (n == 0) {
            System.out.println(n);
        } else {
            System.out.println(n + " ");
            cuentaRegresiva(n - 1);
        }
    }
}
