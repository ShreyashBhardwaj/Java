import Program_9_Part1.Addition;
import Program_9_Part1.Subtraction;


public class Program_9_Part2 {
    public static void main(String[] args) {
        Addition ob1 = new Addition();
        Subtraction ob2 = new Subtraction();

        int a = 15, b = 10;
        System.out.println("Addition of two no.=" + ob1.add(a, b));
        System.out.println("Subtraction of two no. = " + ob2.subtract(a, b));
    }

}
