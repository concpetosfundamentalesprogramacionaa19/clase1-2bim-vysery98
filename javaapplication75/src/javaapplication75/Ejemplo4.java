package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vysery98
 */
public class Ejemplo4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        int[] datos = new int[3]; // arreglo 1
        String[] rangos = {"0-100", "101-199", "200-adelante"}; // arreglo 2
        boolean bandera = true;
        while (bandera) {
            System.err.println("Ingrese cantidad para comprobar");
            int cantidad = entrada.nextInt();
            if (cantidad <= 100) {
                datos[0] = datos[0] + 1;
            } else {
                if (cantidad >= 101 && cantidad <= 199) {
                    datos[1] = datos[1] + 1;
                } else {
                    datos[2] = datos[2] + 1;
                }
            }

            System.out.println("Ingrese -1 para salir, caso contrario con cualq"
                    + "uier número volvera a presentar el mensaje de ingrese va"
                    + "lor");
            int salir = entrada.nextInt();
            if (salir == -1) {
                bandera = false;
            }
        }
        System.out.println("Resultados");

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("Ventas en %s - %d\n", rangos[i], datos[i]);
        }

    }
}
