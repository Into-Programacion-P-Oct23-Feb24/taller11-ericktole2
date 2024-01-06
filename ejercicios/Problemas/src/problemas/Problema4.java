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
public class Problema4 {

    public static void calcularValorLuz(String nombreCliente,
            String cedulaCliente) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor del kilowatio: ");
        double valorKw = entrada.nextDouble();

        System.out.print("Ingrese el número de kilowatios del mes: ");
        int numeroKw = entrada.nextInt();

        double valorTotal = valorKw * numeroKw;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor"
                + " de $ %.2f",
                nombreCliente,
                cedulaCliente,
                valorTotal);

    }

    public static void calcularPredio(String nombreCliente, String cedulaCliente) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor del bien inmueble: ");
        double valorInmueble = entrada.nextDouble();

        double valorPredio = 0.02 * valorInmueble;

        System.out.printf("Cliente %s con cedula %s debe cancelar el valor"
                + " de $ %.2f y tiene que pagar de predio $%.2f",
                nombreCliente,
                cedulaCliente,
                valorInmueble,
                valorPredio);

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese 1 para calcular la planilla de "
                + "luz o 2 para calcular el valor del predio: ");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del cliente: ");
                String nombreCliente = entrada.next();

                System.out.print("Ingrese la cedula del cliente: ");
                String cedulaCliente = entrada.next();

                calcularValorLuz(nombreCliente, cedulaCliente);
                break;

            case 2:
                System.out.print("Ingrese el nombre del cliente: ");
                String nombreCliente2 = entrada.next();

                System.out.print("Ingrese la cedula del cliente: ");
                String cedulaCliente2 = entrada.next();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

    }
}
