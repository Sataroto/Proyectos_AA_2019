/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author CRUZLEIJA
 */
public class Burpbuja implements AlgoritmoOrdenamiento, Runnable{

    private double[] arreglo;
    private double tt;
    private boolean thread;
    
    public Burpbuja() {
        this.arreglo = null;
        this.thread = false;
    }
    public Burpbuja(boolean thread){
        this.thread = thread;
    }
      
    @Override
    public void definirDatos(double[] arreglo) {
       this.arreglo = arreglo;
    }

    @Override
    public void run() {
        // calcular cuando empieza 
        double ti = System.currentTimeMillis();
        // ordenamos
        for(int rep=0; rep<arreglo.length;rep++){
            for(int ver=0; ver<arreglo.length-1-rep;ver++){
                if(arreglo[ver]>arreglo[ver+1]){
                    double temp = arreglo[ver+1];
                    arreglo[ver+1] = arreglo[ver];
                    arreglo[ver] = temp;
                }
                
            }
        }
        // calculamos el tiempo cuando termina 
        double tf = System.currentTimeMillis();
        // calculamos el tiempo total
        this.tt=tf - ti;
    }

    @Override
    public double getTt() {
        return this.tt;
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
    
}
