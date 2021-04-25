package taskM14;
/*Задание 14
Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера.
*/

import java.util.Random;

public class TaskM14 {
    public static void main(String[] args) {
        int array[] = new int[6]; //создаем массив
        Random random = new Random(); //создаем рандом
        for (int i = 0; i < 6; i++) {
            array[i] = random.nextInt(10); //заполняем массив случайными значениями от 0 до 10
        }

        int maxValue = array[0];
        int minValue = array[0];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);


        }

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
        System.out.println("Максимальное значение=" + maxValue + ", " + "находится в ячейке:" + indexMax);
        System.out.println("Минимальное значение=" + minValue + ", " + "находится в ячейке:" + indexMin);
    }


}



