package carrental;

public class Truck extends Vehicle {
    boolean hasTrailer = false;

    public Truck(String color) {
        super(color);
    }
    public Truck(String color, boolean hasTrailer) {
        super(color);
        this.hasTrailer = hasTrailer;
    }


    @Override
    public String toString() {
        return super.toString()+", has Trailer: "+this.hasTrailer;
    }
}
