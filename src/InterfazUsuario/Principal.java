/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazUsuario;

import InterfazUsuario.Vista;

/**
 *
 * @author juani
 */
public class Principal {

    public static void main(String[] args) {
        Vista vis = new Vista();
        Controlador c = new Controlador(vis);
        c.iniciar();
    }
}
