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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int cantR=0;
        cantR=Apoyo.Cantd_Archivo();
        Participante par[]=new Participante[cantR];
        Apoyo.leerArchivo(par);
        Apoyo.mostrarB(par);
    }
    
}
