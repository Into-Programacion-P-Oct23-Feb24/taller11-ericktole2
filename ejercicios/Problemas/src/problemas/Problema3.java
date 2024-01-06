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
public class Problema3 {
    public static String promedioCualitativo(double nota1, double nota2,
            double nota3, double nota4) {
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        if (promedio < 5.1) {
            return "Regular";
        } else if (promedio < 8.1) {
            return "Bueno";
        } else if (promedio < 9.1) {
            return "Muy Bueno";
        } else {
            return "Sobresaliente";
        }
    }

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la primera nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = entrada.nextDouble();

        System.out.print("Ingrese la cuarta nota: ");
        double nota4 = entrada.nextDouble();

        String promedioCualitativo = promedioCualitativo(nota1, nota2, nota3, nota4);
        
        System.out.printf("El promedio de las notas:%.2f, %.2f , %.2f, %."
                + "2f es %s",nota1,nota2,nota3,nota4,
                promedioCualitativo);
    }
}
