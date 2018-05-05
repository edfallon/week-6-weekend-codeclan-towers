package hotels;

import guests.Guest;
import rooms.Bedroom;

import java.util.ArrayList;

public class Hotel {

    protected ArrayList<Bedroom> bedroomArray;

    public Hotel() {
        this.bedroomArray = new ArrayList<>();
    }


    public int bedroomCount() {
        return bedroomArray.size();
    }
}
