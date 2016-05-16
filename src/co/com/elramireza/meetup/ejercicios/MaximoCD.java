package co.com.elramireza.meetup.ejercicios;

/**
 * Created with Edward L. Ramirez A.
 * cel 300 554 3367
 * email elramireza@gmail.com
 * User: usuariox
 * Date: 14/05/16
 * Time: 03:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaximoCD {

    /**
     * Maximo comun divisor
     * @param a
     * @param b
     * @return
     */
    public static int maximoCD(int a, int b){
        if (b == 0){
            return a;
        } else {
            return maximoCD(b, a % b);
        }
    }

    /**
     * minimo comun multiplo
     * @param a
     * @param b
     * @return
     */
    public static int minimoCM(int a, int b){
        return a * b / maximoCD(a, b);
    }
}
