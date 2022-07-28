package com.mycompany.ejercicio_2.Actividad3;

import java.util.Scanner;

public class Padre {

    public void menu_inicial() {

        System.out.println("**********************************");
        System.out.println("*      BANCO INTERNACIONAL       *");
        System.out.println("* Bienvenido, eliga la opcion de *");
        System.out.println("* la accion que desea realizar : *");
        System.out.println("*                                *");
        System.out.println("* 1. Consulta cuenta 1           *");
        System.out.println("* 2. Consulta cuenta 2           *");
        System.out.println("* 3. Acreditar cuenta 1          *");
        System.out.println("* 4. Acreditar cuenta 2          *");
        System.out.println("* 5. Debitar cuenta 1            *");
        System.out.println("* 6. Debitar cuenta 2            *");
        System.out.println("* 7. Salir del sistema           *");
        System.out.println("**********************************");

    }

    public void menu_constante() {

        System.out.println("**********************************");
        System.out.println("*      ¿Que desea realizar?      *");
        System.out.println("*                                *");
        System.out.println("* 1. Consulta cuenta 1           *");
        System.out.println("* 2. Consulta cuenta 2           *");
        System.out.println("* 3. Acreditar cuenta 1          *");
        System.out.println("* 4. Acreditar cuenta 2          *");
        System.out.println("* 5. Debitar cuenta 1            *");
        System.out.println("* 6. Debitar cuenta 2            *");
        System.out.println("* 7. Salir del sistema           *");
        System.out.println("**********************************");

    }

    public void elegir_opcion() {
        Padre pa1 = new Padre();
        hijo1 h1 = new hijo1();
        while (true) {
            Scanner sp = new Scanner(System.in);
            int opcion = sp.nextInt();

            switch (opcion) {
                case 1:
                    h1.consultar_cta1();
                    pa1.menu_constante();
                    break;
                case 2:
                    h1.consultar_cta2();
                    pa1.menu_constante();
                    break;
                case 3:
                    System.out.println("Ingrese el valor a acreditar en cuenta 1 : ");
                    h1.sumar_cta1(sp.nextInt());
                    pa1.menu_constante();
                    break;
                case 4:
                    System.out.println("Ingrese el valor a acreditar en cuenta 2 : ");
                    h1.sumar_cta2(sp.nextInt());
                    pa1.menu_constante();
                    break;
                case 5:
                    System.out.println("Ingrese el valor a debitar en cuenta 1 : ");
                    h1.restar_cta1(sp.nextInt());
                    pa1.menu_constante();
                    break;
                case 6:
                    System.out.println("Ingrese el valor a debitar en cuenta 2 : ");
                    h1.restar_cta2(sp.nextInt());
                    pa1.menu_constante();
                    break;
                case 7:
                    System.out.println("¡Vuelva Pronto!");
                    System.exit(0);
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void main(String[] args) {

        Padre p1 = new Padre();

        p1.menu_inicial();
        p1.elegir_opcion();
    }

}

