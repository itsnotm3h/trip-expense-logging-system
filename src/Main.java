import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Expenses> expenseList = new ArrayList<>();

        expenseList.add(new Expenses());
        expenseList.add(new Expenses("711 water",20,"Anqi","NO"));

        Printer.printAll(expenseList);

    }

    //This is a method to print. //Thinking about creating a specific print class.

    }