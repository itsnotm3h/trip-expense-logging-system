public class SharedExpenses extends Expenses {
    protected String Sharing;
// Changes sharing into arrayList and arrayList.
    public SharedExpenses() {
        super();
        Sharing = "Unknown";
    }

    public SharedExpenses(String expenseName, double cost, String Sharing) {
        super(expenseName,cost);
        this.dates = setDate();
        this.Sharing = Sharing;
    }

    public void setSharing(String Sharing){
        this.Sharing = Sharing;
    }

    public String getMore() {
        return " | Sharing with:"+ Sharing;
    }

    //Remove this.
    public void updateInfo(String changeType) {
        this.Sharing = changeType;
    }

}
