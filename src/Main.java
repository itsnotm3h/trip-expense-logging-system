import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Expenses> expenseList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //Generate default line for testing.
        expenseList.add(new Expenses());

        while(true){
            int status = 0;

            Printer.printAll(status);
            System.out.print("Enter the your option: ");
            status = sc.nextInt();

            if(status == 1 )
            {
                Printer.printAll(status);
                sc.nextLine();
                System.out.print("Enter the payer's name: ");
                String payerName = sc.nextLine();
                System.out.print("The item: ");
                String itemName = sc.nextLine();
                System.out.print("The cost: ");
                double itemCost = sc.nextDouble();
                sc.nextLine();
                System.out.print("Sharing (Y/N): ");
                String sharing = sc.nextLine();
                expenseList.add(new Expenses(payerName,itemName,itemCost,sharing));
            }

            if(status == 2 )
            {
                Printer.printAll(expenseList);
                System.out.print("Enter the index of the item you want to edit. ");
                int option = sc.nextInt();
                Expenses selectedItem = expenseList.get(option-1);
//                System.out.print("Enter index to change (1.Item name, 2.Cost, 3.Paid by, 4.Sharing): ");
//                option = sc.nextInt();
//                System.out.print("Enter the changes: ");
//                String changeType = sc.nextLine();
                selectedItem.setCost(2.3);



            }

            if(status == 4 )
            {
                Printer.printAll(expenseList);
            }

                while(status!=5)
                {
                    sc.nextLine();
                    System.out.print("Would you like to perform other task (Y - Yes / N - No ): ");
                    String checkStatus = sc.nextLine();

                    if(checkStatus.equals("Yes")){
                        status = 0;
                        break;
                    }
                    else if(checkStatus.equals("No")){
                        status = 5;
                        break;
                    }
            }
            if(status == 5)
            {
                Printer.printAll(status);
                break;
            }


        }


    }

    //This is a method to print. //Thinking about creating a specific print class.

    }