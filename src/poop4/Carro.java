/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Carro {
    //Atributos
    int anio;
    int numPuertas;
    String marca;
    String color;
    //Metodod contructor
    public Carro() {
    
    }
    public Carro(String marca, int anio, String color , int numPuertas ){
        this.marca = marca;
        this.anio = anio;
        this.color = color ;
        this.numPuertas = numPuertas;
        
    }
    public void avanzar(){
        System.out.println("Coche avanza");
    }
    public void frenar(){
        System.out.println("Coche Frena");
    }
    public void sonar(){
        System.out.println("cuchao");
    }
    public void retroceder(){
        System.out.println("Para tras tras tras");
        
    }
    
    public void imprimirCarro(){
        System.out.println("Marca ="+marca);
        System.out.println("Año = "+anio);
        System.out.println("NumPuertas ="+numPuertas);
        System.out.println("Color ="+color);
    }
    
    
}
