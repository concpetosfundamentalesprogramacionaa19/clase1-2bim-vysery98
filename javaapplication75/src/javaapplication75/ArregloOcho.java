package javaapplication75;

/**
 *
 * @author vysery98
 */
public class ArregloOcho {

    public static void main(String[] args) {

        int[] respuestas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3,
            3, 2};

        int[] frecuencias = new int[6];

        for (int respuesta = 0; respuesta < respuestas.length; respuesta++) {
            System.out.println(respuestas[respuesta]);
            frecuencias[respuestas[respuesta]]
                    = frecuencias[respuestas[respuesta]] + 1;

        }

        System.out.println("-----------------------------------------------");
        for (int contador = 0; contador < frecuencias.length; contador++) {
            System.out.printf("%d\t\t%d\n", contador, frecuencias[contador]);
        }

    }

}
