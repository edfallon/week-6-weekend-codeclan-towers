import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Guest guest1;

    @Before
    public void before(){
       bedroom1 = new Bedroom(RoomType.SINGLE, 1, 25);
       guest1 = new Guest();
    }

    @Test
    public void getRoomNumber(){
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void getRoomType(){
        assertEquals(RoomType.SINGLE, bedroom1.getRoomType());
    }

    @Test
    public void getRate() {
        assertEquals(25, bedroom1.getRate(), 0.01);
    }

    @Test
    public void canCheckInGuest(){
        bedroom1.checkInGuest(guest1);
        assertEquals(1, bedroom1.guestListCount());
    }

    @Test
    public void canCheckOutGuest(){
        bedroom1.checkInGuest(guest1);
        bedroom1. checkOutGuest(guest1);
        assertEquals(0, bedroom1.guestListCount());
    }
}
