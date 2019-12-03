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
public class item {
    public int n;
    public int peso;
    public int beneficio;

    public item(int n, int peso, int beneficio) {
        this.n = n;
        this.peso = peso;
        this.beneficio = beneficio;
    }
    public item(String frase){
        String[] partes = frase.split(",");
        this.n = Integer.parseInt(partes[0]);
        this.peso = Integer.parseInt(partes[1]);
        this.beneficio = Integer.parseInt(partes[2]);
    }
    @Override
    public String toString(){
        return this.n+","+this.peso+","+this.beneficio;
    }
}
