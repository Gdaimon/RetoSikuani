package kernel;

import java.math.BigInteger;

/**
 * Created by Gdaimon on 5/01/2016.
 * Problem No. 20
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 */
public class Factorial {


    private static Integer sumaTot;
    private static BigInteger factorial;

    public static void main(String[] args) {
       System.out.println(SumaTotal(factorial(100)));
       // System.out.println(factorial(100));
    }

    /**
     * Metodo que nos retorna el factorial de un numero
     *
     * @param num - Valor numero entero
     * @return - numero entero
     */
    public static BigInteger factorial(Integer num) {
        
        //Inicialización Variables
        factorial = BigInteger.ONE;

        for (Integer i = num; i >= 1; i--) {
            factorial = factorial.multiply (BigInteger.valueOf(i));
        }
        return factorial;
    }

    /**
     * Método que suma los digitos de un número
     *
     * @param num - Valor numero entero
     * @return - numero entero
     */
    public static Integer SumaTotal(BigInteger num) {

        //Creacion Variables e Inicialización
        String digito = num.toString();
        sumaTot = 0;

        for (int i = 0; i < digito.length(); i++) {
            sumaTot += Integer.parseInt("" + digito.charAt(i));
        }

        return sumaTot;
    }

}
