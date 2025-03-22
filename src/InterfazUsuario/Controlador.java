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
public class Controlador {

    private Vista v;

    public Controlador(Vista v) {
        this.v = v;
    }

    public void iniciar() {

        this.v.iniciarVista();
    }
}
