package javaapplication75;

import java.util.Random;

/**
 *
 * @author vysery98
 */
public class DemoRandomico {

    public static void main(String[] args) {

        Random aleatorios = new Random();
        int v = aleatorios.nextInt(4);

        System.out.printf("%d\n", v);

    }
}
