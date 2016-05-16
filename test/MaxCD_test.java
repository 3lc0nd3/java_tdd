import co.com.elramireza.meetup.ejercicios.MaximoCD;
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
public class MaxCD_test {
    @Test
    public void maximoCDde8y12es4(){
        assertThat(MaximoCD.mcd(12, 8), is(4));
    }

    @Test
    public void maximoCDDe25y30es5(){
        assertThat(MaximoCD.mcd(25, 30), is(5));
    }

    @Test
    public void minimocmDe25y30es5(){
        assertThat(MaximoCD.mcd(25, 30), is(5));
    }
}
