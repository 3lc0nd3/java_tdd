import co.com.elramireza.meetup.ejercicios.MinimoCD;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created with Edward L. Ramirez A.
 * cel 300 554 3367
 * email elramireza@gmail.com
 * User: usuariox
 * Date: 14/05/16
 * Time: 05:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class mdc_test {
    @Test
    public void mcdde8y12es4(){
        assertThat(MinimoCD.mcd(12, 8), is(4));
    }
}
