/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivo;
/**
 *
 * @author Gerardo Ayala Juarez
 */
public class QuickSort implements AlgoritmoOrdenamiento, Runnable {
    private double[] arreglo;
    private double tt;
    private boolean thread;
    
    public QuickSort() {
        this.thread = false;
        this.arreglo = null;
    }
          
    public QuickSort(boolean thread) {
        this.thread = thread;
        this.arreglo = null;
    }
    @Override
    public double getTt() {
        return tt;
}
    @Override
    public void definirDatos(double[] arreglo) {
       this.arreglo = arreglo;
    }
    public void ordenarDatos()  {
     
             if (this.thread){
                 Thread hilo = new Thread(this);
                hilo.start();
         
             }else{
                run();
             }
        
    }
    int partition(double arr[], int low, int high) 
    { 
        double pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                double temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        double temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    }
  
/* l is for left index and r is right index of the 
   sub-array of arr to be sorted */
        void sort(double arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 

    @Override
    public void run() {
        double ti = System.currentTimeMillis();
      sort(arreglo ,0,arreglo.length-1);
        double tf = System.currentTimeMillis();
        this.tt = tf - ti;
    }
    
}
