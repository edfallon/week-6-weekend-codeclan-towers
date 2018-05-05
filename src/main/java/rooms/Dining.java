package rooms;

public class Dining extends Room {

    private String name;

    public Dining(int capacity, String name){
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
