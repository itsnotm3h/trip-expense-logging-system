import java.util.ArrayList;
import java.util.Scanner;

public class SharedExpenses extends Expenses {
//    protected String Sharing;
// Changes sharing into arrayList and arrayList.
protected ArrayList<String> Sharing;
protected ArrayList<SharedExpenses> allNames;


    public SharedExpenses() {
        super();
        Sharing = new ArrayList<>();
        Sharing.add("Unknown");
        Sharing.add("Unknown");

    }

    public SharedExpenses(String expenseName, double cost, String Sharing) {
        super(expenseName,cost);
        this.Sharing = new ArrayList<>();
        this.Sharing.add(Sharing);
    }

//    public void setSharing(String Sharing){
//        this.Sharing = Sharing;
//    }

//    public ArrayList<String> getItems() {
//        return items;
//    }
public String printEdit(){
    return "Sharing";
}


    public String getMore() {
        return " | Sharing with:"+ Sharing;
    }


    // 1. Detect who we wanna change.
    // 2. Print out who is available for the change
    // 3. Select option to change. Edit / Delete
    // 4. Select who to remove or changes.
    // 5. Type in new entry to change
    // 6. update the change.
    public void updateInfo(String changeType) {
        System.out.println("Please Select from the following:");
        int count=0;

        for(String sharingNames : this.Sharing)
        {count++;
          System.out.println(count+"-"+sharingNames);
        }

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        this.Sharing.set(option-1, changeType);

//        Sharing.set(0, changeType);
    }

}
