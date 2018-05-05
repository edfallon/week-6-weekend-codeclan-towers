package hotels;

import guests.Guest;
import rooms.Bedroom;
import rooms.Conference;
import rooms.Dining;
import rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomArray;
    private ArrayList<Conference> conferenceArray;
    private ArrayList<Dining> diningArray;

    public Hotel() {
        this.bedroomArray = new ArrayList<>();
        this.conferenceArray = new ArrayList<>();
        this.diningArray = new ArrayList<>();
    }


    public int bedroomCount() {
        return bedroomArray.size();
    }

    public int conferenceCount() {
        return conferenceArray.size();
    }

    public int diningCount() {
        return diningArray.size();
    }

    public void addDiningRoom(Dining dining) {
        this.diningArray.add(dining);
    }

    public void addConferenceRoom(Conference conference) {
        this.conferenceArray.add(conference);
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedroomArray.add(bedroom);
    }

    public void checkGuestIntoRoom(Room room, Guest guest) {
        room.checkInGuest(guest);

    }

    public void checkGuestOutOfRoom(Room room, Guest guest) {
        room.checkOutGuest(guest);
    }
}
