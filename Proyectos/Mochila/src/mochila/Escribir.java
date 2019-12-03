/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila;
import java.io.*;
/**
 *
 * @author Gerardo Ayala Juarez
 */
public class Escribir {
 
public Escribir( Object[] hola, String NombreArchivo )
{
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:/Users/futbo/Desktop/ArchivosGenerados/"+NombreArchivo+".txt",true);
            pw = new PrintWriter(fichero);

            for (int i = 0; i < hola.length; i++)
            {
                pw.println(hola[i].toString());
                System.out.println(hola[i].toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
   
    }
}
