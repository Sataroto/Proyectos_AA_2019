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
public class MergeSort implements AlgoritmoOrdenamiento, Runnable{
    private double[] arreglo;
    private double tt;
    private boolean thread;
    
    public MergeSort() {
        this.thread = false;
        this.arreglo = null;
    }
          
    public MergeSort(boolean thread) {
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
    void merge(double arr[], int l, int m, int r) 
{ 
    int i, j, k; 
    int n1 = m - l + 1; 
    int n2 =  r - m; 
  
    /* create temp arrays */
    double[] L= new double[n1];
    double[] R= new double[n2];

    /* Copy data to temp arrays L[] and R[] */
    for (i = 0; i < n1; i++) 
        L[i] = arr[l + i]; 
    for (j = 0; j < n2; j++) 
        R[j] = arr[m + 1+ j]; 
  
    /* Merge the temp arrays back into arr[l..r]*/
    i = 0; // Initial index of first subarray 
    j = 0; // Initial index of second subarray 
    k = l; // Initial index of merged subarray 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[k] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 
  
    /* Copy the remaining elements of L[], if there 
       are any */
    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 
  
    /* Copy the remaining elements of R[], if there 
       are any */
    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
} 
  
/* l is for left index and r is right index of the 
   sub-array of arr to be sorted */
        public void mergeSort(double arr[], int l, int r) 
{ 
    if (l < r) 
    { 
        // Same as (l+r)/2, but avoids overflow for 
        // large l and h 
        int m = l+(r-l)/2; 
  
        // Sort first and second halves 
        mergeSort(arr, l, m); 
        mergeSort(arr, m+1, r); 
  
        merge(arr, l, m, r); 
    } 
}

    @Override
    public void run() {
        double ti = System.currentTimeMillis();
      mergeSort(arreglo ,0,arreglo.length-1);
        double tf = System.currentTimeMillis();
        this.tt = tf - ti;
    }
} 
