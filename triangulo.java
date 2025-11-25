/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author christiansantosflores
 */
public class triangulo {
    double base ;
     
    double altura ;
   
    public triangulo(){
        
    }
    public triangulo(double base , double altura){
        this.base = base;
        this.altura = altura;
    }
    public void area(){
        System.out.println("El area es...");
    }
    public void imprimirtriangulo(){
        System.out.println("Base es ="+base);
        System.out.println("Altura es ="+altura);
    }
}
