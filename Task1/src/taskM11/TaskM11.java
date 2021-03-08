package taskM11;
/*Задание 11
Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.*/

public class TaskM11 {
    public static void main(String[] args) {

        int number = 5;
        int i;
        boolean isSimple = true;
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                isSimple = false;
            }
        }
        if (isSimple) {
            System.out.println(number + " is simple");
        } else {
            System.out.println(number + " is not simple");
        }
    }
}
