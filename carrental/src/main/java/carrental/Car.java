package carrental;


public class Car extends Vehicle {
    private boolean winterTires = false;

    public Car(String color) {
        super(color);
    }
    public Car(String color, boolean winterTires) {
        super(color);
        this.winterTires = winterTires;
    }


    @Override
    public String toString() {
        return super.toString()+", has WinterTires: "+this.winterTires;
    }
}
