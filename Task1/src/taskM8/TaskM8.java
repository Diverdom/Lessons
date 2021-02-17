package taskM8;

import java.util.Random;

public class TaskM8 {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt();
        int number = x % 10;

        if (number == 1) {
            System.out.println(x + " рубль");
        }
        if (number == 5 || number == 6 || number == 7 || number == 8 || number == 9) {
            System.out.println(x + " рублей");
        }
        if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
            System.out.println(x + " рубля");
        }
    }
}
