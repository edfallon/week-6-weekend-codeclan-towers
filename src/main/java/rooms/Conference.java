package rooms;

public class Conference extends Room {
    
    private double rate;
    
    public Conference(int capacity, double rate){
        super(capacity);
        this.rate = rate;
    }


    public double getRate() {
        return rate;
    }
}
