package carrental;

public class CarRentalContract {
    Customer customer;
    Vehicle vehicle;


    public CarRentalContract(Customer customer, Vehicle vehicle){
        this.customer = customer;
        this.vehicle = vehicle;
    }
    public CarRentalContract(){


    }

    @Override
    public String toString() {
        return customer.getName()+":"+this.vehicle;
    }
}
