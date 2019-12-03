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
public class suma {
    public static int suma_recursiva(int a, int b){
        if(b>0)
            return 1+suma_recursiva(a,b-1);
        return a;
    }
}
