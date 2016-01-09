package kernel;

/**
 * Created by Gdaimon on 6/01/2016.
 * Problem No. 20
 * 2520 is the smallest number that can be divided by each of the numbers
 * from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all
 * of the numbers from 1 to 20?
 */
public class divisible {

    public static void main(String[] args) {
        System.out.println(numDivisible(20));}

    /**
     * Método que encuentra el numero mas pequeño que es divisible por los numeros 1 al 20 sin residuo
     *
     * @param num - Valor numero entero
     * @return - numero entero
     */
    public static int numDivisible(int num) {

        //Creacion Variables e Inicialización
        Integer numeroP = 0;
        boolean valida = false;

         while (!valida) {

            numeroP++;

            for (int k = num; k > 0; k--) {
                if (numeroP % k == 0) {
                    valida = true;
                } else {
                    valida = false;
                    break;
                }
            }
        }
        return numeroP;
    }
}
