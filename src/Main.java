import java.util.ArrayList;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                ArrayList<Expenses> expenseList = new ArrayList<>();
                Scanner sc = new Scanner(System.in);

                //Generate default line for testing.
//                expenseList.add(new PersonalExpenses());
//                expenseList.add(new SharedExpenses());

                while(true){
                    int status = 0;

                    Printer.printAll(status);
                    System.out.print("Enter the your option: ");
                    status = sc.nextInt();
                    validateStatus(status);

                    Printer.printAll(status);

                    int checkArray = expenseList.size();


                    try {
                    if(status == 1)
                    {

                            sc.nextLine();
                            System.out.print("Enter Expense Type, 1-Personal, 2-Shared: ");
                            int expenseType = sc.nextInt();
                            validateOption(expenseType,2);
                            sc.nextLine();
                            System.out.print("The item: ");
                            String itemName = sc.nextLine();
                            validateText(itemName);
                            System.out.print("The cost: ");
                            double itemCost = sc.nextDouble();
                            validateCost(itemCost);

                            if (expenseType == 1) {
                                sc.nextLine();
                                System.out.print("Purpose: ");
                                String purpose = sc.nextLine();
                                validateText(purpose);
                                expenseList.add(new PersonalExpenses(itemName, itemCost, purpose));

                            } else if (expenseType == 2) {
                                sc.nextLine();
                                System.out.print("Enter who you are sharing with (Ex: name1, name2):");

                                String sharing = sc.nextLine();
                                validateText(sharing);
                                expenseList.add(new SharedExpenses(itemName, itemCost, sharing));
                            }
                        System.out.println("You have successfully added the entry!");


                    }

                    if(status == 2 )
                    {
                        validateArray(checkArray);
                        Printer.printAll(expenseList);
                        System.out.println();
                        System.out.print("Enter the index of the item you want to edit: ");
                        int option = sc.nextInt();
                        validateOption(option,expenseList.size());

                        System.out.println();
                        Expenses selectedItem = expenseList.get(option-1);
                        System.out.println("You have selected to edit:");
                        System.out.print(option +".");
                        Printer.printAll(selectedItem);
                        System.out.print("\nPlease enter 1-Item, 2-Cost, 3-" + selectedItem.printEdit() +": " );
                        option = sc.nextInt();
                        validateOption(option,3);

                        String changeType="";

                        if(option >= 1 && option <=2)
                        {
                            String itemToChange ="";
                            sc.nextLine();
                            if(option == 1)
                            {
                                itemToChange = " Item:" + selectedItem.expenseName;
                            }
                            else
                            {
                                itemToChange = " Cost: $"+ selectedItem.cost;
                            }

                            System.out.println("\n"+"Current" + itemToChange +".");
                            System.out.print("Enter New Edit: ");

                            changeType = sc.nextLine();
                            validateText(changeType);
                        }



                        Expenses.updateEntry(selectedItem,option,changeType);





                        System.out.println("\nYou have successfully edited the entry!");

                        System.out.print("The new entry: ");
                        System.out.print(option +".");
                        Printer.printAll(selectedItem);


                    }

                    if(status == 3)
                    {
                        validateArray(checkArray);

                        Printer.printAll(expenseList);
                        System.out.print("\nEnter index to delete: ");
                        int option = sc.nextInt();
                        validateOption(option,expenseList.size());
                        Expenses selectedItem = expenseList.get(option-1);
                        System.out.print("You have successfully remove the entry: " + option +". ");
                        Printer.printAll(selectedItem);
                        expenseList.remove(option-1);
                    }

                    if(status == 4 )
                    {
                        validateArray(checkArray);

                        Printer.printAll(expenseList);
                        double totalCost = 0;
                        double totalShared = 0;
                        double individualPortion = 0;
                        for(Expenses cost: expenseList)
                        {

                            if (cost instanceof PersonalExpenses) {
                                double thisCost = cost.getCost();
                                totalCost = totalCost + thisCost;
                            }

                            else if(cost instanceof SharedExpenses)
                            {
                                double thisCost = cost.getCost();
                                ArrayList<String> currentSharedArray = ((SharedExpenses) cost).getSharing();
                                double sharedPortion = thisCost / (currentSharedArray.size()+1);
                                totalShared =  totalShared + thisCost;
                                individualPortion = individualPortion + sharedPortion;
                            }

                        }
                        System.out.println("\nTotal Personal Expenses: $" + (Math.round(totalCost * 100.0) / 100.0));
                        System.out.println("Total Group Expenses: $" + (Math.round(totalShared * 100.0) / 100.0));
                        System.out.println("Your share of Shared Expenses: $" + (Math.round(individualPortion * 100.0) / 100.0));


                    }

                    if(status == 5)
                    {
                        break;
                    }

                    System.out.println();
                    }

                    catch(IllegalArgumentException e)
                    {
                        System.out.println("Error: " + e.getMessage() + " Please try again.");
                        System.out.println();
                    }

                }


            }
            //This to catch the error.
            public static void validateArray(int option) {
                if (option <= 0 || option > 5) {
                    throw new IllegalArgumentException("No data found.");
                }

            }


            //This to catch the error.
            public static void validateStatus(int option) {
                if (option <= 0 || option > 5) {
                    throw new IllegalArgumentException("Invalid option");
                }

            }

            public static void validateOption(int option, int limit) {
                if (option <= 0 || option > limit) {
                    throw new IllegalArgumentException("Invalid option.");
                }

            }

            public static void validateText(String input) {
                if (input == null || input.isEmpty()) {
                    throw new IllegalArgumentException("Input cannot be null or empty.");
                }

            }

            public static void validateCost(double input) {
                if (input <= 0) {
                    throw new IllegalArgumentException("Invalid input for cost.");
                }

            }


            //This is a method to print. //Thinking about creating a specific print class.

        }