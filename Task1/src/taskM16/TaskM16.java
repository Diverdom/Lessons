package taskM16;
/*Задание 16
Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями. */

import java.util.Random;

public class TaskM16 {


    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        int maxValue = array[0];
        int minValue = array[0];
        int indexMax = 0;
        int indexMin = 0;
        int summ;

        for (int i = 0; i < array.length; i++) {
            if (maxValue > array[i]) {
                maxValue = array[i];
                indexMax = i;
            }
            if (minValue < array[i]) {
                minValue = array[i];
                indexMin = i;
            }
        }
        summ = getSum(Math.min(indexMin, indexMax), Math.max(indexMin, indexMax), array);

        System.out.println("Сумма чисел между минимальным и максимальным значениями в массиве равна " + summ);

    }

    public static int getSum(int min, int max, int[] array) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += array[i];
        }
        return sum;

    }
}