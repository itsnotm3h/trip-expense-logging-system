import java.util.ArrayList;
import java.util.Scanner;

public class SharedExpenses extends Expenses {
protected ArrayList<String> Sharing;
//protected ArrayList<SharedExpenses> allNames;


    public SharedExpenses() {
        super();
        Sharing = new ArrayList<>();
        Sharing.add("Unknown");
    }

    public SharedExpenses(String expenseName, double cost, String Sharing) {
        super(expenseName,cost);

        this.dates = setDate();
        this.Sharing = new ArrayList<>();
        String[] namesList = Sharing.split(",");

        for(String names : namesList) {
            this.Sharing.add(names);
        }

    }

    public ArrayList<String> getSharing() {
        return Sharing;
    }

    @Override
    public String printEdit(){
    return "Sharing";
    }


    @Override
    public String getMore() {
        return " | Sharing with: "+ Sharing;
    }


    // 1. Detect who we wanna change.
    // 2. Print out who is available for the change
    // 3. Select option to change. Edit / Delete
    // 4. Select who to remove or changes.
    // 5. Type in new entry to change
    // 6. update the change.
    @Override
    public void updateInfo() {

        System.out.println("\nCurrent sharing list: ");
        int count=0;

        for(String sharingNames : this.Sharing)
        {count++;
          System.out.println(count+"-"+sharingNames);
        }

        int lastOption = count +1;
        System.out.println((count+1) + "-Add new name\n");
        System.out.print("Enter option to edit or add a new name: ");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine();
        Main.validateOption(option,lastOption);


        if(option < this.Sharing.size())
        {
            System.out.println("Current name: " + this.Sharing.get(option-1));
        }

        System.out.print("Please enter the new name: ");
        String newInfo = sc.nextLine();
        Main.validateText(newInfo);

        if(option == this.Sharing.size() + 1)
        {
            this.Sharing.add(newInfo);

        }
        else{
            this.Sharing.set(option-1,newInfo);
        }

//        Sharing.set(0, changeType);
    }

}
