package javaapplication75;

/**
 *
 * @author vysery98
 */
public class ArregloUno {

    public static void main(String[] args) {

        // declaración del arreglo
        int[] c = new int[5];

        // asignación de valores en las posiciones [n] del arreglo
        c[3] = 20;
        c[1 + 1] = 5 + 6;
        c[2] = 11;
        c[4] = 10;
        // arr5[5] = 100; No es válido, no hay la posición 5 del arreglo

        // salida
        System.out.printf("%d + %d = %d\n", c[1], c[4], c[1] + c[4]);
        System.out.printf("El tamaño del arreglo es: %d\n", c.length);

    }

}
