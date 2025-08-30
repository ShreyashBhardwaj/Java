import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("compareTo = " + str.compareTo("hello"));
        System.out.println("length = " + str.length());
        System.out.println("Upper = " + str.toUpperCase());
        System.out.println("Lower = " + str.toLowerCase());
        System.out.println("trim = " + str.trim());

        if (str.length() > 5) {
            System.out.println("charAt(5) = " + str.charAt(5));
        } else {
            System.out.println("String is too short for charAt(5)");
        }
    }

}
