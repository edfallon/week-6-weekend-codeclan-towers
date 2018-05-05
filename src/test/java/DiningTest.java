import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Dining;

import static org.junit.Assert.assertEquals;

public class DiningTest {

    Dining dining1;
    Guest guest1;

    @Before
    public void before(){
        dining1 = new Dining(100, "Rubys");
        guest1 = new Guest();
    }

    @Test
    public void canGetCapacity() {
        assertEquals(100, dining1.getCapacity());
    }

    @Test
    public void canGetName() {
        assertEquals("Rubys", dining1.getName());
    }

    @Test
    public void canCheckInGuest(){
        dining1.checkInGuest(guest1);
        assertEquals(1, dining1.guestListCount());
    }
}
