package taskM9;

/* Задание 9
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
*/


public class TaskM9 {


    public static void main(String[] args) {
        int number = 15;
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;

        }
        System.out.println("Factorial is :" + factorial);
    }
}