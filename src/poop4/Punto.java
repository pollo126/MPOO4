/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Punto {
    //Atributos
    int x;
    int y;
    
    //Mtodos
    
    //Metodo constructor
    public Punto(){
        //x=0;
        //y=0;
    }
    public Punto(int x,int y){
        this.x = x;
        this.y = y;
    }
    //Metodo accion
    public void imprimirPunto(){
        System.out.println("("+x+","+y+")");
    }
}
