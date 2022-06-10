//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero
import java.util.Scanner;

public class Q26_Sum_Of_Odd_Even_Negative {
    public static void main(String[] args) {
        System.out.println("Enter numbers of your liking and 0 to stop");
        int num, negSum = 0, evenSum = 0, oddSum = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            if (num < 0) {
                negSum += num;
            }else {
                if (num % 2 == 0) {
                    evenSum += num;
                }else {
                    oddSum += num;
                }
            }
            if (num == 0) {
                System.out.println("Negative Sum " + negSum + " Even sum " + evenSum + " Odd Sum " + oddSum);
                break;
            }
        }
    }
}
