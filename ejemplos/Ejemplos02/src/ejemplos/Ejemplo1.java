/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int[] informacion = {10, 20, 30, 40, 50, 100};

        // int suma = obtenerSumaDatos(10);
        int sum = obtenerSumaDatos(informacion);
        double promedio = obtenerPromedioDatos(informacion);
        System.out.printf("La suma es %d\nEl promedio es %.2f\n", sum,
                 promedio);
        // System.out.printf("El promedio es %.2f\n", promedio);
    }

    public static int obtenerSumaDatos(int[] d) {
        int suma = 0;
        for (int i = 0; i < d.length; i++) {
            suma += d[i];
        }
        return suma;
    }

    public static double obtenerPromedioDatos(int[] datos) {
        double suma = obtenerSumaDatos(datos);
        double promedio;
        promedio = suma / datos.length;
        return promedio;
    }

}
