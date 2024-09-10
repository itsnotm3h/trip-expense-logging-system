public class PersonalExpenses extends Expenses {
    protected String method;

    public PersonalExpenses() {
        super();
        method = "Cash";
    }

    public PersonalExpenses(String payerName, String expenseName, double cost, String method) {
        super(payerName, expenseName, cost);
        this.dates = setDate();
        this.method = method;
    }

    public String getMore() {
        return " | Payment By:"+ method;
    }

//    public void setPaymentMethod(String paymentMethod) {
//        this.method = paymentMethod;
//    }
}
