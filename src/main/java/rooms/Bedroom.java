package rooms;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private double rate;

    public Bedroom(RoomType roomType, int roomNumber, double rate){
       super(roomType.getCapacity());
       this.roomType = roomType;
       this.roomNumber = roomNumber;
       this.rate = rate;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getRate() {
        return rate;
    }
}
