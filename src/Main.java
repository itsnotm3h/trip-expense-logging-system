import java.util.ArrayList;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                ArrayList<Expenses> expenseList = new ArrayList<>();
                Scanner sc = new Scanner(System.in);

                //Generate default line for testing.
//                expenseList.add(new Expenses());
                expenseList.add(new PersonalExpenses());
                expenseList.add(new SharedExpenses());
//                Printer.printAll(expenseList);

                while(true){
                    int status = 0;

                    Printer.printAll(status);
                    System.out.print("Enter the your option: ");
                    status = sc.nextInt();
                    Printer.printAll(status);


                    if(status == 1)
                    {
                        sc.nextLine();
                        System.out.print("Enter Expense Type, 1-Personal, 2-Shared: ");
                        int expenseType = sc.nextInt();
                        sc.nextLine();
                        System.out.print("The item: ");
                        String itemName = sc.nextLine();
                        System.out.print("The cost: ");
                        double itemCost = sc.nextDouble();
                        sc.nextLine();

                        if(expenseType == 1)
                        {
                            System.out.print("Gift For: ");
                            String gift  = sc.nextLine();
                            expenseList.add(new PersonalExpenses(itemName,itemCost,gift));
                        }
                        else if (expenseType == 2)
                        {
                            sc.nextLine();
                            System.out.print("Enter who you are sharing with: ");
                            String sharing  = sc.nextLine();
                            expenseList.add(new SharedExpenses(itemName,itemCost,sharing));
                        }

                    }

                    if(status == 2 )
                    {
                        Printer.printAll(expenseList);
                        System.out.println();
                        System.out.print("Enter the index of the item you want to edit: ");
                        int option = sc.nextInt();
                        System.out.println();
                        Expenses selectedItem = expenseList.get(option-1);
                        System.out.println("You have selected to edit:");
                        Printer.printAll(selectedItem);
                        System.out.print("\n"+"To an item to change"+"\n"+"Please enter 1-Item name, 2-Cost, 3-" + selectedItem.printEdit() +":" );
                        option = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the changes: ");
                        String changeType = sc.nextLine();
                        Expenses.updateEntry(selectedItem,option,changeType);
                        System.out.print("The new entry:");
                        Printer.printAll(selectedItem);
                    }

                    if(status == 3)
                    {
                        Printer.printAll(expenseList);
                        System.out.print("Enter the index of the item you want to delete. ");
                        int option = sc.nextInt();
                        expenseList.remove(option-1);
                    }

                    if(status == 4 )
                    {
                        Printer.printAll(expenseList);
                    }

                    if(status == 5)
                    {
                        Printer.printAll(status);
                        break;
                    }
                    System.out.println();



                }


            }

            //This is a method to print. //Thinking about creating a specific print class.

        }