package co.com.elramireza.meetup.ejercicios;

/**
 * Created with Edward L. Ramirez A.
 * cel 300 554 3367
 * email elramireza@gmail.com
 * User: usuariox
 * Date: 14/05/16
 * Time: 03:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Util {

    public static void main(String[] args) {
        int a = 25;
        int b = 5;
        System.out.println("( "+a+" % "+b+" ) = " + (a % b));

        System.out.println("MinimoCD.maximoCD( "+a+","+b+" ) = " + MaximoCD.maximoCD(a, b));

        Fraccion unTercio = new Fraccion(1, 3);
        System.out.println("unTercio.sumar(unTercio) = " + unTercio.sumar(unTercio));

    }
}
