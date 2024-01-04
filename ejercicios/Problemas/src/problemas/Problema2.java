/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int l = 0;
        int a = 0;
        int b = 0;
        int i;
        System.out.println("ingrese el numero segun la area que requiera"
                + "\nPrecione 1 para un cuadrado\nPrecione 2 para un triangulo"
                + "\nPrecione 3 para un rectangulo\n");
        i = entrada.nextInt();

        if (i == 1) {
            obtenerCuadrado(l);
        } else if (i == 2) {
            obtenerTriangulo(a, b);
        } else if (i == 3) {
            obtenerRectangulo(l, b);
        }

    }

    public static void obtenerCuadrado(int lado) {
        Scanner entrada = new Scanner(System.in);

        int total = 0;
        System.out.println("Ingrese el valor de un lado");
        lado = entrada.nextInt();
        total = lado * 4;
    }

    public static void obtenerTriangulo(int base, int altura) {
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        System.out.println("Ingrese el valor de la base ");
        base = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura ");
        altura = entrada.nextInt();
        total = (base * altura) / 2;
    }

    public static void obtenerRectangulo(int lado1, int lado2) {
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        System.out.println("Ingrese el valor de un lado");
        lado1 = entrada.nextInt();
        System.out.println("Ingrese el valor de otro lado");
        lado2 = entrada.nextInt();
        total = lado1 * lado2;

    }
}
