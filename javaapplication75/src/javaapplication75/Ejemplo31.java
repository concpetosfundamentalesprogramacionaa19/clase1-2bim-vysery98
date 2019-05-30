package javaapplication75;

import java.util.Scanner;

/**
 *
 * @author vysery98
 */
public class Ejemplo31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // lectura de datos

        // declaración de variables
        int[] datos = new int[6];
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20",
            "20.1-adelante"};

        double calificacion = 0;
        boolean salida = false;
        int aux = 0;

        while (salida == false) {
            // ingreso de datos
            System.out.print("Ingrese la calificación del estudiante: ");
            calificacion = scan.nextDouble();

            // incremento del número de veces que se ingresa datos en un rango
            if (calificacion <= 8) {
                datos[0] = datos[0] + 1;
            } else {
                if (calificacion > 8 && calificacion <= 12) {
                    datos[1] = datos[1] + 1;
                } else {
                    if (calificacion > 12 && calificacion <= 16) {
                        datos[2] = datos[2] + 1;
                    } else {
                        if (calificacion > 16 && calificacion <= 19) {
                            datos[3] = datos[3] + 1;
                        } else {
                            if (calificacion > 19 && calificacion <= 20) {
                                datos[4] = datos[4] + 1;
                            } else {
                                datos[5] = datos[5] + 1;
                            }
                        }
                    }
                }
            }

            // pregunta para determinar fin de ciclo while o continuarlo
            System.out.print("¿Desea ingresar otra calificación?(1=Si|0=No): ");
            aux = scan.nextInt();
            if (aux == 0) {
                salida = true;
            } else {
                salida = false;
            }

        }

        // salida
        System.out.println("Notas ingresadas\nRangos:");

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%s = %d\n", rangos[i], datos[i]);
        }

    }
}
