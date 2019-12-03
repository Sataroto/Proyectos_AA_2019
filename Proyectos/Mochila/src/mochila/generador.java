/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila;

/**
 *
 * @author Gerardo Ayala Juarez
 */
public class generador {
    public static item[] generar(int n, boolean txt){
        int peso;
        int beneficio;
        item[] generacion = new item[n];
        for (int i=0; i<n; i++){
            peso =  (int) (Math.random() * 100) + 1;
            beneficio = (int) (Math.random() * 150) + 1;
            generacion[i]= new item(i,peso,beneficio);
        }
        if(txt){
        Escribir archivo = new Escribir(generacion,"ListaNueva");
        }
        
        return generacion;
    }
}
