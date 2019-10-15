package patient;

import javax.print.DocFlavor;

public class Checkup {
    int height;
    double weight;
    double temperature;
    boolean vaccsOk;



    public Checkup(int height, double weight, double temperature, boolean vaccsOk){
        this.height = height;
        this.weight = weight;
        this.temperature = temperature;
        this.vaccsOk = vaccsOk;

    }

    public int getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public double getTemperature(){
        return temperature;
    }

    public boolean getVaccsOk(){
        return vaccsOk;
    }

}
