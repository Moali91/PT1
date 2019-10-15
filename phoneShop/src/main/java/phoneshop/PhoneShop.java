package phoneshop;

public class PhoneShop{
    private String owner;
    private int phoneStock;
    private int phoneCaseStock;

    public PhoneShop(String owner){
        this.owner = owner;

    }

    public String getOwner(){
        return this.owner;
    }

    public int getPhoneStock(){
        return this.phoneStock;
    }

    public int getPhonecaseStock(){
        return this.phoneCaseStock;
    }



    public void fillStockCases(int number){
        this.phoneCaseStock += number;

    }

    public void fillStockPhones(int number){
        this.phoneStock += number;

    }

    public String phoneSold(){
        if(this.phoneStock > 0){
            this.phoneStock--;
            return "OK";
        }
        return "NOK";
    }

    public String caseSold(){
        if(this.phoneCaseStock>0){
            this.phoneCaseStock--;
            return "OK";
        }
        return "NOK";
    }





        }
