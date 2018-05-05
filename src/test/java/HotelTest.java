import guests.Guest;
import hotels.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.Conference;
import rooms.Dining;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel1;
    Guest guest1;
    Guest guest2;
    Dining dining1;
    Conference conference1;
    Bedroom bedroom1;

    @Before
    public void before(){
        hotel1 = new Hotel();
        guest1 = new Guest();
        guest2 = new Guest();
        dining1 = new Dining(100, "Rubys");
        conference1 = new Conference(200, 300);
        bedroom1 = new Bedroom(RoomType.SINGLE, 1, 25);

    }

    @Test
    public void bedroomArrayStartsEmpty(){
        assertEquals(0, hotel1.bedroomCount());
    }

    @Test
    public void conferenceArrayStartsEmpty(){
        assertEquals(0, hotel1.conferenceCount());
    }

    @Test
    public void diningArrayStartsEmpty(){
        assertEquals(0, hotel1.diningCount());
    }

    @Test
    public void canAddDiningRoomToHotel(){
        hotel1.addDiningRoom(dining1);
        assertEquals(1, hotel1.diningCount());

    }

    @Test
    public void canAddConferenceRoomToHotel(){
        hotel1.addConferenceRoom(conference1);
        assertEquals(1, hotel1.conferenceCount());
    }

    @Test
    public void canAddBedroomToHotel(){
        hotel1.addBedroom(bedroom1);
        assertEquals(1, hotel1.bedroomCount());
    }

    @Test
    public void canCheckGuestIntoDiningRoom(){
        hotel1.addDiningRoom(dining1);
        hotel1.checkGuestIntoRoom(dining1, guest1);
        assertEquals(1, dining1.guestListCount());
    }

    @Test
    public void canCheckGuestOutOfDiningRoom(){
        hotel1.addDiningRoom(dining1);
        hotel1.checkGuestIntoRoom(dining1, guest1);
        hotel1.checkGuestOutOfRoom(dining1, guest1);
        assertEquals(0, dining1.guestListCount());
    }

    @Test
    public void canCheckGuestIntoConferenceRoom(){
        hotel1.addConferenceRoom(conference1);
        hotel1.checkGuestIntoRoom(conference1, guest1);
        assertEquals(1, conference1.guestListCount());
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom(){
        hotel1.addConferenceRoom(conference1);
        hotel1.checkGuestIntoRoom(conference1, guest1);
        hotel1.checkGuestOutOfRoom(conference1, guest1);
        assertEquals(0, conference1.guestListCount());
    }

    @Test
    public void canCheckGuestIntoBedroom(){
        hotel1.addBedroom(bedroom1);
        hotel1.checkGuestIntoRoom(bedroom1, guest1);
        assertEquals(1, bedroom1.guestListCount());
    }

    @Test
    public void canCheckGuestOutOfBedroom(){
        hotel1.addBedroom(bedroom1);
        hotel1.checkGuestIntoRoom(bedroom1, guest1);
        hotel1.checkGuestOutOfRoom(bedroom1, guest1);
        assertEquals(0, bedroom1.guestListCount());
    }
}
