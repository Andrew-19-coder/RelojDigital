/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiempo;

/**
 *
 * @author Jeshuan
 */
public class Reloj extends Tiempo implements Configurable{

    @Override
    public void configurar(int h, int m, int s) {
      this.horas=h;
      this.minutos=m;
      this.segundos=s;
      
      
    }
    
}
