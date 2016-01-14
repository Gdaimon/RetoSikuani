package kernel;

/**
 * Created by Gdaimon on 8/01/2016.
 */
public class Triangulo {

    private static long limite;
    private static long Lado1;
    private static long Lado2;

    public static void main(String[] args) {
        inicio();
    }

    /**
     * Método para evaluar los lados, sumar y mostrar los lados hasta llegar al limite solicitado
     */
    public static void inicio() {

        //Inicialización Variables
        limite = 1000000000;
        Lado1 = 0;
        Lado2 = 0;

        //Ciclo Infinito hasta que se cumpla que los lados 1 y 2 son superiores al limite solicitado
        for (long a = 2; ; a++) {

            if (3 * a + 1 > limite || 3 * a - 1 > limite) {
                break;
            }

            if (a >= 2) {
                if (calculoArea(a, a + 1) == true)
                    Lado1 += 3 * a + 1;
            }

            if (a >= 3) {
                if (calculoArea(a, a - 1) == true)
                    Lado2 += 3 * a - 1;
            }
        }
        resultado();
    }

    /**
     * @param a - Valor numero entero
     * @param c - Valor numero entero
     * @return - Valor booleano
     */
    public static boolean calculoArea(long a, long c) {

        // Lado c va a ser una unidad mayor del lado a
        // c = a + 1
        if (c == a + 1) {

            //Se halla el area del triangulo utilizando la fórmula de Herón debido a que
            // conocemos las longitudes de sus tres lados a, b y c:
            long semiperímetro1 = (3 * a + 1) * (a - 1);
            if ((long) Math.sqrt(semiperímetro1) * (long) Math.sqrt(semiperímetro1) != semiperímetro1)
                return false;
            long semiperímetro2 = (long) ((a + 1) * Math.sqrt(semiperímetro1));
            if (semiperímetro2 % 4 != 0)
                return false;
            else {
                return true;
            }
        }

        // Lado c va a ser una unidad menor del lado a
        // c = a - 1
        if (c == a - 1) {

            //Se halla el area del triangulo utilizando la fórmula de Herón debido a que
            // conocemos las longitudes de sus tres lados a, b y c:
            long semiperímetro1 = (3 * a - 1) * (a + 1);
            if ((long) Math.sqrt(semiperímetro1) * (long) Math.sqrt(semiperímetro1) != semiperímetro1)
                return false;
            long semiperímetro2 = (long) ((a - 1) * Math.sqrt(semiperímetro1));
            if (semiperímetro2 % 4 != 0)
                return false;
            else {
                return true;
            }
        }
        return true;
    }

    /**
     * Método para mostar los resultados obtenidos despues de la evaluacion de sus lados
     */
    private static void resultado() {
        System.out.println("Lado1: " + Lado1);
        System.out.println("Lado2: " + Lado2);
        System.out.println(Lado1 + Lado2);
    }

}
