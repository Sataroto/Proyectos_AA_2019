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
public class Fibonacci {
    public static double run_Fib_r(long x){
        double ti = System.currentTimeMillis();
        Fibonacci.Fib_r(x);
        double tf = System.currentTimeMillis();
        return tf-ti;
    }
    public static double run_fiboIterativo(long x){
        double ti = System.currentTimeMillis();
        Fibonacci.fiboIterativo(x);
        double tf = System.currentTimeMillis();
        return tf-ti;
    }
    public static double run_fiboIterativoDinamico(long x){
        double ti = System.currentTimeMillis();
        
        if(x>2){
        Fibonacci.fiboIterativoDinamico(x);
        }
        double tf = System.currentTimeMillis();
        return tf-ti;
    }
    public static double run_fiboRecursivoDinamico(long x){
        double ti = System.currentTimeMillis();
        Fibonacci.fiboRecursivoDinamico(x);
        double tf = System.currentTimeMillis();
        return tf-ti;
    }
    public static long Fib_r(long n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        return Fib_r(n-1)+Fib_r(n-2);
    }
    public static long fiboIterativo(long pos){
        long pen = 0;
        long ult = 1;
        long suma;
        for (int x=1; x<pos;x++){
          suma =  ult + pen;
          pen = ult;
          ult = suma;        
        }
        
        
       return ult;
 }
    public static long fiboIterativoDinamico(long pos){
        long fibos[]=new long[(int)pos+1];
        fibos[0] = 0;
        fibos[1] = 1;
        for (int x=2; x<=pos;x++){
         fibos[x] =  fibos[x-1] + fibos[x-2];
        }
     return fibos[(int)pos];
    }
    public static long fiboRecursivoDinamico(long pos){
        if(pos<=1){
         return pos;
        } else {
         long n [] = new long[(int)pos+1];
         n[0]= 0;
         n[1]= 1;
//       
         return lookUpFib(n,pos);
        }
            
    }
    private static long lookUpFib(long[] n, long pos) {
        // caso base
       // if(n[(int)pos]!=-1)return n[(int)pos];
       //if(n[(int)pos]==0 || (n[(int)pos]==1 && pos ==2))return n[(int)pos];
        if((pos==0 || pos ==1) || (n[(int)pos]!=0 && pos!=0))return n[(int)pos];
        
        // si no se conoce entonces calcular
        n[(int)pos]=lookUpFib(n, pos-1)+lookUpFib(n, pos-2);
        
        return n[(int)pos];
    }
    
}
