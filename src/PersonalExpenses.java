public class PersonalExpenses extends Expenses {
protected String gift;
    public PersonalExpenses() {
        super();
        gift = "Myself";
    }

    public PersonalExpenses(String expenseName, double cost,String gift) {
        super(expenseName, cost);
        this.dates = setDate();
        this.gift = gift;
    }

    public String printEdit(){
        return "Gift";
    }


    public String getMore() {
        return " | Gift For:"+ gift;
    }


    public void updateInfo(String changeType) {
           this.gift = changeType;
    }



}
