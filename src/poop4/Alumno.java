/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author christiansantosflores
 */
public class Alumno {
    double numCuenta;
    String nombre;
    int edad;
    String carrera;
    
    public Alumno() {
    
    }
    public Alumno(double numCuenta ,String nombre , int edad ,  String carrera ){
       this.numCuenta = numCuenta;
       this.nombre = nombre;
       this.edad = edad;
       this.carrera = carrera;
       
    }
    
    public void estudiar (){
        System.out.println("Estudiar");
    }
    public void comer (){
        System.out.println("comemos");
    }
    public void hacerTarea(){
        System.out.println("los estudiantes hacen tarea");
    }
    public void Dormir(){
        System.out.println("los estudiantes duermen...aveces");
    }
    
    public void imprimirAlumno(){
        System.out.println("Su numero de Cuenta es= "+numCuenta);
        System.out.println("Su nombre es= "+nombre);
        System.out.println("Su edad es = "+edad);
        System.out.println("Su carrera es= "+carrera);
    }
}
