public class Program_8_Part2 {
    public class ExeceptionDemo {
        public static void main(String args[]) {
            try {
                int age = 19;
                if (age < 18) {
                    throw new Program_8("Minor");
                } else {
                    System.out.println("eligible to vote");
                }
            } catch (Program_8 e) {
                System.out.println(e.getMessage());
            }
        }

    }
}