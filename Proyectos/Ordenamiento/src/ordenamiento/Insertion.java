/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author Gerardo Ayala Juarez
 */
public class Insertion implements AlgoritmoOrdenamiento, Runnable{
    private double arreglo[];
    private double tt;
    private boolean thread;
    public Insertion(){
        this.arreglo=null;
        this.thread=false;
    }
    
    public Insertion(boolean thread){
        this.arreglo=null;
        this.thread=thread;
    }
    
    @Override
    public void definirDatos(double[] arreglo) {
       this.arreglo = arreglo;
    }
    
    
    
    @Override
    public void run(){
        int n = arreglo.length; 
        double ti = System.currentTimeMillis();
        for (int i = 1; i < n; ++i) { 
            double key = arreglo[i]; 
            int j = i - 1; 
  
            while (j >= 0 && arreglo[j] > key) { 
                arreglo[j + 1] = arreglo[j]; 
                j = j - 1; 
            } 
            arreglo[j + 1] = key;
            }
        double tf = System.currentTimeMillis();
        // calculamos el tiempo total
        this.tt = (tf - ti);
    }

    @Override
    public void ordenarDatos() {
        if (this.thread){
             Thread hilo = new Thread(this);
             hilo.start();
         
         }else{
             run();
         }
    }

    @Override
    public double getTt() {
        return this.tt;
    }
}
    
