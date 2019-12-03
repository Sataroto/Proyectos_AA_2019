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
public class Test {
    public static void main(String[] aggg){
        item[] generacion =Leer.Leer("ListaNueva");
        for(int i=0;i<generacion.length;i++){
            System.out.println(generacion[i]);
        }        
    } 
}
