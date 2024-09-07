import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Expenses> expenseList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int status = 0;

//        expenseList.add(new Expenses());
//        expenseList.add(new Expenses("711 water",20,"Anqi","NO"));
//
//        Printer.printAll(expenseList);
        while(true){
            Printer.printAll(status);
            System.out.print("Enter the your option: ");
            status = sc.nextInt();

            if(status == 1 )
            {
                Printer.printAll(status);
                System.out.print("Enter the your option: ");
                status = sc.nextInt();
            }
            else if(status == 5)
            {
                Printer.printAll(status);
                break;
            }


        }


    }

    //This is a method to print. //Thinking about creating a specific print class.

    }