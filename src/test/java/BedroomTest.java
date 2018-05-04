import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;

    @Before
    public void before(){
       bedroom1 = new Bedroom(RoomType.SINGLE, 1, 25);
    }

    @Test
    public void getRoomNumber(){
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void getRoomtype(){
        assertEquals(RoomType.SINGLE, bedroom1.getRoomType());
    }

    @Test
    public void getRate() {
        assertEquals(25, bedroom1.getRate(), 0.01);
    }
}
