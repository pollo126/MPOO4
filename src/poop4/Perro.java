/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author christiansantosflores
 */
public class Perro {
    int numPatas;
    int numOrejas;
    String color;
    String raza;
    String nombre;
    
    public Perro() {
    
    }
    public Perro(int numPatas , int numOrejas , String color , String raza , String nombre){
        this.numPatas = numPatas;
        this.numOrejas = numOrejas;
        this.color = color;
        this.raza = raza;
        this.nombre = nombre;  
    }
    public void ladrar (){
        System.out.println("El perro ladra");
    }
    public void comer (){
        System.out.println("El perro come");
    }
    public void correr (){
        System.out.println("El perro corre");
    }
    public void jugar (){
        System.out.println("El perro juega con la pelota");
    }
    public void imprimirPerro(){
        System.out.println("Numero de Patas"+numPatas);
        System.out.println("Numero de Orejas"+numOrejas);
        System.out.println("El color de su pelaje es"+color);
        System.out.println("Su raza es"+raza);
        System.out.println("Su nombre es"+nombre);
    }
   
}
