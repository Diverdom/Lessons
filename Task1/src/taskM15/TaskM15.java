package taskM15;
/*Задание 15
Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).
З*/

import java.util.Random;

public class TaskM15 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            array[i] = random.nextInt(10);
        }
        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println();
        int t;

        for (int i = 0; i < array.length / 2; i++) {

            t = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = t;

        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}