import java.util.ArrayList;

public class Printer {
    //this is static void as it is printed in the main function();
    static void printAll(ArrayList<Expenses> expenseList) {
        int count = 0;
        String compareDate = "";
        for (Expenses item : expenseList) {
            count++;
            if (!compareDate.equals(item.getDate())) {
                System.out.println(item.getDate());
            }
            System.out.print(count + ". ");
            System.out.print("Item: " + item.expenseName);
            System.out.print(" | Cost: $" + item.cost);
            System.out.print(item.getMore());
            System.out.println();
            compareDate = item.getDate();
        }
    }
//
//
    static void printAll(Expenses selectedItem){
        System.out.print("Item: " + selectedItem.expenseName);
        System.out.print(" | Cost: $" + selectedItem.cost);
        System.out.print(selectedItem.getMore());
        System.out.println();
    }

        //this is static void as it is printed in the main function();
        static void printAll ( int status){
            if (status == 0) {
                System.out.println("------- Trip Expense Calculator -------");
                System.out.println("Please choose an option below to start:");
                System.out.println("1. Add an expense");
                System.out.println("2. Edit entry");
                System.out.println("3. Delete entry");
                System.out.println("4. Print out Summary.");
                System.out.println("5. Quit");
                System.out.println();

            }
            if (status == 1) {

                System.out.println();
                System.out.println("---- Add an expense ----");
            }

            if (status == 2) {

                System.out.println();
                System.out.println("---- Edit Expenses ----");
            }

            if (status == 3) {

                System.out.println();
                System.out.println("---- Delete Expense ----");
            }
            if (status == 4) {

                System.out.println();
                System.out.println("---- Expense Summary ----");
            }


            if (status == 5) {
                System.out.println();
                System.out.println("Thank you for using. See you again soon.");
            }


        }

    }
