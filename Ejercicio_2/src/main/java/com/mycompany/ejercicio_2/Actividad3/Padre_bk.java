
package com.mycompany.ejercicio_2.Actividad3;

import java.util.Scanner;

public class Padre_bk {
    
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
        Padre_bk pa1 = new Padre_bk();
        hijo1_bk h1 = new hijo1_bk();
        while (true) {
            Scanner sp = new Scanner(System.in);
            int opcion = sp.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo de la cuenta 1 es : " + h1.getSaldo1());
                    pa1.menu_constante();
                    break;
                case 2:
                    System.out.println("El saldo de la cuenta 2 es : " + h1.getSaldo2());
                    pa1.menu_constante();
                    break;
                case 3:
                    System.out.println("Ingrese el valor a acreditar en cuenta 1 : ");
                    h1.setSaldo1(h1.getSaldo1()+ sp.nextInt());
                    System.out.println("Su credito se proceso exitosamente");
                    pa1.menu_constante();
                    break;
                case 4:
                    System.out.println("Ingrese el valor a acreditar en cuenta 2 : ");
                    h1.setSaldo2(h1.getSaldo2()+ sp.nextInt());
                    System.out.println("Su credito se proceso exitosamente");
                    pa1.menu_constante();
                    break;
                case 5:
                    System.out.println("Ingrese el valor a debitar en cuenta 1 : ");
                    h1.setSaldo1(h1.getSaldo1()- sp.nextInt());
                    System.out.println("Su debito se proceso exitosamente");
                    pa1.menu_constante();
                    break;
                case 6:
                    System.out.println("Ingrese el valor a debitar en cuenta 2 : ");
                    h1.setSaldo2(h1.getSaldo2()- sp.nextInt());
                    System.out.println("Su debito se proceso exitosamente");
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

        Padre_bk p1 = new Padre_bk();

        p1.menu_inicial();
        p1.elegir_opcion();
        
    }
    
    
    
}

