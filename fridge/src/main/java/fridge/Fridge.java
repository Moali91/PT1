package fridge;


public class Fridge{
    int drinksNum ;
    double milk;

    public Fridge(int drinksNum, double milk){
        this.drinksNum = drinksNum;
        this.milk = milk;


    }


    public int getNumberOfDrinks(){
        return drinksNum;
    }

    public double getLitersOfMilk(){
        return milk;
    }

    public String takeADrink(){
        String output = "Not enough drinks!";
        if(drinksNum>=1){
            drinksNum--;
            output ="Here is your drink.";
        }
        return output;
    }

    public String takeMilk(Double litersOfMilk){
        String output ="Not enough milk!";
        if(milk > litersOfMilk){
            output = "Here is your milk.";
        }
        return output;
    }

    public void fillMilk(double litersOfMilk){
        milk += litersOfMilk;
    }

    public void fillDrinks(int number){
        drinksNum += number;
    }


}
