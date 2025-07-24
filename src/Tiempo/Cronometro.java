/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiempo;

/**
 *
 * @author itsth
 */
public class Cronometro extends Tiempo implements Controlable {

    @Override
    public void inciar() {
        this.activo = true;
    }

    @Override
    public void detener() {
        this.activo = false;
    }
}
