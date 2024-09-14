import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Expenses {
    protected String dates;
    protected String expenseName;
    protected double cost;

    public abstract String getMore();
    public abstract void updateInfo(String changeType);


    //This is the constructor;
    public Expenses() {

        this.expenseName = "N/A";
        this.dates = setDate();

        //Improvement needed.
        this.cost = 0;
    }

    //This is an overloading;
    public Expenses(String expenseName, double cost) {
        this.expenseName = expenseName;
        this.cost = cost;
        this.dates = setDate(); // Initialize date
    }

    public static void updateEntry(Expenses selectedItem, int option, String changeType){
        if(option == 1)
        {
            selectedItem.setExpenseName(changeType);
        }
        if(option == 2)
        {
            selectedItem.setCost(Double.parseDouble(changeType));
        }
        if(option == 3)
        {
            selectedItem.updateInfo(changeType);
        }
    }




    //Getter & Setter for names
    public String getExpenseName(){
        return this.expenseName;
    }

    public void setExpenseName(String name){
        this.expenseName = name;
    }

    public String setDate(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return dateTime.format(formatter);
    }



    //Getter & Setter for dates
    public String getDate(){
        return this.dates;
    }


    //Getter & Setter for Cost
    public void setCost(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return this.cost;
    }

}
