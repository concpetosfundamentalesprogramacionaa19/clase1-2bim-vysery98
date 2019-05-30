package javaapplication75;

/**
 *
 * @author vysery98
 */
public class ArregloTres {

    public static void main(String[] args) {

        int[] c; // declaramos la variable
        c = new int[12];

        System.out.printf("%s\t\t%s\n", "Indice", "Valor");

        for (int contador = 0; contador < c.length; contador++) {
            System.out.printf("%d\t\t%d\n", contador, c[contador]);
        }
    }

}
