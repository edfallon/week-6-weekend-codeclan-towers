import org.junit.Before;
import org.junit.Test;
import rooms.Conference;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    Conference conference1;

    @Before
    public void before(){
        conference1 = new Conference(100, 200);
    }

    @Test
    public void getCapacity(){
        assertEquals(100, conference1.getCapacity());
    }

    @Test
    public void canGetRate() {
        assertEquals(200, conference1.getRate(), 0.01);
    }
}
