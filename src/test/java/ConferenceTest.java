import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Conference;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    Conference conference1;
    Guest  guest1;

    @Before
    public void before(){
        conference1 = new Conference(100, 200);
        guest1 = new Guest();
    }

    @Test
    public void getCapacity(){
        assertEquals(100, conference1.getCapacity());
    }

    @Test
    public void canGetRate() {
        assertEquals(200, conference1.getRate(), 0.01);
    }

    @Test
    public void canCheckInGuest(){
        conference1.checkInGuest(guest1);
        assertEquals(1, conference1.guestListCount());
    }
}
