import java.util.Scanner;

public class Firstnaturalnosum {
    public static void main (String[]args)
    {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = A.nextInt();
        int sum = 0;
        for (int i =1; i <=num; i++)
            sum += i;
        System.out.println (sum);
    }

}
