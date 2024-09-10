import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Expenses {
    protected String dates;
    protected String expenseName;
    protected String PayerName;
    protected double cost;


    public abstract String getMore();

    //This is the constructor;
    public Expenses() {

        this.expenseName = "N/A";
        this.dates = setDate();
        this.PayerName = "Me";

        //Improvement needed.
        this.cost = 0;
    }

    //This is an overloading;
    public Expenses(String payerName,String expenseName, double cost) {
        this.expenseName = expenseName;
        this.cost = cost;
        this.PayerName = payerName; // Default payer name
        this.dates = setDate(); // Initialize date
    }

    public static void updateEntry(Expenses expense, int option, String changeType){
        if(option == 1)
        {
            expense.setExpenseName(changeType);
        }
        if(option == 2)
        {
            expense.setCost(Double.parseDouble(changeType));
        }
        if(option == 3)
        {
            expense.setPayerName(changeType);
        }
        if(option == 4)
        {
            expense.setPayerName(changeType);
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

    //Getter & Setter for PayerName
    public void setPayerName(String name){
        this.PayerName = name;
    }

    public String getPayerName(){
        return this.PayerName;
    }


    //Getter & Setter for Cost
    public void setCost(double cost){
        this.cost = cost;
    }

    public double getCost(){
        return this.cost;
    }

}
