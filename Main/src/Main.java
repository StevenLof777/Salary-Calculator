import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void calculateSalary(
            int hours,
            int hourlyWage,
            int vacationDays
    ) {
        int weeksPerYear = 52;
        int vacationComp = vacationDays * hourlyWage;
        int salary = ((hourlyWage * hours) * weeksPerYear) + vacationComp;
        System.out.println("Your salary is...");
        System.out.println(NumberFormat.getCurrencyInstance(
                new Locale("en", "US")).format(salary));
    };

    public static void main(String args[]){
        System.out.println("How many hours per week do you work?");

        // Retrieve hours

        Scanner scanner1 = new Scanner(System.in);
        int hours = Integer.parseInt(scanner1.next());

        System.out.println("What is your hourly wage");

        // Retrieve hourly wage
        Scanner scanner2 = new Scanner(System.in);
        int hourlyWage = Integer.parseInt(scanner2.next());

        System.out.println("How many vacation days do you have?");

        // Retrieve vacation days
        Scanner scanner3 = new Scanner(System.in);
        int vacationDays = Integer.parseInt(scanner3.next());

        calculateSalary(hours, hourlyWage, vacationDays);
    }
}