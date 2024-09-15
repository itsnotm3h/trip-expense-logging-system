import java.util.Scanner;

public class PersonalExpenses extends Expenses {
protected String gift;

    public PersonalExpenses() {
        super();
        gift = "Unknown";
    }

    public PersonalExpenses(String expenseName, double cost,String gift) {
        super(expenseName, cost);
        this.dates = setDate();
        this.gift = gift;
    }

    @Override
    public String printEdit(){
        return "Gift";
    }

    @Override
    public String getMore() {
        return " | Gift For: "+ gift;
    }

    @Override
    public void updateInfo() {
        System.out.println("Current Gift for: "+ this.gift);
        System.out.print("New Gift for: ");
        Scanner sc = new Scanner(System.in);
        String newGift = sc.nextLine();
        Main.validateText(newGift);
        this.gift = newGift;

    }



}
