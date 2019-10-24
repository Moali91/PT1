package carrental;


public class Garage {
    private Vehicle vehicle;


    public Garage setVehicle(Vehicle parked){
        this.vehicle = parked;
        return parked;
    }

    @Override
    public String toString() {
        return "Description of the parked vehicle: "+this.vehicle;
    }
}
