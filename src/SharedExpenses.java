public class SharedExpenses extends Expenses {
    protected String Sharing;

    public SharedExpenses() {
        super();
        Sharing = "Anqi";
    }

    public SharedExpenses(String payerName, String expenseName, double cost, String Sharing) {
        super(payerName, expenseName, cost);
        this.dates = setDate();
        this.Sharing = Sharing;
    }

    public String getMore() {
        return " | Sharing With:"+ Sharing;
    }
}
