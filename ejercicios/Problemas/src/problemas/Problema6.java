/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static double media(int[] arreglo) {
        double suma = 0;
        int n = arreglo.length;

        for (int i = 0; i < n; i++) {
            suma += arreglo[i];
        }

        return suma / n;
    }

    public static double desviacionEstandar(int[] arreglo, double media) {
        double suma = 0;
        int n = arreglo.length;

        for (int i = 0; i < n; i++) {
            suma += Math.pow(arreglo[i] - media, 2);
          //  Math.pow para poder elevar a la potencia 
        }

        return Math.sqrt(suma / n);
    }

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double media = media(informacion);
        double desviacionEstandar = desviacionEstandar(informacion, media);
        
        System.out.printf("La media aritmetica del arreglo es:%.2f\nLa "
                + "desviacion estandar del arreglo es: %.2f",media
                ,desviacionEstandar);
    }
}


