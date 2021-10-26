/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Competición;
import java.io.*;
import java.util.*;
/**
 *
 * @author NB-3170
 */
public class Apoyo {
    public static int Cantd_Archivo()throws IOException {
        Scanner leo= new Scanner (new File("Tiempos.txt"));
        int cont=-1;
        while(leo.hasNextLine()){
            leo.nextLine();
            cont++;
        }leo.close();
        
        return cont;
    }
    public  static void leerArchivo(Participante p[])throws IOException{
        Scanner leo = new Scanner (new File ("Tiempos.txt"));
        String nombre;
   
        double km=0;
        int chekpoint=0;
        int pos=0;
        
        
        chekpoint= leo.nextInt();
        km= leo.nextDouble();
        while(leo.hasNext()){
            nombre=leo.next();
            int tiempos[]=  new int[chekpoint];
            for (int i = 0; i < tiempos.length; i++) {
                tiempos[i]=leo.nextInt(); 
            }
            p[pos]=new Participante(nombre,tiempos);
            pos++;
            
        }leo.close();
        for (int i = 0; i < p.length; i++) {
            Apoyo.Actualizar(km, p[i]);
        }
        
    }
     public static void Actualizar(double km,Participante p){
        p.actualizar(km);
    }
     public static void mostrarB(Participante p[]){
         System.out.println("Competidor   Tiempo(seg)    Velocidad Promedio (Km/h)  ");
         String nom="";
         int menorTiempo=0;
         int band=0;
         for (int i = 0; i < p.length; i++) {
             p[i].mostrarA();
         }
         for (int i = 0; i < p.length; i++) {
             if(band==0){
                 nom=p[i].getNombre();
                 menorTiempo=p[i].getTiempo();
                 band++;
             }
             else if(p[i].getTiempo()<menorTiempo){
                 nom=p[i].getNombre();
                 menorTiempo=p[i].getTiempo();
             }
         }
         System.out.println("El Ganador de la competencia es: "+nom+ " con un tiempo de "+menorTiempo);
         
     }
     
}
