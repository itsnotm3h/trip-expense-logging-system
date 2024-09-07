import java.util.ArrayList;

public class Printer {

    //this is static void as it is printed in the main function();
    static void printAll(ArrayList<Expenses> expenseList){
        int count = 0;
        for(Expenses item : expenseList){
            count++;
            System.out.println(item.getDate());
            System.out.print(count + ". ");
            System.out.print(item.getExpenseName()+"\n");
            System.out.println("Date:" + item.getDate());
            System.out.println("Cost:" + item.getCost());
            System.out.println("Paid By:" + item.getPayerName());
            System.out.println("Sharing:" + item.getSharing());
        }
    }
}

