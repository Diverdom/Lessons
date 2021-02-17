package taskM6;

import java.util.Scanner;

public class TaskM6 {
    public static void main(String[] args) {

        System.out.println("Type your number:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 1000 && number > 99) {
            System.out.println("Number is three-digit");
        } else {
            System.out.println("Number isn't three-digit");
        }

        if (number % 10 == 7) {
            System.out.println("ends at 7");
        } else {
            System.out.println("not ends at 7");
        }

        if (number % 2 == 0) {
            System.out.println("and number is even");
        } else {
            System.out.println("and number isn't even");
        }

        scanner.close();
    }
}