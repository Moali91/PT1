package patient;


public class Patient{
    String name;
    Checkup checkup;

    public Patient(String name){
        this.name = name;

    }


    public void addCheckup(int height, double weight, double temp, boolean vaccs){
        checkup = new Checkup(height,weight,temp,vaccs);
    }

    public String toString(){
        String output = "Name: "+name+",Height: "+checkup.getHeight()+",Weight: "+checkup.getWeight()+",Temperature: "
                +checkup.getTemperature();

        return output;
    }



        }
