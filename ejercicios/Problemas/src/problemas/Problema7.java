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
public class Problema7 {
    public static String[] crearArregloCiudades() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de ciudades: ");
        int n = entrada.nextInt();

        String[] ciudades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la ciudad " + (i + 1) + ": ");
            ciudades[i] = entrada.next();
        }

        return ciudades;
    }

    public static void imprimirCiudades(String[] ciudades) {
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i].length() == 4 || ciudades[i].length() == 5) {
                System.out.println(ciudades[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] ciudades = crearArregloCiudades();

        imprimirCiudades(ciudades);
    }
}

