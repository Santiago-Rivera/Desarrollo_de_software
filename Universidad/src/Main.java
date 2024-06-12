package Universidad.src;

//package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Estudiante alumno = new Estudiante(123456789);
    
        alumno.setCedula(55555555);
    
        alumno.getNombres();
    
        System.out.println("Cedula: " + alumno.getCedula() + "Nombre: " + alumno.getNombres());
    
        alumno.obtenerDatos("Daniel");*/



        //int numeroUno = 0;
        int numeroDos = 0;
        int suma = 0;

        int iva = 15;
        String nombre = "Santiago";
        boolean esLunes = true;
        //double numero = 12.5;

        if (iva == 18 && esLunes == true) {
            System.out.println("Si, es igual");
        } else {
            System.out.println("No es igual");
        }
        for ( int i = 0 ; i <= 10000 ; i++ ){
            System.out.println("Numero: " + i);
        }

        System.out.println("Resultado = " + iva);
        System.out.println("Resultado = " + nombre);
        System.out.println("Resultado = " + esLunes);
        System.out.println("Resultado = " + numeroDos);

        //int iva = 100;

        int [] notas = {100, 20, 40, 80, 125};
        //int suma = 0;
        suma = notas[0] + notas[1] + notas [2];
        System.out.println("Suma: " + suma);
        for ( int i = 0 ; i < notas.length ; i++ ){
            suma += notas[i];
        }
        for (int notitas : notas){
            suma += notitas;
        }
        System.out.println("Suma: " + suma);

        //int var = 0

        //LISTA
        ArrayList<String> nombresAlumnos = new ArrayList<>();
        nombresAlumnos.add("Santiago");
        nombresAlumnos.add("Susana");
        nombresAlumnos.add("Samantha");
        System.out.println("Nombre Alumnos: " + nombresAlumnos);
    }
}
