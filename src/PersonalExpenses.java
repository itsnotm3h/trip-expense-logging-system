import java.util.Scanner;

public class PersonalExpenses extends Expenses {
protected String purpose;

    public PersonalExpenses() {
        super();
        purpose = "Unknown";
    }

    public PersonalExpenses(String expenseName, double cost,String purpose) {
        super(expenseName, cost);
        this.dates = setDate();
        this.purpose = purpose;
    }

    @Override
    public String printEdit(){
        return "Purpose";
    }

    @Override
    public String getMore() {
        return " | Purpose: "+ purpose;
    }

    @Override
    public void updateInfo() {
        System.out.println("Current purpose: "+ this.purpose);
        System.out.print("New purpose: ");
        Scanner sc = new Scanner(System.in);
        String newPurpose = sc.nextLine();
        Main.validateText(newPurpose);
        this.purpose = newPurpose;

    }



}
