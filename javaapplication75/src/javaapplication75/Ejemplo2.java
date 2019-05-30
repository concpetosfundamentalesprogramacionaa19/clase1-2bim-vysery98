package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vysery98
 */
public class Ejemplo2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        int[] datos = new int[5];
        for (int i = 0; i <= 1000; i++) {
            int v = aleatorios.nextInt(5);
            System.out.println(v);
            datos[v] = datos[v] + 1;
        }

        System.out.println("Resultados");
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("posición: %d - %d\n", i, datos[i]);
        }

    }
}
