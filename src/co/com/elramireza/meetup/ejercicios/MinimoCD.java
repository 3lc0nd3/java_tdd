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
public class MinimoCD {

    public static int mcd(int a, int b){
        if (b == 0){
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public static int mcm(int a, int b){
        return a * b / mcd(a, b);
    }
}
