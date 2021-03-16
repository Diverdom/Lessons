package taskM12;

/*Задание 12
Найдите сумму первых n целых чисел, которые делятся на 3.
*/
public class TaskM12 {

    public static void main(String[] args) {
        int number = 3;
        int counter = 0;
        int sumOfNumbers = 0;
        int i = 1;
        while (counter != number) {
            if (i % 3 == 0) {
                counter++;
                sumOfNumbers = sumOfNumbers + i;

            }
            i++;
        }
        System.out.println("сумма " + number + " первых чисел, которые делятся на 3 без остатка = " + sumOfNumbers);

    }


}
