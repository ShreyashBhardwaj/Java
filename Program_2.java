import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        int i,j,m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting number");
        m=sc.nextInt();
        System.out.println("Enter Starting number");
        n=sc.nextInt();
        if(m<n)
        {
            for(i=m;i<=n;i++)
            {
                for(j=1;j<=10;j++)
                {
                    System.out.println(i+"X"+j+"="+(i*j));
                }
                System.out.println();
            }
        }
    }


}
