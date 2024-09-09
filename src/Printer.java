import java.util.ArrayList;

public class Printer extends Expenses {
    //this is static void as it is printed in the main function();
    static void printAll(ArrayList<Expenses> expenseList){
        int count = 0;
        for(Expenses item : expenseList){
            count++;
//            System.out.println(item.getDate());
            System.out.print(count + ". ");
            System.out.print(item.expenseName);
//            System.out.print("Date:" + item.getDate());
            System.out.print(" | Cost:" + item.cost);
            System.out.print(" | Paid By:" + item.PayerName);
            System.out.print(" | Sharing:" + item.sharing);
            System.out.println();
        }

    }

    //this is static void as it is printed in the main function();
    static void printAll(int status){
        if(status==0)
        {
            System.out.println("------- Trip Expense Calculator -------");
            System.out.println("Please choose an option below to start:");
            System.out.println("1. Add a new expense");
            System.out.println("2. Edit any expenditure");
            System.out.println("3. Delete entry of expenditure.");
            System.out.println("4. Print out Summary.");
            System.out.println("5. Quit");
            System.out.println();

        }
        if(status == 1)
        {

            System.out.println();
            System.out.println("---- Add Expenses ----");
        }

        if(status==5)
        {
            System.out.println();
            System.out.println("Thank you for using. See you again soon.");
        }


    }

}

