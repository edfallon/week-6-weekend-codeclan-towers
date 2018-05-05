package hotels;

import guests.Guest;
import rooms.Bedroom;
import rooms.Conference;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomArray;
    private ArrayList<Conference> conferenceArray;

    public Hotel() {
        this.bedroomArray = new ArrayList<>();
        this.conferenceArray = new ArrayList<>();
    }


    public int bedroomCount() {
        return bedroomArray.size();
    }

    public int conferenceCount() {
        return conferenceArray.size();
    }
}
