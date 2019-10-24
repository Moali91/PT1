package carrental;

public class Vehicle extends Garage {
    private String color;

    public Vehicle(String color){
        this.color = color;
    }


    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return "This vehicle is "+this.color;
    }
}
