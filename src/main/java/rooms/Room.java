package rooms;

import guests.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guestList;

    public Room(int capacity){
        this.capacity = capacity;
        this.guestList = new ArrayList<>();
    }

    public int guestListCount(){
        return this.guestList.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void checkInGuest(Guest guest) {
        this.guestList.add(guest);
    }

    public void checkOutGuest(Guest guest) {
        this.guestList.remove(guest);
    }


    public Guest showAllGuests() {
        for (Guest guest : this.guestList) {
            return guest;
        }
        return null;
    }
}
