package taskM13;
/*Задание 13
Создать последовательность случайных чисел, найти и вывести наибольшее
из них.
*/

import java.util.Random;

public class TaskM13 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }


        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - 1 - i; index++) {
                if (array [index] > array [index + 1]) {
                    int temp = array [index];
                    array [index] = array [(index + 1)];
                    array [(index + 1)] = temp;
                }
            }
        }
        System.out.println("Наибольшее значение массива = " +array [9]);

        }
    }

