/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Gerardo Ayala Juarez
 */
public class Leer {
 public static item[] Leer( String NombreArchivo ){
      String acumulado="";
      int i=0;
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:/Users/futbo/Desktop/ArchivosGenerados/"+NombreArchivo+".txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            acumulado=acumulado+linea+"-";
            i++;}
         acumulado=acumulado.substring(0, acumulado.length()-2);
         String[] division = acumulado.split("-");
         item[] sisifo = new item[division.length];
         for(int j=0;j<i;j++){
             sisifo[j]=new item(division[j]);
         }
         return sisifo;
      }
      
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
     return null;
 }
}
