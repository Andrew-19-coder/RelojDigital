/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tiempo;

/**
 *
 * @author itsth
 */
public abstract class Tiempo {
    private int horas;
    private int segundos;
    private int minutos;
   
    
    public Tiempo() {
        this.horas = 0;
        this.segundos = 0;
        this.minutos = 0;
    }
    public void correr(){
        segundos ++;
        if(segundos==60){
            segundos=0;
            minutos++;
            if(minutos==60){
            minutos=0;
            horas++;
            if(horas==24){
            horas=0;
            }
          }
        }
     }
    public int getHoras() {
        return horas;
    }

    public int getSegundos() {
        return segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public String toString(){
        String h, m, s;
        h=String.valueOf(horas);
        if(horas<10){
        h="0".concat(h);  
    }
        m=String.valueOf(minutos);
         if(minutos<10){
         m="0".concat(m);
    }
         s=String.valueOf(segundos);
         if(segundos<10){
        s="0".concat(s);
    }
         return h+":"+m+":"+s;
    }
    
}