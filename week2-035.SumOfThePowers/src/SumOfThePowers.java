
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        Integer n = Integer.parseInt(reader.nextLine());

        int result = 0;

        for(int i = 0; i <= n; i++) {
            result += (int) Math.pow(2, i);
        }

        System.out.println("The result is " + result);
    }
}
