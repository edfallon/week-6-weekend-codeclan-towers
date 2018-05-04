package rooms;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    QUEEN(2),
    KING(2);

    private int capacity;

    RoomType(int capacity) {
       this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}

