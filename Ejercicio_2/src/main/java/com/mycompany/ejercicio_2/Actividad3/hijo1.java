package com.mycompany.ejercicio_2.Actividad3;

public class hijo1 {

    public int saldo1 = 10000;
    public int saldo2 = 5000;

    public void consultar_cta1() {
        System.out.println("El saldo de la cuenta 1 es : " + saldo1);
    }

    public void consultar_cta2() {
        System.out.println("El saldo de la cuenta 2 es : " + saldo2);
    }

    public void sumar_cta1(int abono1) {
        saldo1 = abono1 + saldo1;
        System.out.println("Su credito se proceso exitosamente");
    }

    public void sumar_cta2(int abono2) {
        saldo2 = abono2 + saldo2;
        System.out.println("Su credito se proceso exitosamente");
    }

    public void restar_cta1(int debito1) {
        saldo1 = saldo1 - debito1;
        System.out.println("Su debito se proceso exitosamente");
    }

    public void restar_cta2(int debito2) {
        saldo2 = saldo2 - debito2;
        System.out.println("Su debito se proceso exitosamente");
    }

}

