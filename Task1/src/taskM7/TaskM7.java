package taskM7;

import java.util.Scanner;

import static java.lang.Math.*;

public class TaskM7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the sides of the hole:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Enter the radius of the cap:");
        int c = scanner.nextInt();

        double x = sqrt(pow(a, 2) + pow(b, 2));
        //System.out.println(x);

        if (x <= c) {
            System.out.println("Yes, the hole will be covered");
        } else {
            System.out.println("No, the hole will not be covered");
        }
        scanner.close();
    }
}