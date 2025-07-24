/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiempo;

/**
 *
 * @author itsth
 */
public class Temporizador extends Tiempo implements Configurable, Controlable{

    @Override
    public void configurar(int h, int m, int s) {
        this.horas = h;
        this.minutos = m;
        this.segundos = s;
    }

    @Override
    public void inciar() {
       this.activo = true;
    }

    @Override
    public void detener() {
        this.activo = false;
    }
    
    @Override
    public void correr(){
        if(this.activo){
            segundos--;
        }
        if(segundos==-1){
            segundos=59;
            minutos++;
            if(minutos==-1){
            minutos=59;
            horas--;
            if(horas == -1){
                horas = 0;
                minutos = 0;
                segundos = 0;
                this.activo = false;
            }
          }
        }
     }
}
