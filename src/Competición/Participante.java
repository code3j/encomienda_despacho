/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Competición;

/**
 *
 * @author NB-3170
 */
public class Participante {
    public String nombre;
    public int tiempos [];
    public int tiempoTotal;
    public double veloP;
    
    public Participante (String n, int t[]){
        nombre= n;
        tiempos=t;
    }
    public String getNombre(){
        return nombre;
    }
    public int getTiempo(){
        return tiempoTotal;
    }
    public void actualizar (double km){
      tiempoTotal=0;
    
     
        for (int i = 0; i < tiempos.length; i++) {
            tiempoTotal+=tiempos[i];
        }
        veloP=km/((double)(tiempoTotal)/3600);
    }
    public void mostrarA(){
        
        System.out.printf("%-12s%5d%25.2f\n",nombre,tiempoTotal,veloP);
    }
    
}
