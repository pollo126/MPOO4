/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Profesor {
    //Atributos
    String materiaImparte;
    double horarioClase;
    String divisionQuePertenece;
    String universidad;
    
    public Profesor(){
        
    }
    public Profesor(String materiaImparte , double horarioClase ,String divisionQuePertenece ,String universidad ){
        this.materiaImparte = materiaImparte;
        this.horarioClase = horarioClase;
        this.divisionQuePertenece = divisionQuePertenece ;
        this.universidad = universidad;
    }
    public void pasarlista(){
        System.out.println("Lista :");
    }
    public void calificarTareas(){
        System.out.println("Calificar Tareas :");
    }
    public void hacerExamenes(){
        System.out.println("Hacer examenes:");
    }
    public void imprimirProfesor(){
        System.out.println("Materia que Imparte :"+materiaImparte);
        System.out.println("Horario : "+horarioClase);
        System.out.println("Division : "+divisionQuePertenece);
        System.out.println("universidad :"+universidad);
    }

    
}
