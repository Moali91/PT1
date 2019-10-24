package carrental;


public class CarRental extends CarRentalContract {
    private int size;
    private CarRentalContract [] carRentalContracts = new CarRentalContract[size];




    public void addContract(CarRentalContract contract){
        size++;
        CarRentalContract[] temp = new CarRentalContract[size];

        for(int i = 0; i<carRentalContracts.length;i++){
            if(carRentalContracts[i]!=null){
                temp[i] = carRentalContracts[i];
            }
        }
        carRentalContracts = temp;
        for(int j = 0; j< carRentalContracts.length; j++){
            if(carRentalContracts[j]==null){
                carRentalContracts[j] = contract;
            }
        }
    }

    public String displayContracts() {
        String output = "";
        for(int i = 0; i<carRentalContracts.length; i++) {
            output+= carRentalContracts[i].toString()+"\n";
        }
        return output;
}


}

//    public void addContract(CarRentalContract contract){
//
//        for(int i = 0; i<carRentalContracts.length;i++){
//            if(carRentalContracts[i]==null){
//                continue;
//            }
//        }
//        for(int j = 0; j< carRentalContracts.length; j++){
//            if(carRentalContracts[j]==null){
//                carRentalContracts[j] = contract;
//            }
//        }
//        int newSize = carRentalContracts.length+1;
//        CarRentalContract[] temp = new CarRentalContract[newSize];
//        System.arraycopy(carRentalContracts,0,temp,0,carRentalContracts.length);
//        temp[newSize-1] = contract;
//    }