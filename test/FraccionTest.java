import co.com.elramireza.meetup.ejercicios.Fraccion;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created with Edward L. Ramirez A.
 * cel 300 554 3367
 * email elramireza@gmail.com
 * User: usuariox
 * Date: 14/05/16
 * Time: 03:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class FraccionTest {

    @Test(expected = IllegalArgumentException.class)
    public void crearUnaFraccionConDenominadorCeroLanzaUnaException(){
        new Fraccion(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void crearUnaFraccionConDenominadorNegativoLanzaUnaException(){
        new Fraccion(1, -2);
    }

    @Test
    public void unMedioMasUnMedioEsUno() {
        Fraccion unMedio = new Fraccion(1, 2);
        assertThat(unMedio.sumar(unMedio), is(new Fraccion(1, 1)));
    }

    @Test
    public void unTercioMasUnTercioEsDosTericos() {
        Fraccion unTercio = new Fraccion(1, 3);
        assertThat(unTercio.sumar(unTercio), is(new Fraccion(2, 3)));
    }

    @Test
    public void dosCuartosEsUnMedio(){
        assertThat(new Fraccion(2, 4), is(new Fraccion(1, 2)));
    }
}
