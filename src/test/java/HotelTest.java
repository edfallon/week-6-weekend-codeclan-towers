import guests.Guest;
import hotels.Hotel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel1;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        hotel1 = new Hotel();
        guest1 = new Guest();
        guest2 = new Guest();

    }

    @Test
    public void bedroomArrayStartsEmpty(){
        assertEquals(0, hotel1.bedroomCount());
    }
}
