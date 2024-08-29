import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        int originalNumber=num;
        int result = 0;
        int remainder;

        while (num != 0) {
            remainder = num % 10;
            result+= Math.pow(remainder, 3);
            num /= 10;
        }
        if (originalNumber==result) {
            System.out.println("its is amstrong number:");

        } else {
            System.out.println("not a amstrong number");
        }
    }
}

