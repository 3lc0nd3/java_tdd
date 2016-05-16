package co.com.elramireza.meetup.ejercicios;

/**
 * Created with Edward L. Ramirez A.
 * cel 300 554 3367
 * email elramireza@gmail.com
 * User: usuariox
 * Date: 14/05/16
 * Time: 03:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Fraccion {

    private final int numerador;
    private final int denominador;

    public Fraccion(int numerador, int denominador) {
        // SI DENOMINADOR == 0 FALLA
        if(denominador == 0){
            throw new IllegalArgumentException("Div by CERO");
        }
        // SI DENOMINADOR NEGATIVO FALLA
        if(denominador < 0){
            throw new IllegalArgumentException("Negativo");
        }
        int mcd = MaximoCD.maximoCD(numerador, denominador);
        this.numerador = numerador / mcd;
        this.denominador = denominador / mcd;
    }

    @Override
    public boolean equals(Object o) {
        Fraccion fraccion = (Fraccion) o;
        return numerador == fraccion.numerador && denominador == fraccion.denominador;

    }

    @Override
    public int hashCode() {
        int result = numerador;
        result = 31 * result + denominador;
        return result;
    }

    @Override
    public String toString() {
        return numerador +
                "/" + denominador;
    }

    public Fraccion sumar(Fraccion fraccion2Sumando) {
        int minimoCM = MaximoCD.minimoCM(denominador, fraccion2Sumando.denominador);
        ;
        return new Fraccion(
                ((minimoCM/denominador)*numerador) +
                        ((minimoCM/fraccion2Sumando.denominador)*fraccion2Sumando.numerador)
                ,
                minimoCM
                );
    }
}
