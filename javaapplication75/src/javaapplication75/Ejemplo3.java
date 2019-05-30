package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vysery98
 */
public class Ejemplo3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        int[] datos = new int[3];
        String[] rangos = {"0-100", "101-199", "200-adelante"};

        int cantidad = 199;
        if (cantidad <= 100) {
            datos[0] = datos[0] + 1;
        } else {
            if (cantidad >= 101 && cantidad <= 199) {
                datos[1] = datos[1] + 1;
            } else {
                datos[2] = datos[2] + 1;
            }
        }

        System.out.println("Resultados");

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("Ventas en %s - %d\n", rangos[i], datos[i]);
        }

    }
}
