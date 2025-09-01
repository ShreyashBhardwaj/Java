//Done

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean valid = true; // Assume date is valid

        // Validate year
        if ((year <= 0) || (month < 1 || month > 12))
            valid = false;
        else {
            int maxDays = 31; // Default

            // Set max days based on month
            if (month == 2) {
                // Check for leap year
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    maxDays = 29;
                else
                    maxDays = 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11)
                maxDays = 30;


            // Check if day is valid
            if (day < 1 || day > maxDays)
                valid = false;

        }

        // Print result
        if (valid) {
            System.out.println("Valid date="+day+"-"+month+"-"+year);
        } else {
            System.out.println("Invalid date");
        }
    }

}
