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
public class factorial{
       public static int Factorial_Recursivo(int n){
           if(n == 0)
               return 1;
           return n*Factorial_Recursivo(n-1);
       }
       public static int Factorial_Iterativo(int n){
           int i=1;
           while(n>0){
               i*=n;
               n--;
            }
           return i;
       }
       
       private static int _403(int n){
          if(n == 0)
               return 1;
           return n*_403(n-1); 
       }
}
