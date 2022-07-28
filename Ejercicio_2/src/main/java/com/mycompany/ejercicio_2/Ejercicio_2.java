package com.mycompany.ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // #1 PIDE DOS NUMEROS E INDICA SI SON IGUALES O NO
        System.out.println("PROGRAMA #1 PIDE DOS NUMEROS E INDICA SI SON IGUALES O NO :  ");
        System.out.println("");
        System.out.println("");

        System.out.println("Ingrese el primer valor : ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor : ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Los numeros son iguales : " + num1 + " y " + num2);
        } else if (num1 > num2) {
            System.out.println("El numero 1 es mayor a numero 2 : " + num1 + " > " + num2);

        } else {
            System.out.println("El numero 2 es mayor a numero 1 : " + num2 + " > " + num1);
        }
        System.out.println("----------------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        

        // #2 PEDIR NUMERO E INDICAR SI ES POSITIVO O NEGATIVO
        System.out.println("PROGRAMA #2 PEDIR NUMERO E INDICAR SI ES POSITIVO O NEGATIVO :  ");
        System.out.println("");
        System.out.println("");

        System.out.println("Bienvenido; Ingrese un numero positivo o negativo");
        int num3 = sc.nextInt();
        if (num3 > 0) {
            System.out.println("El valor " + num3 + " es positivo");
        } else if (num3 < 0) {
            System.out.println("El valor " + num3 + " es negativo");
        } else {
            System.out.println("El valor " + num3 + " es neutro");
        }

        System.out.println("----------------------------------------------");
        System.out.println(" ");
        System.out.println(" ");

        // #3 PEDIR 2 VALORES Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR
        System.out.println("PROGRAMA #3 PEDIR 2 VALORES Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR :  ");
        System.out.println("");
        System.out.println("");

        System.out.println("Ingrese el primer valor");
        double num4 = sc.nextDouble();
        System.out.println("Ingrese el segundo valor");
        double num5 = sc.nextDouble();
        System.out.println("Los valores ordenados de mayor a menor son : ");
        if (num4 > num5) {
            System.out.println(num4 + " " + num5);
        } else {
            System.out.println(num5 + " " + num4);
        }

        System.out.println("----------------------------------------------");
        System.out.println(" ");
        System.out.println(" ");

        // #4 PEDIR 3 VALORES Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR
        System.out.println("PROGRAMA #4 PEDIR 3 VALORES Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR :  ");
        System.out.println("");
        System.out.println("");

        System.out.println("Ingrese el primer valor");
        double num6 = sc.nextDouble();
        System.out.println("Ingrese el segundo valor");
        double num7 = sc.nextDouble();
        System.out.println("Ingrese el tercer valor");
        double num8 = sc.nextDouble();
        System.out.println("Los valores ordenados de mayor a menor son : ");
        if (num6 > num7 && num6 > num8) {
            if (num7 > num8) {
                System.out.println(num6 + " " + num7 + " " + num8);
            } else {
                System.out.println(num6 + " " + num8 + " " + num7);
            }
        } else if (num7 > num8 && num7 > num6) {
            if (num8 > num6) {
                System.out.println(num7 + " " + num8 + " " + num6);
            } else {
                System.out.println(num7 + " " + num6 + " " + num8);
            }
        } else if (num8 > num6 && num8 > num7) {
            if (num7 > num6) {
                System.out.println(num8 + " " + num7 + " " + num6);
            } else {
                System.out.println(num8 + " " + num6 + " " + num7);
            }
        }

        // El programa anterior se hizo con ayuda de la siguiente tabla de combinaciones posibles : 
        // __________________________________________________________________________________
        // |               |_________VARIABLES________|    COMBINACION   |    COMBINACION   | 
        // |__OCURRENCIAS__|__NUM6__|__NUM7__|__NUM8__|_________1________|_________2________|
        // |_______1_______|___75___|___50___|___25___|NUM6 > NUM7 > NUM8|                  | 
        // |_______2_______|___25___|___75___|___50___|NUM7 > NUM8 > NUM6|                  |
        // |_______3_______|___50___|___25___|___75___|NUM8 > NUM6 > NUM7|                  |
        // |_______4_______|___75___|___25___|___50___|                  |   NUM8 > NUM 7   |
        // |_______5_______|___50___|___75___|___25___|                  |   NUM6 > NUM 7   |
        // |_______6_______|___25___|___50___|___75___|                  |   NUM7 > NUM 8   |
        // ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
        // Esta tabla nos ayuda a contemplar todas las posibles entradas que se puedan dar
        // y de esa manera responder de mejor manera en la programacion ya que todos los 
        // valores, combinaciones y entradas posibles se consideran.
        System.out.println("----------------------------------------------");
        System.out.println(" ");
        System.out.println(" ");

        // #5 PEDIR DIA, MES Y AÑO DE UNA FECHA E INDICAR SI ES CORRECTA Y SIN AÑOS BISIESTOS
        System.out.println("PROGRAMA #5 PEDIR DIA, MES Y AÑO DE UNA FECHA E INDICAR SI ES CORRECTA Y SIN AÑOS BISIESTOS :  ");
        System.out.println("");
        System.out.println("");

        System.out.println("Ingrese el dia en numeros del 01 al 31");
        int dia = sc.nextInt();
        System.out.println("Ingrese el mes en numeros del 01 al 12");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año en numeros de 4 posiciones");
        int ano = sc.nextInt();

        boolean diaCorrecto = true;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia > 0 && dia <= 31) {
                diaCorrecto = true;
            } else {
                diaCorrecto = false;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 0 && dia <= 30) {
                diaCorrecto = true;
            } else {
                diaCorrecto = false;
            }
        }

        if (diaCorrecto == true) {
            if (mes > 0 && mes <= 12) {
                if (mes == 2 && dia == 29 && ano % 4 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                    System.out.println("La fecha " + dia + "/" + mes + "/" + ano + " es correcta");
                    if (ano % 4 == 0) {
                        System.out.println("Es año bisiesto");
                    } else {
                        System.out.println("No es un año bisiesto");
                    }
                } else if (mes == 2 && dia == 29 && ano % 4 != 0) {
                    System.out.println("El año ingresado es invalido");
                } else if (dia != 29 && ano % 100 != 0) {
                    System.out.println("La fecha " + dia + "/" + mes + "/" + ano + " es correcta");
                    System.out.println("No es un año bisiesto");
                }

            } else {
                System.out.println("El mes ingresado es invalido");
            }
        } else {
            System.out.println("El dia ingresado es invalido");
        }

    }
}
