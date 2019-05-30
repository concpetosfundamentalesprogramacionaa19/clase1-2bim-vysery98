package javaapplication75;

/**
 *
 * @author vysery98
 */
public class ArregloSeis {

    public static void main(String[] args) {

        int[] c = new int[10]; // declaramos la variable
        System.out.println("-----------------------------------------------");
        for (int contador = 0; contador < c.length; contador++) {
            System.out.printf("%d\t\t%d\n", contador, c[contador]);
        }

        for (int contador = 0; contador < c.length; contador++) {
            c[contador] = 100 + contador;
        }

        System.out.println("-----------------------------------------------");
        for (int contador = 0; contador < c.length; contador++) {
            System.out.printf("%d\t\t%d\n", contador, c[contador]);
        }

    }

}
