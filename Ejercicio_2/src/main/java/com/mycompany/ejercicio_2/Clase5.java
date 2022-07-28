
package com.mycompany.ejercicio_2;

import java.util.Scanner;


public class Clase5 {
    
    int cumpleaños;
    
    public void crear(String nombre, String entrenador, int copas, String estrella, int jugadores, String color){
        
        Clase6 argentina = new Clase6();
        
        argentina.setNombre(nombre);
        argentina.setNombre_entrenador(entrenador);
        argentina.setCopas(copas);
        argentina.setEstrella(estrella);
        argentina.setNombre_entrenador(entrenador);
        argentina.setJugadores(jugadores);
        argentina.setColor_uniforme(color);
        
        System.out.println("Nombre : "+argentina.getNombre());
        System.out.println("Copas : "+argentina.getCopas());
        
        
        
        
        
    }
    
    public static void main(String[] args) {
        
        /*
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        */
        
        
        /* WHILE
        int x = 0;
        
        while (x<20){
            System.out.println(x);
            x++;
        }
        */
        
        
        /* ejemplo do while
        int x = 1;
        
        do {
            System.out.println(x);
            x++;
        } while (x<=20);
        */
        
        
        /*
        
        // AQUI LLAMAMOS A LA CLASE CLASE6 PARA UTILIZAR SUS VARIABLES
        // CLASE == OBJETO
        Clase6 argentina = new Clase6();
        
        // AQUI SE DA VALORES A VARIABLES PRIVADAS CON SET
        argentina.setNombre("Argentina");
        argentina.setNombre_entrenador("Leonel Scaloni");
        argentina.setCopas(2);
        argentina.setEstrella("Leonel Messi");
        argentina.setNombre_entrenador("Leonel Scaloni");
        argentina.setJugadores(26);
        argentina.setColor_uniforme("Celeste con blanco");
        
        System.out.println(argentina.getNombre());
        System.out.println("Copas ganadas : "+argentina.getCopas());
        
        
        // LLAMADA AL MISMO OBJETO PERO DIFERENTE USO
        // DE ESTA ,AMERA SE RECICLAN VARIABLES
        Clase6 españa = new Clase6();
        
        españa.setNombre("España");
        españa.setCopas(1);
        españa.setColor_uniforme("Rojo");
        españa.setEstrella("Pedri");
        españa.setJugadores(26);
        españa.setNombre_entrenador("Luis Enrique");
        
        System.out.println("Equipo : "+españa.getNombre());
        System.out.println("Copas : "+españa.getCopas());
        */
        
        
        // se recibe hasta 5 equipos diferentes con un for
        for (int i = 0; i < 5; i++){
            
            Clase6 ayuda = new Clase6();
            
            Scanner sp = new Scanner(System.in);
            
            System.out.println("Ingrese nombre de equipo");
            ayuda.setNombre(sp.nextLine());
            
            System.out.println("Ingrese nombre del entrenador");
            ayuda.setNombre_entrenador(sp.nextLine());
            
            System.out.println("Ingrese las copas");
            ayuda.setCopas(sp.nextInt());
            
            System.out.println("Ingrese su estrella");
            ayuda.setEstrella(sp.nextLine());
            
            System.out.println("Ingrese el numero de jugadores");
            ayuda.setJugadores(sp.nextInt());
            
            System.out.println("Ingrese el color");
            ayuda.setColor_uniforme(sp.nextLine());
            
            
            // AQUI LLAMAMOS A CLASE5 PARA ASIGNARLE LOS VALORES QUE RECIBIMOS POR SCANNER
            Clase5 eje2 = new Clase5();
            
            // AQUI VAMOS A DARLE LOS VALORES A LAS VARIABLES CON AYUDA DE UN GET PARA ASIGNAR
            eje2.crear(ayuda.getNombre(), ayuda.getNombre_entrenador(), ayuda.getCopas(), ayuda.getEstrella(), ayuda.getJugadores(), ayuda.getColor_uniforme());
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
    }
    
}
