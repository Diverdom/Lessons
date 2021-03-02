package taskM10;
/*Задание 10
Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию). */

public class TaskM10 {

    public static void main(String[] args) {

        int number = 15;
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;

        }
        System.out.println("Factorial is :" + factorial);
    }
}
