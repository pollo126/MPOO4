/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto1 = new Punto();
        punto1.imprimirPunto();
        punto1.x = 4;
        punto1.y = 7;
        punto1.imprimirPunto();
        
        Punto punto2 = new Punto(10,88);
        punto2.imprimirPunto();
        System.out.println("Punto2 x="+punto2.x);
        
        Carro carro1 = new Carro();
        carro1.imprimirCarro();
        carro1.anio = 2020;
        carro1.numPuertas = 4;
        carro1.marca = "Honda";
        carro1.color = "Rojo";
        carro1.imprimirCarro();
        
        Carro carro2 = new Carro("Chevrolet",2022,"Azul",2);
        carro2.imprimirCarro();
        
        Profesor profesor1 = new Profesor();
        profesor1.imprimirProfesor();
        profesor1.divisionQuePertenece = "Ciencias Basicas";
        profesor1.horarioClase =12;
        profesor1.materiaImparte = "Calculo";
        profesor1.universidad = "UNAM";
        
        profesor1.imprimirProfesor();
        
        Profesor profesor2 = new Profesor("Ciencias Basicas",12,"Algebra","UNAM");
        profesor2.imprimirProfesor();
        
        
        triangulo triangulo1 = new triangulo();
        triangulo1.imprimirtriangulo();
        triangulo1.base = 3;
        triangulo1.altura= 5;
        triangulo1.imprimirtriangulo();
        
        triangulo triangulo2 = new triangulo(6,8);
        triangulo2.imprimirtriangulo();
        
        Perro Perro1 = new Perro();
        Perro1.imprimirPerro();
        Perro1.numPatas = 4;
        Perro1.numOrejas = 2;
        Perro1.color = "negro";
        Perro1.raza = "Golde";
        Perro1.nombre = "Firulais";
        Perro1.imprimirPerro();
        
        Perro Perro2 = new Perro(4 , 2,"Blanco","de la calle","Solovino");
        Perro2.imprimirPerro();
        
        Alumno Alumno1 = new Alumno();
        Alumno1.imprimirAlumno();
        Alumno1.numCuenta = 322223282 ;
        Alumno1.nombre = "Sofia";
        Alumno1.edad = 19;
        Alumno1.carrera = "Computacion";
        Alumno1.imprimirAlumno();
        
        Alumno Alumno2 = new Alumno(123456789 , "Pedrito" , 19 , "Aeroespacial" );
        Alumno2.imprimirAlumno();
       
    }
    
}
