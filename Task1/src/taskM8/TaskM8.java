package taskM8;

import java.util.Random;

public class TaskM8 {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt();
        int huinya = x % 10;

        if (huinya == 1) {
            System.out.println(x + " рубль");
        }
        if (huinya == 5 || huinya == 6 || huinya == 7 || huinya == 8 || huinya == 9) {
            System.out.println(x + " рублей");
        }
        if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
            System.out.println(x + " рубля");
        }
    }
}
